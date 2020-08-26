package typings.select2.mod

import typings.select2.mod.global.JQuery
import typings.select2.select2Strings.ltr
import typings.select2.select2Strings.rtl
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[Result, RemoteResult] extends js.Object {
  var ajax: js.UndefOr[AjaxOptions[Result, RemoteResult]] = js.native
  var allowClear: js.UndefOr[Boolean] = js.native
  var amdBase: js.UndefOr[String] = js.native
  var amdLanguageBase: js.UndefOr[String] = js.native
  var closeOnSelect: js.UndefOr[Boolean] = js.native
  var containerCss: js.UndefOr[js.Any] = js.native
  var containerCssClass: js.UndefOr[String] = js.native
  // Not in https://select2.org/configuration/options-api
  var createTag: js.UndefOr[js.Function1[/* params */ SearchOptions, IdTextPair | Null]] = js.native
  var data: js.UndefOr[js.Array[DataFormat | GroupedDataFormat]] = js.native
  var dataAdapter: js.UndefOr[js.Any] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var dir: js.UndefOr[ltr | rtl] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dropdownAdapter: js.UndefOr[js.Any] = js.native
  var dropdownAutoWidth: js.UndefOr[Boolean] = js.native
  var dropdownCss: js.UndefOr[js.Any] = js.native
  var dropdownCssClass: js.UndefOr[String] = js.native
  var dropdownParent: js.UndefOr[JQuery[HTMLElement]] = js.native
  var escapeMarkup: js.UndefOr[js.Function1[/* markup */ String, String]] = js.native
  var initSelection: js.UndefOr[
    js.Function2[
      /* element */ JQuery[HTMLElement], 
      /* callback */ js.Function1[/* data */ js.Any, Unit], 
      Unit
    ]
  ] = js.native
  var insertTag: js.UndefOr[
    js.Function2[/* data */ js.Array[OptionData | IdTextPair], /* tag */ IdTextPair, Unit]
  ] = js.native
  var language: js.UndefOr[String | Translation] = js.native
  var matcher: js.UndefOr[
    js.Function2[
      /* params */ SearchOptions, 
      /* data */ OptGroupData | OptionData, 
      OptGroupData | OptionData | Null
    ]
  ] = js.native
  var maximumInputLength: js.UndefOr[Double] = js.native
  var maximumSelectionLength: js.UndefOr[Double] = js.native
  var minimumInputLength: js.UndefOr[Double] = js.native
  var minimumResultsForSearch: js.UndefOr[Double] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var placeholder: js.UndefOr[String | IdTextPair] = js.native
  var resultsAdapter: js.UndefOr[js.Any] = js.native
  var selectOnClose: js.UndefOr[Boolean] = js.native
  var selectionAdapter: js.UndefOr[js.Any] = js.native
  var sorter: js.UndefOr[
    js.Function1[
      /* data */ js.Array[OptGroupData | OptionData | IdTextPair], 
      js.Array[OptGroupData | OptionData | IdTextPair]
    ]
  ] = js.native
  var tags: js.UndefOr[Boolean] = js.native
  var templateResult: js.UndefOr[
    js.Function1[/* result */ LoadingData | Result, String | JQuery[HTMLElement] | Null]
  ] = js.native
  var templateSelection: js.UndefOr[
    js.Function1[/* selection */ IdTextPair | LoadingData | Result, String | JQuery[HTMLElement]]
  ] = js.native
  var theme: js.UndefOr[String] = js.native
  var tokenSeparators: js.UndefOr[js.Array[String]] = js.native
  var tokenizer: js.UndefOr[
    js.Function4[
      /* input */ String, 
      /* selection */ js.Array[_], 
      /* selectCallback */ js.Function0[Unit], 
      /* options */ Options[DataFormat | GroupedDataFormat, _], 
      String
    ]
  ] = js.native
  var width: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply[Result, RemoteResult](): Options[Result, RemoteResult] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[Result, RemoteResult]]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options[_, _], Result, RemoteResult] (val x: Self with (Options[Result, RemoteResult])) extends AnyVal {
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
    def setAjax(value: AjaxOptions[Result, RemoteResult]): Self = this.set("ajax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAjax: Self = this.set("ajax", js.undefined)
    @scala.inline
    def setAllowClear(value: Boolean): Self = this.set("allowClear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowClear: Self = this.set("allowClear", js.undefined)
    @scala.inline
    def setAmdBase(value: String): Self = this.set("amdBase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmdBase: Self = this.set("amdBase", js.undefined)
    @scala.inline
    def setAmdLanguageBase(value: String): Self = this.set("amdLanguageBase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmdLanguageBase: Self = this.set("amdLanguageBase", js.undefined)
    @scala.inline
    def setCloseOnSelect(value: Boolean): Self = this.set("closeOnSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnSelect: Self = this.set("closeOnSelect", js.undefined)
    @scala.inline
    def setContainerCss(value: js.Any): Self = this.set("containerCss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerCss: Self = this.set("containerCss", js.undefined)
    @scala.inline
    def setContainerCssClass(value: String): Self = this.set("containerCssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerCssClass: Self = this.set("containerCssClass", js.undefined)
    @scala.inline
    def setCreateTag(value: /* params */ SearchOptions => IdTextPair | Null): Self = this.set("createTag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreateTag: Self = this.set("createTag", js.undefined)
    @scala.inline
    def setDataVarargs(value: (DataFormat | GroupedDataFormat)*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[DataFormat | GroupedDataFormat]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataAdapter(value: js.Any): Self = this.set("dataAdapter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataAdapter: Self = this.set("dataAdapter", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDir(value: ltr | rtl): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDropdownAdapter(value: js.Any): Self = this.set("dropdownAdapter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownAdapter: Self = this.set("dropdownAdapter", js.undefined)
    @scala.inline
    def setDropdownAutoWidth(value: Boolean): Self = this.set("dropdownAutoWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownAutoWidth: Self = this.set("dropdownAutoWidth", js.undefined)
    @scala.inline
    def setDropdownCss(value: js.Any): Self = this.set("dropdownCss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownCss: Self = this.set("dropdownCss", js.undefined)
    @scala.inline
    def setDropdownCssClass(value: String): Self = this.set("dropdownCssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownCssClass: Self = this.set("dropdownCssClass", js.undefined)
    @scala.inline
    def setDropdownParent(value: JQuery[HTMLElement]): Self = this.set("dropdownParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownParent: Self = this.set("dropdownParent", js.undefined)
    @scala.inline
    def setEscapeMarkup(value: /* markup */ String => String): Self = this.set("escapeMarkup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEscapeMarkup: Self = this.set("escapeMarkup", js.undefined)
    @scala.inline
    def setInitSelection(
      value: (/* element */ JQuery[HTMLElement], /* callback */ js.Function1[/* data */ js.Any, Unit]) => Unit
    ): Self = this.set("initSelection", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInitSelection: Self = this.set("initSelection", js.undefined)
    @scala.inline
    def setInsertTag(value: (/* data */ js.Array[OptionData | IdTextPair], /* tag */ IdTextPair) => Unit): Self = this.set("insertTag", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInsertTag: Self = this.set("insertTag", js.undefined)
    @scala.inline
    def setLanguage(value: String | Translation): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setMatcher(
      value: (/* params */ SearchOptions, /* data */ OptGroupData | OptionData) => OptGroupData | OptionData | Null
    ): Self = this.set("matcher", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMatcher: Self = this.set("matcher", js.undefined)
    @scala.inline
    def setMaximumInputLength(value: Double): Self = this.set("maximumInputLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumInputLength: Self = this.set("maximumInputLength", js.undefined)
    @scala.inline
    def setMaximumSelectionLength(value: Double): Self = this.set("maximumSelectionLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumSelectionLength: Self = this.set("maximumSelectionLength", js.undefined)
    @scala.inline
    def setMinimumInputLength(value: Double): Self = this.set("minimumInputLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumInputLength: Self = this.set("minimumInputLength", js.undefined)
    @scala.inline
    def setMinimumResultsForSearch(value: Double): Self = this.set("minimumResultsForSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumResultsForSearch: Self = this.set("minimumResultsForSearch", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setPlaceholder(value: String | IdTextPair): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setResultsAdapter(value: js.Any): Self = this.set("resultsAdapter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultsAdapter: Self = this.set("resultsAdapter", js.undefined)
    @scala.inline
    def setSelectOnClose(value: Boolean): Self = this.set("selectOnClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectOnClose: Self = this.set("selectOnClose", js.undefined)
    @scala.inline
    def setSelectionAdapter(value: js.Any): Self = this.set("selectionAdapter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionAdapter: Self = this.set("selectionAdapter", js.undefined)
    @scala.inline
    def setSorter(
      value: /* data */ js.Array[OptGroupData | OptionData | IdTextPair] => js.Array[OptGroupData | OptionData | IdTextPair]
    ): Self = this.set("sorter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSorter: Self = this.set("sorter", js.undefined)
    @scala.inline
    def setTags(value: Boolean): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTemplateResult(value: /* result */ LoadingData | Result => String | JQuery[HTMLElement] | Null): Self = this.set("templateResult", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTemplateResult: Self = this.set("templateResult", js.undefined)
    @scala.inline
    def setTemplateSelection(value: /* selection */ IdTextPair | LoadingData | Result => String | JQuery[HTMLElement]): Self = this.set("templateSelection", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTemplateSelection: Self = this.set("templateSelection", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTokenSeparatorsVarargs(value: String*): Self = this.set("tokenSeparators", js.Array(value :_*))
    @scala.inline
    def setTokenSeparators(value: js.Array[String]): Self = this.set("tokenSeparators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenSeparators: Self = this.set("tokenSeparators", js.undefined)
    @scala.inline
    def setTokenizer(
      value: (/* input */ String, /* selection */ js.Array[_], /* selectCallback */ js.Function0[Unit], /* options */ Options[DataFormat | GroupedDataFormat, _]) => String
    ): Self = this.set("tokenizer", js.Any.fromFunction4(value))
    @scala.inline
    def deleteTokenizer: Self = this.set("tokenizer", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

