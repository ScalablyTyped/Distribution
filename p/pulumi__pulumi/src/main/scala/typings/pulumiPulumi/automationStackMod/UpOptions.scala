package typings.pulumiPulumi.automationStackMod

import typings.pulumiPulumi.workspaceMod.PulumiFn
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpOptions extends StObject {
  
  var expectNoChanges: js.UndefOr[Boolean] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var onOutput: js.UndefOr[js.Function1[/* out */ String, Unit]] = js.undefined
  
  var parallel: js.UndefOr[Double] = js.undefined
  
  var program: js.UndefOr[PulumiFn] = js.undefined
  
  var replace: js.UndefOr[js.Array[String]] = js.undefined
  
  var target: js.UndefOr[js.Array[String]] = js.undefined
  
  var targetDependents: js.UndefOr[Boolean] = js.undefined
}
object UpOptions {
  
  inline def apply(): UpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpOptions]
  }
  
  extension [Self <: UpOptions](x: Self) {
    
    inline def setExpectNoChanges(value: Boolean): Self = StObject.set(x, "expectNoChanges", value.asInstanceOf[js.Any])
    
    inline def setExpectNoChangesUndefined: Self = StObject.set(x, "expectNoChanges", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setOnOutput(value: /* out */ String => Unit): Self = StObject.set(x, "onOutput", js.Any.fromFunction1(value))
    
    inline def setOnOutputUndefined: Self = StObject.set(x, "onOutput", js.undefined)
    
    inline def setParallel(value: Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
    
    inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
    
    inline def setProgram(value: () => js.Promise[(Record[String, js.Any]) | Unit]): Self = StObject.set(x, "program", js.Any.fromFunction0(value))
    
    inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
    
    inline def setReplace(value: js.Array[String]): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setReplaceVarargs(value: String*): Self = StObject.set(x, "replace", js.Array(value :_*))
    
    inline def setTarget(value: js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetDependents(value: Boolean): Self = StObject.set(x, "targetDependents", value.asInstanceOf[js.Any])
    
    inline def setTargetDependentsUndefined: Self = StObject.set(x, "targetDependents", js.undefined)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value :_*))
  }
}
