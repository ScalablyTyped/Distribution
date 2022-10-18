package typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateOptions extends StObject {
  
  /**
    * Recursive validate. It will validate all the name path that contains the provided one.
    * e.g. ['a'] will validate ['a'] , ['a', 'b'] and ['a', 1].
    */
  var recursive: js.UndefOr[Boolean] = js.undefined
  
  var triggerName: js.UndefOr[String] = js.undefined
  
  var validateMessages: js.UndefOr[ValidateMessages] = js.undefined
}
object ValidateOptions {
  
  inline def apply(): ValidateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateOptions]
  }
  
  extension [Self <: ValidateOptions](x: Self) {
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    inline def setTriggerName(value: String): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
    
    inline def setTriggerNameUndefined: Self = StObject.set(x, "triggerName", js.undefined)
    
    inline def setValidateMessages(value: ValidateMessages): Self = StObject.set(x, "validateMessages", value.asInstanceOf[js.Any])
    
    inline def setValidateMessagesUndefined: Self = StObject.set(x, "validateMessages", js.undefined)
  }
}
