package typings.select2.mod

import typings.select2.mod.global.JQuery
import typings.select2.select2Strings.ltr
import typings.select2.select2Strings.rtl
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options[Result, RemoteResult] extends StObject {
  
  var ajax: js.UndefOr[AjaxOptions[Result, RemoteResult]] = js.undefined
  
  var allowClear: js.UndefOr[Boolean] = js.undefined
  
  var amdBase: js.UndefOr[String] = js.undefined
  
  var amdLanguageBase: js.UndefOr[String] = js.undefined
  
  var closeOnSelect: js.UndefOr[Boolean] = js.undefined
  
  var containerCss: js.UndefOr[Any] = js.undefined
  
  var containerCssClass: js.UndefOr[String] = js.undefined
  
  // Not in https://select2.org/configuration/options-api
  var createTag: js.UndefOr[
    js.Function1[/* params */ SearchOptions, (IdTextPair & (Record[String, Any])) | Null]
  ] = js.undefined
  
  var data: js.UndefOr[js.Array[DataFormat | GroupedDataFormat]] = js.undefined
  
  var dataAdapter: js.UndefOr[Any] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var dir: js.UndefOr[ltr | rtl] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var dropdownAdapter: js.UndefOr[Any] = js.undefined
  
  var dropdownAutoWidth: js.UndefOr[Boolean] = js.undefined
  
  var dropdownCss: js.UndefOr[Any] = js.undefined
  
  var dropdownCssClass: js.UndefOr[String] = js.undefined
  
  var dropdownParent: js.UndefOr[HTMLElement | JQuery[HTMLElement] | String] = js.undefined
  
  var escapeMarkup: js.UndefOr[js.Function1[/* markup */ String, String]] = js.undefined
  
  var initSelection: js.UndefOr[
    js.Function2[
      /* element */ JQuery[HTMLElement], 
      /* callback */ js.Function1[/* data */ Any, Unit], 
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
  
  var resultsAdapter: js.UndefOr[Any] = js.undefined
  
  var selectOnClose: js.UndefOr[Boolean] = js.undefined
  
  var selectionAdapter: js.UndefOr[Any] = js.undefined
  
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
    js.Function2[
      /* selection */ IdTextPair | LoadingData | Result, 
      /* container */ JQuery[HTMLElement], 
      String | JQuery[HTMLElement]
    ]
  ] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var tokenSeparators: js.UndefOr[js.Array[String]] = js.undefined
  
  var tokenizer: js.UndefOr[
    js.Function4[
      /* input */ String, 
      /* selection */ js.Array[Any], 
      /* selectCallback */ js.Function0[Unit], 
      /* options */ Options[DataFormat | GroupedDataFormat, Any], 
      String
    ]
  ] = js.undefined
  
  var width: js.UndefOr[String] = js.undefined
}
object Options {
  
  inline def apply[Result, RemoteResult](): Options[Result, RemoteResult] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[Result, RemoteResult]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options[?, ?], Result, RemoteResult] (val x: Self & (Options[Result, RemoteResult])) extends AnyVal {
    
    inline def setAjax(value: AjaxOptions[Result, RemoteResult]): Self = StObject.set(x, "ajax", value.asInstanceOf[js.Any])
    
    inline def setAjaxUndefined: Self = StObject.set(x, "ajax", js.undefined)
    
    inline def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
    
    inline def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
    
    inline def setAmdBase(value: String): Self = StObject.set(x, "amdBase", value.asInstanceOf[js.Any])
    
    inline def setAmdBaseUndefined: Self = StObject.set(x, "amdBase", js.undefined)
    
    inline def setAmdLanguageBase(value: String): Self = StObject.set(x, "amdLanguageBase", value.asInstanceOf[js.Any])
    
    inline def setAmdLanguageBaseUndefined: Self = StObject.set(x, "amdLanguageBase", js.undefined)
    
    inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
    
    inline def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
    
    inline def setContainerCss(value: Any): Self = StObject.set(x, "containerCss", value.asInstanceOf[js.Any])
    
    inline def setContainerCssClass(value: String): Self = StObject.set(x, "containerCssClass", value.asInstanceOf[js.Any])
    
    inline def setContainerCssClassUndefined: Self = StObject.set(x, "containerCssClass", js.undefined)
    
    inline def setContainerCssUndefined: Self = StObject.set(x, "containerCss", js.undefined)
    
    inline def setCreateTag(value: /* params */ SearchOptions => (IdTextPair & (Record[String, Any])) | Null): Self = StObject.set(x, "createTag", js.Any.fromFunction1(value))
    
    inline def setCreateTagUndefined: Self = StObject.set(x, "createTag", js.undefined)
    
    inline def setData(value: js.Array[DataFormat | GroupedDataFormat]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataAdapter(value: Any): Self = StObject.set(x, "dataAdapter", value.asInstanceOf[js.Any])
    
    inline def setDataAdapterUndefined: Self = StObject.set(x, "dataAdapter", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: (DataFormat | GroupedDataFormat)*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDir(value: ltr | rtl): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDropdownAdapter(value: Any): Self = StObject.set(x, "dropdownAdapter", value.asInstanceOf[js.Any])
    
    inline def setDropdownAdapterUndefined: Self = StObject.set(x, "dropdownAdapter", js.undefined)
    
    inline def setDropdownAutoWidth(value: Boolean): Self = StObject.set(x, "dropdownAutoWidth", value.asInstanceOf[js.Any])
    
    inline def setDropdownAutoWidthUndefined: Self = StObject.set(x, "dropdownAutoWidth", js.undefined)
    
    inline def setDropdownCss(value: Any): Self = StObject.set(x, "dropdownCss", value.asInstanceOf[js.Any])
    
    inline def setDropdownCssClass(value: String): Self = StObject.set(x, "dropdownCssClass", value.asInstanceOf[js.Any])
    
    inline def setDropdownCssClassUndefined: Self = StObject.set(x, "dropdownCssClass", js.undefined)
    
    inline def setDropdownCssUndefined: Self = StObject.set(x, "dropdownCss", js.undefined)
    
    inline def setDropdownParent(value: HTMLElement | JQuery[HTMLElement] | String): Self = StObject.set(x, "dropdownParent", value.asInstanceOf[js.Any])
    
    inline def setDropdownParentUndefined: Self = StObject.set(x, "dropdownParent", js.undefined)
    
    inline def setEscapeMarkup(value: /* markup */ String => String): Self = StObject.set(x, "escapeMarkup", js.Any.fromFunction1(value))
    
    inline def setEscapeMarkupUndefined: Self = StObject.set(x, "escapeMarkup", js.undefined)
    
    inline def setInitSelection(
      value: (/* element */ JQuery[HTMLElement], /* callback */ js.Function1[/* data */ Any, Unit]) => Unit
    ): Self = StObject.set(x, "initSelection", js.Any.fromFunction2(value))
    
    inline def setInitSelectionUndefined: Self = StObject.set(x, "initSelection", js.undefined)
    
    inline def setInsertTag(value: (/* data */ js.Array[OptionData | IdTextPair], /* tag */ IdTextPair) => Unit): Self = StObject.set(x, "insertTag", js.Any.fromFunction2(value))
    
    inline def setInsertTagUndefined: Self = StObject.set(x, "insertTag", js.undefined)
    
    inline def setLanguage(value: String | Translation): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setMatcher(
      value: (/* params */ SearchOptions, /* data */ OptGroupData | OptionData) => OptGroupData | OptionData | Null
    ): Self = StObject.set(x, "matcher", js.Any.fromFunction2(value))
    
    inline def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
    
    inline def setMaximumInputLength(value: Double): Self = StObject.set(x, "maximumInputLength", value.asInstanceOf[js.Any])
    
    inline def setMaximumInputLengthUndefined: Self = StObject.set(x, "maximumInputLength", js.undefined)
    
    inline def setMaximumSelectionLength(value: Double): Self = StObject.set(x, "maximumSelectionLength", value.asInstanceOf[js.Any])
    
    inline def setMaximumSelectionLengthUndefined: Self = StObject.set(x, "maximumSelectionLength", js.undefined)
    
    inline def setMinimumInputLength(value: Double): Self = StObject.set(x, "minimumInputLength", value.asInstanceOf[js.Any])
    
    inline def setMinimumInputLengthUndefined: Self = StObject.set(x, "minimumInputLength", js.undefined)
    
    inline def setMinimumResultsForSearch(value: Double): Self = StObject.set(x, "minimumResultsForSearch", value.asInstanceOf[js.Any])
    
    inline def setMinimumResultsForSearchUndefined: Self = StObject.set(x, "minimumResultsForSearch", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setPlaceholder(value: String | IdTextPair): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setResultsAdapter(value: Any): Self = StObject.set(x, "resultsAdapter", value.asInstanceOf[js.Any])
    
    inline def setResultsAdapterUndefined: Self = StObject.set(x, "resultsAdapter", js.undefined)
    
    inline def setSelectOnClose(value: Boolean): Self = StObject.set(x, "selectOnClose", value.asInstanceOf[js.Any])
    
    inline def setSelectOnCloseUndefined: Self = StObject.set(x, "selectOnClose", js.undefined)
    
    inline def setSelectionAdapter(value: Any): Self = StObject.set(x, "selectionAdapter", value.asInstanceOf[js.Any])
    
    inline def setSelectionAdapterUndefined: Self = StObject.set(x, "selectionAdapter", js.undefined)
    
    inline def setSorter(
      value: /* data */ js.Array[OptGroupData | OptionData | IdTextPair] => js.Array[OptGroupData | OptionData | IdTextPair]
    ): Self = StObject.set(x, "sorter", js.Any.fromFunction1(value))
    
    inline def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
    
    inline def setTags(value: Boolean): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTemplateResult(value: /* result */ LoadingData | Result => String | JQuery[HTMLElement] | Null): Self = StObject.set(x, "templateResult", js.Any.fromFunction1(value))
    
    inline def setTemplateResultUndefined: Self = StObject.set(x, "templateResult", js.undefined)
    
    inline def setTemplateSelection(
      value: (/* selection */ IdTextPair | LoadingData | Result, /* container */ JQuery[HTMLElement]) => String | JQuery[HTMLElement]
    ): Self = StObject.set(x, "templateSelection", js.Any.fromFunction2(value))
    
    inline def setTemplateSelectionUndefined: Self = StObject.set(x, "templateSelection", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTokenSeparators(value: js.Array[String]): Self = StObject.set(x, "tokenSeparators", value.asInstanceOf[js.Any])
    
    inline def setTokenSeparatorsUndefined: Self = StObject.set(x, "tokenSeparators", js.undefined)
    
    inline def setTokenSeparatorsVarargs(value: String*): Self = StObject.set(x, "tokenSeparators", js.Array(value*))
    
    inline def setTokenizer(
      value: (/* input */ String, /* selection */ js.Array[Any], /* selectCallback */ js.Function0[Unit], /* options */ Options[DataFormat | GroupedDataFormat, Any]) => String
    ): Self = StObject.set(x, "tokenizer", js.Any.fromFunction4(value))
    
    inline def setTokenizerUndefined: Self = StObject.set(x, "tokenizer", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
