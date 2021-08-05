package typings.reactMdUtils

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdUtils.useModeDetectionMod.UserInteractionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionModeMod {
  
  @JSImport("@react-md/utils/types/interaction/InteractionMode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object InteractionModeListener {
    
    inline def apply(hasChildren: InteractionModeListenerProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/utils/types/interaction/InteractionMode", "InteractionModeListener")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils/types/interaction/InteractionMode", "InteractionModeListener.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils/types/interaction/InteractionMode", "InteractionModeListener.propTypes.children")
      @js.native
      def children: js.Any = js.native
      inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def useIsUserInteractionMode(mode: UserInteractionMode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsUserInteractionMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useUserInteractionMode(): UserInteractionMode = ^.asInstanceOf[js.Dynamic].applyDynamic("useUserInteractionMode")().asInstanceOf[UserInteractionMode]
  
  trait InteractionModeListenerProps extends StObject {
    
    var children: ReactNode
  }
  object InteractionModeListenerProps {
    
    inline def apply(): InteractionModeListenerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionModeListenerProps]
    }
    
    extension [Self <: InteractionModeListenerProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
