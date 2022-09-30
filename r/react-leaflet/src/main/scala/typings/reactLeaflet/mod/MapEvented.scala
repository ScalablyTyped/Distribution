package typings.reactLeaflet.mod

import typings.leaflet.mod.Evented
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "MapEvented")
@js.native
open class MapEvented[P, E /* <: Evented */] protected ()
  extends Component[P, js.Object, Any] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: Any) = this()
  
  var _leafletEvents: LeafletEvents = js.native
  
  def bindLeafletEvents(next: LeafletEvents, prev: LeafletEvents): LeafletEvents = js.native
  
  def extractLeafletEvents(props: P): LeafletEvents = js.native
  
  def fireLeafletEvent(`type`: String, data: Any): Unit = js.native
  
  var leafletElement: E = js.native
}
