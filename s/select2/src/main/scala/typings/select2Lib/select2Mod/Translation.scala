package typings
package select2Lib.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Translation extends js.Object {
  var errorLoading: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var inputTooLong: js.UndefOr[js.Function1[/* arg */ TranslationArg, java.lang.String]] = js.undefined
  var inputTooShort: js.UndefOr[js.Function1[/* arg */ TranslationArg, java.lang.String]] = js.undefined
  var loadingMore: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var maximumSelected: js.UndefOr[js.Function1[/* arg */ TranslationArg, java.lang.String]] = js.undefined
  var noResults: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var searching: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

object Translation {
  @scala.inline
  def apply(
    errorLoading: () => java.lang.String = null,
    inputTooLong: /* arg */ TranslationArg => java.lang.String = null,
    inputTooShort: /* arg */ TranslationArg => java.lang.String = null,
    loadingMore: () => java.lang.String = null,
    maximumSelected: /* arg */ TranslationArg => java.lang.String = null,
    noResults: () => java.lang.String = null,
    searching: () => java.lang.String = null
  ): Translation = {
    val __obj = js.Dynamic.literal()
    if (errorLoading != null) __obj.updateDynamic("errorLoading")(js.Any.fromFunction0(errorLoading))
    if (inputTooLong != null) __obj.updateDynamic("inputTooLong")(js.Any.fromFunction1(inputTooLong))
    if (inputTooShort != null) __obj.updateDynamic("inputTooShort")(js.Any.fromFunction1(inputTooShort))
    if (loadingMore != null) __obj.updateDynamic("loadingMore")(js.Any.fromFunction0(loadingMore))
    if (maximumSelected != null) __obj.updateDynamic("maximumSelected")(js.Any.fromFunction1(maximumSelected))
    if (noResults != null) __obj.updateDynamic("noResults")(js.Any.fromFunction0(noResults))
    if (searching != null) __obj.updateDynamic("searching")(js.Any.fromFunction0(searching))
    __obj.asInstanceOf[Translation]
  }
}

