package typings.reactMdLayout

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdLayout.typesMod.LayoutConfiguration
import typings.reactMdLayout.typesMod.SupportedWideLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutProviderMod {
  
  @JSImport("@react-md/layout/types/LayoutProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def LayoutProvider(
    hasBaseIdPhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayoutDefaultToggleableVisibleFixedAppBarChildren: LayoutProviderProps
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("LayoutProvider")(hasBaseIdPhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayoutDefaultToggleableVisibleFixedAppBarChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def useLayoutConfig(): LayoutContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutConfig")().asInstanceOf[LayoutContext]
  
  trait LayoutContext extends StObject {
    
    /**
      * The root `id` that was passed to the `Layout` component so that `id`s can
      * be generated for child components.
      */
    var baseId: String
    
    /**
      * Boolean if the layout is currently using a fixed app bar which can be
      * useful for determining specific scroll or layout behavior.
      *
      * @remarks \@since 2.8.3
      */
    var fixedAppBar: Boolean
    
    /**
      * A function that will set the `visible` state to `false`.
      */
    def hideNav(): Unit
    
    /**
      * Boolean if one of the layout types are mini. This is mostly used internally
      * to prevent the `<main>` element from unmounting (and losing state) for
      * non-fixed app bar layouts.
      *
      * @remarks \@since 2.9.1
      */
    var isMiniable: Boolean
    
    /**
      * The current layout that is being used based on the app's size.
      */
    var layout: SupportedWideLayout
    
    /**
      * A function that will set the `visible` state to `true`.
      */
    def showNav(): Unit
    
    /**
      * Boolean if the navigation panel is currently visible. This will always be
      * `true` for persist layout types on desktop.
      */
    var visible: Boolean
  }
  object LayoutContext {
    
    inline def apply(
      baseId: String,
      fixedAppBar: Boolean,
      hideNav: () => Unit,
      isMiniable: Boolean,
      layout: SupportedWideLayout,
      showNav: () => Unit,
      visible: Boolean
    ): LayoutContext = {
      val __obj = js.Dynamic.literal(baseId = baseId.asInstanceOf[js.Any], fixedAppBar = fixedAppBar.asInstanceOf[js.Any], hideNav = js.Any.fromFunction0(hideNav), isMiniable = isMiniable.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], showNav = js.Any.fromFunction0(showNav), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutContext]
    }
    
    extension [Self <: LayoutContext](x: Self) {
      
      inline def setBaseId(value: String): Self = StObject.set(x, "baseId", value.asInstanceOf[js.Any])
      
      inline def setFixedAppBar(value: Boolean): Self = StObject.set(x, "fixedAppBar", value.asInstanceOf[js.Any])
      
      inline def setHideNav(value: () => Unit): Self = StObject.set(x, "hideNav", js.Any.fromFunction0(value))
      
      inline def setIsMiniable(value: Boolean): Self = StObject.set(x, "isMiniable", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: SupportedWideLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setShowNav(value: () => Unit): Self = StObject.set(x, "showNav", js.Any.fromFunction0(value))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayoutProviderProps
    extends StObject
       with LayoutConfiguration {
    
    /**
      * The base id for the layout component. This is required since all the child
      * components use this to generate their ids.
      */
    var baseId: String
    
    /**
      * The children to render that can inherit the current layout.
      */
    var children: ReactNode
    
    /** {@inheritDoc LayoutContext.fixedAppBar} */
    var fixedAppBar: js.UndefOr[Boolean] = js.undefined
  }
  object LayoutProviderProps {
    
    inline def apply(baseId: String): LayoutProviderProps = {
      val __obj = js.Dynamic.literal(baseId = baseId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutProviderProps]
    }
    
    extension [Self <: LayoutProviderProps](x: Self) {
      
      inline def setBaseId(value: String): Self = StObject.set(x, "baseId", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFixedAppBar(value: Boolean): Self = StObject.set(x, "fixedAppBar", value.asInstanceOf[js.Any])
      
      inline def setFixedAppBarUndefined: Self = StObject.set(x, "fixedAppBar", js.undefined)
    }
  }
}
