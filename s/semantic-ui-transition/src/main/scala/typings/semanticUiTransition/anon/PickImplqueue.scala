package typings.semanticUiTransition.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, 'queue'> */
trait PickImplqueue extends StObject {
  
  var queue: Boolean
}
object PickImplqueue {
  
  inline def apply(queue: Boolean): PickImplqueue = {
    val __obj = js.Dynamic.literal(queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplqueue]
  }
  
  extension [Self <: PickImplqueue](x: Self) {
    
    inline def setQueue(value: Boolean): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
  }
}
