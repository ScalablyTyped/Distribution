package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEditor extends StObject {
  
  val cleanPaste: js.UndefOr[Boolean] = js.undefined
  
  val emojis: js.UndefOr[Boolean] = js.undefined
  
  val spellChecker: js.UndefOr[Boolean] = js.undefined
  
  val tables: js.UndefOr[Boolean] = js.undefined
}
object TextEditor {
  
  inline def apply(): TextEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextEditor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextEditor] (val x: Self) extends AnyVal {
    
    inline def setCleanPaste(value: Boolean): Self = StObject.set(x, "cleanPaste", value.asInstanceOf[js.Any])
    
    inline def setCleanPasteUndefined: Self = StObject.set(x, "cleanPaste", js.undefined)
    
    inline def setEmojis(value: Boolean): Self = StObject.set(x, "emojis", value.asInstanceOf[js.Any])
    
    inline def setEmojisUndefined: Self = StObject.set(x, "emojis", js.undefined)
    
    inline def setSpellChecker(value: Boolean): Self = StObject.set(x, "spellChecker", value.asInstanceOf[js.Any])
    
    inline def setSpellCheckerUndefined: Self = StObject.set(x, "spellChecker", js.undefined)
    
    inline def setTables(value: Boolean): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
  }
}
