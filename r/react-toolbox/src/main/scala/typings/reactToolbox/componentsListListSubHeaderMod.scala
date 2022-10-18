package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsListListSubHeaderMod {
  
  @JSImport("react-toolbox/components/list/ListSubHeader", "ListSubHeader")
  @js.native
  open class ListSubHeader protected ()
    extends Component[ListSubHeaderProps, js.Object, Any] {
    def this(props: ListSubHeaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ListSubHeaderProps, context: Any) = this()
  }
  
  trait ListSubHeaderProps
    extends StObject
       with Props {
    
    /**
      * Text that will be displayed.
      */
    var caption: js.UndefOr[String] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[ListSubHeaderTheme] = js.undefined
  }
  object ListSubHeaderProps {
    
    inline def apply(): ListSubHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListSubHeaderProps]
    }
    
    extension [Self <: ListSubHeaderProps](x: Self) {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setTheme(value: ListSubHeaderTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ListSubHeaderTheme extends StObject {
    
    /**
      * Used as a wrapper class for the subheader element.
      */
    var subheader: js.UndefOr[String] = js.undefined
  }
  object ListSubHeaderTheme {
    
    inline def apply(): ListSubHeaderTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListSubHeaderTheme]
    }
    
    extension [Self <: ListSubHeaderTheme](x: Self) {
      
      inline def setSubheader(value: String): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
      
      inline def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
    }
  }
}
