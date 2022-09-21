package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.anon.Components
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collection extends StObject {
  
  var bundles: js.UndefOr[js.Array[Components]] = js.undefined
  
  var collectionName: js.UndefOr[String] = js.undefined
  
  var compiler: js.UndefOr[CollectionCompiler] = js.undefined
  
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var global: js.UndefOr[Any] = js.undefined
  
  var hasExports: js.UndefOr[Boolean] = js.undefined
  
  var isInitialized: js.UndefOr[Boolean] = js.undefined
  
  var moduleDir: js.UndefOr[String] = js.undefined
  
  var moduleFiles: js.UndefOr[js.Array[Any]] = js.undefined
}
object Collection {
  
  inline def apply(): Collection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collection]
  }
  
  extension [Self <: Collection](x: Self) {
    
    inline def setBundles(value: js.Array[Components]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    inline def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
    
    inline def setBundlesVarargs(value: Components*): Self = StObject.set(x, "bundles", js.Array(value*))
    
    inline def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
    
    inline def setCollectionNameUndefined: Self = StObject.set(x, "collectionName", js.undefined)
    
    inline def setCompiler(value: CollectionCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setGlobal(value: Any): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setHasExports(value: Boolean): Self = StObject.set(x, "hasExports", value.asInstanceOf[js.Any])
    
    inline def setHasExportsUndefined: Self = StObject.set(x, "hasExports", js.undefined)
    
    inline def setIsInitialized(value: Boolean): Self = StObject.set(x, "isInitialized", value.asInstanceOf[js.Any])
    
    inline def setIsInitializedUndefined: Self = StObject.set(x, "isInitialized", js.undefined)
    
    inline def setModuleDir(value: String): Self = StObject.set(x, "moduleDir", value.asInstanceOf[js.Any])
    
    inline def setModuleDirUndefined: Self = StObject.set(x, "moduleDir", js.undefined)
    
    inline def setModuleFiles(value: js.Array[Any]): Self = StObject.set(x, "moduleFiles", value.asInstanceOf[js.Any])
    
    inline def setModuleFilesUndefined: Self = StObject.set(x, "moduleFiles", js.undefined)
    
    inline def setModuleFilesVarargs(value: Any*): Self = StObject.set(x, "moduleFiles", js.Array(value*))
  }
}
