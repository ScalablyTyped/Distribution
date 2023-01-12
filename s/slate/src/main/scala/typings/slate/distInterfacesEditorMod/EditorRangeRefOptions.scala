package typings.slate.distInterfacesEditorMod

import typings.slate.distInterfacesTypesMod.RangeDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorRangeRefOptions extends StObject {
  
  var affinity: js.UndefOr[RangeDirection | Null] = js.undefined
}
object EditorRangeRefOptions {
  
  inline def apply(): EditorRangeRefOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorRangeRefOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorRangeRefOptions] (val x: Self) extends AnyVal {
    
    inline def setAffinity(value: RangeDirection): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
    
    inline def setAffinityNull: Self = StObject.set(x, "affinity", null)
    
    inline def setAffinityUndefined: Self = StObject.set(x, "affinity", js.undefined)
  }
}
