package typings.slateReact

import typings.slateReact.anon.BaseRangeplaceholderstrin
import typings.slateReact.anon.BaseTextplaceholderstring
import typings.slateReact.reactEditorMod.ReactEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait CustomTypes extends StObject {
    
    var Editor: ReactEditor
    
    var Range: BaseRangeplaceholderstrin
    
    var Text: BaseTextplaceholderstring
  }
  object CustomTypes {
    
    inline def apply(Editor: ReactEditor, Range: BaseRangeplaceholderstrin, Text: BaseTextplaceholderstring): CustomTypes = {
      val __obj = js.Dynamic.literal(Editor = Editor.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomTypes]
    }
    
    extension [Self <: CustomTypes](x: Self) {
      
      inline def setEditor(value: ReactEditor): Self = StObject.set(x, "Editor", value.asInstanceOf[js.Any])
      
      inline def setRange(value: BaseRangeplaceholderstrin): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
      
      inline def setText(value: BaseTextplaceholderstring): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    }
  }
}
