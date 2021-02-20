package typings.reactMdUtils

import typings.reactMdUtils.caseInsensitiveFilterMod.CaseInsensitiveOptions
import typings.reactMdUtils.useKeyboardSearchMod.KeyboardSearchOptions
import typings.reactMdUtils.useKeyboardSearchMod.ReturnValue
import typings.reactMdUtils.utilsMod.GetItemValue_
import typings.reactMdUtils.utilsMod.SearchOptions
import typings.std.HTMLElement
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchMod {
  
  @JSImport("@react-md/utils/types/search", "DEFAULT_GET_ITEM_VALUE")
  @js.native
  val DEFAULT_GET_ITEM_VALUE: js.Function2[/* item */ js.Any, /* valueKey */ js.UndefOr[String], String] = js.native
  
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
    def getItemValue: GetItemValue_[js.Any] = js.native
    @scala.inline
    def getItemValue_=(x: GetItemValue_[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getItemValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-md/utils/types/search", "DEFAULT_SEARCH_OPTIONS.ignoreWhitespace")
    @js.native
    def ignoreWhitespace: Boolean = js.native
    @scala.inline
    def ignoreWhitespace_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreWhitespace")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-md/utils/types/search", "DEFAULT_SEARCH_OPTIONS.trim")
    @js.native
    def trim: Boolean = js.native
    @scala.inline
    def trim_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trim")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-md/utils/types/search", "DEFAULT_SEARCH_OPTIONS.valueKey")
    @js.native
    def valueKey: String = js.native
    @scala.inline
    def valueKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(x.asInstanceOf[js.Any])
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
  
  @JSImport("@react-md/utils/types/search", "caseInsensitiveFilter")
  @js.native
  def caseInsensitiveFilter[T](query: String, searchable: js.Array[T]): js.Array[T] = js.native
  @JSImport("@react-md/utils/types/search", "caseInsensitiveFilter")
  @js.native
  def caseInsensitiveFilter[T](query: String, searchable: js.Array[T], options: CaseInsensitiveOptions[T]): js.Array[T] = js.native
  
  @JSImport("@react-md/utils/types/search", "findIgnoreCase")
  @js.native
  def findIgnoreCase[T](query: String, searchable: js.Array[T]): T | Null = js.native
  @JSImport("@react-md/utils/types/search", "findIgnoreCase")
  @js.native
  def findIgnoreCase[T](query: String, searchable: js.Array[T], options: SearchOptions[T]): T | Null = js.native
  
  @JSImport("@react-md/utils/types/search", "findMatchInRange")
  @js.native
  def findMatchInRange(value: String, values: js.Array[String], startIndex: Double, endIndex: Double): Double = js.native
  
  @JSImport("@react-md/utils/types/search", "findMatchIndex")
  @js.native
  def findMatchIndex(value: String, values: js.Array[String], startIndex: Double): Double = js.native
  @JSImport("@react-md/utils/types/search", "findMatchIndex")
  @js.native
  def findMatchIndex(value: String, values: js.Array[String], startIndex: Double, isSelfMatchable: Boolean): Double = js.native
  
  @JSImport("@react-md/utils/types/search", "fuzzyFilter")
  @js.native
  def fuzzyFilter[T](query: String, searchable: js.Array[T]): js.Array[T] = js.native
  @JSImport("@react-md/utils/types/search", "fuzzyFilter")
  @js.native
  def fuzzyFilter[T](query: String, searchable: js.Array[T], options: SearchOptions[T]): js.Array[T] = js.native
  
  @JSImport("@react-md/utils/types/search", "getFuzzyRegExp")
  @js.native
  def getFuzzyRegExp(query: String): RegExp = js.native
  
  @JSImport("@react-md/utils/types/search", "getItemValue")
  @js.native
  def getItemValue(item: js.Any): String = js.native
  @JSImport("@react-md/utils/types/search", "getItemValue")
  @js.native
  def getItemValue(item: js.Any, valueKey: String): String = js.native
  
  @JSImport("@react-md/utils/types/search", "getSearchString")
  @js.native
  def getSearchString(value: String): String = js.native
  @JSImport("@react-md/utils/types/search", "getSearchString")
  @js.native
  def getSearchString(
    value: String,
    lowercase: js.UndefOr[scala.Nothing],
    trim: js.UndefOr[scala.Nothing],
    ignoreWhitespace: Boolean
  ): String = js.native
  @JSImport("@react-md/utils/types/search", "getSearchString")
  @js.native
  def getSearchString(value: String, lowercase: js.UndefOr[scala.Nothing], trim: Boolean): String = js.native
  @JSImport("@react-md/utils/types/search", "getSearchString")
  @js.native
  def getSearchString(value: String, lowercase: js.UndefOr[scala.Nothing], trim: Boolean, ignoreWhitespace: Boolean): String = js.native
  @JSImport("@react-md/utils/types/search", "getSearchString")
  @js.native
  def getSearchString(value: String, lowercase: Boolean): String = js.native
  @JSImport("@react-md/utils/types/search", "getSearchString")
  @js.native
  def getSearchString(value: String, lowercase: Boolean, trim: js.UndefOr[scala.Nothing], ignoreWhitespace: Boolean): String = js.native
  @JSImport("@react-md/utils/types/search", "getSearchString")
  @js.native
  def getSearchString(value: String, lowercase: Boolean, trim: Boolean): String = js.native
  @JSImport("@react-md/utils/types/search", "getSearchString")
  @js.native
  def getSearchString(value: String, lowercase: Boolean, trim: Boolean, ignoreWhitespace: Boolean): String = js.native
  
  @JSImport("@react-md/utils/types/search", "useKeyboardSearch")
  @js.native
  def useKeyboardSearch[D, E /* <: HTMLElement */](
    hasItemsOnChangeOnKeyDownResetTimeSearchIndexValueKeyGetItemValueFindMatchIndex: KeyboardSearchOptions[D, E]
  ): ReturnValue[E] = js.native
}
