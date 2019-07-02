package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationLiteral extends NormalizationArgument {
  val kind: java.lang.String
   // 'Literal';
  val name: java.lang.String
  val `type`: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val value: js.Any
}

object NormalizationLiteral {
  @scala.inline
  def apply(kind: java.lang.String, name: java.lang.String, value: js.Any, `type`: java.lang.String = null): NormalizationLiteral = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, value = value)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NormalizationLiteral]
  }
}

