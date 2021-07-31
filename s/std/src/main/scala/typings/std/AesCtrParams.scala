package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AesCtrParams
  extends StObject
     with Algorithm {
  
  var counter: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  
  var length: Double
}
object AesCtrParams {
  
  @scala.inline
  def apply(
    counter: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    length: Double,
    name: java.lang.String
  ): AesCtrParams = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesCtrParams]
  }
  
  @scala.inline
  implicit class AesCtrParamsMutableBuilder[Self <: AesCtrParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounter(
      value: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
    ): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
