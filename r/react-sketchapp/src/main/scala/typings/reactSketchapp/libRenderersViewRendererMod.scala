package typings.reactSketchapp

import typings.reactSketchapp.libComponentsViewMod.Props
import typings.reactSketchapp.libRenderersSketchRendererMod.SketchRenderer
import typings.reactSketchapp.libTypesMod.PlatformBridge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRenderersViewRendererMod {
  
  @JSImport("react-sketchapp/lib/renderers/ViewRenderer", "ViewRenderer")
  @js.native
  open class ViewRenderer protected () extends SketchRenderer {
    def this(bridge: PlatformBridge) = this()
    
    def getDefaultGroupName(_props: Props): String = js.native
  }
}
