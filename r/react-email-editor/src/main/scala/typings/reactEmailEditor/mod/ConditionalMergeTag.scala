package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalMergeTag extends MergeTag {
  val mergeTags: js.UndefOr[js.Array[SimpleMergeTag]] = js.native
  val name: String = js.native
  val rules: js.Array[ConditionalMergeTagRule] = js.native
}

object ConditionalMergeTag {
  @scala.inline
  def apply(name: String, rules: js.Array[ConditionalMergeTagRule]): ConditionalMergeTag = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalMergeTag]
  }
  @scala.inline
  implicit class ConditionalMergeTagOps[Self <: ConditionalMergeTag] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRulesVarargs(value: ConditionalMergeTagRule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[ConditionalMergeTagRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def setMergeTagsVarargs(value: SimpleMergeTag*): Self = this.set("mergeTags", js.Array(value :_*))
    @scala.inline
    def setMergeTags(value: js.Array[SimpleMergeTag]): Self = this.set("mergeTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeTags: Self = this.set("mergeTags", js.undefined)
  }
  
}

