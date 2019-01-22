package typings
package samchonLib.libraryCaseUnderscoreGeneratorsCartesianProductMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/library/case_generators/CartesianProduct", "CartesianProduct")
@js.native
class CartesianProduct protected ()
  extends samchonLib.libraryCaseUnderscoreGeneratorsICaseGeneratorMod.ICaseGenerator {
  /**
    * Initializer Constructor.
    *
    * @param digits Max number (size) of each digit.
    */
  def this(digits: scala.Double*) = this()
  /**
    * @hidden
    */
  var `digits_`: js.Any = js.native
  /**
    * @hidden
    */
  var `dividers_`: js.Any = js.native
  /**
    * @hidden
    */
  var `size_`: js.Any = js.native
  /**
    * Get index'th case.
    *
    * @param index Index number
    * @return The row of the index'th in combined permuation case
    */
  /* CompleteClass */
  override def at(index: scala.Double): js.Array[scala.Double] = js.native
  /**
    * Get digits, Max number (size) of each digit.
    */
  def digits(): js.Array[scala.Double] = js.native
  /**
    * Get size of all cases.
    *
    * @return Get a number of the all cases.
    */
  /* CompleteClass */
  override def size(): scala.Double = js.native
}

