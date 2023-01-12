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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteModeOn] (val x: Self) extends AnyVal {
      
      inline def setDeleteModeOn(value: Boolean): Self = StObject.set(x, "deleteModeOn", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transform extends StObject {
    
    var transform: js.Array[StringDictionary[AnimatedInterpolation[Double | String]]]
  }
  object Transform {
    
    inline def apply(transform: js.Array[StringDictionary[AnimatedInterpolation[Double | String]]]): Transform = {
      val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transform]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
      
      inline def setTransform(value: js.Array[StringDictionary[AnimatedInterpolation[Double | String]]]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformVarargs(value: (StringDictionary[AnimatedInterpolation[Double | String]])*): Self = StObject.set(x, "transform", js.Array(value*))
    }
  }
}
