package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPopoverMod {
  type Popover[T] = reactLib.reactMod.Component[PopoverProps[T], js.Object, js.Any]
  type PopoverProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_BoundariesElement with T
}
