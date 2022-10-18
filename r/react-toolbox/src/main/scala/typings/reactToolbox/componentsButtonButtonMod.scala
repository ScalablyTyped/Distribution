package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.componentsButtonBaseMod.ButtonBaseProps
import typings.reactToolbox.componentsButtonBaseMod.ButtonTheme
import typings.reactToolbox.componentsRippleMod.RippleTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsButtonButtonMod {
  
  @JSImport("react-toolbox/components/button/Button", JSImport.Default)
  @js.native
  open class default protected () extends Button {
    def this(props: ButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ButtonProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/button/Button", "Button")
  @js.native
  open class Button protected ()
    extends Component[ButtonProps, js.Object, Any] {
    def this(props: ButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ButtonProps, context: Any) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined 
  - typings.reactToolbox.componentsRippleMod.RippleProps because Inheritance from two classes. Inlined onRippleEnded, spread, theme */ trait ButtonProps
    extends StObject
       with ButtonBaseProps {
    
    /**
      * If true, the button will have a flat look.
      * @default false
      */
    var flat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the button will have a floating look.
      * @default false
      */
    var floating: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Creates a link for the button.
      */
    var href: js.UndefOr[String] = js.undefined
    
    /**
      * The text string to use for the name of the button.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * To be used with floating button. If true, the button will be smaller.
      * @default false
      */
    var mini: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function that will be called when the ripple animation ends.
      */
    var onRippleEnded: js.UndefOr[js.Function] = js.undefined
    
    /**
      * If true, the button will have a raised look.
      * @default false
      */
    var raised: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Factor to indicate how much should the ripple spread under the component.
      * @default 2
      */
    var spread: js.UndefOr[Double] = js.undefined
    
    /**
      * Passed down to the root element
      */
    var target: js.UndefOr[String] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[ButtonTheme | RippleTheme] = js.undefined
  }
  object ButtonProps {
    
    inline def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    extension [Self <: ButtonProps](x: Self) {
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      inline def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMini(value: Boolean): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
      
      inline def setMiniUndefined: Self = StObject.set(x, "mini", js.undefined)
      
      inline def setOnRippleEnded(value: js.Function): Self = StObject.set(x, "onRippleEnded", value.asInstanceOf[js.Any])
      
      inline def setOnRippleEndedUndefined: Self = StObject.set(x, "onRippleEnded", js.undefined)
      
      inline def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
      
      inline def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
      
      inline def setSpread(value: Double): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
      
      inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTheme(value: ButtonTheme | RippleTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
