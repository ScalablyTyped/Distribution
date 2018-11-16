package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTabPaneMod {
  type TabPane[T] = reactLib.reactMod.Component[TabPaneProps[T], js.Object, js.Any]
  type TabPaneProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_ClassNameCssModuleTag with T
}
