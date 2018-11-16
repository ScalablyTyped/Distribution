package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTooltipMod {
  type Tooltip[T] = reactLib.reactMod.Component[TooltipProps[T], js.Object, js.Any]
  type TooltipProps[T] = UncontrolledTooltipProps[T] with reactstrapLib.Anon_IsOpen
  type UncontrolledProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_Delay with T
  type UncontrolledTooltipProps[T] = UncontrolledProps[T]
}
