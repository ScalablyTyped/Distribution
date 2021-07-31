package typings.samchon

import typings.samchon.icasegeneratorMod.ICaseGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cartesianProductMod {
  
  @JSImport("samchon/library/case_generators/CartesianProduct", "CartesianProduct")
  @js.native
  class CartesianProduct protected ()
    extends StObject
       with ICaseGenerator {
    /**
      * Initializer Constructor.
      *
      * @param digits Max number (size) of each digit.
      */
    def this(digits: Double*) = this()
    
    /**
      * Get index'th case.
      *
      * @param index Index number
      * @return The row of the index'th in combined permuation case
      */
    /* CompleteClass */
    override def at(index: Double): js.Array[Double] = js.native
    
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
      * Get size of all cases.
      *
      * @return Get a number of the all cases.
      */
    /* CompleteClass */
    override def size(): Double = js.native
    
    /**
      * @hidden
      */
    var size_ : js.Any = js.native
  }
}
