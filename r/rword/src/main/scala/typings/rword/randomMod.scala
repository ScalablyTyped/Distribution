package typings.rword

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rword/dist/lib/random", JSImport.Namespace)
@js.native
object randomMod extends js.Object {
  
  @js.native
  class Random () extends js.Object
  /* static members */
  @js.native
  object Random extends js.Object {
    
    /** Transform an integer to a floating point number. */
    var intToFloat: js.Any = js.native
    
    /**
      * Generate a random number between `min` (inclusive) and `max` (exclusive).
      */
    def range(min: Double, max: Double): Double = js.native
    
    /**
      * Generate a random number between `0` (inclusive) and `1` (exclusive). A
      *  drop in replacement for `Math.random()`
      */
    def value(): Double = js.native
  }
}
