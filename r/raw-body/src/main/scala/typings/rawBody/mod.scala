package typings.rawBody

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.rawBody.anon.OptionsencodingEncoding
import typings.rawBody.rawBodyBooleans.`true`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(stream: Readable): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  /**
    * Gets the entire buffer of a stream either as a `Buffer` or a string.
    * Validates the stream's length against an expected length and maximum
    * limit. Ideal for parsing request bodies.
    */
  inline def apply(stream: Readable, callback: js.Function2[/* err */ RawBodyError, /* body */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(stream: Readable, options: OptionsencodingEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def apply(
    stream: Readable,
    options: OptionsencodingEncoding,
    callback: js.Function2[/* err */ RawBodyError, /* body */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(stream: Readable, options: Encoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def apply(
    stream: Readable,
    options: Encoding,
    callback: js.Function2[/* err */ RawBodyError, /* body */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(stream: Readable, options: Options): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def apply(
    stream: Readable,
    options: Options,
    callback: js.Function2[/* err */ RawBodyError, /* body */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("raw-body", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Encoding = String | `true`
  
  trait Options extends StObject {
    
    /**
      * The encoding to use to decode the body into a string. By default, a
      * `Buffer` instance will be returned when no encoding is specified. Most
      * likely, you want `utf-8`, so setting encoding to `true` will decode as
      * `utf-8`. You can use any type of encoding supported by `iconv-lite`.
      */
    var encoding: js.UndefOr[Encoding | Null] = js.undefined
    
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
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: Encoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setLength(value: Double | String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthNull: Self = StObject.set(x, "length", null)
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setLimit(value: Double | String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitNull: Self = StObject.set(x, "limit", null)
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
  
  trait RawBodyError
    extends StObject
       with Error {
    
    /**
      * The encoding.
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    var expected: js.UndefOr[Double] = js.undefined
    
    /**
      * The expected length of the stream.
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /**
      * The limit in bytes.
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * The received bytes.
      */
    var received: js.UndefOr[Double] = js.undefined
    
    /**
      * The corresponding status code for the error.
      */
    var status: Double
    
    var statusCode: Double
    
    /**
      * The error type.
      */
    var `type`: String
  }
  object RawBodyError {
    
    inline def apply(message: String, name: String, status: Double, statusCode: Double, `type`: String): RawBodyError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawBodyError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawBodyError] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setExpected(value: Double): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setReceived(value: Double): Self = StObject.set(x, "received", value.asInstanceOf[js.Any])
      
      inline def setReceivedUndefined: Self = StObject.set(x, "received", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
