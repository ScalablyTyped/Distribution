package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEditor extends js.Object {
  
  val cleanPaste: js.UndefOr[Boolean] = js.native
  
  val emojis: js.UndefOr[Boolean] = js.native
  
  val spellChecker: js.UndefOr[Boolean] = js.native
  
  val tables: js.UndefOr[Boolean] = js.native
}
object TextEditor {
  
  @scala.inline
  def apply(): TextEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextEditor]
  }
  
  @scala.inline
  implicit class TextEditorOps[Self <: TextEditor] (val x: Self) extends AnyVal {
    
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
    def setCleanPaste(value: Boolean): Self = this.set("cleanPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleanPaste: Self = this.set("cleanPaste", js.undefined)
    
    @scala.inline
    def setEmojis(value: Boolean): Self = this.set("emojis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmojis: Self = this.set("emojis", js.undefined)
    
    @scala.inline
    def setSpellChecker(value: Boolean): Self = this.set("spellChecker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellChecker: Self = this.set("spellChecker", js.undefined)
    
    @scala.inline
    def setTables(value: Boolean): Self = this.set("tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
  }
}
