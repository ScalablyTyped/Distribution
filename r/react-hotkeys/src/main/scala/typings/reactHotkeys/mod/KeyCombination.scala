package typings.reactHotkeys.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyCombination extends StObject {
  
  /**
    * Id of combination that could be used to define a keymap
    */
  var id: MouseTrapKeySequence
  
  /**
    * Dictionary of keys involved in the combination
    */
  var keys: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-hotkeys.react-hotkeys.KeyName ]: true}
    */ typings.reactHotkeys.reactHotkeysStrings.KeyCombination & TopLevel[js.Any]
}
object KeyCombination {
  
  inline def apply(
    id: MouseTrapKeySequence,
    keys: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-hotkeys.react-hotkeys.KeyName ]: true}
    */ typings.reactHotkeys.reactHotkeysStrings.KeyCombination & TopLevel[js.Any]
  ): KeyCombination = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCombination]
  }
  
  extension [Self <: KeyCombination](x: Self) {
    
    inline def setId(value: MouseTrapKeySequence): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdVarargs(value: String*): Self = StObject.set(x, "id", js.Array(value :_*))
    
    inline def setKeys(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in react-hotkeys.react-hotkeys.KeyName ]: true}
      */ typings.reactHotkeys.reactHotkeysStrings.KeyCombination & TopLevel[js.Any]
    ): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
  }
}
