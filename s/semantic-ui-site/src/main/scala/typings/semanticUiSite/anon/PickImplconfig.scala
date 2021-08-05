package typings.semanticUiSite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-site.SemanticUI.Site.NamespaceStubSettings._Impl, 'config'> */
trait PickImplconfig extends StObject {
  
  var config: js.Any
}
object PickImplconfig {
  
  inline def apply(config: js.Any): PickImplconfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplconfig]
  }
  
  extension [Self <: PickImplconfig](x: Self) {
    
    inline def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
  }
}
