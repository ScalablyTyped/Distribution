package typings
package reactDashAlertLib.reactDashAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertComponentProps extends js.Object {
  var id: java.lang.String
  var message: reactLib.reactMod.ReactNode
  var options: AlertCustomOptionsWithType
  def close(): scala.Unit
}

object AlertComponentProps {
  @scala.inline
  def apply(
    close: () => scala.Unit,
    id: java.lang.String,
    message: reactLib.reactMod.ReactNode,
    options: AlertCustomOptionsWithType
  ): AlertComponentProps = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), id = id, message = message.asInstanceOf[js.Any], options = options)
  
    __obj.asInstanceOf[AlertComponentProps]
  }
}

