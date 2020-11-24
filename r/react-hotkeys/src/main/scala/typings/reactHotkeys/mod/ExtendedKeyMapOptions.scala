package typings.reactHotkeys.mod

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
  implicit class ExtendedKeyMapOptionsOps[Self <: ExtendedKeyMapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSequencesVarargs(value: (KeyMapOptions | MouseTrapKeySequence)*): Self = this.set("sequences", js.Array(value :_*))
    
    @scala.inline
    def setSequences(value: js.Array[KeyMapOptions | MouseTrapKeySequence]): Self = this.set("sequences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
