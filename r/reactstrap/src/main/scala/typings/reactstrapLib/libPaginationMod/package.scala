package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPaginationMod {
  type Pagination[T] = reactLib.reactMod.Component[PaginationProps[T], js.Object, js.Any]
  type PaginationProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLElement] with reactstrapLib.Anon_ArialabelClassNameCssModule with T
}
