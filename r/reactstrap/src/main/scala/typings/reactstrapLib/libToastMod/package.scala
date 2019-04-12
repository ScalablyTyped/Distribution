package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libToastMod {
  type Toast[T] = reactLib.reactMod.Component[ToastProps[T], js.Object, js.Any]
  type ToastProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLElement] with reactstrapLib.Anon_ClassNameCssModuleFade with T
}
