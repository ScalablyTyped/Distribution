package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupedMergeTag extends MergeTag {
  val mergeTags: js.Array[SimpleMergeTag | GroupedMergeTag] = js.native
  val name: String = js.native
}

object GroupedMergeTag {
  @scala.inline
  def apply(mergeTags: js.Array[SimpleMergeTag | GroupedMergeTag], name: String): GroupedMergeTag = {
    val __obj = js.Dynamic.literal(mergeTags = mergeTags.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupedMergeTag]
  }
  @scala.inline
  implicit class GroupedMergeTagOps[Self <: GroupedMergeTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMergeTagsVarargs(value: (SimpleMergeTag | GroupedMergeTag)*): Self = this.set("mergeTags", js.Array(value :_*))
    @scala.inline
    def setMergeTags(value: js.Array[SimpleMergeTag | GroupedMergeTag]): Self = this.set("mergeTags", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

