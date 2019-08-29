package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to hold the data that is being dragged during a drag and drop operation. It may hold one or more data items, each of one or more data types. For more information about drag and drop, see HTML Drag and Drop API. */
@js.native
trait DataTransfer extends js.Object {
  /**
    * Returns the kind of operation that is currently selected. If the kind of operation isn't one of those that is allowed by the effectAllowed attribute, then the operation will fail.
    * 
    * Can be set, to change the selected operation.
    * 
    * The possible values are "none", "copy", "link", and "move".
    */
  var dropEffect: java.lang.String = js.native
  /**
    * Returns the kinds of operations that are to be allowed.
    * 
    * Can be set (during the dragstart event), to change the allowed operations.
    * 
    * The possible values are "none", "copy", "copyLink", "copyMove", "link", "linkMove", "move", "all", and "uninitialized",
    */
  var effectAllowed: java.lang.String = js.native
  /**
    * Returns a FileList of the files being dragged, if any.
    */
  val files: FileList = js.native
  /**
    * Returns a DataTransferItemList object, with the drag data.
    */
  val items: DataTransferItemList = js.native
  /**
    * Returns a frozen array listing the formats that were set in the dragstart event. In addition, if any files are being dragged, then one of the types will be the string "Files".
    */
  val types: js.Array[java.lang.String] = js.native
  /**
    * Removes the data of the specified formats. Removes all data if the argument is omitted.
    */
  def clearData(): Unit = js.native
  def clearData(format: java.lang.String): Unit = js.native
  /**
    * Returns the specified data. If there is no such data, returns the empty string.
    */
  def getData(format: java.lang.String): java.lang.String = js.native
  /**
    * Adds the specified data.
    */
  def setData(format: java.lang.String, data: java.lang.String): Unit = js.native
  /**
    * Uses the given element to update the drag feedback, replacing any previously specified feedback.
    */
  def setDragImage(image: Element, x: Double, y: Double): Unit = js.native
}

@JSGlobal("DataTransfer")
@js.native
class DataTransferCls () extends DataTransfer

@JSGlobal("DataTransfer")
@js.native
object DataTransfer extends Instantiable0[DataTransfer]

