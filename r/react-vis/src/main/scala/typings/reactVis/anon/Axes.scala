package typings.reactVis.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Axes extends StObject {
  
  var axes: js.UndefOr[CSSProperties] = js.undefined
  
  var labels: js.UndefOr[CSSProperties] = js.undefined
  
  var polygons: js.UndefOr[CSSProperties] = js.undefined
}
object Axes {
  
  inline def apply(): Axes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Axes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Axes] (val x: Self) extends AnyVal {
    
    inline def setAxes(value: CSSProperties): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    inline def setLabels(value: CSSProperties): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setPolygons(value: CSSProperties): Self = StObject.set(x, "polygons", value.asInstanceOf[js.Any])
    
    inline def setPolygonsUndefined: Self = StObject.set(x, "polygons", js.undefined)
  }
}
