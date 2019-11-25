package typings.reapop.reapopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  var name: String
  var primary: Boolean
  def onClick(): Unit
}

object Button {
  @scala.inline
  def apply(name: String, onClick: () => Unit, primary: Boolean): Button = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), primary = primary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Button]
  }
}

