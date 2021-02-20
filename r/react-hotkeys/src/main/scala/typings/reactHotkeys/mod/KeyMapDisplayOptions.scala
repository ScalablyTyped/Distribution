package typings.reactHotkeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyMapDisplayOptions extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var sequences: js.Array[KeyMapOptions] = js.native
}
object KeyMapDisplayOptions {
  
  @scala.inline
  def apply(sequences: js.Array[KeyMapOptions]): KeyMapDisplayOptions = {
    val __obj = js.Dynamic.literal(sequences = sequences.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMapDisplayOptions]
  }
  
  @scala.inline
  implicit class KeyMapDisplayOptionsMutableBuilder[Self <: KeyMapDisplayOptions] (val x: Self) extends AnyVal {
    
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
    def setSequences(value: js.Array[KeyMapOptions]): Self = StObject.set(x, "sequences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequencesVarargs(value: KeyMapOptions*): Self = StObject.set(x, "sequences", js.Array(value :_*))
  }
}
