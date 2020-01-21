package typings.sessionFileStore.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FileStore Options
  */
trait Options extends js.Object {
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
  @scala.inline
  def apply(
    decoder: /* repeated */ js.Any => Unit = null,
    encoder: /* repeated */ js.Any => Unit = null,
    encoding: String = null,
    encryptEncoding: String = null,
    factor: Int | Double = null,
    fallbackSessionFn: /* repeated */ js.Any => Unit = null,
    fileExtension: String = null,
    filePattern: RegExp = null,
    keyFunction: (/* secret */ String, /* sessionId */ String) => String = null,
    logFn: /* repeated */ js.Any => Unit = null,
    maxTimeout: Int | Double = null,
    minTimeout: Int | Double = null,
    path: String = null,
    reapAsync: js.UndefOr[Boolean] = js.undefined,
    reapInterval: Int | Double = null,
    reapIntervalObject: js.Any = null,
    reapMaxConcurrent: Int | Double = null,
    reapSyncFallback: js.UndefOr[Boolean] = js.undefined,
    retries: Int | Double = null,
    secret: String = null,
    ttl: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (decoder != null) __obj.updateDynamic("decoder")(js.Any.fromFunction1(decoder))
    if (encoder != null) __obj.updateDynamic("encoder")(js.Any.fromFunction1(encoder))
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (encryptEncoding != null) __obj.updateDynamic("encryptEncoding")(encryptEncoding.asInstanceOf[js.Any])
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (fallbackSessionFn != null) __obj.updateDynamic("fallbackSessionFn")(js.Any.fromFunction1(fallbackSessionFn))
    if (fileExtension != null) __obj.updateDynamic("fileExtension")(fileExtension.asInstanceOf[js.Any])
    if (filePattern != null) __obj.updateDynamic("filePattern")(filePattern.asInstanceOf[js.Any])
    if (keyFunction != null) __obj.updateDynamic("keyFunction")(js.Any.fromFunction2(keyFunction))
    if (logFn != null) __obj.updateDynamic("logFn")(js.Any.fromFunction1(logFn))
    if (maxTimeout != null) __obj.updateDynamic("maxTimeout")(maxTimeout.asInstanceOf[js.Any])
    if (minTimeout != null) __obj.updateDynamic("minTimeout")(minTimeout.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(reapAsync)) __obj.updateDynamic("reapAsync")(reapAsync.asInstanceOf[js.Any])
    if (reapInterval != null) __obj.updateDynamic("reapInterval")(reapInterval.asInstanceOf[js.Any])
    if (reapIntervalObject != null) __obj.updateDynamic("reapIntervalObject")(reapIntervalObject.asInstanceOf[js.Any])
    if (reapMaxConcurrent != null) __obj.updateDynamic("reapMaxConcurrent")(reapMaxConcurrent.asInstanceOf[js.Any])
    if (!js.isUndefined(reapSyncFallback)) __obj.updateDynamic("reapSyncFallback")(reapSyncFallback.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

