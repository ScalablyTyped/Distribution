package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AesCfbParams
  extends StObject
     with Algorithm {
  
  var iv: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
}
object AesCfbParams {
  
  @scala.inline
  def apply(
    iv: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    name: java.lang.String
  ): AesCfbParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesCfbParams]
  }
  
  @scala.inline
  implicit class AesCfbParamsMutableBuilder[Self <: AesCfbParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIv(
      value: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
    ): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
  }
}
