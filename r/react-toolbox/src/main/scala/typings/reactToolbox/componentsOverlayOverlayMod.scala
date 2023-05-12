package typings.reactToolbox

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsOverlayOverlayMod {
  
  @JSImport("react-toolbox/components/overlay/Overlay", JSImport.Default)
  @js.native
  open class default protected () extends Overlay {
    def this(props: OverlayProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: OverlayProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/overlay/Overlay", "Overlay")
  @js.native
  open class Overlay protected ()
    extends Component[OverlayProps, js.Object, Any] {
    def this(props: OverlayProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: OverlayProps, context: Any) = this()
  }
  
  trait OverlayProps extends StObject {
    
    /**
      * Whether overlay is active.
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Nodes to be nested inside Overlay.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Additional class name(s) for root container.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Whether Overlay should have 'invisible' styles.
      * @default false
      */
    var invisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback invoked on Overlay click.
      */
    var onClick: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback invoked on ESC key.
      */
    var onEscKeyDown: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Overlay theme.
      */
    var theme: js.UndefOr[OverlayTheme] = js.undefined
  }
  object OverlayProps {
    
    inline def apply(): OverlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverlayProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverlayProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
      
      inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
      
      inline def setOnClick(value: js.Function): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnEscKeyDown(value: js.Function): Self = StObject.set(x, "onEscKeyDown", value.asInstanceOf[js.Any])
      
      inline def setOnEscKeyDownUndefined: Self = StObject.set(x, "onEscKeyDown", js.undefined)
      
      inline def setTheme(value: OverlayTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait OverlayTheme extends StObject {
    
    /**
      * Active class name.
      */
    var active: js.UndefOr[String] = js.undefined
    
    /**
      * Backdrop class name.
      */
    var backdrop: js.UndefOr[String] = js.undefined
    
    /**
      * Invisible class name.
      */
    var invisible: js.UndefOr[String] = js.undefined
    
    /**
      * Overlay class name.
      */
    var overlay: js.UndefOr[String] = js.undefined
  }
  object OverlayTheme {
    
    inline def apply(): OverlayTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverlayTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverlayTheme] (val x: Self) extends AnyVal {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setBackdrop(value: String): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
      inline def setInvisible(value: String): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
      
      inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
      
      inline def setOverlay(value: String): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    }
  }
}
