package typings.sentryWebpackPlugin.mod

import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var configFile: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var dryRun: js.UndefOr[Boolean] = js.undefined
  var entries: js.UndefOr[js.Array[_] | RegExp | EntriesFunction] = js.undefined
  var errorHandler: js.UndefOr[ErrorHandlerFunction] = js.undefined
  var ext: js.UndefOr[js.Array[String]] = js.undefined
  var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
  var ignoreFile: js.UndefOr[String] = js.undefined
  var include: String | js.Array[String]
  var release: js.UndefOr[String] = js.undefined
  var rewrite: js.UndefOr[Boolean] = js.undefined
  var setCommits: js.UndefOr[SetCommitsOptions] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var sourceMapReference: js.UndefOr[Boolean] = js.undefined
  var stripCommonPrefix: js.UndefOr[Boolean] = js.undefined
  var stripPrefix: js.UndefOr[js.Array[js.Any]] = js.undefined
  var urlPrefix: js.UndefOr[String] = js.undefined
  var urlSuffix: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    include: String | js.Array[String],
    configFile: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    dryRun: js.UndefOr[Boolean] = js.undefined,
    entries: js.Array[_] | RegExp | EntriesFunction = null,
    errorHandler: (/* err */ Error, /* invokeErr */ js.Function0[Unit]) => Unit = null,
    ext: js.Array[String] = null,
    ignore: String | js.Array[String] = null,
    ignoreFile: String = null,
    release: String = null,
    rewrite: js.UndefOr[Boolean] = js.undefined,
    setCommits: SetCommitsOptions = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    sourceMapReference: js.UndefOr[Boolean] = js.undefined,
    stripCommonPrefix: js.UndefOr[Boolean] = js.undefined,
    stripPrefix: js.Array[js.Any] = null,
    urlPrefix: String = null,
    urlSuffix: String = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
    if (configFile != null) __obj.updateDynamic("configFile")(configFile.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.asInstanceOf[js.Any])
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction2(errorHandler))
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (ignoreFile != null) __obj.updateDynamic("ignoreFile")(ignoreFile.asInstanceOf[js.Any])
    if (release != null) __obj.updateDynamic("release")(release.asInstanceOf[js.Any])
    if (!js.isUndefined(rewrite)) __obj.updateDynamic("rewrite")(rewrite.asInstanceOf[js.Any])
    if (setCommits != null) __obj.updateDynamic("setCommits")(setCommits.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMapReference)) __obj.updateDynamic("sourceMapReference")(sourceMapReference.asInstanceOf[js.Any])
    if (!js.isUndefined(stripCommonPrefix)) __obj.updateDynamic("stripCommonPrefix")(stripCommonPrefix.asInstanceOf[js.Any])
    if (stripPrefix != null) __obj.updateDynamic("stripPrefix")(stripPrefix.asInstanceOf[js.Any])
    if (urlPrefix != null) __obj.updateDynamic("urlPrefix")(urlPrefix.asInstanceOf[js.Any])
    if (urlSuffix != null) __obj.updateDynamic("urlSuffix")(urlSuffix.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

