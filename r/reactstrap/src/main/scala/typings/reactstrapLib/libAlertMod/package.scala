package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libAlertMod {
  type Alert[T] = reactLib.reactMod.Component[AlertProps[T], js.Object, js.Any]
  type AlertProps[T] = UncontrolledAlertProps[T] with reactstrapLib.Anon_IsOpen
  type UncontrolledAlertProps[T] = UncontrolledProps[T]
  type UncontrolledProps[T] = reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] with reactstrapLib.Anon_ClassName with T
}
