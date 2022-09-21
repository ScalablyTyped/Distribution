package typings.storybookComponents.mod

import typings.react.mod.Component
import typings.std.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomIFrame
  extends Component[IZoomIFrameProps, js.Object, Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MZoomIFrame(): Unit = js.native
  
  var iframe: HTMLIFrameElement = js.native
  
  def setIframeInnerZoom(scale: Double): Unit = js.native
  
  def setIframeZoom(scale: Double): Unit = js.native
  
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MZoomIFrame(nextProps: IZoomIFrameProps): Boolean = js.native
}
