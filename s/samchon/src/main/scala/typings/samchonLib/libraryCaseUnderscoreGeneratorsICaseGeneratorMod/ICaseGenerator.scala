package typings
package samchonLib.libraryCaseUnderscoreGeneratorsICaseGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICaseGenerator extends js.Object {
  /**
    * Get index'th case.
    *
    * @param index Index number
    * @return The row of the index'th in combined permuation case
    */
  def at(index: scala.Double): js.Array[scala.Double]
  /**
    * Get size of all cases.
    *
    * @return Get a number of the all cases.
    */
  def size(): scala.Double
}

object ICaseGenerator {
  @scala.inline
  def apply(at: scala.Double => js.Array[scala.Double], size: () => scala.Double): ICaseGenerator = {
    val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), size = js.Any.fromFunction0(size))
  
    __obj.asInstanceOf[ICaseGenerator]
  }
}

