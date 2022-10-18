package typings.reactSketchapp

import typings.reactSketchapp.libModuleRenderersArtboardRendererMod.ArtboardRenderer
import typings.reactSketchapp.libModuleRenderersImageRendererMod.ImageRenderer
import typings.reactSketchapp.libModuleRenderersSvgRendererMod.SvgRenderer
import typings.reactSketchapp.libModuleRenderersSymbolInstanceRendererMod.SymbolInstanceRenderer
import typings.reactSketchapp.libModuleRenderersSymbolMasterRendererMod.SymbolMasterRenderer
import typings.reactSketchapp.libModuleRenderersTextRendererMod.TextRenderer
import typings.reactSketchapp.libModuleRenderersViewRendererMod.ViewRenderer
import typings.reactSketchapp.libModuleTypesMod.PlatformBridge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleRenderersMod {
  
  @JSImport("react-sketchapp/lib/module/renderers", "sketch_artboard")
  @js.native
  open class sketchArtboard protected () extends ArtboardRenderer {
    def this(bridge: PlatformBridge) = this()
  }
  
  @JSImport("react-sketchapp/lib/module/renderers", "sketch_image")
  @js.native
  open class sketchImage protected () extends ImageRenderer {
    def this(bridge: PlatformBridge) = this()
  }
  
  @JSImport("react-sketchapp/lib/module/renderers", "sketch_svg")
  @js.native
  open class sketchSvg protected () extends SvgRenderer {
    def this(bridge: PlatformBridge) = this()
  }
  
  @JSImport("react-sketchapp/lib/module/renderers", "sketch_symbolinstance")
  @js.native
  open class sketchSymbolinstance protected () extends SymbolInstanceRenderer {
    def this(bridge: PlatformBridge) = this()
  }
  
  @JSImport("react-sketchapp/lib/module/renderers", "sketch_symbolmaster")
  @js.native
  open class sketchSymbolmaster protected () extends SymbolMasterRenderer {
    def this(bridge: PlatformBridge) = this()
  }
  
  @JSImport("react-sketchapp/lib/module/renderers", "sketch_text")
  @js.native
  open class sketchText protected () extends TextRenderer {
    def this(bridge: PlatformBridge) = this()
  }
  
  @JSImport("react-sketchapp/lib/module/renderers", "sketch_view")
  @js.native
  open class sketchView protected () extends ViewRenderer {
    def this(bridge: PlatformBridge) = this()
  }
}
