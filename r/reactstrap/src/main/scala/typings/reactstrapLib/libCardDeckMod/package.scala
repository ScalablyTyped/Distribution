package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCardDeckMod {
  type CardDeck[T] = reactLib.reactMod.Component[CardDeckProps[T], js.Object, js.Any]
  type CardDeckProps[T] = reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] with reactstrapLib.Anon_ClassNameCssModuleTag with T
}
