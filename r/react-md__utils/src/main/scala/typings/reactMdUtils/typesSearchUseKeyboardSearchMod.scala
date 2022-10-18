package typings.reactMdUtils

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.reactMdUtils.typesSearchFindMatchIndexMod.FindMatchIndex_
import typings.reactMdUtils.typesSearchUtilsMod.BaseSearchOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSearchUseKeyboardSearchMod {
  
  @JSImport("@react-md/utils/types/search/useKeyboardSearch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useKeyboardSearch[D, E /* <: HTMLElement */](
    hasItemsOnChangeOnKeyDownResetTimeSearchIndexValueKeyGetItemValueFindMatchIndex: KeyboardSearchOptions[D, E]
  ): ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardSearch")(hasItemsOnChangeOnKeyDownResetTimeSearchIndexValueKeyGetItemValueFindMatchIndex.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[E]]
  
  trait BaseKeyboardSearchOptions[D, E /* <: HTMLElement */]
    extends StObject
       with BaseSearchOptions[D] {
    
    /**
      * The function used to find a match index within the `items` list. You most
      * likely won't want to change this.
      */
    var findMatchIndex: js.UndefOr[FindMatchIndex_] = js.undefined
    
    /**
      * The list of items that should be searched whenever the user types a letter.
      */
    var items: js.Array[D]
    
    /**
      * A required change event handler that will be called whenever a user types a
      * letter and it causes a new item to be "found". This should normally be
      * something that either updates the `aria-activedescendant` id to the new
      * found item's id or manually focus the item's DOM node.
      */
    var onChange: SearchChangeEvent[D, E]
    
    /**
      * An optional `onKeyDown` event handler that should be merged with the search
      * functionality.
      *
      * Note: This will be called **before** the search functionality is triggered.
      */
    var onKeyDown: js.UndefOr[KeyboardEventHandler[E]] = js.undefined
    
    /**
      * The amount of time that a "search" value should be kept before resetting.
      * The default value works for most cases, but it might be nice to configure
      * it based on your use case.
      */
    var resetTime: js.UndefOr[Double] = js.undefined
  }
  object BaseKeyboardSearchOptions {
    
    inline def apply[D, E /* <: HTMLElement */](items: js.Array[D], onChange: /* data */ SearchData[D, E] => Unit): BaseKeyboardSearchOptions[D, E] = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[BaseKeyboardSearchOptions[D, E]]
    }
    
    extension [Self <: BaseKeyboardSearchOptions[?, ?], D, E /* <: HTMLElement */](x: Self & (BaseKeyboardSearchOptions[D, E])) {
      
      inline def setFindMatchIndex(
        value: (/* value */ String, /* values */ js.Array[String], /* startIndex */ Double, /* isSelfMatchable */ js.UndefOr[Boolean]) => Double
      ): Self = StObject.set(x, "findMatchIndex", js.Any.fromFunction4(value))
      
      inline def setFindMatchIndexUndefined: Self = StObject.set(x, "findMatchIndex", js.undefined)
      
      inline def setItems(value: js.Array[D]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: D*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOnChange(value: /* data */ SearchData[D, E] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnKeyDown(value: KeyboardEvent[E] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setResetTime(value: Double): Self = StObject.set(x, "resetTime", value.asInstanceOf[js.Any])
      
      inline def setResetTimeUndefined: Self = StObject.set(x, "resetTime", js.undefined)
    }
  }
  
  trait KeyboardSearchOptions[D, E /* <: HTMLElement */]
    extends StObject
       with BaseKeyboardSearchOptions[D, E] {
    
    /**
      * The current index that should be "focused" due to a keyboard search. This
      * should be updated whenever the `onChange` callback is fired.
      */
    var searchIndex: Double
  }
  object KeyboardSearchOptions {
    
    inline def apply[D, E /* <: HTMLElement */](items: js.Array[D], onChange: /* data */ SearchData[D, E] => Unit, searchIndex: Double): KeyboardSearchOptions[D, E] = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), searchIndex = searchIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardSearchOptions[D, E]]
    }
    
    extension [Self <: KeyboardSearchOptions[?, ?], D, E /* <: HTMLElement */](x: Self & (KeyboardSearchOptions[D, E])) {
      
      inline def setSearchIndex(value: Double): Self = StObject.set(x, "searchIndex", value.asInstanceOf[js.Any])
    }
  }
  
  type ReturnValue[E /* <: HTMLElement */] = KeyboardEventHandler[E]
  
  type SearchChangeEvent[D, E /* <: HTMLElement */] = js.Function1[/* data */ SearchData[D, E], Unit]
  
  trait SearchData[D, E /* <: HTMLElement */] extends StObject {
    
    /**
      * The index in the `items` array that the found item appears at. This is
      * super useful when extending this hook to be used with
      * `aria-activedescendant` focus movement or manual focus behavior since the
      * `items` array should normally be the same indexes as the DOM nodes.
      */
    val index: Double
    
    /**
      * The item that was matched from the latest search.
      */
    val item: D
    
    /**
      * The current list of items that were provided to be searched.
      */
    val items: js.Array[D]
    
    /**
      * The search value that was used to find this item and trigger the change
      * event.
      */
    val query: String
    
    /**
      * The current target for the search keydown event.
      */
    val target: E
  }
  object SearchData {
    
    inline def apply[D, E /* <: HTMLElement */](index: Double, item: D, items: js.Array[D], query: String, target: E): SearchData[D, E] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchData[D, E]]
    }
    
    extension [Self <: SearchData[?, ?], D, E /* <: HTMLElement */](x: Self & (SearchData[D, E])) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setItem(value: D): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[D]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: D*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: E): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
