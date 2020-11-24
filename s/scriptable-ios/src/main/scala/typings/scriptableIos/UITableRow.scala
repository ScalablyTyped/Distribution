package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Row in a UITable._
  *
  * Rows are shown vertically in a UITable. A row contains cells which are displayed horizontally.
  * @see https://docs.scriptable.app/uitablerow/#-new-uitablerow
  */
@js.native
trait UITableRow extends js.Object {
  
  /**
    * _Adds a button cell._
    *
    * Constructs a new cell that contains a button. Set the `onTap` property to specify an action to performed when the button is tapped.
    * @param title - Title of the button.
    * @see https://docs.scriptable.app/uitablerow/#-addbutton
    */
  def addButton(title: String): UITableCell = js.native
  
  /**
    * _Adds a cell._
    *
    * Adds a cell to the row. Note that cells are shown in the order they are added to the row.
    * @param cell - Cell to add to the row.
    * @see https://docs.scriptable.app/uitablerow/#-addcell
    */
  def addCell(cell: UITableCell): Unit = js.native
  
  /**
    * _Adds an image cell._
    *
    * Constructs a new cell containing the specified image and adds it to the row.
    * @param image - Image to show in the cell.
    * @see https://docs.scriptable.app/uitablerow/#-addimage
    */
  def addImage(image: Image): UITableCell = js.native
  
  /**
    * _Adds an image cell._
    *
    * Constructs a new cell that loads the image at the specified url and adds the cell to the row.
    * @param url - URL to image.
    * @see https://docs.scriptable.app/uitablerow/#-addimageaturl
    */
  def addImageAtURL(url: String): UITableCell = js.native
  
  /**
    * _Adds a text cell._
    *
    * Constructs a new cell containing the specified string and adds it to the row.
    * @param title - Optional title to show in the cell.
    * @param subtitle - Optional subtitle shown below the title in the cell.
    * @see https://docs.scriptable.app/uitablerow/#-addtext
    */
  def addText(): UITableCell = js.native
  def addText(title: js.UndefOr[scala.Nothing], subtitle: String): UITableCell = js.native
  def addText(title: String): UITableCell = js.native
  def addText(title: String, subtitle: String): UITableCell = js.native
  
  /**
    * _Background color._
    * @see https://docs.scriptable.app/uitablerow/#backgroundcolor
    */
  var backgroundColor: Color = js.native
  
  /**
    * _Spacing between cells._
    *
    * Specifies the horizontal spacing between cells in the row.
    * @see https://docs.scriptable.app/uitablerow/#cellspacing
    */
  var cellSpacing: Double = js.native
  
  /**
    * _Whether to dismiss the table when the row is selected._
    *
    * This property will only have an effect if the row is selectable, i.e. `onSelect` has a value. Otherwise it is ignored.
    *
    * Defaults to true.
    * @see https://docs.scriptable.app/uitablerow/#dismissonselect
    */
  var dismissOnSelect: Boolean = js.native
  
  /**
    * _Height of the row._
    *
    * The height of the row defaults to 44.
    * @see https://docs.scriptable.app/uitablerow/#height
    */
  var height: Double = js.native
  
  /**
    * _Whether the cell is a header._
    *
    * Headers are highlighted cells that helps users understand context. Defaults to false.
    * @see https://docs.scriptable.app/uitablerow/#isheader
    */
  var isHeader: Boolean = js.native
  
  /**
    * _Called when the row is selected._
    *
    * Called when the row is selected when the table is presented. If this has no value, the row cannot be selected. Defaults to null.
    *
    * Rows cannot be tapped when the tables is presented in Siri.
    * @see https://docs.scriptable.app/uitablerow/#onselect
    */
  def onSelect(arg0: Double): Unit = js.native
}
