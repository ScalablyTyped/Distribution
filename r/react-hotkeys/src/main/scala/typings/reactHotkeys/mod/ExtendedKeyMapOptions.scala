package typings.reactHotkeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactHotkeys.mod._KeySequence because Already inherited */ trait ExtendedKeyMapOptions
  extends StObject
     with KeyMapOptions {
  
  var description: js.UndefOr[String] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var sequences: js.Array[KeyMapOptions | MouseTrapKeySequence]
}
object ExtendedKeyMapOptions {
  
  inline def apply(
    action: KeyEventName,
    sequence: MouseTrapKeySequence,
    sequences: js.Array[KeyMapOptions | MouseTrapKeySequence]
  ): ExtendedKeyMapOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], sequences = sequences.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedKeyMapOptions]
  }
  
  extension [Self <: ExtendedKeyMapOptions](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSequences(value: js.Array[KeyMapOptions | MouseTrapKeySequence]): Self = StObject.set(x, "sequences", value.asInstanceOf[js.Any])
    
    inline def setSequencesVarargs(value: (KeyMapOptions | MouseTrapKeySequence)*): Self = StObject.set(x, "sequences", js.Array(value :_*))
  }
}
