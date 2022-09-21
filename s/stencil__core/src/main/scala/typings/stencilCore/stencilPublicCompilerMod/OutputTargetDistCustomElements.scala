package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.`dist-custom-elements`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputTargetDistCustomElements
  extends StObject
     with OutputTargetBaseNext
     with OutputTarget {
  
  /**
    * Enables the auto-definition of a component and its children (recursively) in the custom elements registry. This
    * functionality allows consumers to bypass the explicit call to define a component, its children, its children's
    * children, etc. Users of this flag should be aware that enabling this functionality may increase bundle size.
    */
  var autoDefineCustomElements: js.UndefOr[Boolean] = js.undefined
  
  var copy: js.UndefOr[js.Array[CopyTask]] = js.undefined
  
  var empty: js.UndefOr[Boolean] = js.undefined
  
  var externalRuntime: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables the generation of type definition files for the output target.
    */
  var generateTypeDeclarations: js.UndefOr[Boolean] = js.undefined
  
  var includeGlobalScripts: js.UndefOr[Boolean] = js.undefined
  
  var inlineDynamicImports: js.UndefOr[Boolean] = js.undefined
  
  var minify: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_OutputTargetDistCustomElements: `dist-custom-elements`
}
object OutputTargetDistCustomElements {
  
  inline def apply(): OutputTargetDistCustomElements = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dist-custom-elements")
    __obj.asInstanceOf[OutputTargetDistCustomElements]
  }
  
  extension [Self <: OutputTargetDistCustomElements](x: Self) {
    
    inline def setAutoDefineCustomElements(value: Boolean): Self = StObject.set(x, "autoDefineCustomElements", value.asInstanceOf[js.Any])
    
    inline def setAutoDefineCustomElementsUndefined: Self = StObject.set(x, "autoDefineCustomElements", js.undefined)
    
    inline def setCopy(value: js.Array[CopyTask]): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setCopyVarargs(value: CopyTask*): Self = StObject.set(x, "copy", js.Array(value*))
    
    inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    inline def setExternalRuntime(value: Boolean): Self = StObject.set(x, "externalRuntime", value.asInstanceOf[js.Any])
    
    inline def setExternalRuntimeUndefined: Self = StObject.set(x, "externalRuntime", js.undefined)
    
    inline def setGenerateTypeDeclarations(value: Boolean): Self = StObject.set(x, "generateTypeDeclarations", value.asInstanceOf[js.Any])
    
    inline def setGenerateTypeDeclarationsUndefined: Self = StObject.set(x, "generateTypeDeclarations", js.undefined)
    
    inline def setIncludeGlobalScripts(value: Boolean): Self = StObject.set(x, "includeGlobalScripts", value.asInstanceOf[js.Any])
    
    inline def setIncludeGlobalScriptsUndefined: Self = StObject.set(x, "includeGlobalScripts", js.undefined)
    
    inline def setInlineDynamicImports(value: Boolean): Self = StObject.set(x, "inlineDynamicImports", value.asInstanceOf[js.Any])
    
    inline def setInlineDynamicImportsUndefined: Self = StObject.set(x, "inlineDynamicImports", js.undefined)
    
    inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
    
    inline def setType(value: `dist-custom-elements`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
