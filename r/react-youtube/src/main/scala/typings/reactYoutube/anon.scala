package typings.reactYoutube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: Double
    
    var target: js.Any
  }
  object Data {
    
    inline def apply(data: Double, target: js.Any): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: Double): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataTarget extends StObject {
    
    var data: String
    
    var target: js.Any
  }
  object DataTarget {
    
    inline def apply(data: String, target: js.Any): DataTarget = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataTarget]
    }
    
    extension [Self <: DataTarget](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait Target extends StObject {
    
    var target: js.Any
  }
  object Target {
    
    inline def apply(target: js.Any): Target = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    extension [Self <: Target](x: Self) {
      
      inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
