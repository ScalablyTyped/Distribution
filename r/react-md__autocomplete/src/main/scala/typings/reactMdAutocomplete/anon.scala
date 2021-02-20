package typings.reactMdAutocomplete

import typings.reactMdAutocomplete.typesMod.AutoCompleteData
import typings.reactMdUtils.utilsMod.GetItemValue_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @react-md/autocomplete.@react-md/autocomplete/types/types.FilterFunctionOptions<{}> */
  @js.native
  trait FilterFunctionOptions extends StObject {
    
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
    var getItemValue: js.UndefOr[GetItemValue_[AutoCompleteData]] = js.native
    
    /**
      * Boolean if all the whitespace should be ignored in the query string and for
      * each item.
      */
    var ignoreWhitespace: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the filter should also exclude all items that do not start with
      * the query string. The default behavior is to return all matches that
      * contain the query string anywhere.
      */
    var startsWith: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the query string and each item should have the leading and
      * trailing spaces removed.
      */
    var trim: js.UndefOr[Boolean] = js.native
    
    /**
      * The key to use to get a value string if the item is an object.
      */
    var valueKey: js.UndefOr[String] = js.native
  }
  object FilterFunctionOptions {
    
    @scala.inline
    def apply(): FilterFunctionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterFunctionOptions]
    }
    
    @scala.inline
    implicit class FilterFunctionOptionsMutableBuilder[Self <: FilterFunctionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetItemValue(value: (AutoCompleteData, /* valueKey */ String) => String): Self = StObject.set(x, "getItemValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetItemValueUndefined: Self = StObject.set(x, "getItemValue", js.undefined)
      
      @scala.inline
      def setIgnoreWhitespace(value: Boolean): Self = StObject.set(x, "ignoreWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreWhitespaceUndefined: Self = StObject.set(x, "ignoreWhitespace", js.undefined)
      
      @scala.inline
      def setStartsWith(value: Boolean): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartsWithUndefined: Self = StObject.set(x, "startsWith", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      @scala.inline
      def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
    }
  }
  
  /* Inlined std.Required<@react-md/transition.@react-md/transition.TransitionHooks> */
  @js.native
  trait RequiredTransitionHooks extends StObject {
    
    var onEnter: js.Any = js.native
    
    var onEntered: js.Any = js.native
    
    var onEntering: js.Any = js.native
    
    var onExited: js.Any = js.native
  }
  object RequiredTransitionHooks {
    
    @scala.inline
    def apply(onEnter: js.Any, onEntered: js.Any, onEntering: js.Any, onExited: js.Any): RequiredTransitionHooks = {
      val __obj = js.Dynamic.literal(onEnter = onEnter.asInstanceOf[js.Any], onEntered = onEntered.asInstanceOf[js.Any], onEntering = onEntering.asInstanceOf[js.Any], onExited = onExited.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredTransitionHooks]
    }
    
    @scala.inline
    implicit class RequiredTransitionHooksMutableBuilder[Self <: RequiredTransitionHooks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnEnter(value: js.Any): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEntered(value: js.Any): Self = StObject.set(x, "onEntered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEntering(value: js.Any): Self = StObject.set(x, "onEntering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExited(value: js.Any): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
    }
  }
}
