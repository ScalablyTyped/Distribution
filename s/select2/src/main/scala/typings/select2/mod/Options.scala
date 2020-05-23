package typings.select2.mod

import typings.select2.mod.global.JQuery
import typings.select2.select2Strings.ltr
import typings.select2.select2Strings.rtl
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[Result, RemoteResult] extends js.Object {
  var ajax: js.UndefOr[AjaxOptions[Result, RemoteResult]] = js.undefined
  var allowClear: js.UndefOr[Boolean] = js.undefined
  var amdBase: js.UndefOr[String] = js.undefined
  var amdLanguageBase: js.UndefOr[String] = js.undefined
  var closeOnSelect: js.UndefOr[Boolean] = js.undefined
  var containerCss: js.UndefOr[js.Any] = js.undefined
  var containerCssClass: js.UndefOr[String] = js.undefined
  // Not in https://select2.org/configuration/options-api
  var createTag: js.UndefOr[js.Function1[/* params */ SearchOptions, IdTextPair | Null]] = js.undefined
  var data: js.UndefOr[js.Array[DataFormat | GroupedDataFormat]] = js.undefined
  var dataAdapter: js.UndefOr[js.Any] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var dir: js.UndefOr[ltr | rtl] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dropdownAdapter: js.UndefOr[js.Any] = js.undefined
  var dropdownAutoWidth: js.UndefOr[Boolean] = js.undefined
  var dropdownCss: js.UndefOr[js.Any] = js.undefined
  var dropdownCssClass: js.UndefOr[String] = js.undefined
  var dropdownParent: js.UndefOr[JQuery[HTMLElement]] = js.undefined
  var escapeMarkup: js.UndefOr[js.Function1[/* markup */ String, String]] = js.undefined
  var initSelection: js.UndefOr[
    js.Function2[
      /* element */ JQuery[HTMLElement], 
      /* callback */ js.Function1[/* data */ js.Any, Unit], 
      Unit
    ]
  ] = js.undefined
  var insertTag: js.UndefOr[
    js.Function2[/* data */ js.Array[OptionData | IdTextPair], /* tag */ IdTextPair, Unit]
  ] = js.undefined
  var language: js.UndefOr[String | Translation] = js.undefined
  var matcher: js.UndefOr[
    js.Function2[
      /* params */ SearchOptions, 
      /* data */ OptGroupData | OptionData, 
      OptGroupData | OptionData | Null
    ]
  ] = js.undefined
  var maximumInputLength: js.UndefOr[Double] = js.undefined
  var maximumSelectionLength: js.UndefOr[Double] = js.undefined
  var minimumInputLength: js.UndefOr[Double] = js.undefined
  var minimumResultsForSearch: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var placeholder: js.UndefOr[String | IdTextPair] = js.undefined
  var resultsAdapter: js.UndefOr[js.Any] = js.undefined
  var selectOnClose: js.UndefOr[Boolean] = js.undefined
  var selectionAdapter: js.UndefOr[js.Any] = js.undefined
  var sorter: js.UndefOr[
    js.Function1[
      /* data */ js.Array[OptGroupData | OptionData | IdTextPair], 
      js.Array[OptGroupData | OptionData | IdTextPair]
    ]
  ] = js.undefined
  var tags: js.UndefOr[Boolean] = js.undefined
  var templateResult: js.UndefOr[
    js.Function1[/* result */ LoadingData | Result, String | JQuery[HTMLElement] | Null]
  ] = js.undefined
  var templateSelection: js.UndefOr[
    js.Function1[/* selection */ IdTextPair | LoadingData | Result, String | JQuery[HTMLElement]]
  ] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var tokenSeparators: js.UndefOr[js.Array[String]] = js.undefined
  var tokenizer: js.UndefOr[
    js.Function4[
      /* input */ String, 
      /* selection */ js.Array[_], 
      /* selectCallback */ js.Function0[Unit], 
      /* options */ Options[DataFormat | GroupedDataFormat, _], 
      String
    ]
  ] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply[Result, RemoteResult](
    ajax: AjaxOptions[Result, RemoteResult] = null,
    allowClear: js.UndefOr[Boolean] = js.undefined,
    amdBase: String = null,
    amdLanguageBase: String = null,
    closeOnSelect: js.UndefOr[Boolean] = js.undefined,
    containerCss: js.Any = null,
    containerCssClass: String = null,
    createTag: /* params */ SearchOptions => IdTextPair | Null = null,
    data: js.Array[DataFormat | GroupedDataFormat] = null,
    dataAdapter: js.Any = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    dir: ltr | rtl = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropdownAdapter: js.Any = null,
    dropdownAutoWidth: js.UndefOr[Boolean] = js.undefined,
    dropdownCss: js.Any = null,
    dropdownCssClass: String = null,
    dropdownParent: JQuery[HTMLElement] = null,
    escapeMarkup: /* markup */ String => String = null,
    initSelection: (/* element */ JQuery[HTMLElement], /* callback */ js.Function1[/* data */ js.Any, Unit]) => Unit = null,
    insertTag: (/* data */ js.Array[OptionData | IdTextPair], /* tag */ IdTextPair) => Unit = null,
    language: String | Translation = null,
    matcher: (/* params */ SearchOptions, /* data */ OptGroupData | OptionData) => OptGroupData | OptionData | Null = null,
    maximumInputLength: js.UndefOr[Double] = js.undefined,
    maximumSelectionLength: js.UndefOr[Double] = js.undefined,
    minimumInputLength: js.UndefOr[Double] = js.undefined,
    minimumResultsForSearch: js.UndefOr[Double] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    placeholder: String | IdTextPair = null,
    resultsAdapter: js.Any = null,
    selectOnClose: js.UndefOr[Boolean] = js.undefined,
    selectionAdapter: js.Any = null,
    sorter: /* data */ js.Array[OptGroupData | OptionData | IdTextPair] => js.Array[OptGroupData | OptionData | IdTextPair] = null,
    tags: js.UndefOr[Boolean] = js.undefined,
    templateResult: /* result */ LoadingData | Result => String | JQuery[HTMLElement] | Null = null,
    templateSelection: /* selection */ IdTextPair | LoadingData | Result => String | JQuery[HTMLElement] = null,
    theme: String = null,
    tokenSeparators: js.Array[String] = null,
    tokenizer: (/* input */ String, /* selection */ js.Array[_], /* selectCallback */ js.Function0[Unit], /* options */ Options[DataFormat | GroupedDataFormat, _]) => String = null,
    width: String = null
  ): Options[Result, RemoteResult] = {
    val __obj = js.Dynamic.literal()
    if (ajax != null) __obj.updateDynamic("ajax")(ajax.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.get.asInstanceOf[js.Any])
    if (amdBase != null) __obj.updateDynamic("amdBase")(amdBase.asInstanceOf[js.Any])
    if (amdLanguageBase != null) __obj.updateDynamic("amdLanguageBase")(amdLanguageBase.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect.get.asInstanceOf[js.Any])
    if (containerCss != null) __obj.updateDynamic("containerCss")(containerCss.asInstanceOf[js.Any])
    if (containerCssClass != null) __obj.updateDynamic("containerCssClass")(containerCssClass.asInstanceOf[js.Any])
    if (createTag != null) __obj.updateDynamic("createTag")(js.Any.fromFunction1(createTag))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataAdapter != null) __obj.updateDynamic("dataAdapter")(dataAdapter.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (dropdownAdapter != null) __obj.updateDynamic("dropdownAdapter")(dropdownAdapter.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownAutoWidth)) __obj.updateDynamic("dropdownAutoWidth")(dropdownAutoWidth.get.asInstanceOf[js.Any])
    if (dropdownCss != null) __obj.updateDynamic("dropdownCss")(dropdownCss.asInstanceOf[js.Any])
    if (dropdownCssClass != null) __obj.updateDynamic("dropdownCssClass")(dropdownCssClass.asInstanceOf[js.Any])
    if (dropdownParent != null) __obj.updateDynamic("dropdownParent")(dropdownParent.asInstanceOf[js.Any])
    if (escapeMarkup != null) __obj.updateDynamic("escapeMarkup")(js.Any.fromFunction1(escapeMarkup))
    if (initSelection != null) __obj.updateDynamic("initSelection")(js.Any.fromFunction2(initSelection))
    if (insertTag != null) __obj.updateDynamic("insertTag")(js.Any.fromFunction2(insertTag))
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (matcher != null) __obj.updateDynamic("matcher")(js.Any.fromFunction2(matcher))
    if (!js.isUndefined(maximumInputLength)) __obj.updateDynamic("maximumInputLength")(maximumInputLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumSelectionLength)) __obj.updateDynamic("maximumSelectionLength")(maximumSelectionLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumInputLength)) __obj.updateDynamic("minimumInputLength")(minimumInputLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumResultsForSearch)) __obj.updateDynamic("minimumResultsForSearch")(minimumResultsForSearch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (resultsAdapter != null) __obj.updateDynamic("resultsAdapter")(resultsAdapter.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOnClose)) __obj.updateDynamic("selectOnClose")(selectOnClose.get.asInstanceOf[js.Any])
    if (selectionAdapter != null) __obj.updateDynamic("selectionAdapter")(selectionAdapter.asInstanceOf[js.Any])
    if (sorter != null) __obj.updateDynamic("sorter")(js.Any.fromFunction1(sorter))
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags.get.asInstanceOf[js.Any])
    if (templateResult != null) __obj.updateDynamic("templateResult")(js.Any.fromFunction1(templateResult))
    if (templateSelection != null) __obj.updateDynamic("templateSelection")(js.Any.fromFunction1(templateSelection))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tokenSeparators != null) __obj.updateDynamic("tokenSeparators")(tokenSeparators.asInstanceOf[js.Any])
    if (tokenizer != null) __obj.updateDynamic("tokenizer")(js.Any.fromFunction4(tokenizer))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[Result, RemoteResult]]
  }
}

