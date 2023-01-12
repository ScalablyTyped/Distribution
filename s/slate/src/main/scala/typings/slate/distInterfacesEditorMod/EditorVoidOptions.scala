package typings.slate.distInterfacesEditorMod

import typings.slate.distInterfacesLocationMod.Location
import typings.slate.distInterfacesTypesMod.MaximizeMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorVoidOptions extends StObject {
  
  var at: js.UndefOr[Location] = js.undefined
  
  var mode: js.UndefOr[MaximizeMode] = js.undefined
  
  var voids: js.UndefOr[Boolean] = js.undefined
}
object EditorVoidOptions {
  
  inline def apply(): EditorVoidOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorVoidOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorVoidOptions] (val x: Self) extends AnyVal {
    
    inline def setAt(value: Location): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    inline def setAtVarargs(value: Double*): Self = StObject.set(x, "at", js.Array(value*))
    
    inline def setMode(value: MaximizeMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setVoids(value: Boolean): Self = StObject.set(x, "voids", value.asInstanceOf[js.Any])
    
    inline def setVoidsUndefined: Self = StObject.set(x, "voids", js.undefined)
  }
}
