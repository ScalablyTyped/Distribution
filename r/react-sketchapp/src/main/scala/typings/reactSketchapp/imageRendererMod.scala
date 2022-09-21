package typings.reactSketchapp

import typings.reactSketchapp.moduleTypesMod.PlatformBridge
import typings.reactSketchapp.sketchRendererMod.SketchRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageRendererMod {
  
  @JSImport("react-sketchapp/lib/module/renderers/ImageRenderer", "ImageRenderer")
  @js.native
  open class ImageRenderer protected () extends SketchRenderer {
    def this(bridge: PlatformBridge) = this()
  }
}
