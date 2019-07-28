package typings.reactDashAlert.reactDashAlertMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertComponentProps extends js.Object {
  var id: String
  var message: ReactNode
  var options: AlertCustomOptionsWithType
  def close(): Unit
}

object AlertComponentProps {
  @scala.inline
  def apply(close: () => Unit, id: String, message: ReactNode, options: AlertCustomOptionsWithType): AlertComponentProps = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), id = id, message = message.asInstanceOf[js.Any], options = options)
  
    __obj.asInstanceOf[AlertComponentProps]
  }
}

