package typings.siesta.Siesta.Test.Action

import typings.siesta.Siesta.Test.IAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  */
trait Wait
  extends StObject
     with IAction {
  
  var args: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var waitFor: js.UndefOr[String] = js.undefined
}
object Wait {
  
  @scala.inline
  def apply(): Wait = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Wait]
  }
  
  @scala.inline
  implicit class WaitMutableBuilder[Self <: Wait] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setWaitFor(value: String): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
  }
}
