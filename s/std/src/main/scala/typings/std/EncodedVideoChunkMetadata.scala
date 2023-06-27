package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodedVideoChunkMetadata extends StObject {
  
  /* standard dom */
  var decoderConfig: js.UndefOr[VideoDecoderConfig] = js.undefined
}
object EncodedVideoChunkMetadata {
  
  inline def apply(): EncodedVideoChunkMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodedVideoChunkMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncodedVideoChunkMetadata] (val x: Self) extends AnyVal {
    
    inline def setDecoderConfig(value: VideoDecoderConfig): Self = StObject.set(x, "decoderConfig", value.asInstanceOf[js.Any])
    
    inline def setDecoderConfigUndefined: Self = StObject.set(x, "decoderConfig", js.undefined)
  }
}
