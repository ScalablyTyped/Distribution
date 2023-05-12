package typings.reactToolbox

import typings.react.mod.Component
import typings.react.mod.ReactChild
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactToolbox.componentsListListItemActionsMod.ListItemActionsTheme
import typings.reactToolbox.componentsListListItemContentMod.ListItemContentTheme
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsListListItemLayoutMod {
  
  @JSImport("react-toolbox/components/list/ListItemLayout", "ListItemLayout")
  @js.native
  open class ListItemLayout protected ()
    extends Component[ListItemLayoutProps, js.Object, Any] {
    def this(props: ListItemLayoutProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ListItemLayoutProps, context: Any) = this()
  }
  
  trait ListItemLayoutProps
    extends StObject
       with Props {
    
    /**
      * A string URL to specify an avatar in the left side of the item.
      */
    var avatar: js.UndefOr[String | ReactElement] = js.undefined
    
    /**
      * Main text of the item.
      */
    var caption: js.UndefOr[String] = js.undefined
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * If true, the item is displayed as disabled and it's not clickable.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Layout content.
      */
    var itemContent: js.UndefOr[ReactChild] = js.undefined
    
    /**
      * A list of elements that are placed on the left side of the item and after the avatar attribute.
      */
    var leftActions: js.UndefOr[js.Array[ReactNode]] = js.undefined
    
    /**
      * A string key of a font icon or element to display an icon in the left side of the item.
      */
    var leftIcon: js.UndefOr[String | ReactElement] = js.undefined
    
    /**
      * Secondary text to display under the caption.
      */
    var legend: js.UndefOr[String] = js.undefined
    
    /**
      * A list of elements that are placed on the right side of the item and after the rightIcon attribute.
      */
    var rightActions: js.UndefOr[js.Array[ReactNode]] = js.undefined
    
    /**
      * The same as the leftIcon but in this case the icon is displayed in the right side.
      */
    var rightIcon: js.UndefOr[String | ReactElement] = js.undefined
    
    /**
      * If true, the elements in the list will display a hover effect and a pointer cursor. Inherited from the parent.
      * @default false
      */
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Object defining the component class name mappings.
      */
    var theme: js.UndefOr[ListItemLayoutTheme & ListItemContentTheme & ListItemActionsTheme] = js.undefined
    
    /**
      * In case you want to provide the item as a link, you can pass this property to specify the href.
      */
    var to: js.UndefOr[String] = js.undefined
  }
  object ListItemLayoutProps {
    
    inline def apply(): ListItemLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemLayoutProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemLayoutProps] (val x: Self) extends AnyVal {
      
      inline def setAvatar(value: String | ReactElement): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setItemContent(value: ReactChild): Self = StObject.set(x, "itemContent", value.asInstanceOf[js.Any])
      
      inline def setItemContentUndefined: Self = StObject.set(x, "itemContent", js.undefined)
      
      inline def setLeftActions(value: js.Array[ReactNode]): Self = StObject.set(x, "leftActions", value.asInstanceOf[js.Any])
      
      inline def setLeftActionsUndefined: Self = StObject.set(x, "leftActions", js.undefined)
      
      inline def setLeftActionsVarargs(value: ReactNode*): Self = StObject.set(x, "leftActions", js.Array(value*))
      
      inline def setLeftIcon(value: String | ReactElement): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
      
      inline def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
      
      inline def setLegend(value: String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setRightActions(value: js.Array[ReactNode]): Self = StObject.set(x, "rightActions", value.asInstanceOf[js.Any])
      
      inline def setRightActionsUndefined: Self = StObject.set(x, "rightActions", js.undefined)
      
      inline def setRightActionsVarargs(value: ReactNode*): Self = StObject.set(x, "rightActions", js.Array(value*))
      
      inline def setRightIcon(value: String | ReactElement): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
      
      inline def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setTheme(value: ListItemLayoutTheme & ListItemContentTheme & ListItemActionsTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait ListItemLayoutTheme extends StObject {
    
    /**
      * Added to the inner content if its a disabled item.
      */
    var disabled: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the inner content of a list item.
      */
    var item: js.UndefOr[String] = js.undefined
    
    /**
      * Added when layout is selectable.
      */
    var selectable: js.UndefOr[String] = js.undefined
  }
  object ListItemLayoutTheme {
    
    inline def apply(): ListItemLayoutTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemLayoutTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemLayoutTheme] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setSelectable(value: String): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    }
  }
}
