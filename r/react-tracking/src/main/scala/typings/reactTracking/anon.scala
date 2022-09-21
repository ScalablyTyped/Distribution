package typings.reactTracking

import typings.react.mod.ReactNode
import typings.reactTracking.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: js.UndefOr[js.Object] = js.undefined
  }
  object Data {
    
    inline def apply(): Data = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  /* Inlined react.react.PropsWithChildren<{}> */
  trait PropsWithChildren extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object PropsWithChildren {
    
    inline def apply(): PropsWithChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropsWithChildren]
    }
    
    extension [Self <: PropsWithChildren](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait Tracking[T] extends StObject {
    
    var tracking: Options[T] & Data
  }
  object Tracking {
    
    inline def apply[T](tracking: Options[T] & Data): Tracking[T] = {
      val __obj = js.Dynamic.literal(tracking = tracking.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tracking[T]]
    }
    
    extension [Self <: Tracking[?], T](x: Self & Tracking[T]) {
      
      inline def setTracking(value: Options[T] & Data): Self = StObject.set(x, "tracking", value.asInstanceOf[js.Any])
    }
  }
}
