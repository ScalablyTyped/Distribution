package typings.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.normalizationNodeMod.NormalizationLiteral
  - typings.relayRuntime.normalizationNodeMod.NormalizationVariable
*/
trait NormalizationArgument extends js.Object

object NormalizationArgument {
  @scala.inline
  def NormalizationLiteral(kind: String, name: String, `type`: js.UndefOr[Null | String] = js.undefined, value: js.Any = null): NormalizationArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationArgument]
  }
  @scala.inline
  def NormalizationVariable(kind: String, name: String, variableName: String, `type`: js.UndefOr[Null | String] = js.undefined): NormalizationArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationArgument]
  }
}

