package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libContainerMod {
  type Container[T] = reactLib.reactMod.Component[ContainerProps[T], js.Object, js.Any]
  type ContainerProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_ClassNameFluid with T
}
