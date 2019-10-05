package typings.sharepoint.SP

import typings.sharepoint.IEnumerable
import typings.sharepoint.IEnumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a base class for a collection of objects on a remote client. */
@JSGlobal("SP.ClientObjectCollection")
@js.native
class ClientObjectCollection[T] ()
  extends ClientObject
     with IEnumerable[T] {
  def addChild(obj: T): Unit = js.native
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[T] = js.native
  def getItemAtIndex(index: Double): T = js.native
  def get_areItemsAvailable(): Boolean = js.native
  /** Returns number of items in the collection. */
  def get_count(): Double = js.native
  def get_data(): js.Array[T] = js.native
  /** Gets the data for all of the items in the collection. */
  def retrieveItems(): ClientObjectPrototype = js.native
}

