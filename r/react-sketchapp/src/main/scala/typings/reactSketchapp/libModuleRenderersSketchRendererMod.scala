package typings.reactSketchapp

import typings.reactSketchapp.libModuleTypesMod.PlatformBridge
import typings.reactSketchapp.libModuleTypesMod.TreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleRenderersSketchRendererMod {
  
  @JSImport("react-sketchapp/lib/module/renderers/SketchRenderer", "SketchRenderer")
  @js.native
  open class SketchRenderer protected () extends StObject {
    def this(bridge: PlatformBridge) = this()
    
    def getDefaultGroupName(_props: Any): String = js.native
    
    /* protected */ val platformBridge: PlatformBridge = js.native
    
    def renderBackingLayers(_node: TreeNode[Any]): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.ShapePath */ Any
      ] = js.native
    
    def renderGroupLayer(param0: TreeNode[Any]): /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any = js.native
  }
}
