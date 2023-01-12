package typings.reactRemoveScroll

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Action extends StObject {
    
    var action: String
    
    var coords: Unit
  }
  object Action {
    
    inline def apply(action: String, coords: Unit): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], coords = coords.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setCoords(value: Unit): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    }
  }
  
  trait Coords extends StObject {
    
    var action: String
    
    var coords: js.Array[Double]
  }
  object Coords {
    
    inline def apply(action: String, coords: js.Array[Double]): Coords = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], coords = coords.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coords]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Coords] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setCoords(value: js.Array[Double]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setCoordsVarargs(value: Double*): Self = StObject.set(x, "coords", js.Array(value*))
    }
  }
  
  trait FullWidth extends StObject {
    
    var fullWidth: String
    
    var zeroRight: String
  }
  object FullWidth {
    
    inline def apply(fullWidth: String, zeroRight: String): FullWidth = {
      val __obj = js.Dynamic.literal(fullWidth = fullWidth.asInstanceOf[js.Any], zeroRight = zeroRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullWidth]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FullWidth] (val x: Self) extends AnyVal {
      
      inline def setFullWidth(value: String): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setZeroRight(value: String): Self = StObject.set(x, "zeroRight", value.asInstanceOf[js.Any])
    }
  }
  
  trait Passive extends StObject {
    
    var passive: Boolean
  }
  object Passive {
    
    inline def apply(passive: Boolean): Passive = {
      val __obj = js.Dynamic.literal(passive = passive.asInstanceOf[js.Any])
      __obj.asInstanceOf[Passive]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Passive] (val x: Self) extends AnyVal {
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
    }
  }
  
  trait SideCar extends StObject {
    
    var sideCar: FC[Any]
  }
  object SideCar {
    
    inline def apply(sideCar: FC[Any]): SideCar = {
      val __obj = js.Dynamic.literal(sideCar = sideCar.asInstanceOf[js.Any])
      __obj.asInstanceOf[SideCar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SideCar] (val x: Self) extends AnyVal {
      
      inline def setSideCar(value: FC[Any]): Self = StObject.set(x, "sideCar", value.asInstanceOf[js.Any])
    }
  }
}
