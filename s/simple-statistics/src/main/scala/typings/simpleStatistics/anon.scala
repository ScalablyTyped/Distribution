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
    
    @scala.inline
    def apply(b: Double, m: Double): B = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any])
      __obj.asInstanceOf[B]
    }
    
    @scala.inline
    implicit class BMutableBuilder[Self <: B] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    }
  }
  
  trait M extends StObject {
    
    var b: Double
    
    var m: Double
  }
  object M {
    
    @scala.inline
    def apply(b: Double, m: Double): M = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any])
      __obj.asInstanceOf[M]
    }
    
    @scala.inline
    implicit class MMutableBuilder[Self <: M] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    }
  }
}
