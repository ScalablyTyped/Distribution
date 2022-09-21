package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfInput extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfInput")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var isPassword: Boolean
    
    var listeners: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue * / any['$listeners'] */ js.Any
  }
  object Computed {
    
    inline def apply(
      isPassword: Boolean,
      listeners: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue * / any['$listeners'] */ js.Any
    ): Computed = {
      val __obj = js.Dynamic.literal(isPassword = isPassword.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setIsPassword(value: Boolean): Self = StObject.set(x, "isPassword", value.asInstanceOf[js.Any])
      
      inline def setListeners(
        value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue * / any['$listeners'] */ js.Any
      ): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var computed: Computed
    
    def data(): Data
    
    var methods: Methods
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(computed: Computed, data: () => Data, methods: Methods, props: Props): Constructor = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], data = js.Any.fromFunction0(data), methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setData(value: () => Data): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var inputType: String
    
    var isNumberTypeSafari: Boolean
    
    var isPasswordVisible: Boolean
  }
  object Data {
    
    inline def apply(inputType: String, isNumberTypeSafari: Boolean, isPasswordVisible: Boolean): Data = {
      val __obj = js.Dynamic.literal(inputType = inputType.asInstanceOf[js.Any], isNumberTypeSafari = isNumberTypeSafari.asInstanceOf[js.Any], isPasswordVisible = isPasswordVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      inline def setIsNumberTypeSafari(value: Boolean): Self = StObject.set(x, "isNumberTypeSafari", value.asInstanceOf[js.Any])
      
      inline def setIsPasswordVisible(value: Boolean): Self = StObject.set(x, "isPasswordVisible", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def switchVisibilityPassword(): Unit
  }
  object Methods {
    
    inline def apply(switchVisibilityPassword: () => Unit): Methods = {
      val __obj = js.Dynamic.literal(switchVisibilityPassword = js.Any.fromFunction0(switchVisibilityPassword))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setSwitchVisibilityPassword(value: () => Unit): Self = StObject.set(x, "switchVisibilityPassword", js.Any.fromFunction0(value))
    }
  }
  
  trait Props extends StObject {
    
    var disabled: Boolean
    
    var errorMessage: String | Null
    
    var hasShowPassword: Boolean
    
    var label: String | Null
    
    var name: String | Null
    
    var required: Boolean
    
    var `type`: String
    
    var valid: Boolean
    
    var value: String | Double | Null
  }
  object Props {
    
    inline def apply(disabled: Boolean, hasShowPassword: Boolean, required: Boolean, `type`: String, valid: Boolean): Props = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], hasShowPassword = hasShowPassword.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], errorMessage = null, label = null, name = null, value = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
      
      inline def setHasShowPassword(value: Boolean): Self = StObject.set(x, "hasShowPassword", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfInput.foo` */
  override def _to: Constructor = ^
}
