package typings.reactDashInstantsearchDashDom.reactDashInstantsearchDashDomMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.StatelessComponent
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.AutocompleteExposed
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.AutocompleteProvided
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.ConnectedComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-dom", "connectAutoComplete")
@js.native
object connectAutoComplete extends js.Object {
  def apply[TDoc](stateless: StatelessComponent[AutocompleteProvided[TDoc]]): ComponentClass[AutocompleteExposed, ComponentState] = js.native
  def apply[Props /* <: AutocompleteProvided[TDoc] */, TDoc](Composed: ComponentType[Props]): ConnectedComponentClass[Props, AutocompleteProvided[TDoc], AutocompleteExposed] = js.native
}

