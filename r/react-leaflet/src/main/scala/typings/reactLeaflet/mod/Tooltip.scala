package typings.reactLeaflet.mod

import typings.leaflet.mod.Tooltip_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "Tooltip")
@js.native
class Tooltip[P /* <: TooltipProps */, E /* <: Tooltip_ */] protected () extends DivOverlay[P, E] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: js.Any) = this()
  
  def onTooltipClose(arg: typings.reactLeaflet.anon.Tooltip[E]): Unit = js.native
  
  def onTooltipOpen(arg: typings.reactLeaflet.anon.Tooltip[E]): Unit = js.native
}
