package typings.reactMdUtils

import typings.react.mod.Provider
import typings.react.mod.ReactElement
import typings.react.mod.Ref
import typings.react.mod.RefCallback
import typings.reactMdUtils.activeDescendantContextMod.ActiveDescendantContext
import typings.reactMdUtils.activeDescendantMovementProviderMod.ActiveDescendantMovementProviderProps
import typings.reactMdUtils.anon.ReadonlyActiveDescendantC
import typings.reactMdUtils.anon.ReadonlyKeyboardFocusCont
import typings.reactMdUtils.keyboardMovementProviderMod.KeyboardMovementProviderProps
import typings.reactMdUtils.typesMod.KeyboardFocusContext
import typings.reactMdUtils.useActiveDescendantFocusMod.ActiveDescendantFocusHookOptions
import typings.reactMdUtils.useActiveDescendantFocusMod.ActiveDescendantFocusHookReturnValue
import typings.reactMdUtils.useActiveDescendantMod.ActiveDescendantHookOptions
import typings.reactMdUtils.useActiveDescendantMod.ActiveDescendantHookReturnValue
import typings.reactMdUtils.useKeyboardFocusMod.KeyboardFocusHookOptions
import typings.reactMdUtils.useKeyboardFocusMod.KeyboardFocusHookReturnValue
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardMovementMod {
  
  @JSImport("@react-md/utils/types/keyboardMovement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/keyboardMovement", "ActiveDescendantContextProvider")
  @js.native
  val ActiveDescendantContextProvider: Provider[ActiveDescendantContext] = js.native
  
  inline def ActiveDescendantMovementProvider(hasChildrenActiveIdSetActiveId: ActiveDescendantMovementProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ActiveDescendantMovementProvider")(hasChildrenActiveIdSetActiveId.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  /* Inlined std.Readonly<@react-md/utils.@react-md/utils/types/keyboardMovement/types.KeyboardMovementConfig> */
  object DEFAULT_KEYBOARD_MOVEMENT {
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_KEYBOARD_MOVEMENT.decrementKeys")
    @js.native
    val decrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_KEYBOARD_MOVEMENT.incrementKeys")
    @js.native
    val incrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_KEYBOARD_MOVEMENT.jumpToFirstKeys")
    @js.native
    val jumpToFirstKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_KEYBOARD_MOVEMENT.jumpToLastKeys")
    @js.native
    val jumpToLastKeys: js.Array[String] = js.native
  }
  
  /* Inlined std.Readonly<@react-md/utils.@react-md/utils/types/keyboardMovement/types.KeyboardMovementConfig> */
  object DEFAULT_LTR_KEYBOARD_MOVEMENT {
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_LTR_KEYBOARD_MOVEMENT.decrementKeys")
    @js.native
    val decrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_LTR_KEYBOARD_MOVEMENT.incrementKeys")
    @js.native
    val incrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_LTR_KEYBOARD_MOVEMENT.jumpToFirstKeys")
    @js.native
    val jumpToFirstKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_LTR_KEYBOARD_MOVEMENT.jumpToLastKeys")
    @js.native
    val jumpToLastKeys: js.Array[String] = js.native
  }
  
  /* Inlined std.Readonly<@react-md/utils.@react-md/utils/types/keyboardMovement/types.KeyboardMovementConfig> */
  object DEFAULT_RTL_KEYBOARD_MOVEMENT {
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_RTL_KEYBOARD_MOVEMENT.decrementKeys")
    @js.native
    val decrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_RTL_KEYBOARD_MOVEMENT.incrementKeys")
    @js.native
    val incrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_RTL_KEYBOARD_MOVEMENT.jumpToFirstKeys")
    @js.native
    val jumpToFirstKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_RTL_KEYBOARD_MOVEMENT.jumpToLastKeys")
    @js.native
    val jumpToLastKeys: js.Array[String] = js.native
  }
  
  @JSImport("@react-md/utils/types/keyboardMovement", "KeyboardMovementContextProvider")
  @js.native
  val KeyboardMovementContextProvider: Provider[KeyboardFocusContext] = js.native
  
  inline def KeyboardMovementProvider(
    hasChildrenLoopableSearchableHorizontalIncludeDisabledPropIncrementKeysPropDecrementKeysPropJumpToFirstKeysPropJumpToLastKeys: KeyboardMovementProviderProps
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("KeyboardMovementProvider")(hasChildrenLoopableSearchableHorizontalIncludeDisabledPropIncrementKeysPropDecrementKeysPropJumpToFirstKeysPropJumpToLastKeys.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def useActiveDescendant[E /* <: HTMLElement */](hasIdRef: ActiveDescendantHookOptions[E]): ActiveDescendantHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendant")(hasIdRef.asInstanceOf[js.Any]).asInstanceOf[ActiveDescendantHookReturnValue[E]]
  
  inline def useActiveDescendantContext(): ReadonlyActiveDescendantC = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantContext")().asInstanceOf[ReadonlyActiveDescendantC]
  
  inline def useActiveDescendantFocus[E /* <: HTMLElement */](): ActiveDescendantFocusHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantFocus")().asInstanceOf[ActiveDescendantFocusHookReturnValue[E]]
  inline def useActiveDescendantFocus[E /* <: HTMLElement */](hasDefaultActiveIdOptions: ActiveDescendantFocusHookOptions[E]): ActiveDescendantFocusHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantFocus")(hasDefaultActiveIdOptions.asInstanceOf[js.Any]).asInstanceOf[ActiveDescendantFocusHookReturnValue[E]]
  
  inline def useKeyboardFocus[E /* <: HTMLElement */](): KeyboardFocusHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocus")().asInstanceOf[KeyboardFocusHookReturnValue[E]]
  inline def useKeyboardFocus[E /* <: HTMLElement */](options: KeyboardFocusHookOptions[E]): KeyboardFocusHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocus")(options.asInstanceOf[js.Any]).asInstanceOf[KeyboardFocusHookReturnValue[E]]
  
  inline def useKeyboardFocusContext(): ReadonlyKeyboardFocusCont = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocusContext")().asInstanceOf[ReadonlyKeyboardFocusCont]
  
  inline def useKeyboardFocusableElement[E /* <: HTMLElement */](): RefCallback[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocusableElement")().asInstanceOf[RefCallback[E]]
  inline def useKeyboardFocusableElement[E /* <: HTMLElement */](ref: Ref[E]): RefCallback[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocusableElement")(ref.asInstanceOf[js.Any]).asInstanceOf[RefCallback[E]]
}
