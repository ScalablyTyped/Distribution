package typings.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationLiteral extends NormalizationArgument {
  val kind: String
   // 'Literal';
  val name: String
  val `type`: js.UndefOr[String | Null] = js.undefined
  val value: js.UndefOr[js.Any] = js.undefined
}

object NormalizationLiteral {
  @scala.inline
  def apply(kind: String, name: String, `type`: js.UndefOr[Null | String] = js.undefined, value: js.Any = null): NormalizationLiteral = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationLiteral]
  }
}

