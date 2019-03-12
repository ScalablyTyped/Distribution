package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaProperties extends js.Object {
  var blocks: js.UndefOr[RulesByNodeType] = js.undefined
  var document: js.UndefOr[Rules] = js.undefined
  var inlines: js.UndefOr[RulesByNodeType] = js.undefined
}

object SchemaProperties {
  @scala.inline
  def apply(blocks: RulesByNodeType = null, document: Rules = null, inlines: RulesByNodeType = null): SchemaProperties = {
    val __obj = js.Dynamic.literal()
    if (blocks != null) __obj.updateDynamic("blocks")(blocks)
    if (document != null) __obj.updateDynamic("document")(document)
    if (inlines != null) __obj.updateDynamic("inlines")(inlines)
    __obj.asInstanceOf[SchemaProperties]
  }
}

