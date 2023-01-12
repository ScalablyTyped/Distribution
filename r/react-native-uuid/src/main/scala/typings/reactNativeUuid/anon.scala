package typings.reactNativeUuid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Clockseq extends StObject {
    
    var clockseq: Double
    
    var msecs: Double
    
    var node: js.Array[Double]
    
    var nsecs: Double
    
    var random: js.Array[Double]
    
    def rng(): js.Array[Double]
  }
  object Clockseq {
    
    inline def apply(
      clockseq: Double,
      msecs: Double,
      node: js.Array[Double],
      nsecs: Double,
      random: js.Array[Double],
      rng: () => js.Array[Double]
    ): Clockseq = {
      val __obj = js.Dynamic.literal(clockseq = clockseq.asInstanceOf[js.Any], msecs = msecs.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nsecs = nsecs.asInstanceOf[js.Any], random = random.asInstanceOf[js.Any], rng = js.Any.fromFunction0(rng))
      __obj.asInstanceOf[Clockseq]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Clockseq] (val x: Self) extends AnyVal {
      
      inline def setClockseq(value: Double): Self = StObject.set(x, "clockseq", value.asInstanceOf[js.Any])
      
      inline def setMsecs(value: Double): Self = StObject.set(x, "msecs", value.asInstanceOf[js.Any])
      
      inline def setNode(value: js.Array[Double]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeVarargs(value: Double*): Self = StObject.set(x, "node", js.Array(value*))
      
      inline def setNsecs(value: Double): Self = StObject.set(x, "nsecs", value.asInstanceOf[js.Any])
      
      inline def setRandom(value: js.Array[Double]): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      inline def setRandomVarargs(value: Double*): Self = StObject.set(x, "random", js.Array(value*))
      
      inline def setRng(value: () => js.Array[Double]): Self = StObject.set(x, "rng", js.Any.fromFunction0(value))
    }
  }
  
  trait Random extends StObject {
    
    var random: js.Array[Double]
    
    var rng: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
  }
  object Random {
    
    inline def apply(random: js.Array[Double]): Random = {
      val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any])
      __obj.asInstanceOf[Random]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Random] (val x: Self) extends AnyVal {
      
      inline def setRandom(value: js.Array[Double]): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      inline def setRandomVarargs(value: Double*): Self = StObject.set(x, "random", js.Array(value*))
      
      inline def setRng(value: () => js.Array[Double]): Self = StObject.set(x, "rng", js.Any.fromFunction0(value))
      
      inline def setRngUndefined: Self = StObject.set(x, "rng", js.undefined)
    }
  }
}
