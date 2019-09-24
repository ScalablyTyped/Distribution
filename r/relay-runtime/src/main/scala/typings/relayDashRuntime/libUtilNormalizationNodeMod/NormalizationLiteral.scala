package typings.relayDashRuntime.libUtilNormalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationLiteral extends NormalizationArgument {
  val kind: String
   // 'Literal';
  val name: String
  val `type`: js.UndefOr[String | Null] = js.undefined
  val value: js.Any
}

object NormalizationLiteral {
  @scala.inline
  def apply(kind: String, name: String, value: js.Any, `type`: String = null): NormalizationLiteral = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, value = value)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NormalizationLiteral]
  }
}

