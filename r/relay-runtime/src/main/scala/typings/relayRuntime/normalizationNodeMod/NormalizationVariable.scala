package typings.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationVariable extends NormalizationArgument {
  val kind: String
   // 'Variable';
  val name: String
  val `type`: js.UndefOr[String | Null] = js.undefined
  val variableName: String
}

object NormalizationVariable {
  @scala.inline
  def apply(kind: String, name: String, variableName: String, `type`: js.UndefOr[Null | String] = js.undefined): NormalizationVariable = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationVariable]
  }
}

