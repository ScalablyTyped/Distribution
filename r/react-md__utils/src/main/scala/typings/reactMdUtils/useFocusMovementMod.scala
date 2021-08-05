package typings.reactMdUtils

import typings.reactMdUtils.movementTypesMod.IncrementMovementKey
import typings.reactMdUtils.movementTypesMod.JumpMovementKey
import typings.reactMdUtils.useKeyboardMovementMod.BaseKeyboardMovementOptions
import typings.reactMdUtils.useKeyboardMovementMod.KeyboardMovementProviders
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFocusMovementMod {
  
  @JSImport("@react-md/utils/types/wia-aria/movement/useFocusMovement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFocusMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](hasDefaultFocusedIndexOnChangeOptions: KeyboardFocusOptions[D, CE, IE]): KeyboardMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusMovement")(hasDefaultFocusedIndexOnChangeOptions.asInstanceOf[js.Any]).asInstanceOf[KeyboardMovementProviders[CE, IE]]
  
  trait KeyboardFocusOptions[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */]
    extends StObject
       with BaseKeyboardMovementOptions[D, CE, IE] {
    
    /**
      * The index that should be focused by default.
      */
    var defaultFocusedIndex: js.UndefOr[Double] = js.undefined
  }
  object KeyboardFocusOptions {
    
    inline def apply[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
      decrementKeys: js.Array[IncrementMovementKey],
      incrementKeys: js.Array[IncrementMovementKey],
      items: js.Array[D],
      jumpToFirstKeys: js.Array[JumpMovementKey],
      jumpToLastKeys: js.Array[JumpMovementKey]
    ): KeyboardFocusOptions[D, CE, IE] = {
      val __obj = js.Dynamic.literal(decrementKeys = decrementKeys.asInstanceOf[js.Any], incrementKeys = incrementKeys.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jumpToFirstKeys = jumpToFirstKeys.asInstanceOf[js.Any], jumpToLastKeys = jumpToLastKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardFocusOptions[D, CE, IE]]
    }
    
    extension [Self <: KeyboardFocusOptions[?, ?, ?], D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](x: Self & (KeyboardFocusOptions[D, CE, IE])) {
      
      inline def setDefaultFocusedIndex(value: Double): Self = StObject.set(x, "defaultFocusedIndex", value.asInstanceOf[js.Any])
      
      inline def setDefaultFocusedIndexUndefined: Self = StObject.set(x, "defaultFocusedIndex", js.undefined)
    }
  }
}
