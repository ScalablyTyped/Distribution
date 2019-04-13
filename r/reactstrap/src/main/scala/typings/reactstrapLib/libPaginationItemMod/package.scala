package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPaginationItemMod {
  type PaginationItem[T] = reactLib.reactMod.Component[PaginationItemProps[T], js.Object, js.Any]
  type PaginationItemProps[T] = reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] with reactstrapLib.Anon_ActiveClassNameCssModuleDisabledTag with T
}
