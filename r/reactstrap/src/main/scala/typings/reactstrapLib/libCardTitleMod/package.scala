package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCardTitleMod {
  type CardTitle[T] = reactLib.reactMod.Component[CardTitleProps[T], js.Object, js.Any]
  type CardTitleProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_ClassName with T
}
