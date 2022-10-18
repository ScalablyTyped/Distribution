package typings.reactSketchapp

import typings.reactSketchapp.libModuleTypesMod.PlatformBridge
import typings.reactSketchapp.libModuleTypesMod.TreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleFlexToSketchJSONMod {
  
  @JSImport("react-sketchapp/lib/module/flexToSketchJSON", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flexToSketchJSON(bridge: PlatformBridge): js.Function1[
    /* node */ String | TreeNode[Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("flexToSketchJSON")(bridge.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* node */ String | TreeNode[Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
  ]]
}
