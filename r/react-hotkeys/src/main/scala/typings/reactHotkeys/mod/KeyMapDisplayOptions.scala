package typings.reactHotkeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyMapDisplayOptions extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var sequences: js.Array[KeyMapOptions]
}
object KeyMapDisplayOptions {
  
  inline def apply(sequences: js.Array[KeyMapOptions]): KeyMapDisplayOptions = {
    val __obj = js.Dynamic.literal(sequences = sequences.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMapDisplayOptions]
  }
  
  extension [Self <: KeyMapDisplayOptions](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSequences(value: js.Array[KeyMapOptions]): Self = StObject.set(x, "sequences", value.asInstanceOf[js.Any])
    
    inline def setSequencesVarargs(value: KeyMapOptions*): Self = StObject.set(x, "sequences", js.Array(value :_*))
  }
}
