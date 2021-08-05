package typings.reactNativeSortableGrid

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.Animated.AnimatedInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DeleteModeOn extends StObject {
    
    var deleteModeOn: Boolean
  }
  object DeleteModeOn {
    
    inline def apply(deleteModeOn: Boolean): DeleteModeOn = {
      val __obj = js.Dynamic.literal(deleteModeOn = deleteModeOn.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteModeOn]
    }
    
    extension [Self <: DeleteModeOn](x: Self) {
      
      inline def setDeleteModeOn(value: Boolean): Self = StObject.set(x, "deleteModeOn", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transform extends StObject {
    
    var transform: js.Array[StringDictionary[AnimatedInterpolation]]
  }
  object Transform {
    
    inline def apply(transform: js.Array[StringDictionary[AnimatedInterpolation]]): Transform = {
      val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transform]
    }
    
    extension [Self <: Transform](x: Self) {
      
      inline def setTransform(value: js.Array[StringDictionary[AnimatedInterpolation]]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformVarargs(value: StringDictionary[AnimatedInterpolation]*): Self = StObject.set(x, "transform", js.Array(value :_*))
    }
  }
}
