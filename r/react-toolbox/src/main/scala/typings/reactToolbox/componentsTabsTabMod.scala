package typings.reactToolbox

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTabsTabMod {
  
  @JSImport("react-toolbox/components/tabs/Tab", JSImport.Default)
  @js.native
  open class default protected () extends Tab {
    def this(props: TabProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: TabProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/tabs/Tab", "Tab")
  @js.native
  open class Tab protected ()
    extends Component[TabProps, js.Object, Any] {
    def this(props: TabProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: TabProps, context: Any) = this()
  }
  
  trait TabProps
    extends StObject
       with Props
       with /**
    * Additional properties passed to inner input element.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * If true, the current component is visible.
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Additional class name to provide custom styling for the active tab.
      */
    var activeClassName: js.UndefOr[String] = js.undefined
    
    /**
      * If true, the current component is not clickable.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the current component is not visible.
      * @default false
      */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Icon to be used in inner FontIcon.
      */
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Label text for navigation header.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Callback function that is fired when the tab is activated.
      */
    var onActive: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[TabTheme] = js.undefined
  }
  object TabProps {
    
    inline def apply(): TabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveClassName(value: String): Self = StObject.set(x, "activeClassName", value.asInstanceOf[js.Any])
      
      inline def setActiveClassNameUndefined: Self = StObject.set(x, "activeClassName", js.undefined)
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnActive(value: js.Function): Self = StObject.set(x, "onActive", value.asInstanceOf[js.Any])
      
      inline def setOnActiveUndefined: Self = StObject.set(x, "onActive", js.undefined)
      
      inline def setTheme(value: TabTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait TabTheme extends StObject {
    
    /**
      * Added to the navigation tab element in case it's active.
      */
    var active: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the navigation tab element in case it's disabled.
      */
    var disabled: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the navigation tab element in case it's hidden.
      */
    var hidden: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the navigation tab element in case it's active.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Class added when icon is set.
      */
    var withIcon: js.UndefOr[String] = js.undefined
    
    /**
      * Class added when label is set.
      */
    var withText: js.UndefOr[String] = js.undefined
  }
  object TabTheme {
    
    inline def apply(): TabTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabTheme] (val x: Self) extends AnyVal {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setWithIcon(value: String): Self = StObject.set(x, "withIcon", value.asInstanceOf[js.Any])
      
      inline def setWithIconUndefined: Self = StObject.set(x, "withIcon", js.undefined)
      
      inline def setWithText(value: String): Self = StObject.set(x, "withText", value.asInstanceOf[js.Any])
      
      inline def setWithTextUndefined: Self = StObject.set(x, "withText", js.undefined)
    }
  }
}
