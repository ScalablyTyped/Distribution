package typings.slate.slateMod

import typings.slate.Anon_MatchArray
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
  var rules: js.UndefOr[js.Array[Anon_MatchArray with Rules]] = js.undefined
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
    rules: js.Array[Anon_MatchArray with Rules] = null
  ): SchemaProperties = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (blocks != null) __obj.updateDynamic("blocks")(blocks)
    if (decorations != null) __obj.updateDynamic("decorations")(decorations)
    if (document != null) __obj.updateDynamic("document")(document)
    if (inlines != null) __obj.updateDynamic("inlines")(inlines)
    if (marks != null) __obj.updateDynamic("marks")(marks)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    __obj.asInstanceOf[SchemaProperties]
  }
}

