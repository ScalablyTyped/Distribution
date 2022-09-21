package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.angular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputTargetAngular
  extends StObject
     with OutputTargetBase
     with OutputTarget {
  
  var componentCorePackage: String
  
  var directivesArrayFile: js.UndefOr[String] = js.undefined
  
  var directivesProxyFile: js.UndefOr[String] = js.undefined
  
  var directivesUtilsFile: js.UndefOr[String] = js.undefined
  
  var excludeComponents: js.UndefOr[js.Array[String]] = js.undefined
  
  @JSName("type")
  var type_OutputTargetAngular: angular
}
object OutputTargetAngular {
  
  inline def apply(componentCorePackage: String): OutputTargetAngular = {
    val __obj = js.Dynamic.literal(componentCorePackage = componentCorePackage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("angular")
    __obj.asInstanceOf[OutputTargetAngular]
  }
  
  extension [Self <: OutputTargetAngular](x: Self) {
    
    inline def setComponentCorePackage(value: String): Self = StObject.set(x, "componentCorePackage", value.asInstanceOf[js.Any])
    
    inline def setDirectivesArrayFile(value: String): Self = StObject.set(x, "directivesArrayFile", value.asInstanceOf[js.Any])
    
    inline def setDirectivesArrayFileUndefined: Self = StObject.set(x, "directivesArrayFile", js.undefined)
    
    inline def setDirectivesProxyFile(value: String): Self = StObject.set(x, "directivesProxyFile", value.asInstanceOf[js.Any])
    
    inline def setDirectivesProxyFileUndefined: Self = StObject.set(x, "directivesProxyFile", js.undefined)
    
    inline def setDirectivesUtilsFile(value: String): Self = StObject.set(x, "directivesUtilsFile", value.asInstanceOf[js.Any])
    
    inline def setDirectivesUtilsFileUndefined: Self = StObject.set(x, "directivesUtilsFile", js.undefined)
    
    inline def setExcludeComponents(value: js.Array[String]): Self = StObject.set(x, "excludeComponents", value.asInstanceOf[js.Any])
    
    inline def setExcludeComponentsUndefined: Self = StObject.set(x, "excludeComponents", js.undefined)
    
    inline def setExcludeComponentsVarargs(value: String*): Self = StObject.set(x, "excludeComponents", js.Array(value*))
    
    inline def setType(value: angular): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
