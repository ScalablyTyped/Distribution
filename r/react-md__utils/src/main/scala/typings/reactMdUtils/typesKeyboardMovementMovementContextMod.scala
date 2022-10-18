package typings.reactMdUtils

import typings.react.mod.Provider
import typings.reactMdUtils.anon.ReadonlyKeyboardFocusCont
import typings.reactMdUtils.typesKeyboardMovementTypesMod.KeyboardFocusContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKeyboardMovementMovementContextMod {
  
  @JSImport("@react-md/utils/types/keyboardMovement/movementContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<@react-md/utils.@react-md/utils/types/keyboardMovement/types.KeyboardMovementConfig> */
  object DEFAULT_KEYBOARD_MOVEMENT {
    
    @JSImport("@react-md/utils/types/keyboardMovement/movementContext", "DEFAULT_KEYBOARD_MOVEMENT.decrementKeys")
    @js.native
    val decrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement/movementContext", "DEFAULT_KEYBOARD_MOVEMENT.incrementKeys")
    @js.native
    val incrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement/movementContext", "DEFAULT_KEYBOARD_MOVEMENT.jumpToFirstKeys")
    @js.native
    val jumpToFirstKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement/movementContext", "DEFAULT_KEYBOARD_MOVEMENT.jumpToLastKeys")
    @js.native
    val jumpToLastKeys: js.Array[String] = js.native
  }
  
  /* Inlined std.Readonly<@react-md/utils.@react-md/utils/types/keyboardMovement/types.KeyboardMovementConfig> */
  object DEFAULT_LTR_KEYBOARD_MOVEMENT {
    
    @JSImport("@react-md/utils/types/keyboardMovement/movementContext", "DEFAULT_LTR_KEYBOARD_MOVEMENT.decrementKeys")
    @js.native
    val decrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement/movementContext", "DEFAULT_LTR_KEYBOARD_MOVEMENT.incrementKeys")
    @js.native
    val incrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement/movementContext", "DEFAULT_LTR_KEYBOARD_MOVEMENT.jumpToFirstKeys")
    @js.native
    val jumpToFirstKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement/movementContext", "DEFAULT_LTR_KEYBOARD_MOVEMENT.jumpToLastKeys")
    @js.native
    val jumpToLastKeys: js.Array[String] = js.native
  }
  
  /* Inlined std.Readonly<@react-md/utils.@react-md/utils/types/keyboardMovement/types.KeyboardMovementConfig> */
  object DEFAULT_RTL_KEYBOARD_MOVEMENT {
    
    @JSImport("@react-md/utils/types/keyboardMovement/movementContext", "DEFAULT_RTL_KEYBOARD_MOVEMENT.decrementKeys")
    @js.native
    val decrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement/movementContext", "DEFAULT_RTL_KEYBOARD_MOVEMENT.incrementKeys")
    @js.native
    val incrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement/movementContext", "DEFAULT_RTL_KEYBOARD_MOVEMENT.jumpToFirstKeys")
    @js.native
    val jumpToFirstKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement/movementContext", "DEFAULT_RTL_KEYBOARD_MOVEMENT.jumpToLastKeys")
    @js.native
    val jumpToLastKeys: js.Array[String] = js.native
  }
  
  @JSImport("@react-md/utils/types/keyboardMovement/movementContext", "KeyboardMovementContextProvider")
  @js.native
  val KeyboardMovementContextProvider: Provider[KeyboardFocusContext] = js.native
  
  inline def useKeyboardFocusContext(): ReadonlyKeyboardFocusCont = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocusContext")().asInstanceOf[ReadonlyKeyboardFocusCont]
}
