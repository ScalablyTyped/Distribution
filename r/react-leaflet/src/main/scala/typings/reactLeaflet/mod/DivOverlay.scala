package typings.reactLeaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "DivOverlay")
@js.native
class DivOverlay[P /* <: DivOverlayProps */, E /* <: DivOverlayTypes */] protected () extends MapComponent[P, E] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: js.Any) = this()
  
  def createLeafletElement(_props: P): Unit = js.native
  
  def onClose(): Unit = js.native
  
  def onOpen(): Unit = js.native
  
  def onRender(): Unit = js.native
  
  def updateLeafletElement(_prevProps: P, _props: P): Unit = js.native
}
