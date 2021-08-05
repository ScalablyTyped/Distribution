package typings.sessionFileStore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressSession.mod.SessionOptions
import typings.expressSession.mod.Store
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    options: js.Function1[
      /* options */ js.UndefOr[SessionOptions], 
      RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
    ]
  ): FileStore = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[FileStore]
  
  @JSImport("session-file-store", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait FileStore
    extends StObject
       with Instantiable0[Store]
       with Instantiable1[/* options */ Options, Store]
  
  /**
    * FileStore Options
    */
  trait Options extends StObject {
    
    /**
      * Decoding function. Takes encoded data, returns object. Defaults to `JSON.parse`
      */
    var decoder: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    /**
      * Encoding function. Takes object, returns encoded data. Defaults to `JSON.stringify`
      */
    var encoder: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    /**
      * Object-to-text text encoding. Can be null. Defaults to `'utf8'`
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      * Encryption output encoding. Defaults to `'hex'`
      */
    var encryptEncoding: js.UndefOr[String] = js.undefined
    
    /**
      * The exponential factor to use for retry. Defaults to `1`
      */
    var factor: js.UndefOr[Double] = js.undefined
    
    /**
      * Returns fallback session object after all failed retries. No defaults
      */
    var fallbackSessionFn: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    /**
      * File extension of saved files. Defaults to `'.json'`
      */
    var fileExtension: js.UndefOr[String] = js.undefined
    
    /**
      * Undocumented
      */
    var filePattern: js.UndefOr[RegExp] = js.undefined
    
    /**
      * Encryption key retrieval function. Takes secret andsession id, returns key.
      * Defaults to `function(secret, sessionId){return secret + sessionId;}`
      */
    var keyFunction: js.UndefOr[js.Function2[/* secret */ String, /* sessionId */ String, String]] = js.undefined
    
    /**
      * Log messages. Defaults to `console.log`
      */
    var logFn: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    /**
      * The maximum number of milliseconds between two retries. Defaults to `100`
      */
    var maxTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of milliseconds before starting the first retry. Defaults to `50`
      */
    var minTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The directory where the session files will be stored. Defaults to `./sessions`
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Use distinct worker process for removing stale sessions. Defaults to `false`
      */
    var reapAsync: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Interval to clear expired sessions in seconds or -1 if do not need. Defaults to `1 hour`
      */
    var reapInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * [OUT] Contains intervalObject if reap was scheduled
      */
    var reapIntervalObject: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Undocumented
      */
    var reapMaxConcurrent: js.UndefOr[Double] = js.undefined
    
    /**
      * Reap stale sessions synchronously if can not do it asynchronously. Default to `false`
      */
    var reapSyncFallback: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of retries to get session data from a session file. Defaults to `5`
      */
    var retries: js.UndefOr[Double] = js.undefined
    
    /**
      * If secret string is specified then enables encryption of the session before
      * writing the file and also decryption when reading it.
      */
    var secret: js.UndefOr[String] = js.undefined
    
    /**
      * Session time to live in seconds. Defaults to `3600`
      */
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDecoder(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "decoder", js.Any.fromFunction1(value))
      
      inline def setDecoderUndefined: Self = StObject.set(x, "decoder", js.undefined)
      
      inline def setEncoder(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "encoder", js.Any.fromFunction1(value))
      
      inline def setEncoderUndefined: Self = StObject.set(x, "encoder", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEncryptEncoding(value: String): Self = StObject.set(x, "encryptEncoding", value.asInstanceOf[js.Any])
      
      inline def setEncryptEncodingUndefined: Self = StObject.set(x, "encryptEncoding", js.undefined)
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      inline def setFallbackSessionFn(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "fallbackSessionFn", js.Any.fromFunction1(value))
      
      inline def setFallbackSessionFnUndefined: Self = StObject.set(x, "fallbackSessionFn", js.undefined)
      
      inline def setFileExtension(value: String): Self = StObject.set(x, "fileExtension", value.asInstanceOf[js.Any])
      
      inline def setFileExtensionUndefined: Self = StObject.set(x, "fileExtension", js.undefined)
      
      inline def setFilePattern(value: RegExp): Self = StObject.set(x, "filePattern", value.asInstanceOf[js.Any])
      
      inline def setFilePatternUndefined: Self = StObject.set(x, "filePattern", js.undefined)
      
      inline def setKeyFunction(value: (/* secret */ String, /* sessionId */ String) => String): Self = StObject.set(x, "keyFunction", js.Any.fromFunction2(value))
      
      inline def setKeyFunctionUndefined: Self = StObject.set(x, "keyFunction", js.undefined)
      
      inline def setLogFn(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "logFn", js.Any.fromFunction1(value))
      
      inline def setLogFnUndefined: Self = StObject.set(x, "logFn", js.undefined)
      
      inline def setMaxTimeout(value: Double): Self = StObject.set(x, "maxTimeout", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeoutUndefined: Self = StObject.set(x, "maxTimeout", js.undefined)
      
      inline def setMinTimeout(value: Double): Self = StObject.set(x, "minTimeout", value.asInstanceOf[js.Any])
      
      inline def setMinTimeoutUndefined: Self = StObject.set(x, "minTimeout", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setReapAsync(value: Boolean): Self = StObject.set(x, "reapAsync", value.asInstanceOf[js.Any])
      
      inline def setReapAsyncUndefined: Self = StObject.set(x, "reapAsync", js.undefined)
      
      inline def setReapInterval(value: Double): Self = StObject.set(x, "reapInterval", value.asInstanceOf[js.Any])
      
      inline def setReapIntervalObject(value: js.Any): Self = StObject.set(x, "reapIntervalObject", value.asInstanceOf[js.Any])
      
      inline def setReapIntervalObjectUndefined: Self = StObject.set(x, "reapIntervalObject", js.undefined)
      
      inline def setReapIntervalUndefined: Self = StObject.set(x, "reapInterval", js.undefined)
      
      inline def setReapMaxConcurrent(value: Double): Self = StObject.set(x, "reapMaxConcurrent", value.asInstanceOf[js.Any])
      
      inline def setReapMaxConcurrentUndefined: Self = StObject.set(x, "reapMaxConcurrent", js.undefined)
      
      inline def setReapSyncFallback(value: Boolean): Self = StObject.set(x, "reapSyncFallback", value.asInstanceOf[js.Any])
      
      inline def setReapSyncFallbackUndefined: Self = StObject.set(x, "reapSyncFallback", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
}
