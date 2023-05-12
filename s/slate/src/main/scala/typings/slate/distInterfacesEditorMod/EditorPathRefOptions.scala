package typings.slate.distInterfacesEditorMod

import typings.slate.distTypesTypesMod.TextDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorPathRefOptions extends StObject {
  
  var affinity: js.UndefOr[TextDirection | Null] = js.undefined
}
object EditorPathRefOptions {
  
  inline def apply(): EditorPathRefOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorPathRefOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorPathRefOptions] (val x: Self) extends AnyVal {
    
    inline def setAffinity(value: TextDirection): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
    
    inline def setAffinityNull: Self = StObject.set(x, "affinity", null)
    
    inline def setAffinityUndefined: Self = StObject.set(x, "affinity", js.undefined)
  }
}
