package typings.reactVis.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Axes extends StObject {
  
  var axes: js.UndefOr[CSSProperties] = js.native
  
  var labels: js.UndefOr[CSSProperties] = js.native
  
  var polygons: js.UndefOr[CSSProperties] = js.native
}
object Axes {
  
  @scala.inline
  def apply(): Axes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Axes]
  }
  
  @scala.inline
  implicit class AxesMutableBuilder[Self <: Axes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxes(value: CSSProperties): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    @scala.inline
    def setLabels(value: CSSProperties): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setPolygons(value: CSSProperties): Self = StObject.set(x, "polygons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonsUndefined: Self = StObject.set(x, "polygons", js.undefined)
  }
}
