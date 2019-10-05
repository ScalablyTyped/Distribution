package typings.reactDashInstantsearchDashDom.reactDashInstantsearchDashDomMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.StatelessComponent
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.ConnectedComponentClass
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.SearchBoxExposed
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.SearchBoxProvided
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-dom", "connectSearchBox")
@js.native
object connectSearchBox extends js.Object {
  def apply(stateless: StatelessComponent[SearchBoxProvided]): ComponentClass[SearchBoxExposed, ComponentState] = js.native
  def apply[TProps /* <: Partial[SearchBoxProvided] */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, SearchBoxProvided, SearchBoxExposed] = js.native
}

