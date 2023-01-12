package typings.reactToolbox

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsAppBarAppBarMod {
  
  @JSImport("react-toolbox/components/app_bar/AppBar", JSImport.Default)
  @js.native
  open class default protected () extends AppBar {
    def this(props: AppBarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AppBarProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/app_bar/AppBar", "AppBar")
  @js.native
  open class AppBar protected ()
    extends Component[AppBarProps, js.Object, Any] {
    def this(props: AppBarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AppBarProps, context: Any) = this()
  }
  
  trait AppBarProps
    extends StObject
       with Props {
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Determine if the bar should have position fixed or relative.
      * @default false
      */
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the AppBar doesn't show a shadow.
      * @default false
      */
    var flat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If it exists it is used as the AppBar left icon
      */
    var leftIcon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Called when the left icon is clicked
      */
    var onLeftIconClick: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Called when the righticon is clicked
      */
    var onRightIconClick: js.UndefOr[js.Function] = js.undefined
    
    /**
      * If it exists it is used as the AppBar right icon
      */
    var rightIcon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Whether AppBar should be hidden during scroll.
      * @default false
      */
    var scrollHide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[AppBarTheme] = js.undefined
    
    /**
      * If it exists it is used as the AppBar title
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object AppBarProps {
    
    inline def apply(): AppBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppBarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppBarProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setLeftIcon(value: ReactNode): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
      
      inline def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
      
      inline def setOnLeftIconClick(value: js.Function): Self = StObject.set(x, "onLeftIconClick", value.asInstanceOf[js.Any])
      
      inline def setOnLeftIconClickUndefined: Self = StObject.set(x, "onLeftIconClick", js.undefined)
      
      inline def setOnRightIconClick(value: js.Function): Self = StObject.set(x, "onRightIconClick", value.asInstanceOf[js.Any])
      
      inline def setOnRightIconClickUndefined: Self = StObject.set(x, "onRightIconClick", js.undefined)
      
      inline def setRightIcon(value: ReactNode): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
      
      inline def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
      
      inline def setScrollHide(value: Boolean): Self = StObject.set(x, "scrollHide", value.asInstanceOf[js.Any])
      
      inline def setScrollHideUndefined: Self = StObject.set(x, "scrollHide", js.undefined)
      
      inline def setTheme(value: AppBarTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait AppBarTheme extends StObject {
    
    /**
      * Used for the component root element.
      */
    var appBar: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root element when the app bar is fixed.
      */
    var fixed: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root element when the app bar is flat.
      */
    var flat: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the left icon app bar element.
      */
    var leftIcon: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the right icon app bar element.
      */
    var rightIcon: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root element when the app bar is hidden during scroll.
      */
    var scrollHide: js.UndefOr[String] = js.undefined
    
    /**
      * Used as the app bar title.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object AppBarTheme {
    
    inline def apply(): AppBarTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppBarTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppBarTheme] (val x: Self) extends AnyVal {
      
      inline def setAppBar(value: String): Self = StObject.set(x, "appBar", value.asInstanceOf[js.Any])
      
      inline def setAppBarUndefined: Self = StObject.set(x, "appBar", js.undefined)
      
      inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlat(value: String): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setLeftIcon(value: String): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
      
      inline def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
      
      inline def setRightIcon(value: String): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
      
      inline def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
      
      inline def setScrollHide(value: String): Self = StObject.set(x, "scrollHide", value.asInstanceOf[js.Any])
      
      inline def setScrollHideUndefined: Self = StObject.set(x, "scrollHide", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
