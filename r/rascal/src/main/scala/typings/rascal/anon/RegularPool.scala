package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegularPool extends StObject {
  
  var confirmPool: Autostart = js.native
  
  var regularPool: Autostart = js.native
}
object RegularPool {
  
  @scala.inline
  def apply(confirmPool: Autostart, regularPool: Autostart): RegularPool = {
    val __obj = js.Dynamic.literal(confirmPool = confirmPool.asInstanceOf[js.Any], regularPool = regularPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegularPool]
  }
  
  @scala.inline
  implicit class RegularPoolMutableBuilder[Self <: RegularPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirmPool(value: Autostart): Self = StObject.set(x, "confirmPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegularPool(value: Autostart): Self = StObject.set(x, "regularPool", value.asInstanceOf[js.Any])
  }
}
