package typings.reactToolbox

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsListListMod {
  
  @JSImport("react-toolbox/components/list/List", "List")
  @js.native
  open class List protected ()
    extends Component[ListProps, js.Object, Any] {
    def this(props: ListProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ListProps, context: Any) = this()
  }
  
  trait ListProps
    extends StObject
       with Props {
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * If true, each element in the list will have a ripple effect on click
      * @default false
      */
    var ripple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the elements in the list will display a hover effect and a pointer cursor.
      * @default false
      */
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[ListTheme] = js.undefined
  }
  object ListProps {
    
    inline def apply(): ListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setRipple(value: Boolean): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      inline def setRippleUndefined: Self = StObject.set(x, "ripple", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setTheme(value: ListTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ListTheme extends StObject {
    
    /**
      * Used for the root element of the list.
      */
    var list: js.UndefOr[String] = js.undefined
  }
  object ListTheme {
    
    inline def apply(): ListTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListTheme] (val x: Self) extends AnyVal {
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    }
  }
}
