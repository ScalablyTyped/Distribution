package typings.slate.distInterfacesEditorMod

import typings.slate.distTypesTypesMod.TextUnitAdjustment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorAfterOptions extends StObject {
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var unit: js.UndefOr[TextUnitAdjustment] = js.undefined
  
  var voids: js.UndefOr[Boolean] = js.undefined
}
object EditorAfterOptions {
  
  inline def apply(): EditorAfterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorAfterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorAfterOptions] (val x: Self) extends AnyVal {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setUnit(value: TextUnitAdjustment): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setVoids(value: Boolean): Self = StObject.set(x, "voids", value.asInstanceOf[js.Any])
    
    inline def setVoidsUndefined: Self = StObject.set(x, "voids", js.undefined)
  }
}
