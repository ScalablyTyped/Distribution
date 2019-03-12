package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libButtonToolbarMod {
  type ButtonToolbar[T] = reactLib.reactMod.Component[ButtonToolbarProps[T], js.Object, js.Any]
  type ButtonToolbarProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLElement] with reactstrapLib.Anon_ArialabelClassName with T
}
