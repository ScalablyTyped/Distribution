package typings.reactSketchapp

import typings.reactSketchapp.libTypesMod.PlatformBridge
import typings.reactSketchapp.renderersSketchRendererMod.SketchRenderer
import typings.reactSketchapp.viewMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderersViewRendererMod {
  
  @JSImport("react-sketchapp/lib/renderers/ViewRenderer", "ViewRenderer")
  @js.native
  open class ViewRenderer protected () extends SketchRenderer {
    def this(bridge: PlatformBridge) = this()
    
    def getDefaultGroupName(_props: Props): String = js.native
  }
}
