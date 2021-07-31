package typings.reactMdLayout

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactMdAppBar.appBarNavMod.AppBarNavProps
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactMdUtils.typesTypesMod.PropsWithRef
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutNavToggleMod {
  
  @JSImport("@react-md/layout/types/LayoutNavToggle", "LayoutNavToggle")
  @js.native
  val LayoutNavToggle: ForwardRefExoticComponent[LayoutNavToggleProps & RefAttributes[HTMLButtonElement]] = js.native
  
  trait LayoutNavToggleProps
    extends StObject
       with AppBarNavProps {
    
    /**
      * The transition classnames to use for the toggleable `LayoutNavigation`
      * either comes into view or expands from mini to full-width.
      */
    var classNames: js.UndefOr[CSSTransitionClassNames] = js.undefined
    
    /**
      * Boolean if the button should offset the rest of the components in the
      * `AppBar` by the current size of the navigation panel. When this is
      * `undefined`, it will be `true` when a toggleable layout is visible.
      */
    var offset: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if this component should be rendered. When this is `undefined`, it
      * will not be rendered for temporary layouts as well as when the toggleable
      * navigation panel is not visible.
      */
    var rendered: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The transition timeout to use for the toggleable `LayoutNavigation` either
      * comes into view or expands from mini to full-width. The transition can be
      * disabled by setting this value to `0`.
      */
    var timeout: js.UndefOr[TransitionTimeout] = js.undefined
  }
  object LayoutNavToggleProps {
    
    @scala.inline
    def apply(): LayoutNavToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutNavToggleProps]
    }
    
    @scala.inline
    implicit class LayoutNavTogglePropsMutableBuilder[Self <: LayoutNavToggleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setOffset(value: Boolean): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setRendered(value: Boolean): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
      
      @scala.inline
      def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait LayoutWithNavToggle extends StObject {
    
    /**
      * An optional custom nav toggle to use within the `Layout` or `LayoutAppBar`
      * instead of the default implementation.
      */
    var navToggle: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Any optional props to provide to the default `LayoutNavToggle`
      * implementation.
      */
    var navToggleProps: js.UndefOr[PropsWithRef[LayoutNavToggleProps, HTMLButtonElement]] = js.undefined
  }
  object LayoutWithNavToggle {
    
    @scala.inline
    def apply(): LayoutWithNavToggle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutWithNavToggle]
    }
    
    @scala.inline
    implicit class LayoutWithNavToggleMutableBuilder[Self <: LayoutWithNavToggle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNavToggle(value: ReactNode): Self = StObject.set(x, "navToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavToggleProps(value: PropsWithRef[LayoutNavToggleProps, HTMLButtonElement]): Self = StObject.set(x, "navToggleProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavTogglePropsUndefined: Self = StObject.set(x, "navToggleProps", js.undefined)
      
      @scala.inline
      def setNavToggleUndefined: Self = StObject.set(x, "navToggle", js.undefined)
    }
  }
}
