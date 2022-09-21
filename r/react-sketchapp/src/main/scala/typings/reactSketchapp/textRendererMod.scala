package typings.reactSketchapp

import typings.reactSketchapp.moduleComponentsTextMod.Props
import typings.reactSketchapp.moduleTypesMod.PlatformBridge
import typings.reactSketchapp.sketchRendererMod.SketchRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textRendererMod {
  
  @JSImport("react-sketchapp/lib/module/renderers/TextRenderer", "TextRenderer")
  @js.native
  open class TextRenderer protected () extends SketchRenderer {
    def this(bridge: PlatformBridge) = this()
    
    def getDefaultGroupName(props: Props): String = js.native
  }
}
