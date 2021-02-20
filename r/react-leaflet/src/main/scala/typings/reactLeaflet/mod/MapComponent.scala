package typings.reactLeaflet.mod

import typings.leaflet.mod.Evented
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "MapComponent")
@js.native
class MapComponent[P /* <: MapComponentProps */, E /* <: Evented */] protected () extends MapEvented[P, E] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: js.Any) = this()
  
  def getOptions(props: P): P = js.native
}
