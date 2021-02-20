package typings.siesta.Siesta.Test

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWaitForReturn extends StObject {
  
  var force: js.Function = js.native
}
object IWaitForReturn {
  
  @scala.inline
  def apply(force: js.Function): IWaitForReturn = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWaitForReturn]
  }
  
  @scala.inline
  implicit class IWaitForReturnMutableBuilder[Self <: IWaitForReturn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: js.Function): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
  }
}
