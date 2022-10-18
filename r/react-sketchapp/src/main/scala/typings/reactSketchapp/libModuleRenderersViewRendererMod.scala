package typings.reactSketchapp

import typings.reactSketchapp.libModuleComponentsViewMod.Props
import typings.reactSketchapp.libModuleRenderersSketchRendererMod.SketchRenderer
import typings.reactSketchapp.libModuleTypesMod.PlatformBridge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleRenderersViewRendererMod {
  
  @JSImport("react-sketchapp/lib/module/renderers/ViewRenderer", "ViewRenderer")
  @js.native
  open class ViewRenderer protected () extends SketchRenderer {
    def this(bridge: PlatformBridge) = this()
    
    def getDefaultGroupName(_props: Props): String = js.native
  }
}
