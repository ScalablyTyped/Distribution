package typings.reactMdUtils

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MutableRefObject
import typings.reactMdUtils.findMatchIndexMod.FindMatchIndex_
import typings.reactMdUtils.movementTypesMod.IncrementMovementKey
import typings.reactMdUtils.movementTypesMod.JumpMovementKey
import typings.reactMdUtils.useKeyboardSearchMod.SearchData
import typings.reactMdUtils.utilsMod.GetItemValue_
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useKeyboardMovementMod {
  
  @JSImport("@react-md/utils/types/wia-aria/movement/useKeyboardMovement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useKeyboardMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    hasOnKeyDownIncrementKeysDecrementKeysJumpToFirstKeysJumpToLastKeysStopPropagationOnChangeItemsResetTimeFindMatchIndexFocusedIndexLoopableSearchableValueKeyGetItemValue: KeyboardMovementOptions[D, CE, IE]
  ): KeyboardMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardMovement")(hasOnKeyDownIncrementKeysDecrementKeysJumpToFirstKeysJumpToLastKeysStopPropagationOnChangeItemsResetTimeFindMatchIndexFocusedIndexLoopableSearchableValueKeyGetItemValue.asInstanceOf[js.Any]).asInstanceOf[KeyboardMovementProviders[CE, IE]]
  
  /* Inlined parent std.Omit<@react-md/utils.@react-md/utils/types/search/useKeyboardSearch.BaseKeyboardSearchOptions<D, CE>, 'onChange'> */
  /* Inlined parent @react-md/utils.@react-md/utils/types/wia-aria/movement/types.MovementConfig */
  trait BaseKeyboardMovementOptions[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */] extends StObject {
    
    /**
      * The keys that can trigger a move to the previous item. If the `loopable`
      * config is enabled, this will loop to the last item if the first item is
      * currently "focused".
      */
    var decrementKeys: js.Array[IncrementMovementKey]
    
    var findMatchIndex: js.UndefOr[FindMatchIndex_] = js.undefined
    
    var getItemValue: js.UndefOr[GetItemValue_[D]] = js.undefined
    
    /**
      * The keys that can trigger a move to the next item. If the `loopable` config
      * is enabled, this will loop to the first item if the last item is currently
      * "focused".
      */
    var incrementKeys: js.Array[IncrementMovementKey]
    
    var items: js.Array[D]
    
    /**
      * The keys that can trigger a move to the first item.
      */
    var jumpToFirstKeys: js.Array[JumpMovementKey]
    
    /**
      * The keys that can trigger a move to the last item.
      */
    var jumpToLastKeys: js.Array[JumpMovementKey]
    
    /**
      * Boolean if the keyboard movement should be able to loop around once it has
      * reached the start or end of all the items.
      */
    var loopable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A required change event handler that will be called whenever a user types a
      * letter and it causes a new item to be "found". This should normally be
      * something that either updates the `aria-activedescendant` id to the new
      * found item's id or manually focus the item's DOM node.
      */
    var onChange: js.UndefOr[js.Function2[/* data */ SearchData[D, CE], /* itemRefs */ ItemRefList[IE], Unit]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[CE]] = js.undefined
    
    var resetTime: js.UndefOr[Double] = js.undefined
    
    /**
      * Boolean if the movement should also include printable characters search
      * movement.
      */
    var searchable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the event should trigger `event.stopPropagation()` when the
      * custom keyboard movement is triggered. This should generally be kept as
      * `false` or `undefined` by default, but enabled when creating more complex
      * 2-dimensional movement cases such as grids.
      */
    var stopPropagation: js.UndefOr[Boolean] = js.undefined
    
    var valueKey: js.UndefOr[String] = js.undefined
  }
  object BaseKeyboardMovementOptions {
    
    @scala.inline
    def apply[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
      decrementKeys: js.Array[IncrementMovementKey],
      incrementKeys: js.Array[IncrementMovementKey],
      items: js.Array[D],
      jumpToFirstKeys: js.Array[JumpMovementKey],
      jumpToLastKeys: js.Array[JumpMovementKey]
    ): BaseKeyboardMovementOptions[D, CE, IE] = {
      val __obj = js.Dynamic.literal(decrementKeys = decrementKeys.asInstanceOf[js.Any], incrementKeys = incrementKeys.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jumpToFirstKeys = jumpToFirstKeys.asInstanceOf[js.Any], jumpToLastKeys = jumpToLastKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseKeyboardMovementOptions[D, CE, IE]]
    }
    
    @scala.inline
    implicit class BaseKeyboardMovementOptionsMutableBuilder[Self <: BaseKeyboardMovementOptions[?, ?, ?], D, CE /* <: HTMLElement */, IE /* <: HTMLElement */] (val x: Self & (BaseKeyboardMovementOptions[D, CE, IE])) extends AnyVal {
      
      @scala.inline
      def setDecrementKeys(value: js.Array[IncrementMovementKey]): Self = StObject.set(x, "decrementKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecrementKeysVarargs(value: IncrementMovementKey*): Self = StObject.set(x, "decrementKeys", js.Array(value :_*))
      
      @scala.inline
      def setFindMatchIndex(
        value: (/* value */ String, /* values */ js.Array[String], /* startIndex */ Double, /* isSelfMatchable */ js.UndefOr[Boolean]) => Double
      ): Self = StObject.set(x, "findMatchIndex", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFindMatchIndexUndefined: Self = StObject.set(x, "findMatchIndex", js.undefined)
      
      @scala.inline
      def setGetItemValue(value: (D, /* valueKey */ String) => String): Self = StObject.set(x, "getItemValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetItemValueUndefined: Self = StObject.set(x, "getItemValue", js.undefined)
      
      @scala.inline
      def setIncrementKeys(value: js.Array[IncrementMovementKey]): Self = StObject.set(x, "incrementKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementKeysVarargs(value: IncrementMovementKey*): Self = StObject.set(x, "incrementKeys", js.Array(value :_*))
      
      @scala.inline
      def setItems(value: js.Array[D]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: D*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setJumpToFirstKeys(value: js.Array[JumpMovementKey]): Self = StObject.set(x, "jumpToFirstKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpToFirstKeysVarargs(value: JumpMovementKey*): Self = StObject.set(x, "jumpToFirstKeys", js.Array(value :_*))
      
      @scala.inline
      def setJumpToLastKeys(value: js.Array[JumpMovementKey]): Self = StObject.set(x, "jumpToLastKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpToLastKeysVarargs(value: JumpMovementKey*): Self = StObject.set(x, "jumpToLastKeys", js.Array(value :_*))
      
      @scala.inline
      def setLoopable(value: Boolean): Self = StObject.set(x, "loopable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopableUndefined: Self = StObject.set(x, "loopable", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* data */ SearchData[D, CE], /* itemRefs */ ItemRefList[IE]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[CE] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setResetTime(value: Double): Self = StObject.set(x, "resetTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetTimeUndefined: Self = StObject.set(x, "resetTime", js.undefined)
      
      @scala.inline
      def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
      
      @scala.inline
      def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      
      @scala.inline
      def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
    }
  }
  
  type ItemRef[E /* <: HTMLElement */] = MutableRefObject[E | Null]
  
  type ItemRefList[E /* <: HTMLElement */] = js.Array[ItemRef[E]]
  
  trait KeyboardMovementOptions[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */]
    extends StObject
       with BaseKeyboardMovementOptions[D, CE, IE] {
    
    /**
      * The currently focused index within the item list. This will need to be
      * updated due to the `onChange` callback being called for this hook to work
      * as it is fully "controlled" by a parent hook/component.
      */
    var focusedIndex: Double
    
    /**
      * A required change event handler that will be called whenever a user types a
      * letter and it causes a new item to be "found". This should normally be
      * something that either updates the `aria-activedescendant` id to the new
      * found item's id or manually focus the item's DOM node.
      */
    @JSName("onChange")
    def onChange_MKeyboardMovementOptions(data: SearchData[D, CE], itemRefs: ItemRefList[IE]): Unit
  }
  object KeyboardMovementOptions {
    
    @scala.inline
    def apply[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
      decrementKeys: js.Array[IncrementMovementKey],
      focusedIndex: Double,
      incrementKeys: js.Array[IncrementMovementKey],
      items: js.Array[D],
      jumpToFirstKeys: js.Array[JumpMovementKey],
      jumpToLastKeys: js.Array[JumpMovementKey],
      onChange: (SearchData[D, CE], ItemRefList[IE]) => Unit
    ): KeyboardMovementOptions[D, CE, IE] = {
      val __obj = js.Dynamic.literal(decrementKeys = decrementKeys.asInstanceOf[js.Any], focusedIndex = focusedIndex.asInstanceOf[js.Any], incrementKeys = incrementKeys.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jumpToFirstKeys = jumpToFirstKeys.asInstanceOf[js.Any], jumpToLastKeys = jumpToLastKeys.asInstanceOf[js.Any], onChange = js.Any.fromFunction2(onChange))
      __obj.asInstanceOf[KeyboardMovementOptions[D, CE, IE]]
    }
    
    @scala.inline
    implicit class KeyboardMovementOptionsMutableBuilder[Self <: KeyboardMovementOptions[?, ?, ?], D, CE /* <: HTMLElement */, IE /* <: HTMLElement */] (val x: Self & (KeyboardMovementOptions[D, CE, IE])) extends AnyVal {
      
      @scala.inline
      def setFocusedIndex(value: Double): Self = StObject.set(x, "focusedIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: (SearchData[D, CE], ItemRefList[IE]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    }
  }
  
  type KeyboardMovementProviders[CE /* <: HTMLElement */, IE /* <: HTMLElement */] = js.Tuple2[
    /**
    * A list of mutable ref objects that must be applied to each focusable item
    * within the list. This list will automatically be generated based on the
    * number of items provided to the `useKeyboardMovement` hook
    */
  ItemRefList[IE], 
    /**
    * The keydown event handler to apply to a "container" element that has custom
    * keyboard focus.
    */
  MovementHandler[CE]
  ]
  
  type MovementHandler[E /* <: HTMLElement */] = KeyboardEventHandler[E]
}
