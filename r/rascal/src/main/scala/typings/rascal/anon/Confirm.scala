package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Confirm extends StObject {
  
  var confirm: Boolean = js.native
  
  var options: Mandatory = js.native
  
  var vhost: String = js.native
}
object Confirm {
  
  @scala.inline
  def apply(confirm: Boolean, options: Mandatory, vhost: String): Confirm = {
    val __obj = js.Dynamic.literal(confirm = confirm.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], vhost = vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[Confirm]
  }
  
  @scala.inline
  implicit class ConfirmMutableBuilder[Self <: Confirm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Mandatory): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVhost(value: String): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
  }
}
