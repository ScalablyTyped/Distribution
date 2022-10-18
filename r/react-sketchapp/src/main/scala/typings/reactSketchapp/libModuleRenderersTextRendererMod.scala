package typings.reactSketchapp

import typings.reactSketchapp.libModuleComponentsTextMod.Props
import typings.reactSketchapp.libModuleRenderersSketchRendererMod.SketchRenderer
import typings.reactSketchapp.libModuleTypesMod.PlatformBridge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleRenderersTextRendererMod {
  
  @JSImport("react-sketchapp/lib/module/renderers/TextRenderer", "TextRenderer")
  @js.native
  open class TextRenderer protected () extends SketchRenderer {
    def this(bridge: PlatformBridge) = this()
    
    def getDefaultGroupName(props: Props): String = js.native
  }
}
