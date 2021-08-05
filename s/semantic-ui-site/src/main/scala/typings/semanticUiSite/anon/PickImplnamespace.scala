package typings.semanticUiSite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-site.SemanticUI.SiteSettings._Impl, 'namespace'> */
trait PickImplnamespace extends StObject {
  
  var namespace: String
}
object PickImplnamespace {
  
  inline def apply(namespace: String): PickImplnamespace = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnamespace]
  }
  
  extension [Self <: PickImplnamespace](x: Self) {
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
  }
}
