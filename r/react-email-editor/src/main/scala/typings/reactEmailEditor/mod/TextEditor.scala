package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEditor extends StObject {
  
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
  implicit class TextEditorMutableBuilder[Self <: TextEditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCleanPaste(value: Boolean): Self = StObject.set(x, "cleanPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCleanPasteUndefined: Self = StObject.set(x, "cleanPaste", js.undefined)
    
    @scala.inline
    def setEmojis(value: Boolean): Self = StObject.set(x, "emojis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmojisUndefined: Self = StObject.set(x, "emojis", js.undefined)
    
    @scala.inline
    def setSpellChecker(value: Boolean): Self = StObject.set(x, "spellChecker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellCheckerUndefined: Self = StObject.set(x, "spellChecker", js.undefined)
    
    @scala.inline
    def setTables(value: Boolean): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
  }
}
