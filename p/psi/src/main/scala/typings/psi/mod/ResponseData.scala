package typings.psi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseData extends StObject {
  
  var data: Result
}
object ResponseData {
  
  @scala.inline
  def apply(data: Result): ResponseData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseData]
  }
  
  @scala.inline
  implicit class ResponseDataMutableBuilder[Self <: ResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Result): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
