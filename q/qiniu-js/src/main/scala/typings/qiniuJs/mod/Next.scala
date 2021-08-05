package typings.qiniuJs.mod

import typings.qiniuJs.anon.Loaded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Next extends StObject {
  
  var total: Loaded
}
object Next {
  
  inline def apply(total: Loaded): Next = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
  
  extension [Self <: Next](x: Self) {
    
    inline def setTotal(value: Loaded): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
