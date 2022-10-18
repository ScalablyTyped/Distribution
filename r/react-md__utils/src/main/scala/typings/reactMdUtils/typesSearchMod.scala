package typings.reactMdUtils

import typings.reactMdUtils.typesSearchCaseInsensitiveFilterMod.CaseInsensitiveOptions
import typings.reactMdUtils.typesSearchUseKeyboardSearchMod.KeyboardSearchOptions
import typings.reactMdUtils.typesSearchUseKeyboardSearchMod.ReturnValue
import typings.reactMdUtils.typesSearchUtilsMod.GetItemValue_
import typings.reactMdUtils.typesSearchUtilsMod.SearchOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSearchMod {
  
  @JSImport("@react-md/utils/types/search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/search", "DEFAULT_GET_ITEM_VALUE")
  @js.native
  val DEFAULT_GET_ITEM_VALUE: js.Function2[/* item */ Any, /* valueKey */ js.UndefOr[String], String] = js.native
  
  @JSImport("@react-md/utils/types/search", "DEFAULT_IGNORE_WHITESPACE")
  @js.native
  val DEFAULT_IGNORE_WHITESPACE: /* false */ Boolean = js.native
  
  /* Inlined std.Required<@react-md/utils.@react-md/utils/types/search/utils.SearchOptions<unknown>> */
  object DEFAULT_SEARCH_OPTIONS {
    
    @JSImport("@react-md/utils/types/search", "DEFAULT_SEARCH_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-md/utils/types/search", "DEFAULT_SEARCH_OPTIONS.getItemValue")
    @js.native
    def getItemValue: GetItemValue_[Any] = js.native
    inline def getItemValue_=(x: GetItemValue_[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getItemValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-md/utils/types/search", "DEFAULT_SEARCH_OPTIONS.ignoreWhitespace")
    @js.native
    def ignoreWhitespace: Boolean = js.native
    inline def ignoreWhitespace_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreWhitespace")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-md/utils/types/search", "DEFAULT_SEARCH_OPTIONS.trim")
    @js.native
    def trim: Boolean = js.native
    inline def trim_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trim")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-md/utils/types/search", "DEFAULT_SEARCH_OPTIONS.valueKey")
    @js.native
    def valueKey: String = js.native
    inline def valueKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@react-md/utils/types/search", "DEFAULT_SEARCH_RESET_TIME")
  @js.native
  val DEFAULT_SEARCH_RESET_TIME: /* 500 */ Double = js.native
  
  @JSImport("@react-md/utils/types/search", "DEFAULT_TRIM")
  @js.native
  val DEFAULT_TRIM: /* true */ Boolean = js.native
  
  @JSImport("@react-md/utils/types/search", "DEFAULT_VALUE_KEY")
  @js.native
  val DEFAULT_VALUE_KEY: /* "value" */ String = js.native
  
  inline def caseInsensitiveFilter[T](query: String, searchable: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("caseInsensitiveFilter")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def caseInsensitiveFilter[T](query: String, searchable: js.Array[T], options: CaseInsensitiveOptions[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("caseInsensitiveFilter")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def findIgnoreCase[T](query: String, searchable: js.Array[T]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findIgnoreCase")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def findIgnoreCase[T](query: String, searchable: js.Array[T], options: SearchOptions[T]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findIgnoreCase")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  
  inline def findMatchInRange(value: String, values: js.Array[String], startIndex: Double, endIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatchInRange")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def findMatchIndex(value: String, values: js.Array[String], startIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatchIndex")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def findMatchIndex(value: String, values: js.Array[String], startIndex: Double, isSelfMatchable: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatchIndex")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], isSelfMatchable.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def fuzzyFilter[T](query: String, searchable: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fuzzyFilter")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def fuzzyFilter[T](query: String, searchable: js.Array[T], options: SearchOptions[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fuzzyFilter")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def getFuzzyRegExp(query: String): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFuzzyRegExp")(query.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def getItemValue(item: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemValue")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getItemValue(item: Any, valueKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemValue")(item.asInstanceOf[js.Any], valueKey.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getSearchString(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Boolean, trim: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Boolean, trim: Boolean, ignoreWhitespace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any], ignoreWhitespace.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Boolean, trim: Unit, ignoreWhitespace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any], ignoreWhitespace.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Unit, trim: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Unit, trim: Boolean, ignoreWhitespace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any], ignoreWhitespace.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Unit, trim: Unit, ignoreWhitespace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any], ignoreWhitespace.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useKeyboardSearch[D, E /* <: HTMLElement */](
    hasItemsOnChangeOnKeyDownResetTimeSearchIndexValueKeyGetItemValueFindMatchIndex: KeyboardSearchOptions[D, E]
  ): ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardSearch")(hasItemsOnChangeOnKeyDownResetTimeSearchIndexValueKeyGetItemValueFindMatchIndex.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[E]]
}
