package typings.randoma

import typings.color.mod.ColorParam
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("randoma", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Randoma {
    /**
    	User-friendly [pseudorandom number generator (PRNG)](https://en.wikipedia.org/wiki/Pseudorandom_number_generator).
    	This is not cryptographically secure.
    	@example
    	```
    	import Randoma = require('randoma');
    	const random = new Randoma({seed: 10});
    	random.integer();
    	//=> 2027521326
    	random.integer();
    	//=> 677268843
    	(new Randoma({seed: '🦄'}).integer());
    	//=> 1659974344
    	(new Randoma({seed: '🦄'}).integer());
    	//=> 1659974344
    	```
    	*/
    def this(options: Options) = this()
  }
  @JSImport("randoma", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	@returns A random seed you could use in the `seed` option if you for some reason don't want deterministic randomness.
  	*/
  /* static member */
  @scala.inline
  def seed(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("seed")().asInstanceOf[Double]
  
  type Color = typings.color.mod.Color[ColorParam]
  
  trait Options extends StObject {
    
    /**
    		[Initialization seed.](https://en.wikipedia.org/wiki/Random_seed) Multiple instances of `Randoma` with the same seed will generate the same random numbers.
    		*/
    val seed: String | Double
  }
  object Options {
    
    @scala.inline
    def apply(seed: String | Double): Options = {
      val __obj = js.Dynamic.literal(seed = seed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSeed(value: String | Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Randoma extends StObject {
    
    def arrayItem[T](array: js.Array[T]): T = js.native
    
    def boolean(): Boolean = js.native
    
    /**
    	@param saturation - Saturation percentage in the range `0...1`. Default: `0.5`.
    	@returns A random [aesthetically pleasing color](https://martin.ankerl.com/2009/12/09/how-to-create-random-colors-programmatically/) as a [`color`](https://github.com/Qix-/color) object.
    	@example
    	```
    	random.color(0.5).hex().toString()
    	//=> '#AAF2B0'
    	```
    	*/
    def color(): Color = js.native
    def color(saturation: Double): Color = js.native
    
    def date(): Date = js.native
    
    def dateInRange(startDate: Date, endDate: Date): Date = js.native
    
    def float(): Double = js.native
    
    def floatInRange(min: Double, max: Double): Double = js.native
    
    def integer(): Double = js.native
    
    def integerInRange(min: Double, max: Double): Double = js.native
  }
}
