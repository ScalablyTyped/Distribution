package typings.smithyTypes

import typings.smithyTypes.distTypesChecksumMod.ChecksumConstructor
import typings.smithyTypes.distTypesCryptoMod.HashConstructor
import typings.smithyTypes.distTypesCryptoMod.StreamHasher
import typings.smithyTypes.distTypesUtilMod.BodyLengthCalculator
import typings.smithyTypes.distTypesUtilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStreamMod {
  
  type GetAwsChunkedEncodingStream[StreamType] = js.Function2[
    /* readableStream */ StreamType, 
    /* options */ GetAwsChunkedEncodingStreamOptions, 
    StreamType
  ]
  
  trait GetAwsChunkedEncodingStreamOptions extends StObject {
    
    var base64Encoder: js.UndefOr[Encoder] = js.undefined
    
    def bodyLengthChecker(body: Any): js.UndefOr[Double]
    @JSName("bodyLengthChecker")
    var bodyLengthChecker_Original: BodyLengthCalculator
    
    var checksumAlgorithmFn: js.UndefOr[ChecksumConstructor | HashConstructor] = js.undefined
    
    var checksumLocationName: js.UndefOr[String] = js.undefined
    
    var streamHasher: js.UndefOr[StreamHasher[Any]] = js.undefined
  }
  object GetAwsChunkedEncodingStreamOptions {
    
    inline def apply(bodyLengthChecker: /* body */ Any => js.UndefOr[Double]): GetAwsChunkedEncodingStreamOptions = {
      val __obj = js.Dynamic.literal(bodyLengthChecker = js.Any.fromFunction1(bodyLengthChecker))
      __obj.asInstanceOf[GetAwsChunkedEncodingStreamOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetAwsChunkedEncodingStreamOptions] (val x: Self) extends AnyVal {
      
      inline def setBase64Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      inline def setBase64EncoderUndefined: Self = StObject.set(x, "base64Encoder", js.undefined)
      
      inline def setBodyLengthChecker(value: /* body */ Any => js.UndefOr[Double]): Self = StObject.set(x, "bodyLengthChecker", js.Any.fromFunction1(value))
      
      inline def setChecksumAlgorithmFn(value: ChecksumConstructor | HashConstructor): Self = StObject.set(x, "checksumAlgorithmFn", value.asInstanceOf[js.Any])
      
      inline def setChecksumAlgorithmFnUndefined: Self = StObject.set(x, "checksumAlgorithmFn", js.undefined)
      
      inline def setChecksumLocationName(value: String): Self = StObject.set(x, "checksumLocationName", value.asInstanceOf[js.Any])
      
      inline def setChecksumLocationNameUndefined: Self = StObject.set(x, "checksumLocationName", js.undefined)
      
      inline def setStreamHasher(value: (/* hashCtor */ HashConstructor, Any) => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "streamHasher", js.Any.fromFunction2(value))
      
      inline def setStreamHasherUndefined: Self = StObject.set(x, "streamHasher", js.undefined)
    }
  }
}
