package typings.storybookComponents.typesPrettierIndexMod

import typings.storybookComponents.anon.Description
import typings.storybookComponents.anon.Since
import typings.storybookComponents.storybookComponentsStrings.choice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChoiceSupportOption[Value]
  extends StObject
     with BaseSupportOption[choice] {
  
  var default: js.UndefOr[Value | js.Array[Since[Value]]] = js.undefined
  
  var choices: js.Array[Description[Value]]
  
  @JSName("description")
  var description_ChoiceSupportOption: String
}
object ChoiceSupportOption {
  
  inline def apply[Value](category: String, choices: js.Array[Description[Value]], description: String, since: String): ChoiceSupportOption[Value] = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], choices = choices.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("choice")
    __obj.asInstanceOf[ChoiceSupportOption[Value]]
  }
  
  extension [Self <: ChoiceSupportOption[?], Value](x: Self & ChoiceSupportOption[Value]) {
    
    inline def setChoices(value: js.Array[Description[Value]]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    inline def setChoicesVarargs(value: Description[Value]*): Self = StObject.set(x, "choices", js.Array(value*))
    
    inline def setDefault(value: Value | js.Array[Since[Value]]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(value: Since[Value]*): Self = StObject.set(x, "default", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
  }
}
