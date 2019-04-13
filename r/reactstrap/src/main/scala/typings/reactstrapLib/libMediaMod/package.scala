package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMediaMod {
  type Media[T] = reactLib.reactMod.Component[MediaProps[T], js.Object, js.Any]
  type MediaProps[T] = reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] with reactstrapLib.Anon_AltBody with T
}
