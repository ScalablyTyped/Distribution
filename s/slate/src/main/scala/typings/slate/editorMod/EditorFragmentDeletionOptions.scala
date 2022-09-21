package typings.slate.editorMod

import typings.slate.typesMod.TextDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorFragmentDeletionOptions extends StObject {
  
  var direction: js.UndefOr[TextDirection] = js.undefined
}
object EditorFragmentDeletionOptions {
  
  inline def apply(): EditorFragmentDeletionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorFragmentDeletionOptions]
  }
  
  extension [Self <: EditorFragmentDeletionOptions](x: Self) {
    
    inline def setDirection(value: TextDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
  }
}
