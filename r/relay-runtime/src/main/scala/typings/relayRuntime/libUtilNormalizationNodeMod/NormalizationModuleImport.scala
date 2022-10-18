package typings.relayRuntime.libUtilNormalizationNodeMod

import typings.relayRuntime.libUtilJsresourcereferenceMod.JSResourceReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationModuleImport
  extends StObject
     with NormalizationSelection {
  
  val args: js.UndefOr[js.Array[NormalizationArgument] | Null] = js.undefined
  
  val componentModuleProvider: js.UndefOr[js.Function0[Any | js.Promise[Any] | JSResourceReference[Any]]] = js.undefined
  
  // "ModuleImport";
  val documentName: String
  
  val fragmentName: String
  
  val fragmentPropName: String
  
  val kind: String
  
  val operationModuleProvider: js.UndefOr[
    js.Function0[
      NormalizationRootNode | js.Promise[NormalizationRootNode] | JSResourceReference[NormalizationRootNode]
    ]
  ] = js.undefined
}
object NormalizationModuleImport {
  
  inline def apply(documentName: String, fragmentName: String, fragmentPropName: String, kind: String): NormalizationModuleImport = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], fragmentName = fragmentName.asInstanceOf[js.Any], fragmentPropName = fragmentPropName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationModuleImport]
  }
  
  extension [Self <: NormalizationModuleImport](x: Self) {
    
    inline def setArgs(value: js.Array[NormalizationArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: NormalizationArgument*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setComponentModuleProvider(value: () => Any | js.Promise[Any] | JSResourceReference[Any]): Self = StObject.set(x, "componentModuleProvider", js.Any.fromFunction0(value))
    
    inline def setComponentModuleProviderUndefined: Self = StObject.set(x, "componentModuleProvider", js.undefined)
    
    inline def setDocumentName(value: String): Self = StObject.set(x, "documentName", value.asInstanceOf[js.Any])
    
    inline def setFragmentName(value: String): Self = StObject.set(x, "fragmentName", value.asInstanceOf[js.Any])
    
    inline def setFragmentPropName(value: String): Self = StObject.set(x, "fragmentPropName", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOperationModuleProvider(
      value: () => NormalizationRootNode | js.Promise[NormalizationRootNode] | JSResourceReference[NormalizationRootNode]
    ): Self = StObject.set(x, "operationModuleProvider", js.Any.fromFunction0(value))
    
    inline def setOperationModuleProviderUndefined: Self = StObject.set(x, "operationModuleProvider", js.undefined)
  }
}
