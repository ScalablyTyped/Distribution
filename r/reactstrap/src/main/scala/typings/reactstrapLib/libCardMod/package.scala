package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCardMod {
  type Card[T] = reactLib.reactMod.Component[CardProps[T], js.Object, js.Any]
  type CardProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_Block with T
}
