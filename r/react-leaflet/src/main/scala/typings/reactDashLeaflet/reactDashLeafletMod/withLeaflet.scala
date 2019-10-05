package typings.reactDashLeaflet.reactDashLeafletMod

import typings.react.reactMod.ComponentType
import typings.reactDashLeaflet.reactDashLeafletStrings.leaflet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "withLeaflet")
@js.native
object withLeaflet extends js.Object {
  def apply[T /* <: ContextProps */](WrappedComponent: ComponentType[T]): ComponentType[Omit[T, leaflet]] = js.native
}

