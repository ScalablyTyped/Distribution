package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Cell in a UITableRow._
  * @see https://docs.scriptable.app/uitablecell
  */
trait UITableCell extends js.Object {
  /**
    * _Whether to dismiss the table when the button is tapped._
    *
    * Defaults to false.
    * @see https://docs.scriptable.app/uitablecell/#dismissontap
    */
  var dismissOnTap: Boolean
  /**
    * _Color of the subtitle._
    *
    * This only have an effect on cells with a subtitle. By default the color is null, in which case an appropriate color is automatically chosen based on the theme of the app and the
    * context the script is running in.
    * @see https://docs.scriptable.app/uitablecell/#subtitlecolor
    */
  var subtitleColor: Color
  /**
    * _Color of the title._
    *
    * This only have an effect on cells with a title. By default the color is null, in which case an appropriate color is automatically chosen based on the theme of the app and the
    * context the script is running in.
    * @see https://docs.scriptable.app/uitablecell/#titlecolor
    */
  var titleColor: Color
  /**
    * _Relative width of the cell._
    *
    * A width weight specifies the relative width of the cell. When computing the absolute width of the cell, all width weights are taken into account. Consider the following example.
    *
    * Cell A has a width weight of 50. Cell B has a width weight of 100. Cell C has a width wegiht of 150.
    *
    * Assume that the row has an absolute width of 100. The width will be distributed among cells A, B and C. B will be double as wide as A but C will be fifty percent wider than B and
    * three times as wide as A.
    * @see https://docs.scriptable.app/uitablecell/#widthweight
    */
  var widthWeight: Double
  /**
    * _Center aligns content._
    *
    * Specifies that content in the cell should be center aligned.
    * @see https://docs.scriptable.app/uitablecell/#-centeraligned
    */
  def centerAligned(): Unit
  /**
    * _Left aligns content._
    *
    * Specifies that content in the cell should be left aligned.
    * @see https://docs.scriptable.app/uitablecell/#-leftaligned
    */
  def leftAligned(): Unit
  /**
    * _Called when the button is tapped._
    *
    * Buttons cannot be tapped when the table is presented in Siri.
    * @see https://docs.scriptable.app/uitablecell/#ontap
    */
  def onTap(): Unit
  /**
    * _Right aligns content._
    *
    * Specifies that content in the cell should be right aligned.
    * @see https://docs.scriptable.app/uitablecell/#-rightaligned
    */
  def rightAligned(): Unit
}

object UITableCell {
  @scala.inline
  def apply(
    centerAligned: () => Unit,
    dismissOnTap: Boolean,
    leftAligned: () => Unit,
    onTap: () => Unit,
    rightAligned: () => Unit,
    subtitleColor: Color,
    titleColor: Color,
    widthWeight: Double
  ): UITableCell = {
    val __obj = js.Dynamic.literal(centerAligned = js.Any.fromFunction0(centerAligned), dismissOnTap = dismissOnTap.asInstanceOf[js.Any], leftAligned = js.Any.fromFunction0(leftAligned), onTap = js.Any.fromFunction0(onTap), rightAligned = js.Any.fromFunction0(rightAligned), subtitleColor = subtitleColor.asInstanceOf[js.Any], titleColor = titleColor.asInstanceOf[js.Any], widthWeight = widthWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[UITableCell]
  }
}

