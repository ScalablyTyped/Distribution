package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCardTextMod {
  type CardText[T] = reactLib.reactMod.Component[CardTextProps[T], js.Object, js.Any]
  type CardTextProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_ClassNameCssModuleTag with T
}
