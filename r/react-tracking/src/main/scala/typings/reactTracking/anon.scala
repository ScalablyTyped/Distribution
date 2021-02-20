package typings.reactTracking

import typings.reactTracking.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Data extends StObject {
    
    var data: js.UndefOr[js.Object] = js.native
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
  
  @js.native
  trait Tracking[T] extends StObject {
    
    var tracking: Options[T] with Data = js.native
  }
  object Tracking {
    
    @scala.inline
    def apply[T](tracking: Options[T] with Data): Tracking[T] = {
      val __obj = js.Dynamic.literal(tracking = tracking.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tracking[T]]
    }
    
    @scala.inline
    implicit class TrackingMutableBuilder[Self <: Tracking[_], T] (val x: Self with Tracking[T]) extends AnyVal {
      
      @scala.inline
      def setTracking(value: Options[T] with Data): Self = StObject.set(x, "tracking", value.asInstanceOf[js.Any])
    }
  }
}
