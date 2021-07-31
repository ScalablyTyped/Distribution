package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Cell in a UITableRow._
  * @see https://docs.scriptable.app/uitablecell
  */
@JSGlobal("UITableCell")
@js.native
class UITableCell ()
  extends StObject
     with typings.scriptableIos.UITableCell {
  
  /**
    * _Center aligns content._
    *
    * Specifies that content in the cell should be center aligned.
    * @see https://docs.scriptable.app/uitablecell/#-centeraligned
    */
  /* CompleteClass */
  override def centerAligned(): Unit = js.native
  
  /**
    * _Whether to dismiss the table when the button is tapped._
    *
    * Defaults to false.
    * @see https://docs.scriptable.app/uitablecell/#dismissontap
    */
  /* CompleteClass */
  var dismissOnTap: Boolean = js.native
  
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
  
  /**
    * _Color of the subtitle._
    *
    * This only has an effect on cells with a subtitle. By default the color is null, in which case an appropriate color is automatically chosen based on the theme of the app and the
    * context the script is running in.
    * @see https://docs.scriptable.app/uitablecell/#subtitlecolor
    */
  /* CompleteClass */
  var subtitleColor: typings.scriptableIos.Color = js.native
  
  /**
    * _Font of the subtitle._
    * @see https://docs.scriptable.app/uitablecell/#subtitlefont
    */
  /* CompleteClass */
  var subtitleFont: typings.scriptableIos.Font = js.native
  
  /**
    * _Color of the title._
    *
    * This only has an effect on cells with a title. By default the color is null, in which case an appropriate color is automatically chosen based on the theme of the app and the
    * context the script is running in.
    * @see https://docs.scriptable.app/uitablecell/#titlecolor
    */
  /* CompleteClass */
  var titleColor: typings.scriptableIos.Color = js.native
  
  /**
    * _Font of the title._
    * @see https://docs.scriptable.app/uitablecell/#titlefont
    */
  /* CompleteClass */
  var titleFont: typings.scriptableIos.Font = js.native
  
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
  var widthWeight: Double = js.native
}
object UITableCell {
  
  @JSGlobal("UITableCell")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Constructs a button cell._
    *
    * Constructs a new cell that contains a button. Set the `onTap` property to specify an action to performed when the button is tapped.
    * @param title - Title of the button.
    * @see https://docs.scriptable.app/uitablecell/#button
    */
  /* static member */
  @scala.inline
  def button(title: String): typings.scriptableIos.UITableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("button")(title.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.UITableCell]
  
  /**
    * _Constructs an image cell._
    *
    * Constructs a new cell containing an image.
    * @param image - Image to show in the cell.
    * @see https://docs.scriptable.app/uitablecell/#image
    */
  /* static member */
  @scala.inline
  def image(image: typings.scriptableIos.Image): typings.scriptableIos.UITableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("image")(image.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.UITableCell]
  
  /**
    * _Constructs an image cell._
    *
    * Constructs a new cell that loads the image at the specified URL.
    * @param url - URL to image.
    * @see https://docs.scriptable.app/uitablecell/#imageaturl
    */
  /* static member */
  @scala.inline
  def imageAtURL(url: String): typings.scriptableIos.UITableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("imageAtURL")(url.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.UITableCell]
  
  /**
    * _Constructs a text cell._
    *
    * Constructs a new cell containing text.
    * @param title - Optional title to show in the cell.
    * @param subtitle - Optional subtitle shown below the title.
    * @see https://docs.scriptable.app/uitablecell/#text
    */
  /* static member */
  @scala.inline
  def text(): typings.scriptableIos.UITableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("text")().asInstanceOf[typings.scriptableIos.UITableCell]
  @scala.inline
  def text(title: String): typings.scriptableIos.UITableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(title.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.UITableCell]
  @scala.inline
  def text(title: String, subtitle: String): typings.scriptableIos.UITableCell = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(title.asInstanceOf[js.Any], subtitle.asInstanceOf[js.Any])).asInstanceOf[typings.scriptableIos.UITableCell]
  @scala.inline
  def text(title: Unit, subtitle: String): typings.scriptableIos.UITableCell = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(title.asInstanceOf[js.Any], subtitle.asInstanceOf[js.Any])).asInstanceOf[typings.scriptableIos.UITableCell]
}
