package typings.servicenow.servicenow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RESTAPIResponseStream extends StObject {
  
  def writeStream(stream: js.Object): Unit
  
  def writeString(data: String): Unit
}
object RESTAPIResponseStream {
  
  inline def apply(writeStream: js.Object => Unit, writeString: String => Unit): RESTAPIResponseStream = {
    val __obj = js.Dynamic.literal(writeStream = js.Any.fromFunction1(writeStream), writeString = js.Any.fromFunction1(writeString))
    __obj.asInstanceOf[RESTAPIResponseStream]
  }
  
  extension [Self <: RESTAPIResponseStream](x: Self) {
    
    inline def setWriteStream(value: js.Object => Unit): Self = StObject.set(x, "writeStream", js.Any.fromFunction1(value))
    
    inline def setWriteString(value: String => Unit): Self = StObject.set(x, "writeString", js.Any.fromFunction1(value))
  }
}
