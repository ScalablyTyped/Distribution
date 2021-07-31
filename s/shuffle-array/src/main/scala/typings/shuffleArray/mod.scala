package typings.shuffleArray

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("shuffle-array", JSImport.Namespace)
  @js.native
  val ^ : ShuffleArray = js.native
  
  /**
    * picks - Specifies how many random elements you want to pick. By default it picks 1.
    * rng - Specifies a custom random number generator.
    */
  trait PickOptions extends StObject {
    
    var picks: js.UndefOr[Double] = js.undefined
    
    var rng: js.UndefOr[js.Function0[Double]] = js.undefined
  }
  object PickOptions {
    
    @scala.inline
    def apply(): PickOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickOptions]
    }
    
    @scala.inline
    implicit class PickOptionsMutableBuilder[Self <: PickOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPicks(value: Double): Self = StObject.set(x, "picks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPicksUndefined: Self = StObject.set(x, "picks", js.undefined)
      
      @scala.inline
      def setRng(value: () => Double): Self = StObject.set(x, "rng", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRngUndefined: Self = StObject.set(x, "rng", js.undefined)
    }
  }
  
  @js.native
  trait ShuffleArray extends StObject {
    
    /**
      * Randomizes the order of the elements in a given array.
      *
      * arr - The given array.
      * options - Optional configuration options.
      */
    def apply[T](arr: js.Array[T]): js.Array[T] = js.native
    def apply[T](arr: js.Array[T], options: ShuffleOptions): js.Array[T] = js.native
    
    /**
      * Pick one or more random elements from the given array. If options.picks is
      * omitted or === 1, a single element will be returned; otherwise an array.
      *
      * arr - The given array.
      * options - Optional configuration options.
      */
    def pick[T](arr: js.Array[T]): T | js.Array[T] = js.native
    def pick[T](arr: js.Array[T], options: PickOptions): T | js.Array[T] = js.native
  }
  
  trait ShuffleOptions extends StObject {
    
    var copy: js.UndefOr[Boolean] = js.undefined
    
    var rng: js.UndefOr[js.Function0[Double]] = js.undefined
  }
  object ShuffleOptions {
    
    @scala.inline
    def apply(): ShuffleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShuffleOptions]
    }
    
    @scala.inline
    implicit class ShuffleOptionsMutableBuilder[Self <: ShuffleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setRng(value: () => Double): Self = StObject.set(x, "rng", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRngUndefined: Self = StObject.set(x, "rng", js.undefined)
    }
  }
  
  type _To = ShuffleArray
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ShuffleArray = ^
}
