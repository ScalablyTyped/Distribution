package typings.reactMdUtils

import typings.reactMdUtils.caseInsensitiveFilterMod.CaseInsensitiveOptions
import typings.reactMdUtils.useKeyboardSearchMod.KeyboardSearchOptions
import typings.reactMdUtils.useKeyboardSearchMod.ReturnValue
import typings.reactMdUtils.utilsMod.GetItemValue_
import typings.reactMdUtils.utilsMod.SearchOptions
import typings.std.HTMLElement
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/search", JSImport.Namespace)
@js.native
object searchMod extends js.Object {
  val DEFAULT_GET_ITEM_VALUE: js.Function2[/* item */ js.Any, /* valueKey */ js.UndefOr[String], String] = js.native
  val DEFAULT_IGNORE_WHITESPACE: /* false */ Boolean = js.native
  val DEFAULT_SEARCH_RESET_TIME: /* 500 */ Double = js.native
  val DEFAULT_TRIM: /* true */ Boolean = js.native
  val DEFAULT_VALUE_KEY: /* "value" */ String = js.native
  def caseInsensitiveFilter[T](query: String, searchable: js.Array[T]): js.Array[T] = js.native
  def caseInsensitiveFilter[T](query: String, searchable: js.Array[T], options: CaseInsensitiveOptions[T]): js.Array[T] = js.native
  def findIgnoreCase[T](query: String, searchable: js.Array[T]): T | Null = js.native
  def findIgnoreCase[T](query: String, searchable: js.Array[T], options: SearchOptions[T]): T | Null = js.native
  def findMatchIndex(value: String, values: js.Array[String], startIndex: Double): Double = js.native
  def findMatchIndex(value: String, values: js.Array[String], startIndex: Double, isSelfMatchable: Boolean): Double = js.native
  def fuzzyFilter[T](query: String, searchable: js.Array[T]): js.Array[T] = js.native
  def fuzzyFilter[T](query: String, searchable: js.Array[T], options: SearchOptions[T]): js.Array[T] = js.native
  def getFuzzyRegExp(query: String): RegExp = js.native
  def getItemValue(item: js.Any): String = js.native
  def getItemValue(item: js.Any, valueKey: String): String = js.native
  def getSearchString(value: String): String = js.native
  def getSearchString(
    value: String,
    lowercase: js.UndefOr[scala.Nothing],
    trim: js.UndefOr[scala.Nothing],
    ignoreWhitespace: Boolean
  ): String = js.native
  def getSearchString(value: String, lowercase: js.UndefOr[scala.Nothing], trim: Boolean): String = js.native
  def getSearchString(value: String, lowercase: js.UndefOr[scala.Nothing], trim: Boolean, ignoreWhitespace: Boolean): String = js.native
  def getSearchString(value: String, lowercase: Boolean): String = js.native
  def getSearchString(value: String, lowercase: Boolean, trim: js.UndefOr[scala.Nothing], ignoreWhitespace: Boolean): String = js.native
  def getSearchString(value: String, lowercase: Boolean, trim: Boolean): String = js.native
  def getSearchString(value: String, lowercase: Boolean, trim: Boolean, ignoreWhitespace: Boolean): String = js.native
  def useKeyboardSearch[D, E /* <: HTMLElement */](
    hasItemsOnChangeOnKeyDownResetTimeSearchIndexValueKeyGetItemValueFindMatchIndex: KeyboardSearchOptions[D, E]
  ): ReturnValue[E] = js.native
  @js.native
  object DEFAULT_SEARCH_OPTIONS extends js.Object {
    var getItemValue: GetItemValue_[_] = js.native
    var ignoreWhitespace: Boolean = js.native
    var trim: Boolean = js.native
    var valueKey: String = js.native
  }
  
}

