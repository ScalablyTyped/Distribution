package typings.reactMdTransition

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdPortal.conditionalPortalMod.RenderConditionalPortalProps
import typings.reactMdTransition.typesMod.OverridableCSSTransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleTransitionMod {
  
  object ScaleTransition {
    
    @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition")
    @js.native
    def apply(
      hasVisibleChildrenClassNamesVerticalTimeoutPortalPortalIntoPortalIntoIdMountOnEnterUnmountOnExitProps: ScaleTransitionProps
    ): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes.classNames")
      @js.native
      def classNames: js.Any = js.native
      @scala.inline
      def classNames_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classNames")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes.mountOnEnter")
      @js.native
      def mountOnEnter: js.Any = js.native
      @scala.inline
      def mountOnEnter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mountOnEnter")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes.portal")
      @js.native
      def portal: js.Any = js.native
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes.portalInto")
      @js.native
      def portalInto: js.Any = js.native
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes.portalIntoId")
      @js.native
      def portalIntoId: js.Any = js.native
      @scala.inline
      def portalIntoId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalIntoId")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def portalInto_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalInto")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def portal_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portal")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes.timeout")
      @js.native
      def timeout: js.Any = js.native
      @scala.inline
      def timeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes.unmountOnExit")
      @js.native
      def unmountOnExit: js.Any = js.native
      @scala.inline
      def unmountOnExit_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unmountOnExit")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes.vertical")
      @js.native
      def vertical: js.Any = js.native
      @scala.inline
      def vertical_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertical")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes.visible")
      @js.native
      def visible: js.Any = js.native
      @scala.inline
      def visible_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visible")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScaleTransitionProps
    extends OverridableCSSTransitionProps
       with RenderConditionalPortalProps {
    
    /**
      * The children to render.
      */
    var children: js.UndefOr[ReactNode] = js.native
    
    /**
      * Boolean if the vertical scale animation should be used instead of the
      * normal scale animation.
      */
    var vertical: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the animation should be triggered. Enabling this will trigger
      * the appear/enter animations while disabling it will trigger the exit
      * animation.
      */
    var visible: Boolean = js.native
  }
  object ScaleTransitionProps {
    
    @scala.inline
    def apply(visible: Boolean): ScaleTransitionProps = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleTransitionProps]
    }
    
    @scala.inline
    implicit class ScaleTransitionPropsMutableBuilder[Self <: ScaleTransitionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
