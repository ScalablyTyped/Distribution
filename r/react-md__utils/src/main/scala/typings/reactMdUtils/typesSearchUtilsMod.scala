package typings.reactMdUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSearchUtilsMod {
  
  @JSImport("@react-md/utils/types/search/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/search/utils", "DEFAULT_GET_ITEM_VALUE")
  @js.native
  val DEFAULT_GET_ITEM_VALUE: js.Function2[/* item */ Any, /* valueKey */ js.UndefOr[String], String] = js.native
  
  @JSImport("@react-md/utils/types/search/utils", "DEFAULT_IGNORE_WHITESPACE")
  @js.native
  val DEFAULT_IGNORE_WHITESPACE: /* false */ Boolean = js.native
  
  /* Inlined std.Required<@react-md/utils.@react-md/utils/types/search/utils.SearchOptions<unknown>> */
  object DEFAULT_SEARCH_OPTIONS {
    
    @JSImport("@react-md/utils/types/search/utils", "DEFAULT_SEARCH_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-md/utils/types/search/utils", "DEFAULT_SEARCH_OPTIONS.getItemValue")
    @js.native
    def getItemValue: GetItemValue_[Any] = js.native
    inline def getItemValue_=(x: GetItemValue_[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getItemValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-md/utils/types/search/utils", "DEFAULT_SEARCH_OPTIONS.ignoreWhitespace")
    @js.native
    def ignoreWhitespace: Boolean = js.native
    inline def ignoreWhitespace_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreWhitespace")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-md/utils/types/search/utils", "DEFAULT_SEARCH_OPTIONS.trim")
    @js.native
    def trim: Boolean = js.native
    inline def trim_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trim")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-md/utils/types/search/utils", "DEFAULT_SEARCH_OPTIONS.valueKey")
    @js.native
    def valueKey: String = js.native
    inline def valueKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@react-md/utils/types/search/utils", "DEFAULT_SEARCH_RESET_TIME")
  @js.native
  val DEFAULT_SEARCH_RESET_TIME: /* 500 */ Double = js.native
  
  @JSImport("@react-md/utils/types/search/utils", "DEFAULT_TRIM")
  @js.native
  val DEFAULT_TRIM: /* true */ Boolean = js.native
  
  @JSImport("@react-md/utils/types/search/utils", "DEFAULT_VALUE_KEY")
  @js.native
  val DEFAULT_VALUE_KEY: /* "value" */ String = js.native
  
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
  
  trait BaseSearchOptions[T] extends StObject {
    
    /**
      * A function that will get a string value from each item. The default
      * implementation will:
      *
      * - return a number as a string
      * - return a string as itself
      * - return the result of item() if it is a function (this will also be used
      *   if the `valueKey` on an object is a function).
      * - return item[valueKey] if it's an object (this uses typeof item === "object")
      * - return the empty string for all other data types
      */
    var getItemValue: js.UndefOr[GetItemValue_[T]] = js.undefined
    
    /**
      * The key to use to get a value string if the item is an object.
      */
    var valueKey: js.UndefOr[String] = js.undefined
  }
  object BaseSearchOptions {
    
    inline def apply[T](): BaseSearchOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseSearchOptions[T]]
    }
    
    extension [Self <: BaseSearchOptions[?], T](x: Self & BaseSearchOptions[T]) {
      
      inline def setGetItemValue(value: (T, /* valueKey */ String) => String): Self = StObject.set(x, "getItemValue", js.Any.fromFunction2(value))
      
      inline def setGetItemValueUndefined: Self = StObject.set(x, "getItemValue", js.undefined)
      
      inline def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
      
      inline def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
    }
  }
  
  type GetItemValue_[T] = js.Function2[/* item */ T, /* valueKey */ String, String]
  
  trait SearchOptions[T]
    extends StObject
       with BaseSearchOptions[T] {
    
    /**
      * Boolean if all the whitespace should be ignored in the query string and for
      * each item.
      */
    var ignoreWhitespace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the query string and each item should have the leading and
      * trailing spaces removed.
      */
    var trim: js.UndefOr[Boolean] = js.undefined
  }
  object SearchOptions {
    
    inline def apply[T](): SearchOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchOptions[T]]
    }
    
    extension [Self <: SearchOptions[?], T](x: Self & SearchOptions[T]) {
      
      inline def setIgnoreWhitespace(value: Boolean): Self = StObject.set(x, "ignoreWhitespace", value.asInstanceOf[js.Any])
      
      inline def setIgnoreWhitespaceUndefined: Self = StObject.set(x, "ignoreWhitespace", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
}
