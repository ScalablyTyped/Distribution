package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl, 'noContent'> */
trait PickImplnoContent extends StObject {
  
  var noContent: String
}
object PickImplnoContent {
  
  inline def apply(noContent: String): PickImplnoContent = {
    val __obj = js.Dynamic.literal(noContent = noContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoContent]
  }
  
  extension [Self <: PickImplnoContent](x: Self) {
    
    inline def setNoContent(value: String): Self = StObject.set(x, "noContent", value.asInstanceOf[js.Any])
  }
}
