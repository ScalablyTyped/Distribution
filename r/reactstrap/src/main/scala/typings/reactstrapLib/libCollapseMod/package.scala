package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCollapseMod {
  type Collapse[T] = reactLib.reactMod.Component[CollapseProps[T], js.Object, js.Any]
  type CollapseProps[T] = reactLib.reactMod.ReactNs.HTMLProps[stdLib.HTMLElement] with reactstrapLib.Anon_ClassNames with T
  type UncontrolledCollapseProps[T] = UncontrolledProps[T]
  type UncontrolledProps[T] = reactLib.reactMod.ReactNs.HTMLProps[stdLib.HTMLElement] with reactstrapLib.Anon_ClassNameCssModuleIsOpen with T
}
