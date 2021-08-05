package typings.reactMdTransition

import typings.react.mod.ReactElement
import typings.react.mod.Ref
import typings.reactMdTransition.typesMod.EnterHandler
import typings.reactMdTransition.typesMod.ExitHandler
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collapseMod {
  
  object Collapse {
    
    inline def apply(
      hasChildrenCollapsedClassNameAppearTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedMinHeightMinPaddingTopMinPaddingBottomTemporary: CollapseProps
    ): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(hasChildrenCollapsedClassNameAppearTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedMinHeightMinPaddingTopMinPaddingBottomTemporary.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("@react-md/transition/types/Collapse", "Collapse")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.children")
      @js.native
      def children: js.Any = js.native
      inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.className")
      @js.native
      def className: js.Any = js.native
      inline def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.collapsed")
      @js.native
      def collapsed: js.Any = js.native
      inline def collapsed_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.minHeight")
      @js.native
      def minHeight: js.Any = js.native
      inline def minHeight_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.minPaddingBottom")
      @js.native
      def minPaddingBottom: js.Any = js.native
      inline def minPaddingBottom_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minPaddingBottom")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.minPaddingTop")
      @js.native
      def minPaddingTop: js.Any = js.native
      inline def minPaddingTop_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minPaddingTop")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.onEnter")
      @js.native
      def onEnter: js.Any = js.native
      inline def onEnter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.onEntered")
      @js.native
      def onEntered: js.Any = js.native
      inline def onEntered_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEntered")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.onEntering")
      @js.native
      def onEntering: js.Any = js.native
      inline def onEntering_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEntering")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.onExit")
      @js.native
      def onExit: js.Any = js.native
      inline def onExit_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExit")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.onExited")
      @js.native
      def onExited: js.Any = js.native
      inline def onExited_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExited")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.onExiting")
      @js.native
      def onExiting: js.Any = js.native
      inline def onExiting_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExiting")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.style")
      @js.native
      def style: js.Any = js.native
      inline def style_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.temporary")
      @js.native
      def temporary: js.Any = js.native
      inline def temporary_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("temporary")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.timeout")
      @js.native
      def timeout: js.Any = js.native
      inline def timeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent @react-md/transition.@react-md/transition/types/types.CollapseOptions<std.HTMLElement> */
  trait CollapseProps extends StObject {
    
    var appear: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The child element to trigger an animation for. This child **must**
      * either be an HTMLElement or a component that:
      *
      * - forwards the ref to a DOM element
      * - applies the `style`, `className`, and `hidden` attributes correctly.
      */
    var children: ReactElement
    
    /**
      * An optional className to merge with the current collapse transition
      * className.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Boolean if the the child is currently collapsed.
      */
    var collapsed: Boolean
    
    var enter: js.UndefOr[Boolean] = js.undefined
    
    var exit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The minimum height that the collapsed element can be which defaults to `0`.
      * This can either be a number of pixels or a string CSS height value.
      *
      * Setting this value to any non-zero value will allow for the element to
      * shrink to the defined min-height, and then expand to the full height once
      * no longer collapsed.
      *
      * Note: If the `minHeight`, `minPaddingTop`, and `minPaddingBottom` options
      * are all set to `0` (default), the child will be removed from the DOM while
      * collapsed.
      */
    var minHeight: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The minimum padding-bottom that the collapsed element can be which defaults
      * to `0`. This can either be a number of pixels or a string CSS
      * `padding-bottom` value.
      *
      * Note: If the `minHeight`, `minPaddingTop`, and `minPaddingBottom` options
      * are all set to `0` (default), the child will be removed from the DOM while
      * collapsed.
      */
    var minPaddingBottom: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The minimum padding-top that the collapsed element can be which defaults to
      * `0`. This can either be a number of pixels or a string CSS `padding-top`
      * value.
      *
      * Note: If the `minHeight`, `minPaddingTop`, and `minPaddingBottom` options
      * are all set to `0` (default), the child will be removed from the DOM while
      * collapsed.
      */
    var minPaddingTop: js.UndefOr[Double | String] = js.undefined
    
    var onEnter: js.UndefOr[EnterHandler[HTMLElement]] = js.undefined
    
    var onEntered: js.UndefOr[EnterHandler[HTMLElement]] = js.undefined
    
    var onEntering: js.UndefOr[EnterHandler[HTMLElement]] = js.undefined
    
    var onExit: js.UndefOr[ExitHandler[HTMLElement]] = js.undefined
    
    var onExited: js.UndefOr[ExitHandler[HTMLElement]] = js.undefined
    
    var onExiting: js.UndefOr[ExitHandler[HTMLElement]] = js.undefined
    
    var ref: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    var temporary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The timeout for the collapse transition. This will default to 250ms enter
      * and 200ms exit.
      */
    var timeout: js.UndefOr[TransitionTimeout] = js.undefined
  }
  object CollapseProps {
    
    inline def apply(children: ReactElement, collapsed: Boolean): CollapseProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollapseProps]
    }
    
    extension [Self <: CollapseProps](x: Self) {
      
      inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      inline def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinPaddingBottom(value: Double | String): Self = StObject.set(x, "minPaddingBottom", value.asInstanceOf[js.Any])
      
      inline def setMinPaddingBottomUndefined: Self = StObject.set(x, "minPaddingBottom", js.undefined)
      
      inline def setMinPaddingTop(value: Double | String): Self = StObject.set(x, "minPaddingTop", value.asInstanceOf[js.Any])
      
      inline def setMinPaddingTopUndefined: Self = StObject.set(x, "minPaddingTop", js.undefined)
      
      inline def setOnEnter(value: (HTMLElement, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction2(value))
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnEntered(value: (HTMLElement, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEntered", js.Any.fromFunction2(value))
      
      inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      inline def setOnEntering(value: (HTMLElement, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEntering", js.Any.fromFunction2(value))
      
      inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      inline def setOnExit(value: HTMLElement => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction1(value))
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnExited(value: HTMLElement => Unit): Self = StObject.set(x, "onExited", js.Any.fromFunction1(value))
      
      inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      inline def setOnExiting(value: HTMLElement => Unit): Self = StObject.set(x, "onExiting", js.Any.fromFunction1(value))
      
      inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      inline def setRef(value: Ref[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
      
      inline def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
      
      inline def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
