package typings.storybookAddonBackgrounds

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9TypesMod {
  
  trait Background extends StObject {
    
    var name: String
    
    var value: String
  }
  object Background {
    
    inline def apply(name: String, value: String): Background = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Background]
    }
    
    extension [Self <: Background](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait BackgroundSelectorItem extends StObject {
    
    var active: Boolean
    
    var id: String
    
    def onClick(): Unit
    
    var right: js.UndefOr[ReactElement] = js.undefined
    
    var title: String
    
    var value: String
  }
  object BackgroundSelectorItem {
    
    inline def apply(active: Boolean, id: String, onClick: () => Unit, title: String, value: String): BackgroundSelectorItem = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundSelectorItem]
    }
    
    extension [Self <: BackgroundSelectorItem](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setRight(value: ReactElement): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait BackgroundsConfig extends StObject {
    
    var backgrounds: js.Array[Background] | Null
    
    var defaultBackgroundName: String | Null
    
    var disable: Boolean
    
    var selectedBackgroundName: String | Null
  }
  object BackgroundsConfig {
    
    inline def apply(disable: Boolean): BackgroundsConfig = {
      val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any], backgrounds = null, defaultBackgroundName = null, selectedBackgroundName = null)
      __obj.asInstanceOf[BackgroundsConfig]
    }
    
    extension [Self <: BackgroundsConfig](x: Self) {
      
      inline def setBackgrounds(value: js.Array[Background]): Self = StObject.set(x, "backgrounds", value.asInstanceOf[js.Any])
      
      inline def setBackgroundsNull: Self = StObject.set(x, "backgrounds", null)
      
      inline def setBackgroundsVarargs(value: Background*): Self = StObject.set(x, "backgrounds", js.Array(value*))
      
      inline def setDefaultBackgroundName(value: String): Self = StObject.set(x, "defaultBackgroundName", value.asInstanceOf[js.Any])
      
      inline def setDefaultBackgroundNameNull: Self = StObject.set(x, "defaultBackgroundName", null)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setSelectedBackgroundName(value: String): Self = StObject.set(x, "selectedBackgroundName", value.asInstanceOf[js.Any])
      
      inline def setSelectedBackgroundNameNull: Self = StObject.set(x, "selectedBackgroundName", null)
    }
  }
  
  trait BackgroundsParameter extends StObject {
    
    var default: js.UndefOr[String] = js.undefined
    
    var disable: js.UndefOr[Boolean] = js.undefined
    
    var values: js.Array[Background]
  }
  object BackgroundsParameter {
    
    inline def apply(values: js.Array[Background]): BackgroundsParameter = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundsParameter]
    }
    
    extension [Self <: BackgroundsParameter](x: Self) {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setValues(value: js.Array[Background]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Background*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait GlobalState extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var selected: js.UndefOr[String] = js.undefined
  }
  object GlobalState {
    
    inline def apply(): GlobalState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalState]
    }
    
    extension [Self <: GlobalState](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
}
