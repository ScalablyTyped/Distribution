package typings.reactLeaflet.mod

import typings.leaflet.mod.Popup_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "Popup")
@js.native
open class Popup[P /* <: PopupProps */, E /* <: Popup_ */] protected () extends DivOverlay[P, E] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: Any) = this()
  
  def onPopupClose(arg: typings.reactLeaflet.anon.Popup[E]): Unit = js.native
  
  def onPopupOpen(arg: typings.reactLeaflet.anon.Popup[E]): Unit = js.native
}
