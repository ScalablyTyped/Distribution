package typings.psi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Category extends StObject {
    
    var category: String
    
    var distributions: js.Array[Max]
    
    var percentile: Double
  }
  object Category {
    
    inline def apply(category: String, distributions: js.Array[Max], percentile: Double): Category = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], distributions = distributions.asInstanceOf[js.Any], percentile = percentile.asInstanceOf[js.Any])
      __obj.asInstanceOf[Category]
    }
    
    extension [Self <: Category](x: Self) {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setDistributions(value: js.Array[Max]): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
      
      inline def setDistributionsVarargs(value: Max*): Self = StObject.set(x, "distributions", js.Array(value :_*))
      
      inline def setPercentile(value: Double): Self = StObject.set(x, "percentile", value.asInstanceOf[js.Any])
    }
  }
  
  trait Max extends StObject {
    
    var max: Double
    
    var min: Double
    
    var proportion: Double
  }
  object Max {
    
    inline def apply(max: Double, min: Double, proportion: Double): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], proportion = proportion.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setProportion(value: Double): Self = StObject.set(x, "proportion", value.asInstanceOf[js.Any])
    }
  }
}
