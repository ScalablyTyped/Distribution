package typings.reactMdUtils

import typings.react.mod.Dispatch
import typings.react.mod.KeyboardEvent
import typings.react.mod.SetStateAction
import typings.reactMdUtils.movementTypesMod.IncrementMovementKey
import typings.reactMdUtils.movementTypesMod.JumpMovementKey
import typings.reactMdUtils.useKeyboardMovementMod.BaseKeyboardMovementOptions
import typings.reactMdUtils.useKeyboardMovementMod.ItemRef
import typings.reactMdUtils.useKeyboardMovementMod.ItemRefList
import typings.reactMdUtils.useKeyboardMovementMod.MovementHandler
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useActiveDescendantMovementMod {
  
  @JSImport("@react-md/utils/types/wia-aria/movement/useActiveDescendantMovement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useActiveDescendantMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    hasBaseIdGetIdDefaultFocusedIndexItemsOnChangeGetItemValueValueKeyOnKeyDownOnEnterOnSpaceOptions: ActiveDescendantOptions[D, CE, IE]
  ): ActiveDescendantMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantMovement")(hasBaseIdGetIdDefaultFocusedIndexItemsOnChangeGetItemValueValueKeyOnKeyDownOnEnterOnSpaceOptions.asInstanceOf[js.Any]).asInstanceOf[ActiveDescendantMovementProviders[CE, IE]]
  
  type ActiveDescendantId = String
  
  trait ActiveDescendantMovementProviders[CE /* <: HTMLElement */, IE /* <: HTMLElement */] extends StObject {
    
    var activeId: ActiveDescendantId
    
    var focusedIndex: Double
    
    var itemRefs: ItemRefList[IE]
    
    var onKeyDown: MovementHandler[CE]
    
    var setFocusedIndex: Dispatch[SetStateAction[Double]]
  }
  object ActiveDescendantMovementProviders {
    
    inline def apply[CE /* <: HTMLElement */, IE /* <: HTMLElement */](
      activeId: ActiveDescendantId,
      focusedIndex: Double,
      itemRefs: ItemRefList[IE],
      onKeyDown: KeyboardEvent[CE] => Unit,
      setFocusedIndex: SetStateAction[Double] => Unit
    ): ActiveDescendantMovementProviders[CE, IE] = {
      val __obj = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any], focusedIndex = focusedIndex.asInstanceOf[js.Any], itemRefs = itemRefs.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1(onKeyDown), setFocusedIndex = js.Any.fromFunction1(setFocusedIndex))
      __obj.asInstanceOf[ActiveDescendantMovementProviders[CE, IE]]
    }
    
    extension [Self <: ActiveDescendantMovementProviders[?, ?], CE /* <: HTMLElement */, IE /* <: HTMLElement */](x: Self & (ActiveDescendantMovementProviders[CE, IE])) {
      
      inline def setActiveId(value: ActiveDescendantId): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      inline def setFocusedIndex(value: Double): Self = StObject.set(x, "focusedIndex", value.asInstanceOf[js.Any])
      
      inline def setItemRefs(value: ItemRefList[IE]): Self = StObject.set(x, "itemRefs", value.asInstanceOf[js.Any])
      
      inline def setItemRefsVarargs(value: ItemRef[IE]*): Self = StObject.set(x, "itemRefs", js.Array(value :_*))
      
      inline def setOnKeyDown(value: KeyboardEvent[CE] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setSetFocusedIndex(value: SetStateAction[Double] => Unit): Self = StObject.set(x, "setFocusedIndex", js.Any.fromFunction1(value))
    }
  }
  
  trait ActiveDescendantOptions[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */]
    extends StObject
       with BaseKeyboardMovementOptions[D, CE, IE] {
    
    /**
      * The base id that should be used to generate the `aria-activedescendant`
      * value id. This will be passed into the `getId` option.
      */
    var baseId: String
    
    /**
      * The default index that should be "focused" when the component mounts. This
      * is set to `-1` by default so that it only gains a new "focused" index when
      * the container element is focused.
      */
    var defaultFocusedIndex: js.UndefOr[js.Function0[Double] | Double] = js.undefined
    
    /**
      * The function that should generate an id based on the provided `id` and
      * `index` of the item.
      */
    var getId: js.UndefOr[js.Function2[/* id */ String, /* index */ Double, String]] = js.undefined
    
    /**
      * An optional function to call when the enter key has been pressed while the
      * container element has keyboard focus. This is normally used for triggering
      * click events for that specific item.
      */
    var onEnter: js.UndefOr[KeyHandler[IE]] = js.undefined
    
    /**
      * An optional function to call when the space key has been pressed while the
      * container element has keyboard focus. This is normally used for triggering
      * click events for that specific item and will always call
      * `event.preventDefault()` to prevent the page scrolling behavior.
      */
    var onSpace: js.UndefOr[KeyHandler[IE]] = js.undefined
  }
  object ActiveDescendantOptions {
    
    inline def apply[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
      baseId: String,
      decrementKeys: js.Array[IncrementMovementKey],
      incrementKeys: js.Array[IncrementMovementKey],
      items: js.Array[D],
      jumpToFirstKeys: js.Array[JumpMovementKey],
      jumpToLastKeys: js.Array[JumpMovementKey]
    ): ActiveDescendantOptions[D, CE, IE] = {
      val __obj = js.Dynamic.literal(baseId = baseId.asInstanceOf[js.Any], decrementKeys = decrementKeys.asInstanceOf[js.Any], incrementKeys = incrementKeys.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jumpToFirstKeys = jumpToFirstKeys.asInstanceOf[js.Any], jumpToLastKeys = jumpToLastKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveDescendantOptions[D, CE, IE]]
    }
    
    extension [Self <: ActiveDescendantOptions[?, ?, ?], D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](x: Self & (ActiveDescendantOptions[D, CE, IE])) {
      
      inline def setBaseId(value: String): Self = StObject.set(x, "baseId", value.asInstanceOf[js.Any])
      
      inline def setDefaultFocusedIndex(value: js.Function0[Double] | Double): Self = StObject.set(x, "defaultFocusedIndex", value.asInstanceOf[js.Any])
      
      inline def setDefaultFocusedIndexFunction0(value: () => Double): Self = StObject.set(x, "defaultFocusedIndex", js.Any.fromFunction0(value))
      
      inline def setDefaultFocusedIndexUndefined: Self = StObject.set(x, "defaultFocusedIndex", js.undefined)
      
      inline def setGetId(value: (/* id */ String, /* index */ Double) => String): Self = StObject.set(x, "getId", js.Any.fromFunction2(value))
      
      inline def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
      
      inline def setOnEnter(value: (/* focusedIndex */ Double, /* itemRef */ IE | Null) => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction2(value))
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnSpace(value: (/* focusedIndex */ Double, /* itemRef */ IE | Null) => Unit): Self = StObject.set(x, "onSpace", js.Any.fromFunction2(value))
      
      inline def setOnSpaceUndefined: Self = StObject.set(x, "onSpace", js.undefined)
    }
  }
  
  type KeyHandler[IE /* <: HTMLElement */] = js.Function2[/* focusedIndex */ Double, /* itemRef */ IE | Null, Unit]
}
