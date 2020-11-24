package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Cell in a UITableRow._
  * @see https://docs.scriptable.app/uitablecell
  */
@JSGlobal("UITableCell")
@js.native
class UITableCell ()
  extends typings.scriptableIos.UITableCell
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
    * Constructs a new cell containing text.
    * @param title - Optional title to show in the cell.
    * @param subtitle - Optional subtitle shown below the title.
    * @see https://docs.scriptable.app/uitablecell/#text
    */
  def text(): typings.scriptableIos.UITableCell = js.native
  def text(title: js.UndefOr[scala.Nothing], subtitle: String): typings.scriptableIos.UITableCell = js.native
  def text(title: String): typings.scriptableIos.UITableCell = js.native
  def text(title: String, subtitle: String): typings.scriptableIos.UITableCell = js.native
}
