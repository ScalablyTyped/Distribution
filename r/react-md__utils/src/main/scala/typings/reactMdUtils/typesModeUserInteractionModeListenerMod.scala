package typings.reactMdUtils

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdUtils.typesModeTypesMod.UserInteractionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModeUserInteractionModeListenerMod {
  
  @JSImport("@react-md/utils/types/mode/UserInteractionModeListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def UserInteractionModeListener(param0: UserInteractionModeListenerProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("UserInteractionModeListener")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def useIsUserInteractionMode(mode: UserInteractionMode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsUserInteractionMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useUserInteractionMode(): UserInteractionMode = ^.asInstanceOf[js.Dynamic].applyDynamic("useUserInteractionMode")().asInstanceOf[UserInteractionMode]
  
  trait UserInteractionModeListenerProps extends StObject {
    
    /**
      * The `children` are required since this component basically does nothing
      * other than providing a `className` to the `document.body` otherwise.
      */
    var children: ReactNode
  }
  object UserInteractionModeListenerProps {
    
    inline def apply(): UserInteractionModeListenerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserInteractionModeListenerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserInteractionModeListenerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
