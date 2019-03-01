package typings
package sessionDashFileDashStoreLib.sessionDashFileDashStoreMod.fNs

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
  var decoder: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  /**
    * Encoding function. Takes object, returns encoded data. Defaults to `JSON.stringify`
    */
  var encoder: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  /**
    * Object-to-text text encoding. Can be null. Defaults to `'utf8'`
    */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Encryption output encoding. Defaults to `'hex'`
    */
  var encryptEncoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The exponential factor to use for retry. Defaults to `1`
    */
  var factor: js.UndefOr[scala.Double] = js.undefined
  /**
    * Returns fallback session object after all failed retries. No defaults
    */
  var fallbackSessionFn: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  /**
    * File extension of saved files. Defaults to `'.json'`
    */
  var fileExtension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Undocumented
    */
  var filePattern: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
    * Encryption key retrieval function. Takes secret andsession id, returns key.
    * Defaults to `function(secret, sessionId){return secret + sessionId;}`
    */
  var keyFunction: js.UndefOr[
    js.Function2[/* secret */ java.lang.String, /* sessionId */ java.lang.String, java.lang.String]
  ] = js.undefined
  /**
    * Log messages. Defaults to `console.log`
    */
  var logFn: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  /**
    * The maximum number of milliseconds between two retries. Defaults to `100`
    */
  var maxTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of milliseconds before starting the first retry. Defaults to `50`
    */
  var minTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * The directory where the session files will be stored. Defaults to `./sessions`
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use distinct worker process for removing stale sessions. Defaults to `false`
    */
  var reapAsync: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Interval to clear expired sessions in seconds or -1 if do not need. Defaults to `1 hour`
    */
  var reapInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * [OUT] Contains intervalObject if reap was scheduled
    */
  var reapIntervalObject: js.UndefOr[js.Any] = js.undefined
  /**
    * Undocumented
    */
  var reapMaxConcurrent: js.UndefOr[scala.Double] = js.undefined
  /**
    * Reap stale sessions synchronously if can not do it asynchronously. Default to `false`
    */
  var reapSyncFallback: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The number of retries to get session data from a session file. Defaults to `5`
    */
  var retries: js.UndefOr[scala.Double] = js.undefined
  /**
    * If secret string is specified then enables encryption of the session before
    * writing the file and also decryption when reading it.
    */
  var secret: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Session time to live in seconds. Defaults to `3600`
    */
  var ttl: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    decoder: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    encoder: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    encoding: java.lang.String = null,
    encryptEncoding: java.lang.String = null,
    factor: scala.Int | scala.Double = null,
    fallbackSessionFn: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fileExtension: java.lang.String = null,
    filePattern: stdLib.RegExp = null,
    keyFunction: js.Function2[/* secret */ java.lang.String, /* sessionId */ java.lang.String, java.lang.String] = null,
    logFn: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    maxTimeout: scala.Int | scala.Double = null,
    minTimeout: scala.Int | scala.Double = null,
    path: java.lang.String = null,
    reapAsync: js.UndefOr[scala.Boolean] = js.undefined,
    reapInterval: scala.Int | scala.Double = null,
    reapIntervalObject: js.Any = null,
    reapMaxConcurrent: scala.Int | scala.Double = null,
    reapSyncFallback: js.UndefOr[scala.Boolean] = js.undefined,
    retries: scala.Int | scala.Double = null,
    secret: java.lang.String = null,
    ttl: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (decoder != null) __obj.updateDynamic("decoder")(decoder)
    if (encoder != null) __obj.updateDynamic("encoder")(encoder)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (encryptEncoding != null) __obj.updateDynamic("encryptEncoding")(encryptEncoding)
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (fallbackSessionFn != null) __obj.updateDynamic("fallbackSessionFn")(fallbackSessionFn)
    if (fileExtension != null) __obj.updateDynamic("fileExtension")(fileExtension)
    if (filePattern != null) __obj.updateDynamic("filePattern")(filePattern)
    if (keyFunction != null) __obj.updateDynamic("keyFunction")(keyFunction)
    if (logFn != null) __obj.updateDynamic("logFn")(logFn)
    if (maxTimeout != null) __obj.updateDynamic("maxTimeout")(maxTimeout.asInstanceOf[js.Any])
    if (minTimeout != null) __obj.updateDynamic("minTimeout")(minTimeout.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(reapAsync)) __obj.updateDynamic("reapAsync")(reapAsync)
    if (reapInterval != null) __obj.updateDynamic("reapInterval")(reapInterval.asInstanceOf[js.Any])
    if (reapIntervalObject != null) __obj.updateDynamic("reapIntervalObject")(reapIntervalObject)
    if (reapMaxConcurrent != null) __obj.updateDynamic("reapMaxConcurrent")(reapMaxConcurrent.asInstanceOf[js.Any])
    if (!js.isUndefined(reapSyncFallback)) __obj.updateDynamic("reapSyncFallback")(reapSyncFallback)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

