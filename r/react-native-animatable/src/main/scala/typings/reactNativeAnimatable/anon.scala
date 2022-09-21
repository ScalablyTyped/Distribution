package typings.reactNativeAnimatable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Finished extends StObject {
    
    var finished: Boolean
  }
  object Finished {
    
    inline def apply(finished: Boolean): Finished = {
      val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any])
      __obj.asInstanceOf[Finished]
    }
    
    extension [Self <: Finished](x: Self) {
      
      inline def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    }
  }
  
  trait Style extends StObject {
    
    var style: js.UndefOr[Any] = js.undefined
  }
  object Style {
    
    inline def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    extension [Self <: Style](x: Self) {
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
