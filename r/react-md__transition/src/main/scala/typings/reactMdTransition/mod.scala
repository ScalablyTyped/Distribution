package typings.reactMdTransition

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.reactMdTransition.anon.PickCrossFadePropshiddenc
import typings.reactMdTransition.collapseMod.CollapseProps
import typings.reactMdTransition.scaleTransitionMod.ScaleTransitionProps
import typings.reactMdTransition.typesMod.CSSTransitionOptions
import typings.reactMdTransition.typesMod.CollapseOptions
import typings.reactMdTransition.typesMod.TransitionOptions
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactMdTransition.useCSSTransitionMod.CSSTransitionReturnValue
import typings.reactMdTransition.useCollapseMod.ReturnValue
import typings.reactMdTransition.useCrossFadeMod.CrossFadeOptions
import typings.reactMdTransition.useFixedPositioningMod.FixedPositioningOptions
import typings.reactMdTransition.useTransitionMod.TransitionReturnValue
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/transition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/transition", "COLLAPSE_TIMEOUT")
  @js.native
  val COLLAPSE_TIMEOUT: TransitionTimeout = js.native
  
  @JSImport("@react-md/transition", "CROSS_FADE_CLASSNAMES")
  @js.native
  val CROSS_FADE_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/transition", "CROSS_FADE_TIMEOUT")
  @js.native
  val CROSS_FADE_TIMEOUT: TransitionTimeout = js.native
  
  object Collapse {
    
    inline def apply(
      hasChildrenCollapsedClassNameAppearTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedMinHeightMinPaddingTopMinPaddingBottomTemporary: CollapseProps
    ): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(hasChildrenCollapsedClassNameAppearTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedMinHeightMinPaddingTopMinPaddingBottomTemporary.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("@react-md/transition", "Collapse")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/transition", "Collapse.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/transition", "Collapse.propTypes.children")
      @js.native
      def children: js.Any = js.native
      inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.className")
      @js.native
      def className: js.Any = js.native
      inline def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.collapsed")
      @js.native
      def collapsed: js.Any = js.native
      inline def collapsed_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.minHeight")
      @js.native
      def minHeight: js.Any = js.native
      inline def minHeight_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.minPaddingBottom")
      @js.native
      def minPaddingBottom: js.Any = js.native
      inline def minPaddingBottom_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minPaddingBottom")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.minPaddingTop")
      @js.native
      def minPaddingTop: js.Any = js.native
      inline def minPaddingTop_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minPaddingTop")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.onEnter")
      @js.native
      def onEnter: js.Any = js.native
      inline def onEnter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.onEntered")
      @js.native
      def onEntered: js.Any = js.native
      inline def onEntered_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEntered")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.onEntering")
      @js.native
      def onEntering: js.Any = js.native
      inline def onEntering_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEntering")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.onExit")
      @js.native
      def onExit: js.Any = js.native
      inline def onExit_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExit")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.onExited")
      @js.native
      def onExited: js.Any = js.native
      inline def onExited_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExited")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.onExiting")
      @js.native
      def onExiting: js.Any = js.native
      inline def onExiting_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExiting")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.style")
      @js.native
      def style: js.Any = js.native
      inline def style_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.temporary")
      @js.native
      def temporary: js.Any = js.native
      inline def temporary_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("temporary")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.timeout")
      @js.native
      def timeout: js.Any = js.native
      inline def timeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/transition", "CrossFade")
  @js.native
  val CrossFade: ForwardRefExoticComponent[PickCrossFadePropshiddenc] = js.native
  
  @JSImport("@react-md/transition", "DEFAULT_COLLAPSE_MIN_HEIGHT")
  @js.native
  val DEFAULT_COLLAPSE_MIN_HEIGHT: /* 0 */ Double = js.native
  
  @JSImport("@react-md/transition", "DEFAULT_COLLAPSE_MIN_PADDING_BOTTOM")
  @js.native
  val DEFAULT_COLLAPSE_MIN_PADDING_BOTTOM: /* 0 */ Double = js.native
  
  @JSImport("@react-md/transition", "DEFAULT_COLLAPSE_MIN_PADDING_TOP")
  @js.native
  val DEFAULT_COLLAPSE_MIN_PADDING_TOP: /* 0 */ Double = js.native
  
  @JSImport("@react-md/transition", "ENTER")
  @js.native
  val ENTER: /* "enter" */ String = js.native
  
  @JSImport("@react-md/transition", "ENTERED")
  @js.native
  val ENTERED: /* "entered" */ String = js.native
  
  @JSImport("@react-md/transition", "ENTERING")
  @js.native
  val ENTERING: /* "entering" */ String = js.native
  
  @JSImport("@react-md/transition", "EXIT")
  @js.native
  val EXIT: /* "exit" */ String = js.native
  
  @JSImport("@react-md/transition", "EXITED")
  @js.native
  val EXITED: /* "exited" */ String = js.native
  
  @JSImport("@react-md/transition", "EXITING")
  @js.native
  val EXITING: /* "exiting" */ String = js.native
  
  @JSImport("@react-md/transition", "SCALE_CLASSNAMES")
  @js.native
  val SCALE_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/transition", "SCALE_TIMEOUT")
  @js.native
  val SCALE_TIMEOUT: TransitionTimeout = js.native
  
  @JSImport("@react-md/transition", "SCALE_Y_CLASSNAMES")
  @js.native
  val SCALE_Y_CLASSNAMES: CSSTransitionClassNames = js.native
  
  object ScaleTransition {
    
    inline def apply(
      hasVisibleChildrenPropClassNamesVerticalTimeoutPortalPortalIntoPortalIntoIdMountOnEnterUnmountOnExitProps: ScaleTransitionProps
    ): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasVisibleChildrenPropClassNamesVerticalTimeoutPortalPortalIntoPortalIntoIdMountOnEnterUnmountOnExitProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/transition", "ScaleTransition")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes.children")
      @js.native
      def children: js.Any = js.native
      inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes.classNames")
      @js.native
      def classNames: js.Any = js.native
      inline def classNames_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classNames")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes.mountOnEnter")
      @js.native
      def mountOnEnter: js.Any = js.native
      inline def mountOnEnter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mountOnEnter")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes.portal")
      @js.native
      def portal: js.Any = js.native
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes.portalInto")
      @js.native
      def portalInto: js.Any = js.native
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes.portalIntoId")
      @js.native
      def portalIntoId: js.Any = js.native
      inline def portalIntoId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalIntoId")(x.asInstanceOf[js.Any])
      
      inline def portalInto_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalInto")(x.asInstanceOf[js.Any])
      
      inline def portal_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portal")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes.timeout")
      @js.native
      def timeout: js.Any = js.native
      inline def timeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes.unmountOnExit")
      @js.native
      def unmountOnExit: js.Any = js.native
      inline def unmountOnExit_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unmountOnExit")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes.vertical")
      @js.native
      def vertical: js.Any = js.native
      inline def vertical_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertical")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes.visible")
      @js.native
      def visible: js.Any = js.native
      inline def visible_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visible")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/transition", "UNMOUNT")
  @js.native
  val UNMOUNT: /* "unmount" */ String = js.native
  
  inline def useCSSTransition[E /* <: HTMLElement */](
    hasAppearTemporaryTimeoutTransitionInOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedClassNamePropClassNamesPropRef: CSSTransitionOptions[E]
  ): CSSTransitionReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCSSTransition")(hasAppearTemporaryTimeoutTransitionInOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedClassNamePropClassNamesPropRef.asInstanceOf[js.Any]).asInstanceOf[CSSTransitionReturnValue[E]]
  
  inline def useCollapse[E /* <: HTMLElement */](collapsed: Boolean): ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCollapse")(collapsed.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[E]]
  inline def useCollapse[E /* <: HTMLElement */](
    collapsed: Boolean,
    hasClassNameAppearTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedMinHeightMinPaddingTopMinPaddingBottomTemporary: CollapseOptions[E]
  ): ReturnValue[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCollapse")(collapsed.asInstanceOf[js.Any], hasClassNameAppearTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedMinHeightMinPaddingTopMinPaddingBottomTemporary.asInstanceOf[js.Any])).asInstanceOf[ReturnValue[E]]
  
  inline def useCrossFade[E /* <: HTMLElement */](): CSSTransitionReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCrossFade")().asInstanceOf[CSSTransitionReturnValue[E]]
  inline def useCrossFade[E /* <: HTMLElement */](
    hasAppearTemporaryTransitionInClassNameOnEnterOnEnteringOnEnteredOnExitOnExitingOnExited: CrossFadeOptions[E]
  ): CSSTransitionReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCrossFade")(hasAppearTemporaryTransitionInClassNameOnEnterOnEnteringOnEnteredOnExitOnExitingOnExited.asInstanceOf[js.Any]).asInstanceOf[CSSTransitionReturnValue[E]]
  
  inline def useFixedPositioning(
    hasOnEnterOnEnteringOnEnteredOnExitedFixedToGetOptionsOnResizeOnScrollCurrentAnchorInitialXInitialYXMarginVwMarginYMarginVhMarginWidthOnPositionChangeTransformOriginPreventOverlapDisableSwappingDisableVHBounds: FixedPositioningOptions
  ): typings.reactMdTransition.useFixedPositioningMod.ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useFixedPositioning")(hasOnEnterOnEnteringOnEnteredOnExitedFixedToGetOptionsOnResizeOnScrollCurrentAnchorInitialXInitialYXMarginVwMarginYMarginVhMarginWidthOnPositionChangeTransformOriginPreventOverlapDisableSwappingDisableVHBounds.asInstanceOf[js.Any]).asInstanceOf[typings.reactMdTransition.useFixedPositioningMod.ReturnValue]
  
  inline def useTransition[E /* <: HTMLElement */](
    hasAppearRepaintTemporaryTransitionInPropTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedPropRef: TransitionOptions[E]
  ): TransitionReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(hasAppearRepaintTemporaryTransitionInPropTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedPropRef.asInstanceOf[js.Any]).asInstanceOf[TransitionReturnValue[E]]
  
  @js.native
  trait Rendered
    extends StObject
       with typings.std.Boolean
}
