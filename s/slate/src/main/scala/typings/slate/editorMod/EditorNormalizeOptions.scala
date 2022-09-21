package typings.slate.editorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorNormalizeOptions extends StObject {
  
  var force: js.UndefOr[Boolean] = js.undefined
}
object EditorNormalizeOptions {
  
  inline def apply(): EditorNormalizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorNormalizeOptions]
  }
  
  extension [Self <: EditorNormalizeOptions](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
  }
}
