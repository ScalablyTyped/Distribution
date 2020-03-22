package typings.reactInstantsearchCore.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.StatelessComponent
import typings.reactInstantsearchCore.PartialMenuProvided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", "connectMenu")
@js.native
object connectMenu extends js.Object {
  def apply(stateless: StatelessComponent[MenuProvided]): ComponentClass[MenuExposed, ComponentState] = js.native
  def apply[TProps /* <: PartialMenuProvided */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, MenuProvided, MenuExposed] = js.native
}

