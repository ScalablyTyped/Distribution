package typings.reactLeaflet.mod

import typings.leaflet.mod.SVGOverlay_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "SVGOverlay")
@js.native
open class SVGOverlay[P /* <: SVGOverlayProps */, E /* <: SVGOverlay_ */] protected () extends MapComponent[P, E] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: Any) = this()
  
  def createLeafletElement(props: P): E = js.native
  
  def updateLeafletElement(fromProps: P, toProps: P): Unit = js.native
}
