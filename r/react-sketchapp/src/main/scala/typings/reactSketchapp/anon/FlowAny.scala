package typings.reactSketchapp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowAny extends StObject {
  
  var flow: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.FlowConnection */ Any
}
object FlowAny {
  
  inline def apply(
    flow: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.FlowConnection */ Any
  ): FlowAny = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowAny]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlowAny] (val x: Self) extends AnyVal {
    
    inline def setFlow(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.FlowConnection */ Any
    ): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
  }
}
