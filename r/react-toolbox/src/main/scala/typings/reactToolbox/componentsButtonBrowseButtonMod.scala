package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.componentsButtonBaseMod.ButtonBaseProps
import typings.reactToolbox.componentsButtonBaseMod.ButtonTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsButtonBrowseButtonMod {
  
  @JSImport("react-toolbox/components/button/BrowseButton", "BrowseButton")
  @js.native
  open class BrowseButton protected ()
    extends Component[BrowseButtonProps, js.Object, Any] {
    def this(props: BrowseButtonProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: BrowseButtonProps, context: Any) = this()
  }
  
  trait BrowseButtonProps
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
    
    var onChange: js.UndefOr[js.Function] = js.undefined
    
    /**
      * If true, the button will have a raised look.
      * @default false
      */
    var raised: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[BrowseButtonTheme] = js.undefined
  }
  object BrowseButtonProps {
    
    inline def apply(): BrowseButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowseButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BrowseButtonProps] (val x: Self) extends AnyVal {
      
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
      
      inline def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
      
      inline def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
      
      inline def setTheme(value: BrowseButtonTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type BrowseButtonTheme = ButtonTheme
}
