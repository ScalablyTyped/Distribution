package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CalculateItemHeight extends js.Object {
  var length: js.UndefOr[scala.Double] = js.undefined
  var modifier: js.UndefOr[java.lang.String] = js.undefined
  def calculateItemHeight(rowIndex: scala.Double): js.Any
  def renderRow(rowIndex: scala.Double): js.Any
}

object Anon_CalculateItemHeight {
  @scala.inline
  def apply(
    calculateItemHeight: scala.Double => js.Any,
    renderRow: scala.Double => js.Any,
    length: scala.Int | scala.Double = null,
    modifier: java.lang.String = null
  ): Anon_CalculateItemHeight = {
    val __obj = js.Dynamic.literal(calculateItemHeight = js.Any.fromFunction1(calculateItemHeight), renderRow = js.Any.fromFunction1(renderRow))
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    __obj.asInstanceOf[Anon_CalculateItemHeight]
  }
}

