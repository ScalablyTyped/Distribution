package typings.slateReact

import typings.react.mod.Context
import typings.slateReact.anon.Editor
import typings.slateReact.reactEditorMod.ReactEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSlateMod {
  
  @JSImport("slate-react/dist/hooks/use-slate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("slate-react/dist/hooks/use-slate", "SlateContext")
  @js.native
  val SlateContext: Context[Editor | Null] = js.native
  
  inline def useSlate(): typings.slate.editorMod.Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlate")().asInstanceOf[typings.slate.editorMod.Editor]
  
  inline def useSlateWithV(): Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlateWithV")().asInstanceOf[Editor]
  
  trait SlateContextValue extends StObject {
    
    var editor: ReactEditor
    
    var v: Double
  }
  object SlateContextValue {
    
    inline def apply(editor: ReactEditor, v: Double): SlateContextValue = {
      val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlateContextValue]
    }
    
    extension [Self <: SlateContextValue](x: Self) {
      
      inline def setEditor(value: ReactEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
}
