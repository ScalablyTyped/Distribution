package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classifications extends StObject {
  
  var endOfLineState: EndOfLineState
  
  var spans: js.Array[Double]
}
object Classifications {
  
  inline def apply(endOfLineState: EndOfLineState, spans: js.Array[Double]): Classifications = {
    val __obj = js.Dynamic.literal(endOfLineState = endOfLineState.asInstanceOf[js.Any], spans = spans.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifications]
  }
  
  extension [Self <: Classifications](x: Self) {
    
    inline def setEndOfLineState(value: EndOfLineState): Self = StObject.set(x, "endOfLineState", value.asInstanceOf[js.Any])
    
    inline def setSpans(value: js.Array[Double]): Self = StObject.set(x, "spans", value.asInstanceOf[js.Any])
    
    inline def setSpansVarargs(value: Double*): Self = StObject.set(x, "spans", js.Array(value*))
  }
}
