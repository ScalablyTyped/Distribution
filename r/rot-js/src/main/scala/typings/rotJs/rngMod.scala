package typings.rotJs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rot-js/lib/rng", JSImport.Namespace)
@js.native
object rngMod extends js.Object {
  
  val default: RNG = js.native
  
  @js.native
  trait RNG extends js.Object {
    
    var _c: Double = js.native
    
    var _s0: Double = js.native
    
    var _s1: Double = js.native
    
    var _s2: Double = js.native
    
    var _seed: Double = js.native
    
    /**
      * @returns Randomly picked item, null when length=0
      */
    def getItem[T](array: js.Array[T]): T | Null = js.native
    
    /**
      * @param mean Mean value
      * @param stddev Standard deviation. ~95% of the absolute values will be lower than 2*stddev.
      * @returns A normally distributed pseudorandom value
      */
    def getNormal(): Double = js.native
    def getNormal(mean: js.UndefOr[scala.Nothing], stddev: Double): Double = js.native
    def getNormal(mean: Double): Double = js.native
    def getNormal(mean: Double, stddev: Double): Double = js.native
    
    /**
      * @returns Pseudorandom value [1,100] inclusive, uniformly distributed
      */
    def getPercentage(): Double = js.native
    
    def getSeed(): Double = js.native
    
    /**
      * Get RNG state. Useful for storing the state and re-setting it via setState.
      * @returns Internal state
      */
    def getState(): js.Array[Double] = js.native
    
    /**
      * @returns Pseudorandom value [0,1), uniformly distributed
      */
    def getUniform(): Double = js.native
    
    /**
      * @param lowerBound The lower end of the range to return a value from, inclusive
      * @param upperBound The upper end of the range to return a value from, inclusive
      * @returns Pseudorandom value [lowerBound, upperBound], using ROT.RNG.getUniform() to distribute the value
      */
    def getUniformInt(lowerBound: Double, upperBound: Double): Double = js.native
    
    /**
      * @param data key=whatever, value=weight (relative probability)
      * @returns whatever
      */
    def getWeightedValue(data: StringDictionary[Double] with NumberDictionary[Double]): js.UndefOr[String] = js.native
    
    /**
      * Seed the number generator
      */
    def setSeed(seed: Double): this.type = js.native
    
    /**
      * Set a previously retrieved state.
      */
    def setState(state: js.Array[Double]): this.type = js.native
    
    /**
      * @returns New array with randomized items
      */
    def shuffle[T](array: js.Array[T]): js.Array[T] = js.native
  }
}
