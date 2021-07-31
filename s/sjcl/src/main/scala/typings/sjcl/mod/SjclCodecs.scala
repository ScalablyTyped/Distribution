package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclCodecs extends StObject {
  
  var arrayBuffer: SjclArrayBufferCodec
  
  var base32: SjclCodec[String]
  
  var base32hex: SjclCodec[String]
  
  var base64: SjclCodec[String]
  
  var base64url: SjclCodec[String]
  
  var bytes: SjclCodec[js.Array[Double]]
  
  var hex: SjclCodec[String]
  
  var utf8String: SjclCodec[String]
  
  var z85: SjclCodec[String]
}
object SjclCodecs {
  
  @scala.inline
  def apply(
    arrayBuffer: SjclArrayBufferCodec,
    base32: SjclCodec[String],
    base32hex: SjclCodec[String],
    base64: SjclCodec[String],
    base64url: SjclCodec[String],
    bytes: SjclCodec[js.Array[Double]],
    hex: SjclCodec[String],
    utf8String: SjclCodec[String],
    z85: SjclCodec[String]
  ): SjclCodecs = {
    val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.asInstanceOf[js.Any], base32 = base32.asInstanceOf[js.Any], base32hex = base32hex.asInstanceOf[js.Any], base64 = base64.asInstanceOf[js.Any], base64url = base64url.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], utf8String = utf8String.asInstanceOf[js.Any], z85 = z85.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCodecs]
  }
  
  @scala.inline
  implicit class SjclCodecsMutableBuilder[Self <: SjclCodecs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayBuffer(value: SjclArrayBufferCodec): Self = StObject.set(x, "arrayBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase32(value: SjclCodec[String]): Self = StObject.set(x, "base32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase32hex(value: SjclCodec[String]): Self = StObject.set(x, "base32hex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase64(value: SjclCodec[String]): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase64url(value: SjclCodec[String]): Self = StObject.set(x, "base64url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytes(value: SjclCodec[js.Array[Double]]): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHex(value: SjclCodec[String]): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtf8String(value: SjclCodec[String]): Self = StObject.set(x, "utf8String", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ85(value: SjclCodec[String]): Self = StObject.set(x, "z85", value.asInstanceOf[js.Any])
  }
}
