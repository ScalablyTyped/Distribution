package typings.reactToolbox

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.componentsListListItemActionsMod.ListItemActionsTheme
import typings.reactToolbox.componentsListListItemContentMod.ListItemContentTheme
import typings.reactToolbox.componentsListListItemLayoutMod.ListItemLayoutProps
import typings.reactToolbox.componentsListListItemLayoutMod.ListItemLayoutTheme
import typings.reactToolbox.componentsListListItemTextMod.ListItemTextTheme
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsListListItemMod {
  
  @JSImport("react-toolbox/components/list/ListItem", "ListItem")
  @js.native
  open class ListItem protected ()
    extends Component[ListItemProps & ListItemLayoutProps, js.Object, Any] {
    def this(props: ListItemProps & ListItemLayoutProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ListItemProps & ListItemLayoutProps, context: Any) = this()
  }
  
  trait ListItemProps
    extends StObject
       with Props {
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * If true, the item is displayed as disabled and is not clickable.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the item displays a ripple effect on click. By default it's inherited from the parent element.
      */
    var ripple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Classnames object defining the component style.
      * @default false
      */
    var theme: js.UndefOr[
        ListItemTheme & ListItemActionsTheme & ListItemContentTheme & ListItemLayoutTheme & ListItemTextTheme
      ] = js.undefined
    
    /**
      * In case you want to provide the item as a link, you can pass this property to specify the href.
      */
    var to: js.UndefOr[String] = js.undefined
  }
  object ListItemProps {
    
    inline def apply(): ListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setRipple(value: Boolean): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      inline def setRippleUndefined: Self = StObject.set(x, "ripple", js.undefined)
      
      inline def setTheme(
        value: ListItemTheme & ListItemActionsTheme & ListItemContentTheme & ListItemLayoutTheme & ListItemTextTheme
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait ListItemTheme extends StObject {
    
    /**
      * Used for the root element of the list.
      */
    var listItem: js.UndefOr[String] = js.undefined
  }
  object ListItemTheme {
    
    inline def apply(): ListItemTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemTheme] (val x: Self) extends AnyVal {
      
      inline def setListItem(value: String): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
      
      inline def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
    }
  }
}
