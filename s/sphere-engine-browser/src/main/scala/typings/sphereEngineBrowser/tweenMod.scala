package typings.sphereEngineBrowser

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tweenMod {
  
  /**
    * Provides a means to adjust the numeric values of an object over time via interpolation.
    */
  @JSImport("tween", JSImport.Default)
  @js.native
  open class default[T /* <: js.Object */] protected ()
    extends StObject
       with Tween[T] {
    /**
      * Construct a new `Tween` that can be used to adjust a specified object.
      * @param object     Object to animate with this tween.
      * @param easingType Easing function to use; `Easing.Sine` if not specified.
      */
    def this(`object`: T) = this()
    def this(`object`: T, easingType: Easing) = this()
    
    /**
      * Adjust by easing in. This inverts the easing function and may look bad with certain ones.
      * @param newValues Object specifying the target values for each property.
      * @param numFrames Number of frames over which to do the adjustment.
      * @returns A promise that resolves once the adjustment is complete.
      */
    /* CompleteClass */
    override def easeIn(newValues: Partial[T], numFrames: Double): js.Promise[Unit] = js.native
    
    /**
      * Adjust by easing in *and* out. Approximately equivalent to easing in up to the halfway
      * point, then easing out the rest of the way.
      * @param newValues Object specifying the target values for each property.
      * @param numFrames Number of frames over which to do the adjustment.
      * @returns A promise that resolves once the adjustment is complete.
      */
    /* CompleteClass */
    override def easeInOut(newValues: Partial[T], numFrames: Double): js.Promise[Unit] = js.native
    
    /**
      * Adjust by easing out.
      * @param newValues Object specifying the target values for each property.
      * @param numFrames Number of frames over which to do the adjustment.
      * @returns A promise that resolves once the adjustment is complete.
      */
    /* CompleteClass */
    override def easeOut(newValues: Partial[T], numFrames: Double): js.Promise[Unit] = js.native
  }
  
  @js.native
  sealed trait Easing extends StObject
  /**
    * Specifies the interpolation method for a tween.
    */
  @JSImport("tween", "Easing")
  @js.native
  object Easing extends StObject {
    
    /** Overshoots the target values, then reverses into place. */
    @js.native
    sealed trait Back
      extends StObject
         with Easing
    
    @js.native
    sealed trait Bounce
      extends StObject
         with Easing
    
    @js.native
    sealed trait Circular
      extends StObject
         with Easing
    
    @js.native
    sealed trait Cubic
      extends StObject
         with Easing
    
    @js.native
    sealed trait Elastic
      extends StObject
         with Easing
    
    @js.native
    sealed trait Exponential
      extends StObject
         with Easing
    
    /** Linear interpolation: Animate smoothly from one value to the next, with no acceleration. */
    @js.native
    sealed trait Linear
      extends StObject
         with Easing
    
    @js.native
    sealed trait Quadratic
      extends StObject
         with Easing
    
    @js.native
    sealed trait Quartic
      extends StObject
         with Easing
    
    @js.native
    sealed trait Quintic
      extends StObject
         with Easing
    
    @js.native
    sealed trait Sine
      extends StObject
         with Easing
  }
  
  /**
    * Provides a means to adjust the numeric values of an object over time via interpolation.
    */
  trait Tween[T /* <: js.Object */] extends StObject {
    
    /**
      * Adjust by easing in. This inverts the easing function and may look bad with certain ones.
      * @param newValues Object specifying the target values for each property.
      * @param numFrames Number of frames over which to do the adjustment.
      * @returns A promise that resolves once the adjustment is complete.
      */
    def easeIn(newValues: Partial[T], numFrames: Double): js.Promise[Unit]
    
    /**
      * Adjust by easing in *and* out. Approximately equivalent to easing in up to the halfway
      * point, then easing out the rest of the way.
      * @param newValues Object specifying the target values for each property.
      * @param numFrames Number of frames over which to do the adjustment.
      * @returns A promise that resolves once the adjustment is complete.
      */
    def easeInOut(newValues: Partial[T], numFrames: Double): js.Promise[Unit]
    
    /**
      * Adjust by easing out.
      * @param newValues Object specifying the target values for each property.
      * @param numFrames Number of frames over which to do the adjustment.
      * @returns A promise that resolves once the adjustment is complete.
      */
    def easeOut(newValues: Partial[T], numFrames: Double): js.Promise[Unit]
  }
  object Tween {
    
    inline def apply[T /* <: js.Object */](
      easeIn: (Partial[T], Double) => js.Promise[Unit],
      easeInOut: (Partial[T], Double) => js.Promise[Unit],
      easeOut: (Partial[T], Double) => js.Promise[Unit]
    ): Tween[T] = {
      val __obj = js.Dynamic.literal(easeIn = js.Any.fromFunction2(easeIn), easeInOut = js.Any.fromFunction2(easeInOut), easeOut = js.Any.fromFunction2(easeOut))
      __obj.asInstanceOf[Tween[T]]
    }
    
    extension [Self <: Tween[?], T /* <: js.Object */](x: Self & Tween[T]) {
      
      inline def setEaseIn(value: (Partial[T], Double) => js.Promise[Unit]): Self = StObject.set(x, "easeIn", js.Any.fromFunction2(value))
      
      inline def setEaseInOut(value: (Partial[T], Double) => js.Promise[Unit]): Self = StObject.set(x, "easeInOut", js.Any.fromFunction2(value))
      
      inline def setEaseOut(value: (Partial[T], Double) => js.Promise[Unit]): Self = StObject.set(x, "easeOut", js.Any.fromFunction2(value))
    }
  }
}
