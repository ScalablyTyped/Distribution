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

