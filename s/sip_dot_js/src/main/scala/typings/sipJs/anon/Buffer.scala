package typings.sipJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buffer extends StObject {
  
  var buffer: String
  
  var buflen: Double
  
  var length: Double
  
  var state: js.Array[Double]
}
object Buffer {
  
  @scala.inline
  def apply(buffer: String, buflen: Double, length: Double, state: js.Array[Double]): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], buflen = buflen.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  
  @scala.inline
  implicit class BufferMutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: String): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuflen(value: Double): Self = StObject.set(x, "buflen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: js.Array[Double]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateVarargs(value: Double*): Self = StObject.set(x, "state", js.Array(value :_*))
  }
}
