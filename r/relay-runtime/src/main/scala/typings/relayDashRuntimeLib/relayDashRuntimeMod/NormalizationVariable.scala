package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationVariable extends NormalizationArgument {
  val kind: java.lang.String
   // 'Variable';
  val name: java.lang.String
  val variableName: java.lang.String
}

object NormalizationVariable {
  @scala.inline
  def apply(kind: java.lang.String, name: java.lang.String, variableName: java.lang.String): NormalizationVariable = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, variableName = variableName)
  
    __obj.asInstanceOf[NormalizationVariable]
  }
}

