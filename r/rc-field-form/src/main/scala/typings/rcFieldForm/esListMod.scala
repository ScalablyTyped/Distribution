package typings.rcFieldForm

import org.scalablytyped.runtime.Shortcut
import typings.rcFieldForm.esInterfaceMod.Meta
import typings.rcFieldForm.esInterfaceMod.NamePath
import typings.rcFieldForm.esInterfaceMod.StoreValue
import typings.rcFieldForm.esInterfaceMod.ValidatorRule
import typings.rcFieldForm.rcFieldFormBooleans.`false`
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esListMod extends Shortcut {
  
  @JSImport("rc-field-form/es/List", JSImport.Default)
  @js.native
  val default: FunctionComponent[ListProps] = js.native
  
  trait ListField extends StObject {
    
    var isListField: Boolean
    
    var key: Double
    
    var name: Double
  }
  object ListField {
    
    inline def apply(isListField: Boolean, key: Double, name: Double): ListField = {
      val __obj = js.Dynamic.literal(isListField = isListField.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListField]
    }
    
    extension [Self <: ListField](x: Self) {
      
      inline def setIsListField(value: Boolean): Self = StObject.set(x, "isListField", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setName(value: Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListOperations extends StObject {
    
    def add(): Unit = js.native
    def add(defaultValue: Unit, index: Double): Unit = js.native
    def add(defaultValue: StoreValue): Unit = js.native
    def add(defaultValue: StoreValue, index: Double): Unit = js.native
    
    def move(from: Double, to: Double): Unit = js.native
    
    def remove(index: js.Array[Double]): Unit = js.native
    def remove(index: Double): Unit = js.native
  }
  
  trait ListProps extends StObject {
    
    var children: js.UndefOr[
        js.Function3[
          /* fields */ js.Array[ListField], 
          /* operations */ ListOperations, 
          /* meta */ Meta, 
          Element | ReactNode
        ]
      ] = js.undefined
    
    var initialValue: js.UndefOr[js.Array[Any]] = js.undefined
    
    var name: NamePath
    
    var rules: js.UndefOr[js.Array[ValidatorRule]] = js.undefined
    
    var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.undefined
  }
  object ListProps {
    
    inline def apply(name: NamePath): ListProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListProps]
    }
    
    extension [Self <: ListProps](x: Self) {
      
      inline def setChildren(
        value: (/* fields */ js.Array[ListField], /* operations */ ListOperations, /* meta */ Meta) => Element | ReactNode
      ): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialValue(value: js.Array[Any]): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setInitialValueVarargs(value: Any*): Self = StObject.set(x, "initialValue", js.Array(value*))
      
      inline def setName(value: NamePath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value*))
      
      inline def setRules(value: js.Array[ValidatorRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: ValidatorRule*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setValidateTrigger(value: String | js.Array[String] | `false`): Self = StObject.set(x, "validateTrigger", value.asInstanceOf[js.Any])
      
      inline def setValidateTriggerUndefined: Self = StObject.set(x, "validateTrigger", js.undefined)
      
      inline def setValidateTriggerVarargs(value: String*): Self = StObject.set(x, "validateTrigger", js.Array(value*))
    }
  }
  
  type _To = FunctionComponent[ListProps]
  
  /* This means you don't have to write `default`, but can instead just say `esListMod.foo` */
  override def _to: FunctionComponent[ListProps] = default
}
