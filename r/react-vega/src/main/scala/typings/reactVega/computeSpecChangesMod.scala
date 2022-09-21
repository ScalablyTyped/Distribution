package typings.reactVega

import typings.reactVega.reactVegaBooleans.`false`
import typings.vegaEmbed.mod.VisualizationSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeSpecChangesMod {
  
  @JSImport("react-vega/lib/utils/computeSpecChanges", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(newSpec: VisualizationSpec, oldSpec: VisualizationSpec): `false` | SpecChanges = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(newSpec.asInstanceOf[js.Any], oldSpec.asInstanceOf[js.Any])).asInstanceOf[`false` | SpecChanges]
  
  trait SpecChanges extends StObject {
    
    var height: `false` | Double
    
    var isExpensive: Boolean
    
    var width: `false` | Double
  }
  object SpecChanges {
    
    inline def apply(height: `false` | Double, isExpensive: Boolean, width: `false` | Double): SpecChanges = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], isExpensive = isExpensive.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpecChanges]
    }
    
    extension [Self <: SpecChanges](x: Self) {
      
      inline def setHeight(value: `false` | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsExpensive(value: Boolean): Self = StObject.set(x, "isExpensive", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: `false` | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
