package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Cell in a UITableRow._
  * @see https://docs.scriptable.app/uitablecell
  */
@JSGlobal("UITableCell")
@js.native
class UITableCell ()
  extends typings.scriptableIos.UITableCell {
  /**
    * _Whether to dismiss the table when the button is tapped._
    *
    * Defaults to false.
    * @see https://docs.scriptable.app/uitablecell/#dismissontap
    */
  /* CompleteClass */
  override var dismissOnTap: Boolean = js.native
  /**
    * _Color of the subtitle._
    *
    * This only have an effect on cells with a subtitle. By default the color is null, in which case an appropriate color is automatically chosen based on the theme of the app and the
    * context the script is running in.
    * @see https://docs.scriptable.app/uitablecell/#subtitlecolor
    */
  /* CompleteClass */
  override var subtitleColor: typings.scriptableIos.Color = js.native
  /**
    * _Color of the title._
    *
    * This only have an effect on cells with a title. By default the color is null, in which case an appropriate color is automatically chosen based on the theme of the app and the
    * context the script is running in.
    * @see https://docs.scriptable.app/uitablecell/#titlecolor
    */
  /* CompleteClass */
  override var titleColor: typings.scriptableIos.Color = js.native
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
  /* CompleteClass */
  override var widthWeight: Double = js.native
  /**
    * _Center aligns content._
    *
    * Specifies that content in the cell should be center aligned.
    * @see https://docs.scriptable.app/uitablecell/#-centeraligned
    */
  /* CompleteClass */
  override def centerAligned(): Unit = js.native
  /**
    * _Left aligns content._
    *
    * Specifies that content in the cell should be left aligned.
    * @see https://docs.scriptable.app/uitablecell/#-leftaligned
    */
  /* CompleteClass */
  override def leftAligned(): Unit = js.native
  /**
    * _Called when the button is tapped._
    *
    * Buttons cannot be tapped when the table is presented in Siri.
    * @see https://docs.scriptable.app/uitablecell/#ontap
    */
  /* CompleteClass */
  override def onTap(): Unit = js.native
  /**
    * _Right aligns content._
    *
    * Specifies that content in the cell should be right aligned.
    * @see https://docs.scriptable.app/uitablecell/#-rightaligned
    */
  /* CompleteClass */
  override def rightAligned(): Unit = js.native
}

/* static members */
@JSGlobal("UITableCell")
@js.native
object UITableCell extends js.Object {
  /**
    * _Constructs a button cell._
    *
    * Constructs a new cell that contains a button. Set the `onTap` property to specify an action to performed when the button is tapped.
    * @param title - Title of the button.
    * @see https://docs.scriptable.app/uitablecell/#button
    */
  def button(title: String): typings.scriptableIos.UITableCell = js.native
  /**
    * _Constructs an image cell._
    *
    * Constructs a new cell containing an image.
    * @param image - Image to show in the cell.
    * @see https://docs.scriptable.app/uitablecell/#image
    */
  def image(image: typings.scriptableIos.Image): typings.scriptableIos.UITableCell = js.native
  /**
    * _Constructs an image cell._
    *
    * Constructs a new cell that loads the image at the specified URL.
    * @param url - URL to image.
    * @see https://docs.scriptable.app/uitablecell/#imageaturl
    */
  def imageAtURL(url: String): typings.scriptableIos.UITableCell = js.native
  /**
    * _Constructs a text cell._
    *
    * Constructs a new cell containing a text.
    * @param title - Optional title to show in the cell.
    * @param subtitle - Optional subtitle shown below the title.
    * @see https://docs.scriptable.app/uitablecell/#text
    */
  def text(): typings.scriptableIos.UITableCell = js.native
  def text(title: String): typings.scriptableIos.UITableCell = js.native
  def text(title: String, subtitle: String): typings.scriptableIos.UITableCell = js.native
}

