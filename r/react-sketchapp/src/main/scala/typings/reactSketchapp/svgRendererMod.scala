package typings.reactSketchapp

import typings.reactSketchapp.moduleTypesMod.PlatformBridge
import typings.reactSketchapp.viewRendererMod.ViewRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgRendererMod {
  
  @JSImport("react-sketchapp/lib/module/renderers/SvgRenderer", "SvgRenderer")
  @js.native
  open class SvgRenderer protected () extends ViewRenderer {
    def this(bridge: PlatformBridge) = this()
  }
}
