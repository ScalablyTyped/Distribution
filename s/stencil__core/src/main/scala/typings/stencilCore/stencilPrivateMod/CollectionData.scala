package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.anon.TypescriptVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionData extends StObject {
  
  var bundles: js.UndefOr[js.Array[CollectionBundle]] = js.undefined
  
  var collections: js.UndefOr[js.Array[CollectionDependencyData]] = js.undefined
  
  var compiler: js.UndefOr[TypescriptVersion] = js.undefined
  
  var components: js.UndefOr[js.Array[ComponentData]] = js.undefined
  
  var global: js.UndefOr[String] = js.undefined
  
  var modules: js.UndefOr[js.Array[String]] = js.undefined
}
object CollectionData {
  
  inline def apply(): CollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionData]
  }
  
  extension [Self <: CollectionData](x: Self) {
    
    inline def setBundles(value: js.Array[CollectionBundle]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    inline def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
    
    inline def setBundlesVarargs(value: CollectionBundle*): Self = StObject.set(x, "bundles", js.Array(value*))
    
    inline def setCollections(value: js.Array[CollectionDependencyData]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setCollectionsUndefined: Self = StObject.set(x, "collections", js.undefined)
    
    inline def setCollectionsVarargs(value: CollectionDependencyData*): Self = StObject.set(x, "collections", js.Array(value*))
    
    inline def setCompiler(value: TypescriptVersion): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
    
    inline def setComponents(value: js.Array[ComponentData]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setComponentsVarargs(value: ComponentData*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setGlobal(value: String): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setModules(value: js.Array[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    inline def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value*))
  }
}
