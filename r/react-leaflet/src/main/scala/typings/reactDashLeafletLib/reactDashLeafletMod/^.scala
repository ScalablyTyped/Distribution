package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val LeafletConsumer: reactLib.reactMod.Consumer[LeafletContext] = js.native
  val LeafletProvider: reactLib.reactMod.Provider[LeafletContext] = js.native
  def withLeaflet[T /* <: ContextProps */](WrappedComponent: reactLib.reactMod.ComponentType[T]): reactLib.reactMod.ComponentType[Omit[T, reactDashLeafletLib.reactDashLeafletLibStrings.leaflet]] = js.native
}

