package typings.reactHotkeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyMapOptions extends _KeySequence {
  
  var action: KeyEventName = js.native
  
  var sequence: MouseTrapKeySequence = js.native
}
object KeyMapOptions {
  
  @scala.inline
  def apply(action: KeyEventName, sequence: MouseTrapKeySequence): KeyMapOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMapOptions]
  }
  
  @scala.inline
  implicit class KeyMapOptionsOps[Self <: KeyMapOptions] (val x: Self) extends AnyVal {
    
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
    def setAction(value: KeyEventName): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceVarargs(value: String*): Self = this.set("sequence", js.Array(value :_*))
    
    @scala.inline
    def setSequence(value: MouseTrapKeySequence): Self = this.set("sequence", value.asInstanceOf[js.Any])
  }
}
