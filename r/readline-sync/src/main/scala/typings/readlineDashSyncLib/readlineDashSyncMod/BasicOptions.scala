package typings
package readlineDashSyncLib.readlineDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicOptions extends js.Object {
  var bufferSize: js.UndefOr[scala.Double] = js.undefined
  var cancel: js.UndefOr[js.Any] = js.undefined
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  var cd: js.UndefOr[scala.Boolean] = js.undefined
  var charlist: js.UndefOr[java.lang.String] = js.undefined
  var confirmMessage: js.UndefOr[js.Any] = js.undefined
  var create: js.UndefOr[scala.Boolean] = js.undefined
  var defaultInput: js.UndefOr[java.lang.String] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var exists: js.UndefOr[js.Any] = js.undefined
  var falseValue: js.UndefOr[OptionType | js.Array[OptionType]] = js.undefined
  var guide: js.UndefOr[scala.Boolean] = js.undefined
  var hideEchoBack: js.UndefOr[scala.Boolean] = js.undefined
  var history: js.UndefOr[scala.Boolean] = js.undefined
  var isDirectory: js.UndefOr[scala.Boolean] = js.undefined
  var isFile: js.UndefOr[scala.Boolean] = js.undefined
  var keepWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  var limit: js.UndefOr[OptionType | js.Array[OptionType]] = js.undefined
  var limitMessage: js.UndefOr[java.lang.String] = js.undefined
  var mask: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[js.Any] = js.undefined
  var min: js.UndefOr[js.Any] = js.undefined
  var print: js.UndefOr[
    js.Function2[/* display */ java.lang.String, /* encoding */ java.lang.String, scala.Unit]
  ] = js.undefined
  var prompt: js.UndefOr[js.Any] = js.undefined
  var trueValue: js.UndefOr[OptionType | js.Array[OptionType]] = js.undefined
  var unmatchMessage: js.UndefOr[js.Any] = js.undefined
  var validate: js.UndefOr[js.Function1[/* path */ java.lang.String, scala.Boolean | java.lang.String]] = js.undefined
}

object BasicOptions {
  @scala.inline
  def apply(
    bufferSize: scala.Int | scala.Double = null,
    cancel: js.Any = null,
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    cd: js.UndefOr[scala.Boolean] = js.undefined,
    charlist: java.lang.String = null,
    confirmMessage: js.Any = null,
    create: js.UndefOr[scala.Boolean] = js.undefined,
    defaultInput: java.lang.String = null,
    encoding: java.lang.String = null,
    exists: js.Any = null,
    falseValue: OptionType | js.Array[OptionType] = null,
    guide: js.UndefOr[scala.Boolean] = js.undefined,
    hideEchoBack: js.UndefOr[scala.Boolean] = js.undefined,
    history: js.UndefOr[scala.Boolean] = js.undefined,
    isDirectory: js.UndefOr[scala.Boolean] = js.undefined,
    isFile: js.UndefOr[scala.Boolean] = js.undefined,
    keepWhitespace: js.UndefOr[scala.Boolean] = js.undefined,
    limit: OptionType | js.Array[OptionType] = null,
    limitMessage: java.lang.String = null,
    mask: java.lang.String = null,
    max: js.Any = null,
    min: js.Any = null,
    print: (/* display */ java.lang.String, /* encoding */ java.lang.String) => scala.Unit = null,
    prompt: js.Any = null,
    trueValue: OptionType | js.Array[OptionType] = null,
    unmatchMessage: js.Any = null,
    validate: /* path */ java.lang.String => scala.Boolean | java.lang.String = null
  ): BasicOptions = {
    val __obj = js.Dynamic.literal()
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (!js.isUndefined(cd)) __obj.updateDynamic("cd")(cd)
    if (charlist != null) __obj.updateDynamic("charlist")(charlist)
    if (confirmMessage != null) __obj.updateDynamic("confirmMessage")(confirmMessage)
    if (!js.isUndefined(create)) __obj.updateDynamic("create")(create)
    if (defaultInput != null) __obj.updateDynamic("defaultInput")(defaultInput)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (exists != null) __obj.updateDynamic("exists")(exists)
    if (falseValue != null) __obj.updateDynamic("falseValue")(falseValue.asInstanceOf[js.Any])
    if (!js.isUndefined(guide)) __obj.updateDynamic("guide")(guide)
    if (!js.isUndefined(hideEchoBack)) __obj.updateDynamic("hideEchoBack")(hideEchoBack)
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history)
    if (!js.isUndefined(isDirectory)) __obj.updateDynamic("isDirectory")(isDirectory)
    if (!js.isUndefined(isFile)) __obj.updateDynamic("isFile")(isFile)
    if (!js.isUndefined(keepWhitespace)) __obj.updateDynamic("keepWhitespace")(keepWhitespace)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (limitMessage != null) __obj.updateDynamic("limitMessage")(limitMessage)
    if (mask != null) __obj.updateDynamic("mask")(mask)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (print != null) __obj.updateDynamic("print")(js.Any.fromFunction2(print))
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (trueValue != null) __obj.updateDynamic("trueValue")(trueValue.asInstanceOf[js.Any])
    if (unmatchMessage != null) __obj.updateDynamic("unmatchMessage")(unmatchMessage)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    __obj.asInstanceOf[BasicOptions]
  }
}

