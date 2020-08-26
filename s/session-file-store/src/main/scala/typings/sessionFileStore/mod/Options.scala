package typings.sessionFileStore.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FileStore Options
  */
@js.native
trait Options extends js.Object {
  /**
    * Decoding function. Takes encoded data, returns object. Defaults to `JSON.parse`
    */
  var decoder: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /**
    * Encoding function. Takes object, returns encoded data. Defaults to `JSON.stringify`
    */
  var encoder: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /**
    * Object-to-text text encoding. Can be null. Defaults to `'utf8'`
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * Encryption output encoding. Defaults to `'hex'`
    */
  var encryptEncoding: js.UndefOr[String] = js.native
  /**
    * The exponential factor to use for retry. Defaults to `1`
    */
  var factor: js.UndefOr[Double] = js.native
  /**
    * Returns fallback session object after all failed retries. No defaults
    */
  var fallbackSessionFn: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /**
    * File extension of saved files. Defaults to `'.json'`
    */
  var fileExtension: js.UndefOr[String] = js.native
  /**
    * Undocumented
    */
  var filePattern: js.UndefOr[RegExp] = js.native
  /**
    * Encryption key retrieval function. Takes secret andsession id, returns key.
    * Defaults to `function(secret, sessionId){return secret + sessionId;}`
    */
  var keyFunction: js.UndefOr[js.Function2[/* secret */ String, /* sessionId */ String, String]] = js.native
  /**
    * Log messages. Defaults to `console.log`
    */
  var logFn: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /**
    * The maximum number of milliseconds between two retries. Defaults to `100`
    */
  var maxTimeout: js.UndefOr[Double] = js.native
  /**
    * The number of milliseconds before starting the first retry. Defaults to `50`
    */
  var minTimeout: js.UndefOr[Double] = js.native
  /**
    * The directory where the session files will be stored. Defaults to `./sessions`
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Use distinct worker process for removing stale sessions. Defaults to `false`
    */
  var reapAsync: js.UndefOr[Boolean] = js.native
  /**
    * Interval to clear expired sessions in seconds or -1 if do not need. Defaults to `1 hour`
    */
  var reapInterval: js.UndefOr[Double] = js.native
  /**
    * [OUT] Contains intervalObject if reap was scheduled
    */
  var reapIntervalObject: js.UndefOr[js.Any] = js.native
  /**
    * Undocumented
    */
  var reapMaxConcurrent: js.UndefOr[Double] = js.native
  /**
    * Reap stale sessions synchronously if can not do it asynchronously. Default to `false`
    */
  var reapSyncFallback: js.UndefOr[Boolean] = js.native
  /**
    * The number of retries to get session data from a session file. Defaults to `5`
    */
  var retries: js.UndefOr[Double] = js.native
  /**
    * If secret string is specified then enables encryption of the session before
    * writing the file and also decryption when reading it.
    */
  var secret: js.UndefOr[String] = js.native
  /**
    * Session time to live in seconds. Defaults to `3600`
    */
  var ttl: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDecoder(value: /* repeated */ js.Any => Unit): Self = this.set("decoder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDecoder: Self = this.set("decoder", js.undefined)
    @scala.inline
    def setEncoder(value: /* repeated */ js.Any => Unit): Self = this.set("encoder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEncoder: Self = this.set("encoder", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEncryptEncoding(value: String): Self = this.set("encryptEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptEncoding: Self = this.set("encryptEncoding", js.undefined)
    @scala.inline
    def setFactor(value: Double): Self = this.set("factor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactor: Self = this.set("factor", js.undefined)
    @scala.inline
    def setFallbackSessionFn(value: /* repeated */ js.Any => Unit): Self = this.set("fallbackSessionFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFallbackSessionFn: Self = this.set("fallbackSessionFn", js.undefined)
    @scala.inline
    def setFileExtension(value: String): Self = this.set("fileExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileExtension: Self = this.set("fileExtension", js.undefined)
    @scala.inline
    def setFilePattern(value: RegExp): Self = this.set("filePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilePattern: Self = this.set("filePattern", js.undefined)
    @scala.inline
    def setKeyFunction(value: (/* secret */ String, /* sessionId */ String) => String): Self = this.set("keyFunction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteKeyFunction: Self = this.set("keyFunction", js.undefined)
    @scala.inline
    def setLogFn(value: /* repeated */ js.Any => Unit): Self = this.set("logFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLogFn: Self = this.set("logFn", js.undefined)
    @scala.inline
    def setMaxTimeout(value: Double): Self = this.set("maxTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTimeout: Self = this.set("maxTimeout", js.undefined)
    @scala.inline
    def setMinTimeout(value: Double): Self = this.set("minTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinTimeout: Self = this.set("minTimeout", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setReapAsync(value: Boolean): Self = this.set("reapAsync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReapAsync: Self = this.set("reapAsync", js.undefined)
    @scala.inline
    def setReapInterval(value: Double): Self = this.set("reapInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReapInterval: Self = this.set("reapInterval", js.undefined)
    @scala.inline
    def setReapIntervalObject(value: js.Any): Self = this.set("reapIntervalObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReapIntervalObject: Self = this.set("reapIntervalObject", js.undefined)
    @scala.inline
    def setReapMaxConcurrent(value: Double): Self = this.set("reapMaxConcurrent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReapMaxConcurrent: Self = this.set("reapMaxConcurrent", js.undefined)
    @scala.inline
    def setReapSyncFallback(value: Boolean): Self = this.set("reapSyncFallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReapSyncFallback: Self = this.set("reapSyncFallback", js.undefined)
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
  
}

