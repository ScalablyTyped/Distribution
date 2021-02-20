package typings.rawBody

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.rawBody.anon.OptionsencodingEncoding
import typings.rawBody.rawBodyBooleans.`true`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("raw-body", JSImport.Namespace)
  @js.native
  def apply(stream: Readable): js.Promise[Buffer] = js.native
  /**
    * Gets the entire buffer of a stream either as a `Buffer` or a string.
    * Validates the stream's length against an expected length and maximum
    * limit. Ideal for parsing request bodies.
    */
  @JSImport("raw-body", JSImport.Namespace)
  @js.native
  def apply(stream: Readable, callback: js.Function2[/* err */ RawBodyError, /* body */ Buffer, Unit]): Unit = js.native
  @JSImport("raw-body", JSImport.Namespace)
  @js.native
  def apply(stream: Readable, options: OptionsencodingEncoding): js.Promise[String] = js.native
  @JSImport("raw-body", JSImport.Namespace)
  @js.native
  def apply(
    stream: Readable,
    options: OptionsencodingEncoding,
    callback: js.Function2[/* err */ RawBodyError, /* body */ String, Unit]
  ): Unit = js.native
  @JSImport("raw-body", JSImport.Namespace)
  @js.native
  def apply(stream: Readable, options: Encoding): js.Promise[String] = js.native
  @JSImport("raw-body", JSImport.Namespace)
  @js.native
  def apply(
    stream: Readable,
    options: Encoding,
    callback: js.Function2[/* err */ RawBodyError, /* body */ String, Unit]
  ): Unit = js.native
  @JSImport("raw-body", JSImport.Namespace)
  @js.native
  def apply(stream: Readable, options: Options): js.Promise[Buffer] = js.native
  @JSImport("raw-body", JSImport.Namespace)
  @js.native
  def apply(
    stream: Readable,
    options: Options,
    callback: js.Function2[/* err */ RawBodyError, /* body */ Buffer, Unit]
  ): Unit = js.native
  
  type Encoding = String | `true`
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The encoding to use to decode the body into a string. By default, a
      * `Buffer` instance will be returned when no encoding is specified. Most
      * likely, you want `utf-8`, so setting encoding to `true` will decode as
      * `utf-8`. You can use any type of encoding supported by `iconv-lite`.
      */
    var encoding: js.UndefOr[Encoding | Null] = js.native
    
    /**
      * The expected length of the stream.
      */
    var length: js.UndefOr[Double | String | Null] = js.native
    
    /**
      * The byte limit of the body. This is the number of bytes or any string
      * format supported by `bytes`, for example `1000`, `'500kb'` or `'3mb'`.
      */
    var limit: js.UndefOr[Double | String | Null] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: Encoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setLength(value: Double | String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthNull: Self = StObject.set(x, "length", null)
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setLimit(value: Double | String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitNull: Self = StObject.set(x, "limit", null)
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
  
  @js.native
  trait RawBodyError extends Error {
    
    /**
      * The encoding.
      */
    var encoding: js.UndefOr[String] = js.native
    
    var expected: js.UndefOr[Double] = js.native
    
    /**
      * The expected length of the stream.
      */
    var length: js.UndefOr[Double] = js.native
    
    /**
      * The limit in bytes.
      */
    var limit: js.UndefOr[Double] = js.native
    
    /**
      * The received bytes.
      */
    var received: js.UndefOr[Double] = js.native
    
    /**
      * The corresponding status code for the error.
      */
    var status: Double = js.native
    
    var statusCode: Double = js.native
    
    /**
      * The error type.
      */
    var `type`: String = js.native
  }
  object RawBodyError {
    
    @scala.inline
    def apply(message: String, name: String, status: Double, statusCode: Double, `type`: String): RawBodyError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawBodyError]
    }
    
    @scala.inline
    implicit class RawBodyErrorMutableBuilder[Self <: RawBodyError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setExpected(value: Double): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setReceived(value: Double): Self = StObject.set(x, "received", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceivedUndefined: Self = StObject.set(x, "received", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
