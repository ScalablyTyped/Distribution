package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libBreadcrumbItemMod {
  type BreadcrumbItem[T] = reactLib.reactMod.Component[BreadcrumbItemProps[T], js.Object, js.Any]
  type BreadcrumbItemProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_Active with T
}
