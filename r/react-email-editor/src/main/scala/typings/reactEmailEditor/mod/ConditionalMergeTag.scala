package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalMergeTag extends MergeTag {
  val mergeTags: js.UndefOr[js.Array[SimpleMergeTag]] = js.undefined
  val name: String
  val rules: js.Array[ConditionalMergeTagRule]
}

object ConditionalMergeTag {
  @scala.inline
  def apply(name: String, rules: js.Array[ConditionalMergeTagRule], mergeTags: js.Array[SimpleMergeTag] = null): ConditionalMergeTag = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    if (mergeTags != null) __obj.updateDynamic("mergeTags")(mergeTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalMergeTag]
  }
}

