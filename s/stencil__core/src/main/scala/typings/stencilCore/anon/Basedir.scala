package typings.stencilCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Basedir extends StObject {
  
  @JSName("package")
  var _package: js.UndefOr[String] = js.undefined
  
  var basedir: js.UndefOr[String] = js.undefined
  
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  var isDirectory: js.UndefOr[js.Function] = js.undefined
  
  var isFile: js.UndefOr[js.Function] = js.undefined
  
  var moduleDirectory: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var packageFilter: js.UndefOr[js.Function] = js.undefined
  
  var pathFilter: js.UndefOr[js.Function] = js.undefined
  
  var paths: js.UndefOr[js.Function | js.Array[String]] = js.undefined
  
  var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
  
  var readFile: js.UndefOr[js.Function] = js.undefined
}
object Basedir {
  
  inline def apply(): Basedir = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Basedir]
  }
  
  extension [Self <: Basedir](x: Self) {
    
    inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
    
    inline def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setIsDirectory(value: js.Function): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
    
    inline def setIsDirectoryUndefined: Self = StObject.set(x, "isDirectory", js.undefined)
    
    inline def setIsFile(value: js.Function): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
    
    inline def setIsFileUndefined: Self = StObject.set(x, "isFile", js.undefined)
    
    inline def setModuleDirectory(value: String | js.Array[String]): Self = StObject.set(x, "moduleDirectory", value.asInstanceOf[js.Any])
    
    inline def setModuleDirectoryUndefined: Self = StObject.set(x, "moduleDirectory", js.undefined)
    
    inline def setModuleDirectoryVarargs(value: String*): Self = StObject.set(x, "moduleDirectory", js.Array(value*))
    
    inline def setPackageFilter(value: js.Function): Self = StObject.set(x, "packageFilter", value.asInstanceOf[js.Any])
    
    inline def setPackageFilterUndefined: Self = StObject.set(x, "packageFilter", js.undefined)
    
    inline def setPathFilter(value: js.Function): Self = StObject.set(x, "pathFilter", value.asInstanceOf[js.Any])
    
    inline def setPathFilterUndefined: Self = StObject.set(x, "pathFilter", js.undefined)
    
    inline def setPaths(value: js.Function | js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
    
    inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
    
    inline def setReadFile(value: js.Function): Self = StObject.set(x, "readFile", value.asInstanceOf[js.Any])
    
    inline def setReadFileUndefined: Self = StObject.set(x, "readFile", js.undefined)
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
