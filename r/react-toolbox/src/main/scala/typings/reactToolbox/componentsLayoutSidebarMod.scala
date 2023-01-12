package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.componentsDrawerDrawerMod.DrawerCommonProps
import typings.reactToolbox.reactToolboxStrings.lg
import typings.reactToolbox.reactToolboxStrings.lgTablet
import typings.reactToolbox.reactToolboxStrings.md
import typings.reactToolbox.reactToolboxStrings.sm
import typings.reactToolbox.reactToolboxStrings.smTablet
import typings.reactToolbox.reactToolboxStrings.xl
import typings.reactToolbox.reactToolboxStrings.xxl
import typings.reactToolbox.reactToolboxStrings.xxxl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsLayoutSidebarMod {
  
  @JSImport("react-toolbox/components/layout/Sidebar", "Sidebar")
  @js.native
  open class Sidebar protected ()
    extends Component[SidebarProps, js.Object, Any] {
    def this(props: SidebarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SidebarProps, context: Any) = this()
  }
  
  trait SidebarProps
    extends StObject
       with DrawerCommonProps {
    
    /**
      * If true, when the `AppBar` gets pinned, it will stand over the `Drawer`.
      * @default false
      */
    var clipped: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The breakpoint at which the drawer is automatically pinned.
      */
    var permanentAt: js.UndefOr[sm | smTablet | md | lg | lgTablet | xl | xxl | xxxl] = js.undefined
    
    /**
      * If true, the sidebar will be pinned open.
      * @default false
      */
    var pinned: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[SidebarTheme] = js.undefined
    
    /**
      * Width in standard increments (1-12) or percentage (25, 33, 50, 66, 75, 100)
      * @default 5
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object SidebarProps {
    
    inline def apply(): SidebarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SidebarProps] (val x: Self) extends AnyVal {
      
      inline def setClipped(value: Boolean): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
      
      inline def setClippedUndefined: Self = StObject.set(x, "clipped", js.undefined)
      
      inline def setPermanentAt(value: sm | smTablet | md | lg | lgTablet | xl | xxl | xxxl): Self = StObject.set(x, "permanentAt", value.asInstanceOf[js.Any])
      
      inline def setPermanentAtUndefined: Self = StObject.set(x, "permanentAt", js.undefined)
      
      inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
      
      inline def setTheme(value: SidebarTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SidebarTheme extends StObject {
    
    /**
      * Added to the root class when it is clipped.
      */
    var clipped: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root class if sidebar is pinned.
      */
    var pinned: js.UndefOr[String] = js.undefined
  }
  object SidebarTheme {
    
    inline def apply(): SidebarTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SidebarTheme] (val x: Self) extends AnyVal {
      
      inline def setClipped(value: String): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
      
      inline def setClippedUndefined: Self = StObject.set(x, "clipped", js.undefined)
      
      inline def setPinned(value: String): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    }
  }
}
