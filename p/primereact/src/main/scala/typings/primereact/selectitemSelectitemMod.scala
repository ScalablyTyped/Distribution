package typings.primereact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectitemSelectitemMod {
  
  trait SelectItem extends StObject {
    
    /**
      * ClassName of the option.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the option is disabled or not. (Not supported)
      * @defaultValue false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Icon to display to the option.
      */
    var icon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<SelectItem> */ Any
      ] = js.undefined
    
    /**
      * Label of the option.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Tooltip text of the option. (Not supported)
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * Value of the option.
      */
    var value: js.UndefOr[Any] = js.undefined
  }
  object SelectItem {
    
    inline def apply(): SelectItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectItem] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<SelectItem> */ Any
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type SelectItemOptionsType = js.Array[Any | SelectItem]
}
