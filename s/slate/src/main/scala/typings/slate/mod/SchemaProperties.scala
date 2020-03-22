package typings.slate.mod

import typings.slate.matchObjectAndTypeArrayOb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaProperties extends js.Object {
  var annotations: js.UndefOr[RulesByNodeType] = js.undefined
  var blocks: js.UndefOr[RulesByNodeType] = js.undefined
  var decorations: js.UndefOr[RulesByNodeType] = js.undefined
  var document: js.UndefOr[Rules] = js.undefined
  var inlines: js.UndefOr[RulesByNodeType] = js.undefined
  var marks: js.UndefOr[RulesByNodeType] = js.undefined
  var rules: js.UndefOr[js.Array[matchObjectAndTypeArrayOb]] = js.undefined
}

object SchemaProperties {
  @scala.inline
  def apply(
    annotations: RulesByNodeType = null,
    blocks: RulesByNodeType = null,
    decorations: RulesByNodeType = null,
    document: Rules = null,
    inlines: RulesByNodeType = null,
    marks: RulesByNodeType = null,
    rules: js.Array[matchObjectAndTypeArrayOb] = null
  ): SchemaProperties = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (blocks != null) __obj.updateDynamic("blocks")(blocks.asInstanceOf[js.Any])
    if (decorations != null) __obj.updateDynamic("decorations")(decorations.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (inlines != null) __obj.updateDynamic("inlines")(inlines.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProperties]
  }
}

