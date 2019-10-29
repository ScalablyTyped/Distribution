package typings.randomDashJs

import typings.randomDashJs.distEngineMersenneTwister19937Mod.MersenneTwister19937
import typings.randomDashJs.distTypesMod.Engine
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/engine/MersenneTwister19937", JSImport.Namespace)
@js.native
object distEngineMersenneTwister19937Mod extends js.Object {
  @js.native
  /**
    * MersenneTwister19937 should not be instantiated directly.
    * Instead, use the static methods `seed`, `seedWithArray`, or `autoSeed`.
    */
  class MersenneTwister19937 protected () extends Engine {
    val data: js.Any = js.native
    var index: js.Any = js.native
    var seed: js.Any = js.native
    var seedWithArray: js.Any = js.native
    var uses: js.Any = js.native
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
    /* CompleteClass */
    override def next(): Double = js.native
  }
  
  /* static members */
  @js.native
  object MersenneTwister19937 extends js.Object {
    /**
      * Returns a MersenneTwister19937 seeded with the current time and
      * a series of natively-generated random values
      */
    def autoSeed(): MersenneTwister19937 = js.native
    /**
      * Returns a MersenneTwister19937 seeded with an initial int32 value
      * @param initial the initial seed value
      */
    def seed(initial: Double): MersenneTwister19937 = js.native
    /**
      * Returns a MersenneTwister19937 seeded with zero or more int32 values
      * @param source A series of int32 values
      */
    def seedWithArray(source: ArrayLike[Double]): MersenneTwister19937 = js.native
  }
  
}

