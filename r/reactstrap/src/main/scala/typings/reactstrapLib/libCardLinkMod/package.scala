package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCardLinkMod {
  type CardLink[T] = reactLib.reactMod.Component[CardLinkProps[T], js.Object, js.Any]
  type CardLinkProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_InnerRef with T
}
