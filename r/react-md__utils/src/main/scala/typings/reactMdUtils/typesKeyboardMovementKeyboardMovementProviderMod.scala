package typings.reactMdUtils

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdUtils.typesKeyboardMovementTypesMod.KeyboardMovementBehavior
import typings.reactMdUtils.typesKeyboardMovementTypesMod.KeyboardMovementConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKeyboardMovementKeyboardMovementProviderMod {
  
  @JSImport("@react-md/utils/types/keyboardMovement/KeyboardMovementProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def KeyboardMovementProvider(
    hasChildrenLoopableSearchableHorizontalIncludeDisabledPropIncrementKeysPropDecrementKeysPropJumpToFirstKeysPropJumpToLastKeys: KeyboardMovementProviderProps
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("KeyboardMovementProvider")(hasChildrenLoopableSearchableHorizontalIncludeDisabledPropIncrementKeysPropDecrementKeysPropJumpToFirstKeysPropJumpToLastKeys.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait KeyboardMovementProviderProps
    extends StObject
       with KeyboardMovementBehavior
       with KeyboardMovementConfiguration {
    
    var children: ReactNode
  }
  object KeyboardMovementProviderProps {
    
    inline def apply(): KeyboardMovementProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardMovementProviderProps]
    }
    
    extension [Self <: KeyboardMovementProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
