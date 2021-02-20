package typings.storybookAddonBackgrounds

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait Background extends StObject {
    
    var name: String = js.native
    
    var value: String = js.native
  }
  object Background {
    
    @scala.inline
    def apply(name: String, value: String): Background = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Background]
    }
    
    @scala.inline
    implicit class BackgroundMutableBuilder[Self <: Background] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BackgroundSelectorItem extends StObject {
    
    var active: Boolean = js.native
    
    var id: String = js.native
    
    def onClick(): Unit = js.native
    
    var right: js.UndefOr[ReactElement] = js.native
    
    var title: String = js.native
    
    var value: String = js.native
  }
  object BackgroundSelectorItem {
    
    @scala.inline
    def apply(active: Boolean, id: String, onClick: () => Unit, title: String, value: String): BackgroundSelectorItem = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundSelectorItem]
    }
    
    @scala.inline
    implicit class BackgroundSelectorItemMutableBuilder[Self <: BackgroundSelectorItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRight(value: ReactElement): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BackgroundsConfig extends StObject {
    
    var backgrounds: js.Array[Background] | Null = js.native
    
    var defaultBackgroundName: String | Null = js.native
    
    var disable: Boolean = js.native
    
    var selectedBackgroundName: String | Null = js.native
  }
  object BackgroundsConfig {
    
    @scala.inline
    def apply(disable: Boolean): BackgroundsConfig = {
      val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundsConfig]
    }
    
    @scala.inline
    implicit class BackgroundsConfigMutableBuilder[Self <: BackgroundsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgrounds(value: js.Array[Background]): Self = StObject.set(x, "backgrounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundsNull: Self = StObject.set(x, "backgrounds", null)
      
      @scala.inline
      def setBackgroundsVarargs(value: Background*): Self = StObject.set(x, "backgrounds", js.Array(value :_*))
      
      @scala.inline
      def setDefaultBackgroundName(value: String): Self = StObject.set(x, "defaultBackgroundName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultBackgroundNameNull: Self = StObject.set(x, "defaultBackgroundName", null)
      
      @scala.inline
      def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedBackgroundName(value: String): Self = StObject.set(x, "selectedBackgroundName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedBackgroundNameNull: Self = StObject.set(x, "selectedBackgroundName", null)
    }
  }
  
  @js.native
  trait BackgroundsParameter extends StObject {
    
    var default: js.UndefOr[String] = js.native
    
    var disable: js.UndefOr[Boolean] = js.native
    
    var values: js.Array[Background] = js.native
  }
  object BackgroundsParameter {
    
    @scala.inline
    def apply(values: js.Array[Background]): BackgroundsParameter = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundsParameter]
    }
    
    @scala.inline
    implicit class BackgroundsParameterMutableBuilder[Self <: BackgroundsParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[Background]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: Background*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GlobalState extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var selected: js.UndefOr[String] = js.native
  }
  object GlobalState {
    
    @scala.inline
    def apply(): GlobalState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalState]
    }
    
    @scala.inline
    implicit class GlobalStateMutableBuilder[Self <: GlobalState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
}
