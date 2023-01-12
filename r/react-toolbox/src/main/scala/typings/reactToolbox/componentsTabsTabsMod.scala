package typings.reactToolbox

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.componentsTabsTabMod.TabTheme
import typings.reactToolbox.mod.ReactToolbox.Props
import typings.reactToolbox.reactToolboxStrings.display
import typings.reactToolbox.reactToolboxStrings.unmounted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTabsTabsMod {
  
  @JSImport("react-toolbox/components/tabs/Tabs", JSImport.Default)
  @js.native
  open class default protected () extends Tabs {
    def this(props: TabsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabsProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/tabs/Tabs", "Tabs")
  @js.native
  open class Tabs protected ()
    extends Component[TabsProps, js.Object, Any] {
    def this(props: TabsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabsProps, context: Any) = this()
  }
  
  trait TabsProps
    extends StObject
       with Props {
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Disable the animation below the active tab.
      * @default false
      */
    var disableAnimatedBottomBorder: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If True, the tabs will be fixed, covering the whole width.
      */
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * `unmounted` mode will not mount the tab content of inactive tabs.
      * `display` mode will mount but hide inactive tabs.
      * Consider holding state outside of the Tabs component before using `display` mode
      * @default unmounted
      */
    var hideMode: js.UndefOr[display | unmounted] = js.undefined
    
    /**
      * Current
      * @default 0
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /**
      * If True, the tabs will have an inverse style.
      */
    var inverse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback function that is fired when the tab changes.
      */
    var onChange: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[TabsTheme] = js.undefined
  }
  object TabsProps {
    
    inline def apply(): TabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisableAnimatedBottomBorder(value: Boolean): Self = StObject.set(x, "disableAnimatedBottomBorder", value.asInstanceOf[js.Any])
      
      inline def setDisableAnimatedBottomBorderUndefined: Self = StObject.set(x, "disableAnimatedBottomBorder", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setHideMode(value: display | unmounted): Self = StObject.set(x, "hideMode", value.asInstanceOf[js.Any])
      
      inline def setHideModeUndefined: Self = StObject.set(x, "hideMode", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setTheme(value: TabsTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactToolbox.componentsTabsTabContentMod.TabContentTheme because var conflicts: active. Inlined tab */ trait TabsTheme
    extends StObject
       with TabTheme {
    
    /**
      * Class used for arrows.
      */
    var arrow: js.UndefOr[String] = js.undefined
    
    /**
      * Class used for arrow container.
      */
    var arrowContainer: js.UndefOr[String] = js.undefined
    
    /**
      * Class used when 'disableAnimatedBottomBorder' is true.
      */
    var disableAnimation: js.UndefOr[String] = js.undefined
    
    /**
      * Used to make the 'fixed tabs'.
      */
    var fixed: js.UndefOr[String] = js.undefined
    
    /**
      * Used to invert the colors.
      */
    var inverse: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the navigation element.
      */
    var navigation: js.UndefOr[String] = js.undefined
    
    /**
      * Used for navigation container.
      */
    var navigationContainer: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the moving underline element.
      */
    var pointer: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the tab content element.
      */
    var tab: js.UndefOr[String] = js.undefined
    
    /**
      * Used as a root classname for the component.
      */
    var tabs: js.UndefOr[String] = js.undefined
  }
  object TabsTheme {
    
    inline def apply(): TabsTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsTheme] (val x: Self) extends AnyVal {
      
      inline def setArrow(value: String): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowContainer(value: String): Self = StObject.set(x, "arrowContainer", value.asInstanceOf[js.Any])
      
      inline def setArrowContainerUndefined: Self = StObject.set(x, "arrowContainer", js.undefined)
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setDisableAnimation(value: String): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
      
      inline def setDisableAnimationUndefined: Self = StObject.set(x, "disableAnimation", js.undefined)
      
      inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setInverse(value: String): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setNavigation(value: String): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setNavigationContainer(value: String): Self = StObject.set(x, "navigationContainer", value.asInstanceOf[js.Any])
      
      inline def setNavigationContainerUndefined: Self = StObject.set(x, "navigationContainer", js.undefined)
      
      inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
      
      inline def setPointer(value: String): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      inline def setPointerUndefined: Self = StObject.set(x, "pointer", js.undefined)
      
      inline def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
      
      inline def setTabs(value: String): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
    }
  }
}
