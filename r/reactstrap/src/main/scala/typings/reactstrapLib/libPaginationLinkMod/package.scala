package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPaginationLinkMod {
  type PaginationLink[T] = reactLib.reactMod.Component[PaginationLinkProps[T], js.Object, js.Any]
  type PaginationLinkProps[T] = reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLAnchorElement] with reactstrapLib.Anon_ArialabelClassNameCssModule with T
}
