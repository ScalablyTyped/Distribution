package typings.reactDashOnsenui

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier ? :string,   length ? :number, renderRow (rowIndex : number): any, calculateItemHeight (rowIndex : number): any} */
trait HTMLAttributesidclassNamestylemodifierstringlength extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  def calculateItemHeight(rowIndex: Double): js.Any
  def renderRow(rowIndex: Double): js.Any
}

object HTMLAttributesidclassNamestylemodifierstringlength {
  @scala.inline
  def apply(
    calculateItemHeight: Double => js.Any,
    renderRow: Double => js.Any,
    className: String = null,
    id: String = null,
    length: Int | Double = null,
    modifier: String = null,
    style: CSSProperties = null
  ): HTMLAttributesidclassNamestylemodifierstringlength = {
    val __obj = js.Dynamic.literal(calculateItemHeight = js.Any.fromFunction1(calculateItemHeight), renderRow = js.Any.fromFunction1(renderRow))
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[HTMLAttributesidclassNamestylemodifierstringlength]
  }
}

