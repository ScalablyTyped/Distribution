package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pkg extends StObject {
  
  var id: String
  
  var info: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PkgInfo */ Any
}
object Pkg {
  
  inline def apply(
    id: String,
    info: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PkgInfo */ Any
  ): Pkg = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pkg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pkg] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInfo(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PkgInfo */ Any
    ): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
