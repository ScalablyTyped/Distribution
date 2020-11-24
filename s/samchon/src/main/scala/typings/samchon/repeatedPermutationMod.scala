package typings.samchon

import typings.samchon.icasegeneratorMod.ICaseGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/library/case_generators/RepeatedPermutation", JSImport.Namespace)
@js.native
object repeatedPermutationMod extends js.Object {
  
  @js.native
  class RepeatedPermutation protected () extends ICaseGenerator {
    /**
      * Construct from size of N and R.
      *
      * @param n Size of candidates.
      * @param r Size of elements of each case.
      */
    def this(n: Double, r: Double) = this()
    
    /**
      * @hidden
      */
    var divider_array: js.Any = js.native
    
    /**
      * Get N, number of candidates.
      */
    def n(): Double = js.native
    
    /**
      * @hidden
      */
    var n_ : js.Any = js.native
    
    /**
      * Get R, number of elements for each case.
      */
    def r(): Double = js.native
    
    /**
      * @hidden
      */
    var r_ : js.Any = js.native
    
    /**
      * @hidden
      */
    var size_ : js.Any = js.native
  }
}
