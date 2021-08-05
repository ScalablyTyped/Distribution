package typings.restfulJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data[T] extends StObject {
    
    var data: T
    
    var headers: typings.restfulJs.mod.Headers
    
    var status: Double
    
    var statusText: String
  }
  object Data {
    
    inline def apply[T](data: T, headers: typings.restfulJs.mod.Headers, status: Double, statusText: String): Data[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[T]]
    }
    
    extension [Self <: Data[?], T](x: Self & Data[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: typings.restfulJs.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
  
  trait Headers[T] extends StObject {
    
    var data: js.Array[T]
    
    var headers: typings.restfulJs.mod.Headers
    
    var status: Double
    
    var statusText: String
  }
  object Headers {
    
    inline def apply[T](data: js.Array[T], headers: typings.restfulJs.mod.Headers, status: Double, statusText: String): Headers[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers[T]]
    }
    
    extension [Self <: Headers[?], T](x: Self & Headers[T]) {
      
      inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setHeaders(value: typings.restfulJs.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
}
