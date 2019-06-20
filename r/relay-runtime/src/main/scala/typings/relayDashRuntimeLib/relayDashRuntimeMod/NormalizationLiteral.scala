package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationLiteral extends NormalizationArgument {
  val kind: java.lang.String
   // 'Literal';
  val name: java.lang.String
  val value: js.Any
}

object NormalizationLiteral {
  @scala.inline
  def apply(kind: java.lang.String, name: java.lang.String, value: js.Any): NormalizationLiteral = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, value = value)
  
    __obj.asInstanceOf[NormalizationLiteral]
  }
}

