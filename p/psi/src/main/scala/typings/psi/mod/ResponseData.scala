package typings.psi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseData extends StObject {
  
  var data: Result
}
object ResponseData {
  
  inline def apply(data: Result): ResponseData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseData]
  }
  
  extension [Self <: ResponseData](x: Self) {
    
    inline def setData(value: Result): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
