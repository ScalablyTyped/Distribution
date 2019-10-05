package typings.reactDashInstantsearchDashDom.reactDashInstantsearchDashDomMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.StatelessComponent
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.ConnectedComponentClass
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.HighlightPassedThru
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.HighlightProps
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.HighlightProvided
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-dom", "connectHighlight")
@js.native
object connectHighlight extends js.Object {
  def apply[TDoc](stateless: StatelessComponent[HighlightProps[TDoc]]): ComponentClass[HighlightPassedThru[TDoc], ComponentState] = js.native
  def apply[TProps /* <: Partial[HighlightProps[TDoc]] */, TDoc](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, HighlightProvided[TDoc], js.Object] = js.native
}

