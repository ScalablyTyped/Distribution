package typings.reactVega

import typings.vegaEmbed.mod.VisualizationSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject
  
  trait Height extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var spec: VisualizationSpec
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Height {
    
    inline def apply(spec: VisualizationSpec): Height = {
      val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSpec(value: VisualizationSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Mode extends StObject {
    
    var mode: js.UndefOr[typings.vegaEmbed.mod.Mode] = js.undefined
    
    var spec: VisualizationSpec
  }
  object Mode {
    
    inline def apply(spec: VisualizationSpec): Mode = {
      val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mode]
    }
    
    extension [Self <: Mode](x: Self) {
      
      inline def setMode(value: typings.vegaEmbed.mod.Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setSpec(value: VisualizationSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
}
