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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Accepted] (val x: Self) extends AnyVal {
      
      inline def setAccepted(value: Boolean): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
      
      inline def setX(value: js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value*))
    }
  }
  
  trait Chi2 extends StObject {
    
    var chi2: Double
    
    var passed: Boolean
  }
  object Chi2 {
    
    inline def apply(chi2: Double, passed: Boolean): Chi2 = {
      val __obj = js.Dynamic.literal(chi2 = chi2.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chi2]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Chi2] (val x: Self) extends AnyVal {
      
      inline def setChi2(value: Double): Self = StObject.set(x, "chi2", value.asInstanceOf[js.Any])
      
      inline def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Closed] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cv] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: D] (val x: Self) extends AnyVal {
      
      inline def setD(value: Matrix): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      inline def setL(value: Matrix): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dim extends StObject {
    
    var dim: js.UndefOr[Double] = js.undefined
    
    var maxHistory: js.UndefOr[Double] = js.undefined
  }
  object Dim {
    
    inline def apply(): Dim = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dim]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dim] (val x: Self) extends AnyVal {
      
      inline def setDim(value: Double): Self = StObject.set(x, "dim", value.asInstanceOf[js.Any])
      
      inline def setDimUndefined: Self = StObject.set(x, "dim", js.undefined)
      
      inline def setMaxHistory(value: Double): Self = StObject.set(x, "maxHistory", value.asInstanceOf[js.Any])
      
      inline def setMaxHistoryUndefined: Self = StObject.set(x, "maxHistory", js.undefined)
    }
  }
  
  trait Passed extends StObject {
    
    var U: Double
    
    var passed: Boolean
  }
  object Passed {
    
    inline def apply(U: Double, passed: Boolean): Passed = {
      val __obj = js.Dynamic.literal(U = U.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Passed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Passed] (val x: Self) extends AnyVal {
      
      inline def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
      
      inline def setU(value: Double): Self = StObject.set(x, "U", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rate extends StObject {
    
    var rate: Double
    
    var weight: Double
  }
  object Rate {
    
    inline def apply(rate: Double, weight: Double): Rate = {
      val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rate] (val x: Self) extends AnyVal {
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
  
  trait Statistics extends StObject {
    
    var passed: Boolean
    
    var statistics: Double
  }
  object Statistics {
    
    inline def apply(passed: Boolean, statistics: Double): Statistics = {
      val __obj = js.Dynamic.literal(passed = passed.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
      __obj.asInstanceOf[Statistics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Statistics] (val x: Self) extends AnyVal {
      
      inline def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
      
      inline def setStatistics(value: Double): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    }
  }
}
