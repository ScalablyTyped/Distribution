package typings.slate.distInterfacesEditorMod

import typings.slate.distInterfacesTypesMod.TextUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorDirectedDeletionOptions extends StObject {
  
  var unit: js.UndefOr[TextUnit] = js.undefined
}
object EditorDirectedDeletionOptions {
  
  inline def apply(): EditorDirectedDeletionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorDirectedDeletionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorDirectedDeletionOptions] (val x: Self) extends AnyVal {
    
    inline def setUnit(value: TextUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
