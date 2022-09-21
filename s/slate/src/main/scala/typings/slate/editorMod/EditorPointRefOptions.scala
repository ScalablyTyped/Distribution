package typings.slate.editorMod

import typings.slate.typesMod.TextDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorPointRefOptions extends StObject {
  
  var affinity: js.UndefOr[TextDirection | Null] = js.undefined
}
object EditorPointRefOptions {
  
  inline def apply(): EditorPointRefOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorPointRefOptions]
  }
  
  extension [Self <: EditorPointRefOptions](x: Self) {
    
    inline def setAffinity(value: TextDirection): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
    
    inline def setAffinityNull: Self = StObject.set(x, "affinity", null)
    
    inline def setAffinityUndefined: Self = StObject.set(x, "affinity", js.undefined)
  }
}
