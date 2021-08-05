package typings.semanticUiSite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-site.SemanticUI.SiteSettings._Impl, 'modules'> */
trait PickImplmodules extends StObject {
  
  var modules: js.Array[String]
}
object PickImplmodules {
  
  inline def apply(modules: js.Array[String]): PickImplmodules = {
    val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmodules]
  }
  
  extension [Self <: PickImplmodules](x: Self) {
    
    inline def setModules(value: js.Array[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value :_*))
  }
}
