package typings.pulumiPulumi.automationStackMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshOptions extends StObject {
  
  var expectNoChanges: js.UndefOr[Boolean] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var onOutput: js.UndefOr[js.Function1[/* out */ String, Unit]] = js.undefined
  
  var parallel: js.UndefOr[Double] = js.undefined
  
  var target: js.UndefOr[js.Array[String]] = js.undefined
}
object RefreshOptions {
  
  @scala.inline
  def apply(): RefreshOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshOptions]
  }
  
  @scala.inline
  implicit class RefreshOptionsMutableBuilder[Self <: RefreshOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpectNoChanges(value: Boolean): Self = StObject.set(x, "expectNoChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectNoChangesUndefined: Self = StObject.set(x, "expectNoChanges", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOnOutput(value: /* out */ String => Unit): Self = StObject.set(x, "onOutput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOutputUndefined: Self = StObject.set(x, "onOutput", js.undefined)
    
    @scala.inline
    def setParallel(value: Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value :_*))
  }
}
