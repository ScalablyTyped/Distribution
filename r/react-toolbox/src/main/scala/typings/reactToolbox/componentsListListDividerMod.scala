package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsListListDividerMod {
  
  @JSImport("react-toolbox/components/list/ListDivider", "ListDivider")
  @js.native
  open class ListDivider protected ()
    extends Component[ListDividerProps, js.Object, Any] {
    def this(props: ListDividerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ListDividerProps, context: Any) = this()
  }
  
  trait ListDividerProps
    extends StObject
       with Props {
    
    /**
      * If true, will leave a space at the left side.
      */
    var inset: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[ListDividerTheme] = js.undefined
  }
  object ListDividerProps {
    
    inline def apply(): ListDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListDividerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListDividerProps] (val x: Self) extends AnyVal {
      
      inline def setInset(value: Boolean): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
      
      inline def setTheme(value: ListDividerTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ListDividerTheme extends StObject {
    
    /**
      * Added to the root element.
      */
    var divider: js.UndefOr[String] = js.undefined
    
    /**
      * Added to root element if inset is true.
      */
    var inset: js.UndefOr[String] = js.undefined
  }
  object ListDividerTheme {
    
    inline def apply(): ListDividerTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListDividerTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListDividerTheme] (val x: Self) extends AnyVal {
      
      inline def setDivider(value: String): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      inline def setInset(value: String): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    }
  }
}
