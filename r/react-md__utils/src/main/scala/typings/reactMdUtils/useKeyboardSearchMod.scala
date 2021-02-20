package typings.reactMdUtils

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.reactMdUtils.findMatchIndexMod.FindMatchIndex_
import typings.reactMdUtils.utilsMod.BaseSearchOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useKeyboardSearchMod {
  
  @JSImport("@react-md/utils/types/search/useKeyboardSearch", "useKeyboardSearch")
  @js.native
  def useKeyboardSearch[D, E /* <: HTMLElement */](
    hasItemsOnChangeOnKeyDownResetTimeSearchIndexValueKeyGetItemValueFindMatchIndex: KeyboardSearchOptions[D, E]
  ): ReturnValue[E] = js.native
  
  @js.native
  trait BaseKeyboardSearchOptions[D, E /* <: HTMLElement */] extends BaseSearchOptions[D] {
    
    /**
      * The function used to find a match index within the `items` list. You most
      * likely won't want to change this.
      */
    var findMatchIndex: js.UndefOr[FindMatchIndex_] = js.native
    
    /**
      * The list of items that should be searched whenever the user types a letter.
      */
    var items: js.Array[D] = js.native
    
    /**
      * A required change event handler that will be called whenever a user types a
      * letter and it causes a new item to be "found". This should normally be
      * something that either updates the `aria-activedescendant` id to the new
      * found item's id or manually focus the item's DOM node.
      */
    var onChange: SearchChangeEvent[D, E] = js.native
    
    /**
      * An optional `onKeyDown` event handler that should be merged with the search
      * functionality.
      *
      * Note: This will be called **before** the search functionality is triggered.
      */
    var onKeyDown: js.UndefOr[KeyboardEventHandler[E]] = js.native
    
    /**
      * The amount of time that a "search" value should be kept before resetting.
      * The default value works for most cases, but it might be nice to configure
      * it based on your use case.
      */
    var resetTime: js.UndefOr[Double] = js.native
  }
  object BaseKeyboardSearchOptions {
    
    @scala.inline
    def apply[D, E /* <: HTMLElement */](items: js.Array[D], onChange: /* data */ SearchData[D, E] => Unit): BaseKeyboardSearchOptions[D, E] = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[BaseKeyboardSearchOptions[D, E]]
    }
    
    @scala.inline
    implicit class BaseKeyboardSearchOptionsMutableBuilder[Self <: BaseKeyboardSearchOptions[_, _], D, E /* <: HTMLElement */] (val x: Self with (BaseKeyboardSearchOptions[D, E])) extends AnyVal {
      
      @scala.inline
      def setFindMatchIndex(
        value: (/* value */ String, /* values */ js.Array[String], /* startIndex */ Double, /* isSelfMatchable */ js.UndefOr[Boolean]) => Double
      ): Self = StObject.set(x, "findMatchIndex", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFindMatchIndexUndefined: Self = StObject.set(x, "findMatchIndex", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[D]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: D*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setOnChange(value: /* data */ SearchData[D, E] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[E] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setResetTime(value: Double): Self = StObject.set(x, "resetTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetTimeUndefined: Self = StObject.set(x, "resetTime", js.undefined)
    }
  }
  
  @js.native
  trait KeyboardSearchOptions[D, E /* <: HTMLElement */] extends BaseKeyboardSearchOptions[D, E] {
    
    /**
      * The current index that should be "focused" due to a keyboard search. This
      * should be updated whenever the `onChange` callback is fired.
      */
    var searchIndex: Double = js.native
  }
  object KeyboardSearchOptions {
    
    @scala.inline
    def apply[D, E /* <: HTMLElement */](items: js.Array[D], onChange: /* data */ SearchData[D, E] => Unit, searchIndex: Double): KeyboardSearchOptions[D, E] = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), searchIndex = searchIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardSearchOptions[D, E]]
    }
    
    @scala.inline
    implicit class KeyboardSearchOptionsMutableBuilder[Self <: KeyboardSearchOptions[_, _], D, E /* <: HTMLElement */] (val x: Self with (KeyboardSearchOptions[D, E])) extends AnyVal {
      
      @scala.inline
      def setSearchIndex(value: Double): Self = StObject.set(x, "searchIndex", value.asInstanceOf[js.Any])
    }
  }
  
  type ReturnValue[E /* <: HTMLElement */] = KeyboardEventHandler[E]
  
  type SearchChangeEvent[D, E /* <: HTMLElement */] = js.Function1[/* data */ SearchData[D, E], Unit]
  
  @js.native
  trait SearchData[D, E /* <: HTMLElement */] extends StObject {
    
    /**
      * The index in the `items` array that the found item appears at. This is
      * super useful when extending this hook to be used with
      * `aria-activedescendant` focus movement or manual focus behavior since the
      * `items` array should normally be the same indexes as the DOM nodes.
      */
    val index: Double = js.native
    
    /**
      * The item that was matched from the latest search.
      */
    val item: D = js.native
    
    /**
      * The current list of items that were provided to be searched.
      */
    val items: js.Array[D] = js.native
    
    /**
      * The search value that was used to find this item and trigger the change
      * event.
      */
    val query: String = js.native
    
    /**
      * The current target for the search keydown event.
      */
    val target: E = js.native
  }
  object SearchData {
    
    @scala.inline
    def apply[D, E /* <: HTMLElement */](index: Double, item: D, items: js.Array[D], query: String, target: E): SearchData[D, E] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchData[D, E]]
    }
    
    @scala.inline
    implicit class SearchDataMutableBuilder[Self <: SearchData[_, _], D, E /* <: HTMLElement */] (val x: Self with (SearchData[D, E])) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: D): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[D]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: D*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: E): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
