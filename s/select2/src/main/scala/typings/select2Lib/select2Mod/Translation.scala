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
    errorLoading: js.Function0[java.lang.String] = null,
    inputTooLong: js.Function1[/* arg */ TranslationArg, java.lang.String] = null,
    inputTooShort: js.Function1[/* arg */ TranslationArg, java.lang.String] = null,
    loadingMore: js.Function0[java.lang.String] = null,
    maximumSelected: js.Function1[/* arg */ TranslationArg, java.lang.String] = null,
    noResults: js.Function0[java.lang.String] = null,
    searching: js.Function0[java.lang.String] = null
  ): Translation = {
    val __obj = js.Dynamic.literal()
    if (errorLoading != null) __obj.updateDynamic("errorLoading")(errorLoading)
    if (inputTooLong != null) __obj.updateDynamic("inputTooLong")(inputTooLong)
    if (inputTooShort != null) __obj.updateDynamic("inputTooShort")(inputTooShort)
    if (loadingMore != null) __obj.updateDynamic("loadingMore")(loadingMore)
    if (maximumSelected != null) __obj.updateDynamic("maximumSelected")(maximumSelected)
    if (noResults != null) __obj.updateDynamic("noResults")(noResults)
    if (searching != null) __obj.updateDynamic("searching")(searching)
    __obj.asInstanceOf[Translation]
  }
}

