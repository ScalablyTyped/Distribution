package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfCheckbox extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfCheckbox")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var isChecked: Boolean
  }
  object Computed {
    
    inline def apply(isChecked: Boolean): Computed = {
      val __obj = js.Dynamic.literal(isChecked = isChecked.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var computed: Computed
    
    var methods: Methods
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(computed: Computed, methods: Methods, props: Props): Constructor = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def inputHandler(): Unit
  }
  object Methods {
    
    inline def apply(inputHandler: () => Unit): Methods = {
      val __obj = js.Dynamic.literal(inputHandler = js.Any.fromFunction0(inputHandler))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setInputHandler(value: () => Unit): Self = StObject.set(x, "inputHandler", js.Any.fromFunction0(value))
    }
  }
  
  trait Props extends StObject {
    
    var disabled: Boolean
    
    var label: String
    
    var name: String
    
    var required: Boolean
    
    var selected: Boolean | js.Array[String]
    
    var valid: Boolean
    
    var value: String | Boolean
  }
  object Props {
    
    inline def apply(
      disabled: Boolean,
      label: String,
      name: String,
      required: Boolean,
      selected: Boolean | js.Array[String],
      valid: Boolean,
      value: String | Boolean
    ): Props = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean | js.Array[String]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedVarargs(value: String*): Self = StObject.set(x, "selected", js.Array(value*))
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfCheckbox.foo` */
  override def _to: Constructor = ^
}
