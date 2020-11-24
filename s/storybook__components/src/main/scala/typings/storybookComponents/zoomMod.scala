package typings.storybookComponents

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typings.storybookComponents.zoomElementMod.ZoomProps
import typings.storybookComponents.zoomIFrameMod.ZoomIFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/Zoom/Zoom", JSImport.Namespace)
@js.native
object zoomMod extends js.Object {
  
  def browserSupportsCssZoom(): Boolean = js.native
  
  @js.native
  object Zoom extends js.Object {
    
    var Element: js.Function1[/* hasScaleChildren */ ZoomProps, typings.react.mod.global.JSX.Element] = js.native
    
    @js.native
    class IFrame () extends ZoomIFrame
    @js.native
    object IFrame extends TopLevel[Instantiable0[ZoomIFrame]]
  }
}
