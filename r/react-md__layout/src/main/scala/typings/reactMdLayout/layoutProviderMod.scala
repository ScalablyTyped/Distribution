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
  
  object LayoutProvider {
    
    @scala.inline
    def apply(
      hasBaseIdPhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayoutChildren: LayoutProviderProps
    ): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasBaseIdPhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayoutChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/layout/types/LayoutProvider", "LayoutProvider")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/layout/types/LayoutProvider", "LayoutProvider.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/layout/types/LayoutProvider", "LayoutProvider.propTypes.baseId")
      @js.native
      def baseId: js.Any = js.native
      @scala.inline
      def baseId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseId")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/LayoutProvider", "LayoutProvider.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/LayoutProvider", "LayoutProvider.propTypes.desktopLayout")
      @js.native
      def desktopLayout: js.Any = js.native
      @scala.inline
      def desktopLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktopLayout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/LayoutProvider", "LayoutProvider.propTypes.landscapeTabletLayout")
      @js.native
      def landscapeTabletLayout: js.Any = js.native
      @scala.inline
      def landscapeTabletLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("landscapeTabletLayout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/LayoutProvider", "LayoutProvider.propTypes.largeDesktopLayout")
      @js.native
      def largeDesktopLayout: js.Any = js.native
      @scala.inline
      def largeDesktopLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("largeDesktopLayout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/LayoutProvider", "LayoutProvider.propTypes.phoneLayout")
      @js.native
      def phoneLayout: js.Any = js.native
      @scala.inline
      def phoneLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneLayout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/LayoutProvider", "LayoutProvider.propTypes.tabletLayout")
      @js.native
      def tabletLayout: js.Any = js.native
      @scala.inline
      def tabletLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabletLayout")(x.asInstanceOf[js.Any])
    }
  }
  
  @scala.inline
  def useLayoutConfig(): LayoutContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutConfig")().asInstanceOf[LayoutContext]
  
  trait LayoutContext extends StObject {
    
    /**
      * The root `id` that was passed to the `Layout` component so that `id`s can
      * be generated for child components.
      */
    var baseId: String
    
    /**
      * A function that will set the `visible` state to `false`.
      */
    def hideNav(): Unit
    
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
    
    @scala.inline
    def apply(
      baseId: String,
      hideNav: () => Unit,
      layout: SupportedWideLayout,
      showNav: () => Unit,
      visible: Boolean
    ): LayoutContext = {
      val __obj = js.Dynamic.literal(baseId = baseId.asInstanceOf[js.Any], hideNav = js.Any.fromFunction0(hideNav), layout = layout.asInstanceOf[js.Any], showNav = js.Any.fromFunction0(showNav), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutContext]
    }
    
    @scala.inline
    implicit class LayoutContextMutableBuilder[Self <: LayoutContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseId(value: String): Self = StObject.set(x, "baseId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideNav(value: () => Unit): Self = StObject.set(x, "hideNav", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLayout(value: SupportedWideLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNav(value: () => Unit): Self = StObject.set(x, "showNav", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
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
  }
  object LayoutProviderProps {
    
    @scala.inline
    def apply(baseId: String): LayoutProviderProps = {
      val __obj = js.Dynamic.literal(baseId = baseId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutProviderProps]
    }
    
    @scala.inline
    implicit class LayoutProviderPropsMutableBuilder[Self <: LayoutProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseId(value: String): Self = StObject.set(x, "baseId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
