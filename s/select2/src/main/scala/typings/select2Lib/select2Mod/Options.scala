package typings
package select2Lib.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[Result, RemoteResult] extends js.Object {
  var ajax: js.UndefOr[AjaxOptions[Result, RemoteResult]] = js.undefined
  var allowClear: js.UndefOr[scala.Boolean] = js.undefined
  var amdBase: js.UndefOr[java.lang.String] = js.undefined
  var amdLanguageBase: js.UndefOr[java.lang.String] = js.undefined
  var closeOnSelect: js.UndefOr[scala.Boolean] = js.undefined
  var containerCss: js.UndefOr[js.Any] = js.undefined
  var containerCssClass: js.UndefOr[java.lang.String] = js.undefined
  // Not in https://select2.org/configuration/options-api
  var createTag: js.UndefOr[js.Function1[/* params */ SearchOptions, IdTextPair | scala.Null]] = js.undefined
  var data: js.UndefOr[js.Array[DataFormat] | js.Array[GroupedDataFormat]] = js.undefined
  var dataAdapter: js.UndefOr[js.Any] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var dir: js.UndefOr[select2Lib.select2LibStrings.ltr | select2Lib.select2LibStrings.rtl] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var dropdownAdapter: js.UndefOr[js.Any] = js.undefined
  var dropdownAutoWidth: js.UndefOr[scala.Boolean] = js.undefined
  var dropdownCss: js.UndefOr[js.Any] = js.undefined
  var dropdownCssClass: js.UndefOr[java.lang.String] = js.undefined
  var dropdownParent: js.UndefOr[select2Lib.select2Mod.Global.JQuery[stdLib.HTMLElement]] = js.undefined
  var escapeMarkup: js.UndefOr[js.Function1[/* markup */ java.lang.String, java.lang.String]] = js.undefined
  var initSelection: js.UndefOr[
    js.Function2[
      /* element */ select2Lib.select2Mod.Global.JQuery[stdLib.HTMLElement], 
      /* callback */ js.Function1[/* data */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var insertTag: js.UndefOr[
    js.Function2[/* data */ js.Array[OptionData | IdTextPair], /* tag */ IdTextPair, scala.Unit]
  ] = js.undefined
  var language: js.UndefOr[java.lang.String | Translation] = js.undefined
  var matcher: js.UndefOr[
    js.Function2[
      /* params */ SearchOptions, 
      /* data */ OptGroupData | OptionData, 
      OptGroupData | OptionData | scala.Null
    ]
  ] = js.undefined
  var maximumInputLength: js.UndefOr[scala.Double] = js.undefined
  var maximumSelectionLength: js.UndefOr[scala.Double] = js.undefined
  var minimumInputLength: js.UndefOr[scala.Double] = js.undefined
  var minimumResultsForSearch: js.UndefOr[scala.Double] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var placeholder: js.UndefOr[java.lang.String | IdTextPair] = js.undefined
  var resultsAdapter: js.UndefOr[js.Any] = js.undefined
  var selectOnClose: js.UndefOr[scala.Boolean] = js.undefined
  var selectionAdapter: js.UndefOr[js.Any] = js.undefined
  var sorter: js.UndefOr[
    js.Function1[
      /* data */ js.Array[OptGroupData | OptionData | IdTextPair], 
      js.Array[OptGroupData | OptionData | IdTextPair]
    ]
  ] = js.undefined
  var tags: js.UndefOr[scala.Boolean] = js.undefined
  var templateResult: js.UndefOr[
    js.Function1[
      /* result */ LoadingData | Result, 
      java.lang.String | select2Lib.select2Mod.Global.JQuery[stdLib.HTMLElement] | scala.Null
    ]
  ] = js.undefined
  var templateSelection: js.UndefOr[
    js.Function1[
      /* selection */ IdTextPair | LoadingData | Result, 
      java.lang.String | select2Lib.select2Mod.Global.JQuery[stdLib.HTMLElement]
    ]
  ] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var tokenSeparators: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var tokenizer: js.UndefOr[
    js.Function4[
      /* input */ java.lang.String, 
      /* selection */ js.Array[_], 
      /* selectCallback */ js.Function0[scala.Unit], 
      /* options */ Options[DataFormat | GroupedDataFormat, _], 
      java.lang.String
    ]
  ] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply[Result, RemoteResult](
    ajax: AjaxOptions[Result, RemoteResult] = null,
    allowClear: js.UndefOr[scala.Boolean] = js.undefined,
    amdBase: java.lang.String = null,
    amdLanguageBase: java.lang.String = null,
    closeOnSelect: js.UndefOr[scala.Boolean] = js.undefined,
    containerCss: js.Any = null,
    containerCssClass: java.lang.String = null,
    createTag: /* params */ SearchOptions => IdTextPair | scala.Null = null,
    data: js.Array[DataFormat] | js.Array[GroupedDataFormat] = null,
    dataAdapter: js.Any = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    dir: select2Lib.select2LibStrings.ltr | select2Lib.select2LibStrings.rtl = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownAdapter: js.Any = null,
    dropdownAutoWidth: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownCss: js.Any = null,
    dropdownCssClass: java.lang.String = null,
    dropdownParent: select2Lib.select2Mod.Global.JQuery[stdLib.HTMLElement] = null,
    escapeMarkup: /* markup */ java.lang.String => java.lang.String = null,
    initSelection: (/* element */ select2Lib.select2Mod.Global.JQuery[stdLib.HTMLElement], /* callback */ js.Function1[/* data */ js.Any, scala.Unit]) => scala.Unit = null,
    insertTag: (/* data */ js.Array[OptionData | IdTextPair], /* tag */ IdTextPair) => scala.Unit = null,
    language: java.lang.String | Translation = null,
    matcher: (/* params */ SearchOptions, /* data */ OptGroupData | OptionData) => OptGroupData | OptionData | scala.Null = null,
    maximumInputLength: scala.Int | scala.Double = null,
    maximumSelectionLength: scala.Int | scala.Double = null,
    minimumInputLength: scala.Int | scala.Double = null,
    minimumResultsForSearch: scala.Int | scala.Double = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    placeholder: java.lang.String | IdTextPair = null,
    resultsAdapter: js.Any = null,
    selectOnClose: js.UndefOr[scala.Boolean] = js.undefined,
    selectionAdapter: js.Any = null,
    sorter: /* data */ js.Array[OptGroupData | OptionData | IdTextPair] => js.Array[OptGroupData | OptionData | IdTextPair] = null,
    tags: js.UndefOr[scala.Boolean] = js.undefined,
    templateResult: /* result */ LoadingData | Result => java.lang.String | select2Lib.select2Mod.Global.JQuery[stdLib.HTMLElement] | scala.Null = null,
    templateSelection: /* selection */ IdTextPair | LoadingData | Result => java.lang.String | select2Lib.select2Mod.Global.JQuery[stdLib.HTMLElement] = null,
    theme: java.lang.String = null,
    tokenSeparators: js.Array[java.lang.String] = null,
    tokenizer: (/* input */ java.lang.String, /* selection */ js.Array[_], /* selectCallback */ js.Function0[scala.Unit], /* options */ Options[DataFormat | GroupedDataFormat, _]) => java.lang.String = null,
    width: java.lang.String = null
  ): Options[Result, RemoteResult] = {
    val __obj = js.Dynamic.literal()
    if (ajax != null) __obj.updateDynamic("ajax")(ajax)
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (amdBase != null) __obj.updateDynamic("amdBase")(amdBase)
    if (amdLanguageBase != null) __obj.updateDynamic("amdLanguageBase")(amdLanguageBase)
    if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect)
    if (containerCss != null) __obj.updateDynamic("containerCss")(containerCss)
    if (containerCssClass != null) __obj.updateDynamic("containerCssClass")(containerCssClass)
    if (createTag != null) __obj.updateDynamic("createTag")(js.Any.fromFunction1(createTag))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataAdapter != null) __obj.updateDynamic("dataAdapter")(dataAdapter)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dropdownAdapter != null) __obj.updateDynamic("dropdownAdapter")(dropdownAdapter)
    if (!js.isUndefined(dropdownAutoWidth)) __obj.updateDynamic("dropdownAutoWidth")(dropdownAutoWidth)
    if (dropdownCss != null) __obj.updateDynamic("dropdownCss")(dropdownCss)
    if (dropdownCssClass != null) __obj.updateDynamic("dropdownCssClass")(dropdownCssClass)
    if (dropdownParent != null) __obj.updateDynamic("dropdownParent")(dropdownParent)
    if (escapeMarkup != null) __obj.updateDynamic("escapeMarkup")(js.Any.fromFunction1(escapeMarkup))
    if (initSelection != null) __obj.updateDynamic("initSelection")(js.Any.fromFunction2(initSelection))
    if (insertTag != null) __obj.updateDynamic("insertTag")(js.Any.fromFunction2(insertTag))
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (matcher != null) __obj.updateDynamic("matcher")(js.Any.fromFunction2(matcher))
    if (maximumInputLength != null) __obj.updateDynamic("maximumInputLength")(maximumInputLength.asInstanceOf[js.Any])
    if (maximumSelectionLength != null) __obj.updateDynamic("maximumSelectionLength")(maximumSelectionLength.asInstanceOf[js.Any])
    if (minimumInputLength != null) __obj.updateDynamic("minimumInputLength")(minimumInputLength.asInstanceOf[js.Any])
    if (minimumResultsForSearch != null) __obj.updateDynamic("minimumResultsForSearch")(minimumResultsForSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (resultsAdapter != null) __obj.updateDynamic("resultsAdapter")(resultsAdapter)
    if (!js.isUndefined(selectOnClose)) __obj.updateDynamic("selectOnClose")(selectOnClose)
    if (selectionAdapter != null) __obj.updateDynamic("selectionAdapter")(selectionAdapter)
    if (sorter != null) __obj.updateDynamic("sorter")(js.Any.fromFunction1(sorter))
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags)
    if (templateResult != null) __obj.updateDynamic("templateResult")(js.Any.fromFunction1(templateResult))
    if (templateSelection != null) __obj.updateDynamic("templateSelection")(js.Any.fromFunction1(templateSelection))
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tokenSeparators != null) __obj.updateDynamic("tokenSeparators")(tokenSeparators)
    if (tokenizer != null) __obj.updateDynamic("tokenizer")(js.Any.fromFunction4(tokenizer))
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Options[Result, RemoteResult]]
  }
}

