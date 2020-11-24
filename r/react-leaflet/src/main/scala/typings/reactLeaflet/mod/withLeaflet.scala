package typings.reactLeaflet.mod

import typings.react.mod.ComponentType
import typings.reactLeaflet.reactLeafletStrings.leaflet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "withLeaflet")
@js.native
object withLeaflet extends js.Object {
  
  def apply[T /* <: ContextProps */](WrappedComponent: ComponentType[T]): ComponentType[Omit[T, leaflet]] = js.native
}
