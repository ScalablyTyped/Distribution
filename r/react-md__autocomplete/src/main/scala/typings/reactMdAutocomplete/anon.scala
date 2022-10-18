package typings.reactMdAutocomplete

import typings.reactMdAutocomplete.typesTypesMod.AutoCompleteData
import typings.reactMdTransition.typesTypesMod.TransitionEnterHandler
import typings.reactMdTransition.typesTypesMod.TransitionExitHandler
import typings.reactMdUtils.typesSearchUtilsMod.GetItemValue_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @react-md/autocomplete.@react-md/autocomplete/types/types.FilterFunctionOptions<{}> */
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
    var getItemValue: js.UndefOr[GetItemValue_[AutoCompleteData]] = js.undefined
    
    /**
      * Boolean if all the whitespace should be ignored in the query string and for
      * each item.
      */
    var ignoreWhitespace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the filter should also exclude all items that do not start with
      * the query string. The default behavior is to return all matches that
      * contain the query string anywhere.
      */
    var startsWith: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the query string and each item should have the leading and
      * trailing spaces removed.
      */
    var trim: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The key to use to get a value string if the item is an object.
      */
    var valueKey: js.UndefOr[String] = js.undefined
  }
  object FilterFunctionOptions {
    
    inline def apply(): FilterFunctionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterFunctionOptions]
    }
    
    extension [Self <: FilterFunctionOptions](x: Self) {
      
      inline def setGetItemValue(value: (AutoCompleteData, /* valueKey */ String) => String): Self = StObject.set(x, "getItemValue", js.Any.fromFunction2(value))
      
      inline def setGetItemValueUndefined: Self = StObject.set(x, "getItemValue", js.undefined)
      
      inline def setIgnoreWhitespace(value: Boolean): Self = StObject.set(x, "ignoreWhitespace", value.asInstanceOf[js.Any])
      
      inline def setIgnoreWhitespaceUndefined: Self = StObject.set(x, "ignoreWhitespace", js.undefined)
      
      inline def setStartsWith(value: Boolean): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
      
      inline def setStartsWithUndefined: Self = StObject.set(x, "startsWith", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
      
      inline def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
    }
  }
  
  /* Inlined std.Required<@react-md/transition.@react-md/transition.FixedPositioningTransitionCallbacks> */
  trait RequiredFixedPositioningT extends StObject {
    
    var onEnter: TransitionEnterHandler
    
    var onEntered: TransitionEnterHandler
    
    var onEntering: TransitionEnterHandler
    
    var onExited: TransitionExitHandler
  }
  object RequiredFixedPositioningT {
    
    inline def apply(
      onEnter: /* appearing */ Boolean => Unit,
      onEntered: /* appearing */ Boolean => Unit,
      onEntering: /* appearing */ Boolean => Unit,
      onExited: () => Unit
    ): RequiredFixedPositioningT = {
      val __obj = js.Dynamic.literal(onEnter = js.Any.fromFunction1(onEnter), onEntered = js.Any.fromFunction1(onEntered), onEntering = js.Any.fromFunction1(onEntering), onExited = js.Any.fromFunction0(onExited))
      __obj.asInstanceOf[RequiredFixedPositioningT]
    }
    
    extension [Self <: RequiredFixedPositioningT](x: Self) {
      
      inline def setOnEnter(value: /* appearing */ Boolean => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
      
      inline def setOnEntered(value: /* appearing */ Boolean => Unit): Self = StObject.set(x, "onEntered", js.Any.fromFunction1(value))
      
      inline def setOnEntering(value: /* appearing */ Boolean => Unit): Self = StObject.set(x, "onEntering", js.Any.fromFunction1(value))
      
      inline def setOnExited(value: () => Unit): Self = StObject.set(x, "onExited", js.Any.fromFunction0(value))
    }
  }
}
