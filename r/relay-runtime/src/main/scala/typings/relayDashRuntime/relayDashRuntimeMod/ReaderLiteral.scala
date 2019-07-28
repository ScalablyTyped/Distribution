package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderLiteral extends ReaderArgument {
  val kind: String
   // 'Literal';
  val name: String
  val value: js.Any
}

object ReaderLiteral {
  @scala.inline
  def apply(kind: String, name: String, value: js.Any): ReaderLiteral = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, value = value)
  
    __obj.asInstanceOf[ReaderLiteral]
  }
}

