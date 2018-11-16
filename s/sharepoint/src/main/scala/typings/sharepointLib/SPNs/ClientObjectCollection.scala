package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a base class for a collection of objects on a remote client. */
@JSGlobal("SP.ClientObjectCollection")
@js.native
class ClientObjectCollection[T] ()
  extends ClientObject
     with sharepointLib.IEnumerable[T] {
  def addChild(obj: T): scala.Unit = js.native
  /* CompleteClass */
  override def getEnumerator(): sharepointLib.IEnumerator[T] = js.native
  def getItemAtIndex(index: scala.Double): T = js.native
  def get_areItemsAvailable(): scala.Boolean = js.native
  /** Returns number of items in the collection. */
  def get_count(): scala.Double = js.native
  def get_data(): js.Array[T] = js.native
  /** Gets the data for all of the items in the collection. */
  def retrieveItems(): ClientObjectPrototype = js.native
}

