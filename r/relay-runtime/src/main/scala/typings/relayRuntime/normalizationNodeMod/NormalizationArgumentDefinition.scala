package typings.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.normalizationNodeMod.NormalizationLocalArgument
  - typings.relayRuntime.normalizationNodeMod.NormalizationRootArgument
*/
trait NormalizationArgumentDefinition extends js.Object

object NormalizationArgumentDefinition {
  @scala.inline
  def NormalizationLocalArgument(defaultValue: js.Any, kind: String, name: String, `type`: String): NormalizationArgumentDefinition = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationArgumentDefinition]
  }
  @scala.inline
  def NormalizationRootArgument(kind: String, name: String, `type`: js.UndefOr[Null | String] = js.undefined): NormalizationArgumentDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationArgumentDefinition]
  }
}

