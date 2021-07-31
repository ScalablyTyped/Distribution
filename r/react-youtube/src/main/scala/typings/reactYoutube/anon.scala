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
    
    @scala.inline
    def apply(data: Double, target: js.Any): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Double): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataTarget extends StObject {
    
    var data: String
    
    var target: js.Any
  }
  object DataTarget {
    
    @scala.inline
    def apply(data: String, target: js.Any): DataTarget = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataTarget]
    }
    
    @scala.inline
    implicit class DataTargetMutableBuilder[Self <: DataTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait Target extends StObject {
    
    var target: js.Any
  }
  object Target {
    
    @scala.inline
    def apply(target: js.Any): Target = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    @scala.inline
    implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
