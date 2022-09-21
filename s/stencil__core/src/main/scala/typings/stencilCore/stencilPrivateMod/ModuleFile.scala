package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleFile extends StObject {
  
  var cmpMeta: js.UndefOr[Any] = js.undefined
  
  var dtsFilePath: js.UndefOr[String] = js.undefined
  
  var excludeFromCollection: js.UndefOr[Boolean] = js.undefined
  
  var externalImports: js.UndefOr[js.Array[String]] = js.undefined
  
  var hasSlot: js.UndefOr[Boolean] = js.undefined
  
  var hasSvg: js.UndefOr[Boolean] = js.undefined
  
  var isCollectionDependency: js.UndefOr[Boolean] = js.undefined
  
  var jsFilePath: js.UndefOr[String] = js.undefined
  
  var localImports: js.UndefOr[js.Array[String]] = js.undefined
  
  var originalCollectionComponentPath: js.UndefOr[String] = js.undefined
  
  var potentialCmpRefs: js.UndefOr[js.Array[String]] = js.undefined
  
  var sourceFilePath: String
}
object ModuleFile {
  
  inline def apply(sourceFilePath: String): ModuleFile = {
    val __obj = js.Dynamic.literal(sourceFilePath = sourceFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleFile]
  }
  
  extension [Self <: ModuleFile](x: Self) {
    
    inline def setCmpMeta(value: Any): Self = StObject.set(x, "cmpMeta", value.asInstanceOf[js.Any])
    
    inline def setCmpMetaUndefined: Self = StObject.set(x, "cmpMeta", js.undefined)
    
    inline def setDtsFilePath(value: String): Self = StObject.set(x, "dtsFilePath", value.asInstanceOf[js.Any])
    
    inline def setDtsFilePathUndefined: Self = StObject.set(x, "dtsFilePath", js.undefined)
    
    inline def setExcludeFromCollection(value: Boolean): Self = StObject.set(x, "excludeFromCollection", value.asInstanceOf[js.Any])
    
    inline def setExcludeFromCollectionUndefined: Self = StObject.set(x, "excludeFromCollection", js.undefined)
    
    inline def setExternalImports(value: js.Array[String]): Self = StObject.set(x, "externalImports", value.asInstanceOf[js.Any])
    
    inline def setExternalImportsUndefined: Self = StObject.set(x, "externalImports", js.undefined)
    
    inline def setExternalImportsVarargs(value: String*): Self = StObject.set(x, "externalImports", js.Array(value*))
    
    inline def setHasSlot(value: Boolean): Self = StObject.set(x, "hasSlot", value.asInstanceOf[js.Any])
    
    inline def setHasSlotUndefined: Self = StObject.set(x, "hasSlot", js.undefined)
    
    inline def setHasSvg(value: Boolean): Self = StObject.set(x, "hasSvg", value.asInstanceOf[js.Any])
    
    inline def setHasSvgUndefined: Self = StObject.set(x, "hasSvg", js.undefined)
    
    inline def setIsCollectionDependency(value: Boolean): Self = StObject.set(x, "isCollectionDependency", value.asInstanceOf[js.Any])
    
    inline def setIsCollectionDependencyUndefined: Self = StObject.set(x, "isCollectionDependency", js.undefined)
    
    inline def setJsFilePath(value: String): Self = StObject.set(x, "jsFilePath", value.asInstanceOf[js.Any])
    
    inline def setJsFilePathUndefined: Self = StObject.set(x, "jsFilePath", js.undefined)
    
    inline def setLocalImports(value: js.Array[String]): Self = StObject.set(x, "localImports", value.asInstanceOf[js.Any])
    
    inline def setLocalImportsUndefined: Self = StObject.set(x, "localImports", js.undefined)
    
    inline def setLocalImportsVarargs(value: String*): Self = StObject.set(x, "localImports", js.Array(value*))
    
    inline def setOriginalCollectionComponentPath(value: String): Self = StObject.set(x, "originalCollectionComponentPath", value.asInstanceOf[js.Any])
    
    inline def setOriginalCollectionComponentPathUndefined: Self = StObject.set(x, "originalCollectionComponentPath", js.undefined)
    
    inline def setPotentialCmpRefs(value: js.Array[String]): Self = StObject.set(x, "potentialCmpRefs", value.asInstanceOf[js.Any])
    
    inline def setPotentialCmpRefsUndefined: Self = StObject.set(x, "potentialCmpRefs", js.undefined)
    
    inline def setPotentialCmpRefsVarargs(value: String*): Self = StObject.set(x, "potentialCmpRefs", js.Array(value*))
    
    inline def setSourceFilePath(value: String): Self = StObject.set(x, "sourceFilePath", value.asInstanceOf[js.Any])
  }
}
