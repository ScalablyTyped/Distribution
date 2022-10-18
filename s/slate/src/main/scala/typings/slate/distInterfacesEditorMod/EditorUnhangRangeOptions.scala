package typings.slate.distInterfacesEditorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorUnhangRangeOptions extends StObject {
  
  var voids: js.UndefOr[Boolean] = js.undefined
}
object EditorUnhangRangeOptions {
  
  inline def apply(): EditorUnhangRangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorUnhangRangeOptions]
  }
  
  extension [Self <: EditorUnhangRangeOptions](x: Self) {
    
    inline def setVoids(value: Boolean): Self = StObject.set(x, "voids", value.asInstanceOf[js.Any])
    
    inline def setVoidsUndefined: Self = StObject.set(x, "voids", js.undefined)
  }
}
