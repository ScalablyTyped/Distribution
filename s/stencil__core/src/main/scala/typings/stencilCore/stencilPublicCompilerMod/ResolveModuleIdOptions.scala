package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveModuleIdOptions extends StObject {
  
  var containingFile: js.UndefOr[String] = js.undefined
  
  var exts: js.UndefOr[js.Array[String]] = js.undefined
  
  var moduleId: String
  
  var packageFilter: js.UndefOr[js.Function1[/* pkg */ Any, Unit]] = js.undefined
}
object ResolveModuleIdOptions {
  
  inline def apply(moduleId: String): ResolveModuleIdOptions = {
    val __obj = js.Dynamic.literal(moduleId = moduleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveModuleIdOptions]
  }
  
  extension [Self <: ResolveModuleIdOptions](x: Self) {
    
    inline def setContainingFile(value: String): Self = StObject.set(x, "containingFile", value.asInstanceOf[js.Any])
    
    inline def setContainingFileUndefined: Self = StObject.set(x, "containingFile", js.undefined)
    
    inline def setExts(value: js.Array[String]): Self = StObject.set(x, "exts", value.asInstanceOf[js.Any])
    
    inline def setExtsUndefined: Self = StObject.set(x, "exts", js.undefined)
    
    inline def setExtsVarargs(value: String*): Self = StObject.set(x, "exts", js.Array(value*))
    
    inline def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setPackageFilter(value: /* pkg */ Any => Unit): Self = StObject.set(x, "packageFilter", js.Any.fromFunction1(value))
    
    inline def setPackageFilterUndefined: Self = StObject.set(x, "packageFilter", js.undefined)
  }
}
