package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Access extends StObject {
  
  var access: Boolean
}
object Access {
  
  @scala.inline
  def apply(access: Boolean): Access = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any])
    __obj.asInstanceOf[Access]
  }
  
  @scala.inline
  implicit class AccessMutableBuilder[Self <: Access] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess(value: Boolean): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
  }
}
