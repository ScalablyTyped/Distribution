package typings.atStorybookUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arg extends js.Object {
  def onChange(arg: String): Unit
}

object Anon_Arg {
  @scala.inline
  def apply(onChange: String => Unit): Anon_Arg = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
  
    __obj.asInstanceOf[Anon_Arg]
  }
}

