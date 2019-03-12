package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCardGroupMod {
  type CardGroup[T] = reactLib.reactMod.Component[CardGroupProps[T], js.Object, js.Any]
  type CardGroupProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLElement] with reactstrapLib.Anon_ClassNameCssModuleTag with T
}
