package typings
package samchonLib.libraryCaseUnderscoreGeneratorsRepeatedPermutationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/library/case_generators/RepeatedPermutation", "RepeatedPermutation")
@js.native
class RepeatedPermutation protected ()
  extends samchonLib.libraryCaseUnderscoreGeneratorsICaseGeneratorMod.ICaseGenerator {
  /**
    * Construct from size of N and R.
    *
    * @param n Size of candidates.
    * @param r Size of elements of each case.
    */
  def this(n: scala.Double, r: scala.Double) = this()
  /**
    * @hidden
    */
  var divider_array: js.Any = js.native
  /**
    * @hidden
    */
  var `n_`: js.Any = js.native
  /**
    * @hidden
    */
  var `r_`: js.Any = js.native
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
    * Get N, number of candidates.
    */
  def n(): scala.Double = js.native
  /**
    * Get R, number of elements for each case.
    */
  def r(): scala.Double = js.native
  /**
    * Get size of all cases.
    *
    * @return Get a number of the all cases.
    */
  /* CompleteClass */
  override def size(): scala.Double = js.native
}

