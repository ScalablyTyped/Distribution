package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** One drag data item. During a drag operation, each drag event has a dataTransfer property which contains a list of drag data items. Each item in the list is a DataTransferItem object. */
@js.native
trait DataTransferItem extends js.Object {
  /**
    * Returns the drag data item kind, one of: "string", "file".
    */
  val kind: java.lang.String = js.native
  /**
    * Returns the drag data item type string.
    */
  val `type`: java.lang.String = js.native
  /**
    * Returns a File object, if the drag data item kind is File.
    */
  def getAsFile(): File | Null = js.native
  def getAsString(): Unit = js.native
  /**
    * Invokes the callback with the string data as the argument, if the drag data item kind is Plain Unicode string.
    */
  def getAsString(callback: FunctionStringCallback): Unit = js.native
  def webkitGetAsEntry(): js.Any = js.native
}

@JSGlobal("DataTransferItem")
@js.native
object DataTransferItem extends Instantiable0[DataTransferItem]

