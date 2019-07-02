package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationVariable extends NormalizationArgument {
  val kind: java.lang.String
   // 'Variable';
  val name: java.lang.String
  val `type`: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val variableName: java.lang.String
}

object NormalizationVariable {
  @scala.inline
  def apply(
    kind: java.lang.String,
    name: java.lang.String,
    variableName: java.lang.String,
    `type`: java.lang.String = null
  ): NormalizationVariable = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, variableName = variableName)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NormalizationVariable]
  }
}

