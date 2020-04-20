package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupedMergeTag extends MergeTag {
  val mergeTags: js.Array[SimpleMergeTag | GroupedMergeTag]
  val name: String
}

object GroupedMergeTag {
  @scala.inline
  def apply(mergeTags: js.Array[SimpleMergeTag | GroupedMergeTag], name: String): GroupedMergeTag = {
    val __obj = js.Dynamic.literal(mergeTags = mergeTags.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupedMergeTag]
  }
}

