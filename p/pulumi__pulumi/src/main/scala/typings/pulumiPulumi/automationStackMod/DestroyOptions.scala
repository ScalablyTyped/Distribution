package typings.pulumiPulumi.automationStackMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestroyOptions extends StObject {
  
  var message: js.UndefOr[String] = js.undefined
  
  var onOutput: js.UndefOr[js.Function1[/* out */ String, Unit]] = js.undefined
  
  var parallel: js.UndefOr[Double] = js.undefined
  
  var target: js.UndefOr[js.Array[String]] = js.undefined
  
  var targetDependents: js.UndefOr[Boolean] = js.undefined
}
object DestroyOptions {
  
  inline def apply(): DestroyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroyOptions]
  }
  
  extension [Self <: DestroyOptions](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setOnOutput(value: /* out */ String => Unit): Self = StObject.set(x, "onOutput", js.Any.fromFunction1(value))
    
    inline def setOnOutputUndefined: Self = StObject.set(x, "onOutput", js.undefined)
    
    inline def setParallel(value: Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
    
    inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
    
    inline def setTarget(value: js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetDependents(value: Boolean): Self = StObject.set(x, "targetDependents", value.asInstanceOf[js.Any])
    
    inline def setTargetDependentsUndefined: Self = StObject.set(x, "targetDependents", js.undefined)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value :_*))
  }
}
