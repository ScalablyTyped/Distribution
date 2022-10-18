package typings.slateReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange extends StObject {
  
  def onChange(editor: typings.slate.distInterfacesEditorMod.Editor): Unit
  
  var selectorContext: GetSlate
}
object OnChange {
  
  inline def apply(onChange: typings.slate.distInterfacesEditorMod.Editor => Unit, selectorContext: GetSlate): OnChange = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), selectorContext = selectorContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChange]
  }
  
  extension [Self <: OnChange](x: Self) {
    
    inline def setOnChange(value: typings.slate.distInterfacesEditorMod.Editor => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setSelectorContext(value: GetSlate): Self = StObject.set(x, "selectorContext", value.asInstanceOf[js.Any])
  }
}
