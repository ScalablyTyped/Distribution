package typings.smooch

import typings.smooch.smoochStrings.pending
import typings.smooch.smoochStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  var status: resolved | pending | String
}
object Status {
  
  inline def apply(status: resolved | pending | String): Status = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: resolved | pending | String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
