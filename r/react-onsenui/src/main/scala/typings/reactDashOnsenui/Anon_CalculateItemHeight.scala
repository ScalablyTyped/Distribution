package typings.reactDashOnsenui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CalculateItemHeight extends js.Object {
  var length: js.UndefOr[Double] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  def calculateItemHeight(rowIndex: Double): js.Any
  def renderRow(rowIndex: Double): js.Any
}

object Anon_CalculateItemHeight {
  @scala.inline
  def apply(
    calculateItemHeight: Double => js.Any,
    renderRow: Double => js.Any,
    length: Int | Double = null,
    modifier: String = null
  ): Anon_CalculateItemHeight = {
    val __obj = js.Dynamic.literal(calculateItemHeight = js.Any.fromFunction1(calculateItemHeight), renderRow = js.Any.fromFunction1(renderRow))
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    __obj.asInstanceOf[Anon_CalculateItemHeight]
  }
}

