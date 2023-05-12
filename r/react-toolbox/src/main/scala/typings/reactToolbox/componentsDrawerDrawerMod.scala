package typings.reactToolbox

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import typings.reactToolbox.reactToolboxStrings.left
import typings.reactToolbox.reactToolboxStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDrawerDrawerMod {
  
  @JSImport("react-toolbox/components/drawer/Drawer", JSImport.Default)
  @js.native
  open class default protected () extends Drawer {
    def this(props: DrawerProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: DrawerProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/drawer/Drawer", "Drawer")
  @js.native
  open class Drawer protected ()
    extends Component[DrawerProps, js.Object, Any] {
    def this(props: DrawerProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: DrawerProps, context: Any) = this()
  }
  
  trait DrawerCommonProps extends StObject {
    
    /**
      * If true, the drawer will be visible.
      * @default false
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * If true the Drawer is rendered inside the normal tree.
      * @default false
      */
    var insideTree: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback function to be invoked when the overlay is clicked.
      */
    var onOverlayClick: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Type of drawer. It can be left or right to display the drawer on the left or right side of the screen.
      * @default left
      */
    var `type`: js.UndefOr[left | right] = js.undefined
    
    /**
      * If true display an Overlay that locks the scroll when the Drawer is active.
      * @default true
      */
    var withOverlay: js.UndefOr[Boolean] = js.undefined
  }
  object DrawerCommonProps {
    
    inline def apply(): DrawerCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerCommonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawerCommonProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInsideTree(value: Boolean): Self = StObject.set(x, "insideTree", value.asInstanceOf[js.Any])
      
      inline def setInsideTreeUndefined: Self = StObject.set(x, "insideTree", js.undefined)
      
      inline def setOnOverlayClick(value: js.Function): Self = StObject.set(x, "onOverlayClick", value.asInstanceOf[js.Any])
      
      inline def setOnOverlayClickUndefined: Self = StObject.set(x, "onOverlayClick", js.undefined)
      
      inline def setType(value: left | right): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWithOverlay(value: Boolean): Self = StObject.set(x, "withOverlay", value.asInstanceOf[js.Any])
      
      inline def setWithOverlayUndefined: Self = StObject.set(x, "withOverlay", js.undefined)
    }
  }
  
  trait DrawerProps
    extends StObject
       with Props
       with DrawerCommonProps {
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[DrawerTheme] = js.undefined
  }
  object DrawerProps {
    
    inline def apply(): DrawerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawerProps] (val x: Self) extends AnyVal {
      
      inline def setTheme(value: DrawerTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait DrawerTheme extends StObject {
    
    /**
      * Used for the root class when the drawer is active.
      */
    var active: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the drawer content.
      */
    var content: js.UndefOr[String] = js.undefined
    
    /**
      * Root class.
      */
    var drawer: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root class when drawer is to the left.
      */
    var left: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root class when drawer is to the right.
      */
    var right: js.UndefOr[String] = js.undefined
    
    /**
      * A wrapper class for the top of the root.
      */
    var wrapper: js.UndefOr[String] = js.undefined
  }
  object DrawerTheme {
    
    inline def apply(): DrawerTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawerTheme] (val x: Self) extends AnyVal {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDrawer(value: String): Self = StObject.set(x, "drawer", value.asInstanceOf[js.Any])
      
      inline def setDrawerUndefined: Self = StObject.set(x, "drawer", js.undefined)
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
}
