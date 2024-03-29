package typings.quaternion

import typings.quaternion.mod.QuaternionRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Pitch extends StObject {
    
    var pitch: Double
    
    var roll: Double
    
    var yaw: Double
  }
  object Pitch {
    
    inline def apply(pitch: Double, roll: Double, yaw: Double): Pitch = {
      val __obj = js.Dynamic.literal(pitch = pitch.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any], yaw = yaw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pitch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pitch] (val x: Self) extends AnyVal {
      
      inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
      
      inline def setRoll(value: Double): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
      
      inline def setYaw(value: Double): Self = StObject.set(x, "yaw", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  w :number} & {  w :number | undefined,   x :number | undefined,   y :number | undefined,   z :number | undefined} */
  trait wnumberwnumberundefinedxn
    extends StObject
       with QuaternionRecord {
    
    var w: Double
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
    
    var z: js.UndefOr[Double] = js.undefined
  }
  object wnumberwnumberundefinedxn {
    
    inline def apply(w: Double): wnumberwnumberundefinedxn = {
      val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[wnumberwnumberundefinedxn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: wnumberwnumberundefinedxn] (val x: Self) extends AnyVal {
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
  
  /* Inlined {  x :number} & {  w :number | undefined,   x :number | undefined,   y :number | undefined,   z :number | undefined} */
  trait xnumberwnumberundefinedxn
    extends StObject
       with QuaternionRecord {
    
    var w: js.UndefOr[Double] = js.undefined
    
    var x: Double
    
    var y: js.UndefOr[Double] = js.undefined
    
    var z: js.UndefOr[Double] = js.undefined
  }
  object xnumberwnumberundefinedxn {
    
    inline def apply(x: Double): xnumberwnumberundefinedxn = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[xnumberwnumberundefinedxn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: xnumberwnumberundefinedxn] (val x: Self) extends AnyVal {
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
  
  /* Inlined {  y :number} & {  w :number | undefined,   x :number | undefined,   y :number | undefined,   z :number | undefined} */
  trait ynumberwnumberundefinedxn
    extends StObject
       with QuaternionRecord {
    
    var w: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: Double
    
    var z: js.UndefOr[Double] = js.undefined
  }
  object ynumberwnumberundefinedxn {
    
    inline def apply(y: Double): ynumberwnumberundefinedxn = {
      val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ynumberwnumberundefinedxn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ynumberwnumberundefinedxn] (val x: Self) extends AnyVal {
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
  
  /* Inlined {  z :number} & {  w :number | undefined,   x :number | undefined,   y :number | undefined,   z :number | undefined} */
  trait znumberwnumberundefinedxn
    extends StObject
       with QuaternionRecord {
    
    var w: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
    
    var z: Double
  }
  object znumberwnumberundefinedxn {
    
    inline def apply(z: Double): znumberwnumberundefinedxn = {
      val __obj = js.Dynamic.literal(z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[znumberwnumberundefinedxn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: znumberwnumberundefinedxn] (val x: Self) extends AnyVal {
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
}
