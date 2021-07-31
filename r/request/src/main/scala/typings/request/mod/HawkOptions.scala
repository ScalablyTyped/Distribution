package typings.request.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HawkOptions extends StObject {
  
  var credentials: js.Any
}
object HawkOptions {
  
  @scala.inline
  def apply(credentials: js.Any): HawkOptions = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[HawkOptions]
  }
  
  @scala.inline
  implicit class HawkOptionsMutableBuilder[Self <: HawkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: js.Any): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
  }
}
