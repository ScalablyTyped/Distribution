package typings.reactMdLayout

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactMdLayout.reactMdLayoutStrings.div
import typings.reactMdLayout.reactMdLayoutStrings.main
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutMainMod {
  
  @JSImport("@react-md/layout/types/LayoutMain", "LayoutMain")
  @js.native
  val LayoutMain: ForwardRefExoticComponent[LayoutMainProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait LayoutMainProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * The transition classnames to use for the toggleable `LayoutNavigation`
      * either comes into view or expands from mini to full-width.
      */
    var classNames: js.UndefOr[CSSTransitionClassNames] = js.undefined
    
    /**
      * The component to render the main element as. This should normally stay as
      * the default of `"main"`, but if you want to have multiple `Layout` on the
      * page for some reason, you'll need to use `"div"` for the other `Layout`s
      * since you can only have one `<main>` per page (unless you set the `hidden`
      * attribute on all the others).
      */
    var component: js.UndefOr[div | main] = js.undefined
    
    /**
      * Boolean if the main element should be ofset by the `AppBar`'s height
      */
    var headerOffset: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the main element should be offset by the current navigation
      * tree's width.
      */
    var navOffset: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The transition timeout to use for the toggleable `LayoutNavigation` either
      * comes into view or expands from mini to full-width. The transition can be
      * disabled by setting this value to `0`.
      */
    var timeout: js.UndefOr[TransitionTimeout] = js.undefined
  }
  object LayoutMainProps {
    
    @scala.inline
    def apply(): LayoutMainProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutMainProps]
    }
    
    @scala.inline
    implicit class LayoutMainPropsMutableBuilder[Self <: LayoutMainProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setComponent(value: div | main): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setHeaderOffset(value: Boolean): Self = StObject.set(x, "headerOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderOffsetUndefined: Self = StObject.set(x, "headerOffset", js.undefined)
      
      @scala.inline
      def setNavOffset(value: Boolean): Self = StObject.set(x, "navOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavOffsetUndefined: Self = StObject.set(x, "navOffset", js.undefined)
      
      @scala.inline
      def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
