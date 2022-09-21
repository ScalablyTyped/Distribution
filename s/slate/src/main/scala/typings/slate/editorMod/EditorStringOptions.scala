package typings.slate.editorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorStringOptions extends StObject {
  
  var voids: js.UndefOr[Boolean] = js.undefined
}
object EditorStringOptions {
  
  inline def apply(): EditorStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorStringOptions]
  }
  
  extension [Self <: EditorStringOptions](x: Self) {
    
    inline def setVoids(value: Boolean): Self = StObject.set(x, "voids", value.asInstanceOf[js.Any])
    
    inline def setVoidsUndefined: Self = StObject.set(x, "voids", js.undefined)
  }
}
