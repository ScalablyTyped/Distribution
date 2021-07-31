package typings.pulumiPulumi.automationStackMod

import typings.pulumiPulumi.workspaceMod.PulumiFn
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewOptions extends StObject {
  
  var expectNoChanges: js.UndefOr[Boolean] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var parallel: js.UndefOr[Double] = js.undefined
  
  var program: js.UndefOr[PulumiFn] = js.undefined
  
  var replace: js.UndefOr[js.Array[String]] = js.undefined
  
  var target: js.UndefOr[js.Array[String]] = js.undefined
  
  var targetDependents: js.UndefOr[Boolean] = js.undefined
}
object PreviewOptions {
  
  @scala.inline
  def apply(): PreviewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewOptions]
  }
  
  @scala.inline
  implicit class PreviewOptionsMutableBuilder[Self <: PreviewOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpectNoChanges(value: Boolean): Self = StObject.set(x, "expectNoChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectNoChangesUndefined: Self = StObject.set(x, "expectNoChanges", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setParallel(value: Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
    
    @scala.inline
    def setProgram(value: () => js.Promise[(Record[String, js.Any]) | Unit]): Self = StObject.set(x, "program", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
    
    @scala.inline
    def setReplace(value: js.Array[String]): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    @scala.inline
    def setReplaceVarargs(value: String*): Self = StObject.set(x, "replace", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDependents(value: Boolean): Self = StObject.set(x, "targetDependents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDependentsUndefined: Self = StObject.set(x, "targetDependents", js.undefined)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value :_*))
  }
}
