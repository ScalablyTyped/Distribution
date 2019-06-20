package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderVariable extends ReaderArgument {
  val kind: java.lang.String
   // 'Variable';
  val name: java.lang.String
  val variableName: java.lang.String
}

object ReaderVariable {
  @scala.inline
  def apply(kind: java.lang.String, name: java.lang.String, variableName: java.lang.String): ReaderVariable = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, variableName = variableName)
  
    __obj.asInstanceOf[ReaderVariable]
  }
}

