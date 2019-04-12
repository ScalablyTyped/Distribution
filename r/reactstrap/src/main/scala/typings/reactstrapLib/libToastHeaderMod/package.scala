package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libToastHeaderMod {
  type ToastHeader[T] = reactLib.reactMod.Component[ToastHeaderProps[T], js.Object, js.Any]
  type ToastHeaderProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLElement] with reactstrapLib.Anon_CharCode with T
}
