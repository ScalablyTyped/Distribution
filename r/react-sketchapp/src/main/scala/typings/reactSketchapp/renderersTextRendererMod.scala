package typings.reactSketchapp

import typings.reactSketchapp.componentsTextMod.Props
import typings.reactSketchapp.libTypesMod.PlatformBridge
import typings.reactSketchapp.renderersSketchRendererMod.SketchRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderersTextRendererMod {
  
  @JSImport("react-sketchapp/lib/renderers/TextRenderer", "TextRenderer")
  @js.native
  open class TextRenderer protected () extends SketchRenderer {
    def this(bridge: PlatformBridge) = this()
    
    def getDefaultGroupName(props: Props): String = js.native
  }
}
