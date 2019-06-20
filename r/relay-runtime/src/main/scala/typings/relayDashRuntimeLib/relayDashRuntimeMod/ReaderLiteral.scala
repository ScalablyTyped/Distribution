package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderLiteral extends ReaderArgument {
  val kind: java.lang.String
   // 'Literal';
  val name: java.lang.String
  val value: js.Any
}

object ReaderLiteral {
  @scala.inline
  def apply(kind: java.lang.String, name: java.lang.String, value: js.Any): ReaderLiteral = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, value = value)
  
    __obj.asInstanceOf[ReaderLiteral]
  }
}

