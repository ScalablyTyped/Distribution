package typings.slateReact.anon

import typings.slateReact.reactEditorMod.ReactEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Editor extends StObject {
  
  var editor: ReactEditor
  
  var v: Double
}
object Editor {
  
  inline def apply(editor: ReactEditor, v: Double): Editor = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editor]
  }
  
  extension [Self <: Editor](x: Self) {
    
    inline def setEditor(value: ReactEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
