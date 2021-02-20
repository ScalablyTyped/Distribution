package typings.reactHotkeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactHotkeys.mod._KeySequence because Already inherited */ @js.native
trait ExtendedKeyMapOptions extends KeyMapOptions {
  
  var description: js.UndefOr[String] = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var sequences: js.Array[KeyMapOptions | MouseTrapKeySequence] = js.native
}
object ExtendedKeyMapOptions {
  
  @scala.inline
  def apply(
    action: KeyEventName,
    sequence: MouseTrapKeySequence,
    sequences: js.Array[KeyMapOptions | MouseTrapKeySequence]
  ): ExtendedKeyMapOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], sequences = sequences.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedKeyMapOptions]
  }
  
  @scala.inline
  implicit class ExtendedKeyMapOptionsMutableBuilder[Self <: ExtendedKeyMapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSequences(value: js.Array[KeyMapOptions | MouseTrapKeySequence]): Self = StObject.set(x, "sequences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequencesVarargs(value: (KeyMapOptions | MouseTrapKeySequence)*): Self = StObject.set(x, "sequences", js.Array(value :_*))
  }
}
