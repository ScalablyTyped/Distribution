package typings.ranjs

import typings.ranjs.mod.la.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accepted extends StObject {
    
    var accepted: Boolean
    
    var x: js.Array[Double]
  }
  object Accepted {
    
    inline def apply(accepted: Boolean, x: js.Array[Double]): Accepted = {
      val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[Accepted]
    }
    
    extension [Self <: Accepted](x: Self) {
      
      inline def setAccepted(value: Boolean): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
      
      inline def setX(value: js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value*))
    }
  }
  
  trait Closed extends StObject {
    
    var closed: Boolean
    
    var value: Double
  }
  object Closed {
    
    inline def apply(closed: Boolean, value: Double): Closed = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Closed]
    }
    
    extension [Self <: Closed](x: Self) {
      
      inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cv extends StObject {
    
    var cv: Double
    
    var mean: Double
    
    var std: Double
  }
  object Cv {
    
    inline def apply(cv: Double, mean: Double, std: Double): Cv = {
      val __obj = js.Dynamic.literal(cv = cv.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], std = std.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cv]
    }
    
    extension [Self <: Cv](x: Self) {
      
      inline def setCv(value: Double): Self = StObject.set(x, "cv", value.asInstanceOf[js.Any])
      
      inline def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      inline def setStd(value: Double): Self = StObject.set(x, "std", value.asInstanceOf[js.Any])
    }
  }
  
  trait D extends StObject {
    
    var D: Matrix
    
    var L: Matrix
  }
  object D {
    
    inline def apply(D: Matrix, L: Matrix): D = {
      val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any])
      __obj.asInstanceOf[D]
    }
    
    extension [Self <: D](x: Self) {
      
      inline def setD(value: Matrix): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      inline def setL(value: Matrix): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
    }
  }
  
  trait Passed extends StObject {
    
    var passed: Boolean
    
    var statistics: Double
  }
  object Passed {
    
    inline def apply(passed: Boolean, statistics: Double): Passed = {
      val __obj = js.Dynamic.literal(passed = passed.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
      __obj.asInstanceOf[Passed]
    }
    
    extension [Self <: Passed](x: Self) {
      
      inline def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
      
      inline def setStatistics(value: Double): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    }
  }
}
