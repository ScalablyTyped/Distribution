package typings.reactDashInstantsearchDashDom.reactDashInstantsearchDashDomMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.StatelessComponent
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.ConnectedComponentClass
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.GeoSearchExposed
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.GeoSearchProvided
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-dom", "connectGeoSearch")
@js.native
object connectGeoSearch extends js.Object {
  def apply(stateless: StatelessComponent[GeoSearchProvided[_]]): ComponentClass[GeoSearchExposed, ComponentState] = js.native
  def apply[TProps /* <: Partial[GeoSearchProvided[THit]] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, GeoSearchProvided[THit], GeoSearchExposed] = js.native
}

