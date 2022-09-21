package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A list of DataTransferItem objects representing items being dragged. During a drag operation, each DragEvent has a dataTransfer property and that property is a DataTransferItemList. */
@js.native
trait DataTransferItemList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[DataTransferItem] {
  
  /** Adds a new entry for the given data to the drag data store. If the data is plain text then a type string has to be provided also. */
  /* standard dom */
  def add(data: java.lang.String, `type`: java.lang.String): DataTransferItem | Null = js.native
  /* standard dom */
  def add(data: File): DataTransferItem | Null = js.native
  
  /** Removes all the entries in the drag data store. */
  /* standard dom */
  def clear(): Unit = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[DataTransferItem]] = js.native
  
  /** Returns the number of items in the drag data store. */
  /* standard dom */
  val length: Double = js.native
  
  /** Removes the indexth entry in the drag data store. */
  /* standard dom */
  def remove(index: Double): Unit = js.native
}
