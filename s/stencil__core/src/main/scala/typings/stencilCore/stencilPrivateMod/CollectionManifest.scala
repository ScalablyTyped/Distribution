package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionManifest extends StObject {
  
  var bundles: js.UndefOr[js.Array[CollectionBundleManifest]] = js.undefined
  
  var collections: js.UndefOr[js.Array[CollectionDependencyManifest]] = js.undefined
  
  var compiler: js.UndefOr[CollectionCompilerVersion] = js.undefined
  
  var entries: js.UndefOr[js.Array[CollectionComponentEntryPath]] = js.undefined
  
  var global: js.UndefOr[String] = js.undefined
}
object CollectionManifest {
  
  inline def apply(): CollectionManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionManifest]
  }
  
  extension [Self <: CollectionManifest](x: Self) {
    
    inline def setBundles(value: js.Array[CollectionBundleManifest]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    inline def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
    
    inline def setBundlesVarargs(value: CollectionBundleManifest*): Self = StObject.set(x, "bundles", js.Array(value*))
    
    inline def setCollections(value: js.Array[CollectionDependencyManifest]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setCollectionsUndefined: Self = StObject.set(x, "collections", js.undefined)
    
    inline def setCollectionsVarargs(value: CollectionDependencyManifest*): Self = StObject.set(x, "collections", js.Array(value*))
    
    inline def setCompiler(value: CollectionCompilerVersion): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
    
    inline def setEntries(value: js.Array[CollectionComponentEntryPath]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: CollectionComponentEntryPath*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setGlobal(value: String): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
  }
}
