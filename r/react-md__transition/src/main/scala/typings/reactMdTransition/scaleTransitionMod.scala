package typings.reactMdTransition

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdPortal.conditionalPortalMod.RenderConditionalPortalProps
import typings.reactMdTransition.typesMod.OverridableCSSTransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleTransitionMod {
  
  object ScaleTransition {
    
    inline def apply(
      hasVisibleChildrenPropClassNamesVerticalTimeoutPortalPortalIntoPortalIntoIdMountOnEnterUnmountOnExitProps: ScaleTransitionProps
    ): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasVisibleChildrenPropClassNamesVerticalTimeoutPortalPortalIntoPortalIntoIdMountOnEnterUnmountOnExitProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes.children")
      @js.native
      def children: js.Any = js.native
      inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes.classNames")
      @js.native
      def classNames: js.Any = js.native
      inline def classNames_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classNames")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes.mountOnEnter")
      @js.native
      def mountOnEnter: js.Any = js.native
      inline def mountOnEnter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mountOnEnter")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes.portal")
      @js.native
      def portal: js.Any = js.native
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes.portalInto")
      @js.native
      def portalInto: js.Any = js.native
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes.portalIntoId")
      @js.native
      def portalIntoId: js.Any = js.native
      inline def portalIntoId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalIntoId")(x.asInstanceOf[js.Any])
      
      inline def portalInto_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalInto")(x.asInstanceOf[js.Any])
      
      inline def portal_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portal")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes.timeout")
      @js.native
      def timeout: js.Any = js.native
      inline def timeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes.unmountOnExit")
      @js.native
      def unmountOnExit: js.Any = js.native
      inline def unmountOnExit_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unmountOnExit")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes.vertical")
      @js.native
      def vertical: js.Any = js.native
      inline def vertical_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertical")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/ScaleTransition", "ScaleTransition.propTypes.visible")
      @js.native
      def visible: js.Any = js.native
      inline def visible_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visible")(x.asInstanceOf[js.Any])
    }
  }
  
  trait ScaleTransitionProps
    extends StObject
       with OverridableCSSTransitionProps
       with RenderConditionalPortalProps {
    
    /**
      * The children to render.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Boolean if the vertical scale animation should be used instead of the
      * normal scale animation.
      */
    var vertical: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the animation should be triggered. Enabling this will trigger
      * the appear/enter animations while disabling it will trigger the exit
      * animation.
      */
    var visible: Boolean
  }
  object ScaleTransitionProps {
    
    inline def apply(visible: Boolean): ScaleTransitionProps = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleTransitionProps]
    }
    
    extension [Self <: ScaleTransitionProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
