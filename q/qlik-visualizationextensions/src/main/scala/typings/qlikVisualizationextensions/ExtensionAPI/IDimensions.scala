package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.dimensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDimensions extends StObject {
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var uses: dimensions
}
object IDimensions {
  
  @scala.inline
  def apply(): IDimensions = {
    val __obj = js.Dynamic.literal(uses = "dimensions")
    __obj.asInstanceOf[IDimensions]
  }
  
  @scala.inline
  implicit class IDimensionsMutableBuilder[Self <: IDimensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setUses(value: dimensions): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
  }
}
