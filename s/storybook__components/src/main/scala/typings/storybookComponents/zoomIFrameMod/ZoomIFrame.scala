package typings.storybookComponents.zoomIFrameMod

import typings.react.mod.Component
import typings.std.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/Zoom/ZoomIFrame", "ZoomIFrame")
@js.native
class ZoomIFrame ()
  extends Component[IZoomIFrameProps, js.Object, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MZoomIFrame(): Unit = js.native
  
  var iframe: HTMLIFrameElement = js.native
  
  def setIframeInnerZoom(scale: Double): Unit = js.native
  
  def setIframeZoom(scale: Double): Unit = js.native
  
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MZoomIFrame(nextProps: IZoomIFrameProps): Boolean = js.native
}
