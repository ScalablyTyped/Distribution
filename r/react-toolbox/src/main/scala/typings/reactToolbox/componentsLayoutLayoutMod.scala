package typings.reactToolbox

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsLayoutLayoutMod {
  
  @JSImport("react-toolbox/components/layout/Layout", "Layout")
  @js.native
  open class Layout protected ()
    extends Component[LayoutProps, js.Object, Any] {
    def this(props: LayoutProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LayoutProps, context: Any) = this()
  }
  
  trait LayoutProps
    extends StObject
       with Props {
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[Element | js.Array[Element]] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[LayoutTheme] = js.undefined
  }
  object LayoutProps {
    
    inline def apply(): LayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayoutProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: Element | js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setTheme(value: LayoutTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait LayoutTheme extends StObject {
    
    var appbarFixed: js.UndefOr[String] = js.undefined
    
    /**
      * The root class that wraps the whole layout.
      */
    var layout: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root if there is a clipped NavDrawer.
      */
    var navDrawerClipped: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root if there is a pinned `NavDrawer`
      */
    var navDrawerPinned: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root if there is a clipped sidebar.
      */
    var sidebarClipped: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root if there is a pinned sidebar.
      */
    var sidebarPinned: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root element in case there is a sidebar present. width correspond to the value passed to the `Sidebar`.
      */
    var sidebarWidth1: js.UndefOr[String] = js.undefined
    
    var sidebarWidth10: js.UndefOr[String] = js.undefined
    
    var sidebarWidth100: js.UndefOr[String] = js.undefined
    
    var sidebarWidth11: js.UndefOr[String] = js.undefined
    
    var sidebarWidth12: js.UndefOr[String] = js.undefined
    
    var sidebarWidth2: js.UndefOr[String] = js.undefined
    
    var sidebarWidth25: js.UndefOr[String] = js.undefined
    
    var sidebarWidth3: js.UndefOr[String] = js.undefined
    
    var sidebarWidth33: js.UndefOr[String] = js.undefined
    
    var sidebarWidth4: js.UndefOr[String] = js.undefined
    
    var sidebarWidth5: js.UndefOr[String] = js.undefined
    
    var sidebarWidth50: js.UndefOr[String] = js.undefined
    
    var sidebarWidth6: js.UndefOr[String] = js.undefined
    
    var sidebarWidth66: js.UndefOr[String] = js.undefined
    
    var sidebarWidth7: js.UndefOr[String] = js.undefined
    
    var sidebarWidth75: js.UndefOr[String] = js.undefined
    
    var sidebarWidth8: js.UndefOr[String] = js.undefined
    
    var sidebarWidth9: js.UndefOr[String] = js.undefined
  }
  object LayoutTheme {
    
    inline def apply(): LayoutTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayoutTheme] (val x: Self) extends AnyVal {
      
      inline def setAppbarFixed(value: String): Self = StObject.set(x, "appbarFixed", value.asInstanceOf[js.Any])
      
      inline def setAppbarFixedUndefined: Self = StObject.set(x, "appbarFixed", js.undefined)
      
      inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setNavDrawerClipped(value: String): Self = StObject.set(x, "navDrawerClipped", value.asInstanceOf[js.Any])
      
      inline def setNavDrawerClippedUndefined: Self = StObject.set(x, "navDrawerClipped", js.undefined)
      
      inline def setNavDrawerPinned(value: String): Self = StObject.set(x, "navDrawerPinned", value.asInstanceOf[js.Any])
      
      inline def setNavDrawerPinnedUndefined: Self = StObject.set(x, "navDrawerPinned", js.undefined)
      
      inline def setSidebarClipped(value: String): Self = StObject.set(x, "sidebarClipped", value.asInstanceOf[js.Any])
      
      inline def setSidebarClippedUndefined: Self = StObject.set(x, "sidebarClipped", js.undefined)
      
      inline def setSidebarPinned(value: String): Self = StObject.set(x, "sidebarPinned", value.asInstanceOf[js.Any])
      
      inline def setSidebarPinnedUndefined: Self = StObject.set(x, "sidebarPinned", js.undefined)
      
      inline def setSidebarWidth1(value: String): Self = StObject.set(x, "sidebarWidth1", value.asInstanceOf[js.Any])
      
      inline def setSidebarWidth10(value: String): Self = StObject.set(x, "sidebarWidth10", value.asInstanceOf[js.Any])
      
      inline def setSidebarWidth100(value: String): Self = StObject.set(x, "sidebarWidth100", value.asInstanceOf[js.Any])
      
      inline def setSidebarWidth100Undefined: Self = StObject.set(x, "sidebarWidth100", js.undefined)
      
      inline def setSidebarWidth10Undefined: Self = StObject.set(x, "sidebarWidth10", js.undefined)
      
      inline def setSidebarWidth11(value: String): Self = StObject.set(x, "sidebarWidth11", value.asInstanceOf[js.Any])
      
      inline def setSidebarWidth11Undefined: Self = StObject.set(x, "sidebarWidth11", js.undefined)
      
      inline def setSidebarWidth12(value: String): Self = StObject.set(x, "sidebarWidth12", value.asInstanceOf[js.Any])
      
      inline def setSidebarWidth12Undefined: Self = StObject.set(x, "sidebarWidth12", js.undefined)
      
      inline def setSidebarWidth1Undefined: Self = StObject.set(x, "sidebarWidth1", js.undefined)
      
      inline def setSidebarWidth2(value: String): Self = StObject.set(x, "sidebarWidth2", value.asInstanceOf[js.Any])
      
      inline def setSidebarWidth25(value: String): Self = StObject.set(x, "sidebarWidth25", value.asInstanceOf[js.Any])
      
      inline def setSidebarWidth25Undefined: Self = StObject.set(x, "sidebarWidth25", js.undefined)
      
      inline def setSidebarWidth2Undefined: Self = StObject.set(x, "sidebarWidth2", js.undefined)
      
      inline def setSidebarWidth3(value: String): Self = StObject.set(x, "sidebarWidth3", value.asInstanceOf[js.Any])
      
      inline def setSidebarWidth33(value: String): Self = StObject.set(x, "sidebarWidth33", value.asInstanceOf[js.Any])
      
      inline def setSidebarWidth33Undefined: Self = StObject.set(x, "sidebarWidth33", js.undefined)
      
      inline def setSidebarWidth3Undefined: Self = StObject.set(x, "sidebarWidth3", js.undefined)
      
      inline def setSidebarWidth4(value: String): Self = StObject.set(x, "sidebarWidth4", value.asInstanceOf[js.Any])
      
      inline def setSidebarWidth4Undefined: Self = StObject.set(x, "sidebarWidth4", js.undefined)
      
      inline def setSidebarWidth5(value: String): Self = StObject.set(x, "sidebarWidth5", value.asInstanceOf[js.Any])
      
      inline def setSidebarWidth50(value: String): Self = StObject.set(x, "sidebarWidth50", value.asInstanceOf[js.Any])
      
      inline def setSidebarWidth50Undefined: Self = StObject.set(x, "sidebarWidth50", js.undefined)
      
      inline def setSidebarWidth5Undefined: Self = StObject.set(x, "sidebarWidth5", js.undefined)
      
      inline def setSidebarWidth6(value: String): Self = StObject.set(x, "sidebarWidth6", value.asInstanceOf[js.Any])
      
      inline def setSidebarWidth66(value: String): Self = StObject.set(x, "sidebarWidth66", value.asInstanceOf[js.Any])
      
      inline def setSidebarWidth66Undefined: Self = StObject.set(x, "sidebarWidth66", js.undefined)
      
      inline def setSidebarWidth6Undefined: Self = StObject.set(x, "sidebarWidth6", js.undefined)
      
      inline def setSidebarWidth7(value: String): Self = StObject.set(x, "sidebarWidth7", value.asInstanceOf[js.Any])
      
      inline def setSidebarWidth75(value: String): Self = StObject.set(x, "sidebarWidth75", value.asInstanceOf[js.Any])
      
      inline def setSidebarWidth75Undefined: Self = StObject.set(x, "sidebarWidth75", js.undefined)
      
      inline def setSidebarWidth7Undefined: Self = StObject.set(x, "sidebarWidth7", js.undefined)
      
      inline def setSidebarWidth8(value: String): Self = StObject.set(x, "sidebarWidth8", value.asInstanceOf[js.Any])
      
      inline def setSidebarWidth8Undefined: Self = StObject.set(x, "sidebarWidth8", js.undefined)
      
      inline def setSidebarWidth9(value: String): Self = StObject.set(x, "sidebarWidth9", value.asInstanceOf[js.Any])
      
      inline def setSidebarWidth9Undefined: Self = StObject.set(x, "sidebarWidth9", js.undefined)
    }
  }
}
