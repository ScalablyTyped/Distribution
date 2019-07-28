package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Boolean extends js.Object

@JSGlobal("Boolean")
@js.native
class BooleanCls () extends Boolean {
  def this(value: js.Any) = this()
}

object Boolean {
  @scala.inline
  def apply(valueOf: () => scala.Boolean): Boolean = {
    val __obj = js.Dynamic.literal(valueOf = js.Any.fromFunction0(valueOf))
  
    __obj.asInstanceOf[Boolean]
  }
}

