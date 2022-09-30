package typings.reactToolbox

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontIconFontIconMod {
  
  @JSImport("react-toolbox/components/font_icon/FontIcon", JSImport.Default)
  @js.native
  open class default protected () extends FontIcon {
    def this(props: FontIconProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FontIconProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/font_icon/FontIcon", "FontIcon")
  @js.native
  open class FontIcon protected ()
    extends Component[FontIconProps, js.Object, Any] {
    def this(props: FontIconProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FontIconProps, context: Any) = this()
  }
  
  trait FontIconProps
    extends StObject
       with Props
       with /**
    * Additional properties passed to inner input element.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The key string for the icon you want be displayed.
      */
    var value: js.UndefOr[ReactNode] = js.undefined
  }
  object FontIconProps {
    
    inline def apply(): FontIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontIconProps]
    }
    
    extension [Self <: FontIconProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setValue(value: ReactNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
