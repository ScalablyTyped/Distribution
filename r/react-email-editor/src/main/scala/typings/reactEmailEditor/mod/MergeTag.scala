package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactEmailEditor.mod.SimpleMergeTag
  - typings.reactEmailEditor.mod.ConditionalMergeTag
  - typings.reactEmailEditor.mod.GroupedMergeTag
*/
trait MergeTag extends js.Object

object MergeTag {
  @scala.inline
  def SimpleMergeTag(name: String, value: String): MergeTag = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeTag]
  }
  @scala.inline
  def ConditionalMergeTag(name: String, rules: js.Array[ConditionalMergeTagRule], mergeTags: js.Array[SimpleMergeTag] = null): MergeTag = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    if (mergeTags != null) __obj.updateDynamic("mergeTags")(mergeTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeTag]
  }
  @scala.inline
  def GroupedMergeTag(mergeTags: js.Array[SimpleMergeTag | typings.reactEmailEditor.mod.GroupedMergeTag], name: String): MergeTag = {
    val __obj = js.Dynamic.literal(mergeTags = mergeTags.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeTag]
  }
}

