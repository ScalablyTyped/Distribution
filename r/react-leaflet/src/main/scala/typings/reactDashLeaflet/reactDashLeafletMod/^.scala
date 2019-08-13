package typings.reactDashLeaflet.reactDashLeafletMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.Consumer
import typings.react.reactMod.Provider
import typings.reactDashLeaflet.reactDashLeafletStrings.leaflet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val LeafletConsumer: Consumer[LeafletContext] = js.native
  val LeafletProvider: Provider[LeafletContext] = js.native
  def useLeaflet(): LeafletContext = js.native
  def withLeaflet[T /* <: ContextProps */](WrappedComponent: ComponentType[T]): ComponentType[Omit[T, leaflet]] = js.native
}

