package typings.slate.distInterfacesEditorMod

import typings.slate.distTypesTypesMod.TextDirection
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorFragmentDeletionOptions] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: TextDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
  }
}
