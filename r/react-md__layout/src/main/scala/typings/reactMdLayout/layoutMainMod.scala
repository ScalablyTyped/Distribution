package typings.reactMdLayout

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactMdLayout.reactMdLayoutStrings.div
import typings.reactMdLayout.reactMdLayoutStrings.main
import typings.reactMdTransition.typesMod.CSSTransitionClassNames
import typings.reactMdTransition.typesMod.TransitionTimeout
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
      * Boolean if the main element should be offset by the `AppBar`'s height
      */
    var headerOffset: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean of there is a mini nav visible within the layout. This makes sure
      * that the content if offset by the current nav's width when needed.
      *
      * @remarks \@since 2.7.0
      */
    var mini: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the mini layout is currently hidden to help determine if
      * specific mini styles should be applied when the {@link LayoutContext.fixedAppBar}
      * config is `false`.
      *
      * @internal
      * @remarks \@since 2.8.3
      */
    var miniHidden: js.UndefOr[Boolean] = js.undefined
    
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
    
    inline def apply(): LayoutMainProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutMainProps]
    }
    
    extension [Self <: LayoutMainProps](x: Self) {
      
      inline def setClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setComponent(value: div | main): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setHeaderOffset(value: Boolean): Self = StObject.set(x, "headerOffset", value.asInstanceOf[js.Any])
      
      inline def setHeaderOffsetUndefined: Self = StObject.set(x, "headerOffset", js.undefined)
      
      inline def setMini(value: Boolean): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
      
      inline def setMiniHidden(value: Boolean): Self = StObject.set(x, "miniHidden", value.asInstanceOf[js.Any])
      
      inline def setMiniHiddenUndefined: Self = StObject.set(x, "miniHidden", js.undefined)
      
      inline def setMiniUndefined: Self = StObject.set(x, "mini", js.undefined)
      
      inline def setNavOffset(value: Boolean): Self = StObject.set(x, "navOffset", value.asInstanceOf[js.Any])
      
      inline def setNavOffsetUndefined: Self = StObject.set(x, "navOffset", js.undefined)
      
      inline def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
