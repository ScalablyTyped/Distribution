package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libBreadcrumbMod {
  type Breadcrumb[T] = reactLib.reactMod.Component[BreadcrumbProps[T], js.Object, js.Any]
  type BreadcrumbProps[T] = reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] with reactstrapLib.Anon_ClassNameCssModule with T
}
