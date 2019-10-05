package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CustomEvent")
@js.native
class CustomEventCls[T] protected () extends CustomEvent[T] {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: CustomEventInit[T]) = this()
}

