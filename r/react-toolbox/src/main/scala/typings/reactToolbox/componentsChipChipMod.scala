package typings.reactToolbox

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsChipChipMod {
  
  @JSImport("react-toolbox/components/chip/Chip", JSImport.Default)
  @js.native
  open class default protected () extends Chip {
    def this(props: ChipProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ChipProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/chip/Chip", "Chip")
  @js.native
  open class Chip protected ()
    extends Component[ChipProps, js.Object, Any] {
    def this(props: ChipProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ChipProps, context: Any) = this()
  }
  
  trait ChipProps
    extends StObject
       with Props {
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * If true, the chip will be rendered with a delete icon.
      * @default false
      */
    var deletable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback to be invoked when the delete icon is clicked.
      */
    var onDeleteClick: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[ChipTheme] = js.undefined
  }
  object ChipProps {
    
    inline def apply(): ChipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChipProps]
    }
    
    extension [Self <: ChipProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDeletable(value: Boolean): Self = StObject.set(x, "deletable", value.asInstanceOf[js.Any])
      
      inline def setDeletableUndefined: Self = StObject.set(x, "deletable", js.undefined)
      
      inline def setOnDeleteClick(value: js.Function): Self = StObject.set(x, "onDeleteClick", value.asInstanceOf[js.Any])
      
      inline def setOnDeleteClickUndefined: Self = StObject.set(x, "onDeleteClick", js.undefined)
      
      inline def setTheme(value: ChipTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ChipTheme extends StObject {
    
    /**
      * Added to the root element when the component includes an avatar.
      */
    var avatar: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the root element.
      */
    var chip: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root element when the component is deletable.
      */
    var deletable: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the delete element wrapper.
      */
    var delete: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the delete icon.
      */
    var deleteIcon: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the delete svg inner layer.
      */
    var deleteX: js.UndefOr[String] = js.undefined
  }
  object ChipTheme {
    
    inline def apply(): ChipTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChipTheme]
    }
    
    extension [Self <: ChipTheme](x: Self) {
      
      inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setChip(value: String): Self = StObject.set(x, "chip", value.asInstanceOf[js.Any])
      
      inline def setChipUndefined: Self = StObject.set(x, "chip", js.undefined)
      
      inline def setDeletable(value: String): Self = StObject.set(x, "deletable", value.asInstanceOf[js.Any])
      
      inline def setDeletableUndefined: Self = StObject.set(x, "deletable", js.undefined)
      
      inline def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteIcon(value: String): Self = StObject.set(x, "deleteIcon", value.asInstanceOf[js.Any])
      
      inline def setDeleteIconUndefined: Self = StObject.set(x, "deleteIcon", js.undefined)
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setDeleteX(value: String): Self = StObject.set(x, "deleteX", value.asInstanceOf[js.Any])
      
      inline def setDeleteXUndefined: Self = StObject.set(x, "deleteX", js.undefined)
    }
  }
}
