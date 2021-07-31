package typings.reactLeaflet.mod

import typings.leaflet.mod.Evented
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "MapEvented")
@js.native
class MapEvented[P, E /* <: Evented */] protected ()
  extends Component[P, js.Object, js.Any] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: js.Any) = this()
  
  var _leafletEvents: LeafletEvents = js.native
  
  def bindLeafletEvents(next: LeafletEvents, prev: LeafletEvents): LeafletEvents = js.native
  
  def extractLeafletEvents(props: P): LeafletEvents = js.native
  
  def fireLeafletEvent(`type`: String, data: js.Any): Unit = js.native
  
  var leafletElement: E = js.native
}
