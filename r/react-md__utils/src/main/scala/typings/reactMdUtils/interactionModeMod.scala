package typings.reactMdUtils

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdUtils.useModeDetectionMod.UserInteractionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionModeMod {
  
  object InteractionModeListener {
    
    @JSImport("@react-md/utils/types/interaction/InteractionMode", "InteractionModeListener")
    @js.native
    def apply(hasChildren: InteractionModeListenerProps): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils/types/interaction/InteractionMode", "InteractionModeListener.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils/types/interaction/InteractionMode", "InteractionModeListener.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/utils/types/interaction/InteractionMode", "useIsUserInteractionMode")
  @js.native
  def useIsUserInteractionMode(mode: UserInteractionMode): Boolean = js.native
  
  @JSImport("@react-md/utils/types/interaction/InteractionMode", "useUserInteractionMode")
  @js.native
  def useUserInteractionMode(): UserInteractionMode = js.native
  
  @js.native
  trait InteractionModeListenerProps extends StObject {
    
    var children: ReactNode = js.native
  }
  object InteractionModeListenerProps {
    
    @scala.inline
    def apply(): InteractionModeListenerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionModeListenerProps]
    }
    
    @scala.inline
    implicit class InteractionModeListenerPropsMutableBuilder[Self <: InteractionModeListenerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
