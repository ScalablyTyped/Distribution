package typings.slate.editorMod

import typings.slate.typesMod.TextUnitAdjustment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorBeforeOptions extends StObject {
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var unit: js.UndefOr[TextUnitAdjustment] = js.undefined
  
  var voids: js.UndefOr[Boolean] = js.undefined
}
object EditorBeforeOptions {
  
  inline def apply(): EditorBeforeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorBeforeOptions]
  }
  
  extension [Self <: EditorBeforeOptions](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setUnit(value: TextUnitAdjustment): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setVoids(value: Boolean): Self = StObject.set(x, "voids", value.asInstanceOf[js.Any])
    
    inline def setVoidsUndefined: Self = StObject.set(x, "voids", js.undefined)
  }
}
