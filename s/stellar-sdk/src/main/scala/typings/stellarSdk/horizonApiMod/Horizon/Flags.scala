package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flags extends StObject {
  
  var auth_immutable: Boolean = js.native
  
  var auth_required: Boolean = js.native
  
  var auth_revocable: Boolean = js.native
}
object Flags {
  
  @scala.inline
  def apply(auth_immutable: Boolean, auth_required: Boolean, auth_revocable: Boolean): Flags = {
    val __obj = js.Dynamic.literal(auth_immutable = auth_immutable.asInstanceOf[js.Any], auth_required = auth_required.asInstanceOf[js.Any], auth_revocable = auth_revocable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
  
  @scala.inline
  implicit class FlagsMutableBuilder[Self <: Flags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth_immutable(value: Boolean): Self = StObject.set(x, "auth_immutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuth_required(value: Boolean): Self = StObject.set(x, "auth_required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuth_revocable(value: Boolean): Self = StObject.set(x, "auth_revocable", value.asInstanceOf[js.Any])
  }
}
