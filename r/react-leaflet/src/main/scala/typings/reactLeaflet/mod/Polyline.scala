package typings.reactLeaflet.mod

import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.leaflet.mod.Polyline_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "Polyline")
@js.native
class Polyline[P /* <: PolylineProps */, E /* <: Polyline_[LineString | MultiLineString, js.Any] */] protected () extends Path[P, E] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: js.Any) = this()
}
