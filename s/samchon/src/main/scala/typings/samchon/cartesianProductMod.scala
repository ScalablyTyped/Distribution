package typings.samchon

import typings.samchon.icasegeneratorMod.ICaseGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/library/case_generators/CartesianProduct", JSImport.Namespace)
@js.native
object cartesianProductMod extends js.Object {
  
  @js.native
  class CartesianProduct protected () extends ICaseGenerator {
    /**
      * Initializer Constructor.
      *
      * @param digits Max number (size) of each digit.
      */
    def this(digits: Double*) = this()
    
    /**
      * Get digits, Max number (size) of each digit.
      */
    def digits(): js.Array[Double] = js.native
    
    /**
      * @hidden
      */
    var digits_ : js.Any = js.native
    
    /**
      * @hidden
      */
    var dividers_ : js.Any = js.native
    
    /**
      * @hidden
      */
    var size_ : js.Any = js.native
  }
}
