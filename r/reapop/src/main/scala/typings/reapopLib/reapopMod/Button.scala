package typings
package reapopLib.reapopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  var name: java.lang.String
  var primary: scala.Boolean
  def onClick(): scala.Unit
}

object Button {
  @scala.inline
  def apply(name: java.lang.String, onClick: () => scala.Unit, primary: scala.Boolean): Button = {
    val __obj = js.Dynamic.literal(name = name, onClick = js.Any.fromFunction0(onClick), primary = primary)
  
    __obj.asInstanceOf[Button]
  }
}

