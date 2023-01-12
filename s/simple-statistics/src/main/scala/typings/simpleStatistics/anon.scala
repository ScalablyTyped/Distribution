package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait B extends StObject {
    
    var b: Double
    
    var m: Double
  }
  object B {
    
    inline def apply(b: Double, m: Double): B = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any])
      __obj.asInstanceOf[B]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: B] (val x: Self) extends AnyVal {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    }
  }
  
  trait Centroids extends StObject {
    
    var centroids: js.Array[js.Array[Double]]
    
    var labels: js.Array[Double]
  }
  object Centroids {
    
    inline def apply(centroids: js.Array[js.Array[Double]], labels: js.Array[Double]): Centroids = {
      val __obj = js.Dynamic.literal(centroids = centroids.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any])
      __obj.asInstanceOf[Centroids]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Centroids] (val x: Self) extends AnyVal {
      
      inline def setCentroids(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "centroids", value.asInstanceOf[js.Any])
      
      inline def setCentroidsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "centroids", js.Array(value*))
      
      inline def setLabels(value: js.Array[Double]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsVarargs(value: Double*): Self = StObject.set(x, "labels", js.Array(value*))
    }
  }
  
  trait M extends StObject {
    
    var b: Double
    
    var m: Double
  }
  object M {
    
    inline def apply(b: Double, m: Double): M = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any])
      __obj.asInstanceOf[M]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: M] (val x: Self) extends AnyVal {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    }
  }
}
