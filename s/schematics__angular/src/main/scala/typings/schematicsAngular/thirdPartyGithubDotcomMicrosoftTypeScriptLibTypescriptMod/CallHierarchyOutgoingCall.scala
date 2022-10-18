package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallHierarchyOutgoingCall extends StObject {
  
  var fromSpans: js.Array[TextSpan]
  
  var to: CallHierarchyItem
}
object CallHierarchyOutgoingCall {
  
  inline def apply(fromSpans: js.Array[TextSpan], to: CallHierarchyItem): CallHierarchyOutgoingCall = {
    val __obj = js.Dynamic.literal(fromSpans = fromSpans.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyOutgoingCall]
  }
  
  extension [Self <: CallHierarchyOutgoingCall](x: Self) {
    
    inline def setFromSpans(value: js.Array[TextSpan]): Self = StObject.set(x, "fromSpans", value.asInstanceOf[js.Any])
    
    inline def setFromSpansVarargs(value: TextSpan*): Self = StObject.set(x, "fromSpans", js.Array(value*))
    
    inline def setTo(value: CallHierarchyItem): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
