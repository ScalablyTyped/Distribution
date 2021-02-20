package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaitResult extends StObject {
  
  var ready: Double = js.native
}
object WaitResult {
  
  @scala.inline
  def apply(ready: Double): WaitResult = {
    val __obj = js.Dynamic.literal(ready = ready.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitResult]
  }
  
  @scala.inline
  implicit class WaitResultMutableBuilder[Self <: WaitResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReady(value: Double): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
  }
}
