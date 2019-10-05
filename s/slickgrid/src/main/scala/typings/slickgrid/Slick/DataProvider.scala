package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProvider[T /* <: SlickData */] extends js.Object {
  /**
  		 * Returns the metadata for the item at a given index (optional).
  		 * @param index
  		 */
  var getItemMetadata: js.UndefOr[js.Function1[/* index */ Double, RowMetadata[T]]] = js.undefined
  /**
  		 * Returns the item at a given index.
  		 * @param index
  		 */
  def getItem(index: Double): T
  /**
  		 * Returns the number of data items in the set.
  		 */
  def getLength(): Double
}

object DataProvider {
  @scala.inline
  def apply[T /* <: SlickData */](
    getItem: Double => T,
    getLength: () => Double,
    getItemMetadata: /* index */ Double => RowMetadata[T] = null
  ): DataProvider[T] = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), getLength = js.Any.fromFunction0(getLength))
    if (getItemMetadata != null) __obj.updateDynamic("getItemMetadata")(js.Any.fromFunction1(getItemMetadata))
    __obj.asInstanceOf[DataProvider[T]]
  }
}

