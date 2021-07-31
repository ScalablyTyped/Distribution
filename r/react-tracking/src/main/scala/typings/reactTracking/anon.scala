package typings.reactTracking

import typings.reactTracking.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: js.UndefOr[js.Object] = js.undefined
  }
  object Data {
    
    @scala.inline
    def apply(): Data = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  trait Tracking[T] extends StObject {
    
    var tracking: Options[T] & Data
  }
  object Tracking {
    
    @scala.inline
    def apply[T](tracking: Options[T] & Data): Tracking[T] = {
      val __obj = js.Dynamic.literal(tracking = tracking.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tracking[T]]
    }
    
    @scala.inline
    implicit class TrackingMutableBuilder[Self <: Tracking[?], T] (val x: Self & Tracking[T]) extends AnyVal {
      
      @scala.inline
      def setTracking(value: Options[T] & Data): Self = StObject.set(x, "tracking", value.asInstanceOf[js.Any])
    }
  }
}
