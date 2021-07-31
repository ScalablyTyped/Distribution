package typings.randomJs

import typings.randomJs.typesMod.Engine
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mersenneTwister19937Mod {
  
  @JSImport("random-js/dist/engine/MersenneTwister19937", "MersenneTwister19937")
  @js.native
  /**
    * MersenneTwister19937 should not be instantiated directly.
    * Instead, use the static methods `seed`, `seedWithArray`, or `autoSeed`.
    */
  class MersenneTwister19937 protected ()
    extends StObject
       with Engine {
    
    val data: js.Any = js.native
    
    /**
      * Discards one or more items from the engine
      * @param count The count of items to discard
      */
    def discard(count: Double): this.type = js.native
    
    /**
      * Returns the number of times that the Engine has been used.
      *
      * This can be provided to an unused MersenneTwister19937 with the same
      * seed, bringing it to the exact point that was left off.
      */
    def getUseCount(): Double = js.native
    
    var index: js.Any = js.native
    
    /* CompleteClass */
    override def next(): Double = js.native
    
    var seed: js.Any = js.native
    
    var seedWithArray: js.Any = js.native
    
    var uses: js.Any = js.native
  }
  /* static members */
  object MersenneTwister19937 {
    
    @JSImport("random-js/dist/engine/MersenneTwister19937", "MersenneTwister19937")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a MersenneTwister19937 seeded with the current time and
      * a series of natively-generated random values
      */
    @scala.inline
    def autoSeed(): MersenneTwister19937 = ^.asInstanceOf[js.Dynamic].applyDynamic("autoSeed")().asInstanceOf[MersenneTwister19937]
    
    /**
      * Returns a MersenneTwister19937 seeded with an initial int32 value
      * @param initial the initial seed value
      */
    @scala.inline
    def seed(initial: Double): MersenneTwister19937 = ^.asInstanceOf[js.Dynamic].applyDynamic("seed")(initial.asInstanceOf[js.Any]).asInstanceOf[MersenneTwister19937]
    
    /**
      * Returns a MersenneTwister19937 seeded with zero or more int32 values
      * @param source A series of int32 values
      */
    @scala.inline
    def seedWithArray(source: ArrayLike[Double]): MersenneTwister19937 = ^.asInstanceOf[js.Dynamic].applyDynamic("seedWithArray")(source.asInstanceOf[js.Any]).asInstanceOf[MersenneTwister19937]
  }
}
