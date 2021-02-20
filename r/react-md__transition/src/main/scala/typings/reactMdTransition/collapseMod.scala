package typings.reactMdTransition

import typings.react.mod.ReactElement
import typings.react.mod.Ref
import typings.reactMdTransition.typesMod.EnterHandler
import typings.reactMdTransition.typesMod.ExitHandler
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collapseMod {
  
  object Collapse {
    
    @JSImport("@react-md/transition/types/Collapse", "Collapse")
    @js.native
    def apply(
      hasChildrenCollapsedClassNameAppearTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedMinHeightMinPaddingTopMinPaddingBottomTemporary: CollapseProps
    ): ReactElement | Null = js.native
    
    object propTypes {
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.className")
      @js.native
      def className: js.Any = js.native
      @scala.inline
      def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.collapsed")
      @js.native
      def collapsed: js.Any = js.native
      @scala.inline
      def collapsed_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.minHeight")
      @js.native
      def minHeight: js.Any = js.native
      @scala.inline
      def minHeight_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.minPaddingBottom")
      @js.native
      def minPaddingBottom: js.Any = js.native
      @scala.inline
      def minPaddingBottom_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minPaddingBottom")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.minPaddingTop")
      @js.native
      def minPaddingTop: js.Any = js.native
      @scala.inline
      def minPaddingTop_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minPaddingTop")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.onEnter")
      @js.native
      def onEnter: js.Any = js.native
      @scala.inline
      def onEnter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.onEntered")
      @js.native
      def onEntered: js.Any = js.native
      @scala.inline
      def onEntered_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEntered")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.onEntering")
      @js.native
      def onEntering: js.Any = js.native
      @scala.inline
      def onEntering_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEntering")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.onExit")
      @js.native
      def onExit: js.Any = js.native
      @scala.inline
      def onExit_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExit")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.onExited")
      @js.native
      def onExited: js.Any = js.native
      @scala.inline
      def onExited_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExited")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.onExiting")
      @js.native
      def onExiting: js.Any = js.native
      @scala.inline
      def onExiting_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExiting")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.style")
      @js.native
      def style: js.Any = js.native
      @scala.inline
      def style_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.temporary")
      @js.native
      def temporary: js.Any = js.native
      @scala.inline
      def temporary_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("temporary")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition/types/Collapse", "Collapse.propTypes.timeout")
      @js.native
      def timeout: js.Any = js.native
      @scala.inline
      def timeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent @react-md/transition.@react-md/transition/types/types.CollapseOptions<std.HTMLElement> */
  @js.native
  trait CollapseProps extends StObject {
    
    var appear: js.UndefOr[Boolean] = js.native
    
    /**
      * The child element to trigger an animation for. This child **must**
      * either be an HTMLElement or a component that:
      *
      * - forwards the ref to a DOM element
      * - applies the `style`, `className`, and `hidden` attributes correctly.
      */
    var children: ReactElement = js.native
    
    /**
      * An optional className to merge with the current collapse transition
      * className.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Boolean if the the child is currently collapsed.
      */
    var collapsed: Boolean = js.native
    
    var enter: js.UndefOr[Boolean] = js.native
    
    var exit: js.UndefOr[Boolean] = js.native
    
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
    var minHeight: js.UndefOr[Double | String] = js.native
    
    /**
      * The minimum padding-bottom that the collapsed element can be which defaults
      * to `0`. This can either be a number of pixels or a string CSS
      * `padding-bottom` value.
      *
      * Note: If the `minHeight`, `minPaddingTop`, and `minPaddingBottom` options
      * are all set to `0` (default), the child will be removed from the DOM while
      * collapsed.
      */
    var minPaddingBottom: js.UndefOr[Double | String] = js.native
    
    /**
      * The minimum padding-top that the collapsed element can be which defaults to
      * `0`. This can either be a number of pixels or a string CSS `padding-top`
      * value.
      *
      * Note: If the `minHeight`, `minPaddingTop`, and `minPaddingBottom` options
      * are all set to `0` (default), the child will be removed from the DOM while
      * collapsed.
      */
    var minPaddingTop: js.UndefOr[Double | String] = js.native
    
    var onEnter: js.UndefOr[EnterHandler[HTMLElement]] = js.native
    
    var onEntered: js.UndefOr[EnterHandler[HTMLElement]] = js.native
    
    var onEntering: js.UndefOr[EnterHandler[HTMLElement]] = js.native
    
    var onExit: js.UndefOr[ExitHandler[HTMLElement]] = js.native
    
    var onExited: js.UndefOr[ExitHandler[HTMLElement]] = js.native
    
    var onExiting: js.UndefOr[ExitHandler[HTMLElement]] = js.native
    
    var ref: js.UndefOr[Ref[HTMLElement]] = js.native
    
    var temporary: js.UndefOr[Boolean] = js.native
    
    /**
      * The timeout for the collapse transition. This will default to 250ms enter
      * and 200ms exit.
      */
    var timeout: js.UndefOr[TransitionTimeout] = js.native
  }
  object CollapseProps {
    
    @scala.inline
    def apply(children: ReactElement, collapsed: Boolean): CollapseProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollapseProps]
    }
    
    @scala.inline
    implicit class CollapsePropsMutableBuilder[Self <: CollapseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      @scala.inline
      def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinPaddingBottom(value: Double | String): Self = StObject.set(x, "minPaddingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPaddingBottomUndefined: Self = StObject.set(x, "minPaddingBottom", js.undefined)
      
      @scala.inline
      def setMinPaddingTop(value: Double | String): Self = StObject.set(x, "minPaddingTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPaddingTopUndefined: Self = StObject.set(x, "minPaddingTop", js.undefined)
      
      @scala.inline
      def setOnEnter(value: (HTMLElement, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnEntered(value: (HTMLElement, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEntered", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      @scala.inline
      def setOnEntering(value: (HTMLElement, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEntering", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      @scala.inline
      def setOnExit(value: HTMLElement => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      @scala.inline
      def setOnExited(value: HTMLElement => Unit): Self = StObject.set(x, "onExited", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      @scala.inline
      def setOnExiting(value: HTMLElement => Unit): Self = StObject.set(x, "onExiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
      
      @scala.inline
      def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
