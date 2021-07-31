package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitOptions extends StObject {
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var waitFor: js.UndefOr[typings.rethinkdb.mod.waitFor] = js.undefined
}
object WaitOptions {
  
  @scala.inline
  def apply(): WaitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitOptions]
  }
  
  @scala.inline
  implicit class WaitOptionsMutableBuilder[Self <: WaitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setWaitFor(value: waitFor): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
  }
}
