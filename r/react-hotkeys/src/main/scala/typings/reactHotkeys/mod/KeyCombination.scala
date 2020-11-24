package typings.reactHotkeys.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyCombination extends js.Object {
  
  /**
    * Id of combination that could be used to define a keymap
    */
  var id: MouseTrapKeySequence = js.native
  
  /**
    * Dictionary of keys involved in the combination
    */
  var keys: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-hotkeys.react-hotkeys.KeyName ]: true}
    */ typings.reactHotkeys.reactHotkeysStrings.KeyCombination with TopLevel[js.Any] = js.native
}
object KeyCombination {
  
  @scala.inline
  def apply(
    id: MouseTrapKeySequence,
    keys: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-hotkeys.react-hotkeys.KeyName ]: true}
    */ typings.reactHotkeys.reactHotkeysStrings.KeyCombination with TopLevel[js.Any]
  ): KeyCombination = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCombination]
  }
  
  @scala.inline
  implicit class KeyCombinationOps[Self <: KeyCombination] (val x: Self) extends AnyVal {
    
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
    def setIdVarargs(value: String*): Self = this.set("id", js.Array(value :_*))
    
    @scala.inline
    def setId(value: MouseTrapKeySequence): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeys(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in react-hotkeys.react-hotkeys.KeyName ]: true}
      */ typings.reactHotkeys.reactHotkeysStrings.KeyCombination with TopLevel[js.Any]
    ): Self = this.set("keys", value.asInstanceOf[js.Any])
  }
}
