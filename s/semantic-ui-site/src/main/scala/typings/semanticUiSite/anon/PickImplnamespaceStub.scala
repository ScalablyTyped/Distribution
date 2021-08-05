package typings.semanticUiSite.anon

import typings.semanticUiSite.SemanticUI.Site.NamespaceStubSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-site.SemanticUI.SiteSettings._Impl, 'namespaceStub'> */
trait PickImplnamespaceStub extends StObject {
  
  var namespaceStub: NamespaceStubSettings
}
object PickImplnamespaceStub {
  
  inline def apply(namespaceStub: NamespaceStubSettings): PickImplnamespaceStub = {
    val __obj = js.Dynamic.literal(namespaceStub = namespaceStub.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnamespaceStub]
  }
  
  extension [Self <: PickImplnamespaceStub](x: Self) {
    
    inline def setNamespaceStub(value: NamespaceStubSettings): Self = StObject.set(x, "namespaceStub", value.asInstanceOf[js.Any])
  }
}
