package typings.rawBody

import typings.rawBody.mod.Encoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined raw-body.raw-body.Options & {  encoding :raw-body.raw-body.Encoding} */
  trait OptionsencodingEncoding extends StObject {
    
    /**
      * The encoding to use to decode the body into a string. By default, a
      * `Buffer` instance will be returned when no encoding is specified. Most
      * likely, you want `utf-8`, so setting encoding to `true` will decode as
      * `utf-8`. You can use any type of encoding supported by `iconv-lite`.
      */
    var encoding: (js.UndefOr[Encoding | Null]) & Encoding
    
    /**
      * The expected length of the stream.
      */
    var length: js.UndefOr[Double | String | Null] = js.undefined
    
    /**
      * The byte limit of the body. This is the number of bytes or any string
      * format supported by `bytes`, for example `1000`, `'500kb'` or `'3mb'`.
      */
    var limit: js.UndefOr[Double | String | Null] = js.undefined
  }
  object OptionsencodingEncoding {
    
    inline def apply(encoding: (js.UndefOr[Encoding | Null]) & Encoding): OptionsencodingEncoding = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsencodingEncoding]
    }
    
    extension [Self <: OptionsencodingEncoding](x: Self) {
      
      inline def setEncoding(value: (js.UndefOr[Encoding | Null]) & Encoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double | String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthNull: Self = StObject.set(x, "length", null)
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setLimit(value: Double | String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitNull: Self = StObject.set(x, "limit", null)
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
}
