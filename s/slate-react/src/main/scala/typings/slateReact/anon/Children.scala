package typings.slateReact.anon

import typings.react.mod.ReactNode
import typings.slate.distInterfacesNodeMod.Descendant
import typings.slateReact.distPluginReactEditorMod.ReactEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: ReactNode
  
  var editor: ReactEditor
  
  var onChange: js.UndefOr[js.Function1[/* value */ js.Array[Descendant], Unit]] = js.undefined
  
  var value: js.Array[Descendant]
}
object Children {
  
  inline def apply(editor: ReactEditor, value: js.Array[Descendant]): Children = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setEditor(value: ReactEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: /* value */ js.Array[Descendant] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setValue(value: js.Array[Descendant]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Descendant*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
