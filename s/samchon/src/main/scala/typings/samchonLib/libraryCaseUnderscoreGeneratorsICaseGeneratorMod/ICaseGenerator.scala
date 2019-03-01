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
  def apply(at: js.Function1[scala.Double, js.Array[scala.Double]], size: js.Function0[scala.Double]): ICaseGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("at")(at)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[ICaseGenerator]
  }
}

