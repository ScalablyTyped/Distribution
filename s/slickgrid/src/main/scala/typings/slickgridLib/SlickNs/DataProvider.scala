package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProvider[T /* <: SlickData */] extends js.Object {
  /**
  		 * Returns the metadata for the item at a given index (optional).
  		 * @param index
  		 */
  var getItemMetadata: js.UndefOr[js.Function1[/* index */ scala.Double, RowMetadata[T]]] = js.undefined
  /**
  		 * Returns the item at a given index.
  		 * @param index
  		 */
  def getItem(index: scala.Double): T
  /**
  		 * Returns the number of data items in the set.
  		 */
  def getLength(): scala.Double
}

object DataProvider {
  @scala.inline
  def apply[T /* <: SlickData */](
    getItem: js.Function1[scala.Double, T],
    getLength: js.Function0[scala.Double],
    getItemMetadata: js.Function1[/* index */ scala.Double, RowMetadata[T]] = null
  ): DataProvider[T] = {
    val __obj = js.Dynamic.literal(getItem = getItem, getLength = getLength)
    if (getItemMetadata != null) __obj.updateDynamic("getItemMetadata")(getItemMetadata)
    __obj.asInstanceOf[DataProvider[T]]
  }
}

