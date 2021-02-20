package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AesGcmParams extends Algorithm {
  
  var additionalData: js.UndefOr[
    Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ] = js.native
  
  var iv: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer = js.native
  
  var tagLength: js.UndefOr[Double] = js.native
}
object AesGcmParams {
  
  @scala.inline
  def apply(
    iv: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    name: java.lang.String
  ): AesGcmParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesGcmParams]
  }
  
  @scala.inline
  implicit class AesGcmParamsMutableBuilder[Self <: AesGcmParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalData(
      value: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
    ): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDataUndefined: Self = StObject.set(x, "additionalData", js.undefined)
    
    @scala.inline
    def setIv(
      value: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
    ): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagLength(value: Double): Self = StObject.set(x, "tagLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagLengthUndefined: Self = StObject.set(x, "tagLength", js.undefined)
  }
}
