package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProvider[T /* <: SlickData */] extends js.Object {
  /**
    * Returns the metadata for the item at a given index (optional).
    * @param index
    */
  var getItemMetadata: js.UndefOr[js.Function1[/* index */ Double, RowMetadata[T]]] = js.native
  /**
    * Returns the item at a given index.
    * @param index
    */
  def getItem(index: Double): T = js.native
  /**
    * Returns the number of data items in the set.
    */
  def getLength(): Double = js.native
}

object DataProvider {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](getItem: Double => T, getLength: () => Double): DataProvider[T] = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), getLength = js.Any.fromFunction0(getLength))
    __obj.asInstanceOf[DataProvider[T]]
  }
  @scala.inline
  implicit class DataProviderOps[Self <: DataProvider[_], /* <: typings.slickgrid.Slick.SlickData */ T] (val x: Self with DataProvider[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetItem(value: Double => T): Self = this.set("getItem", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    @scala.inline
    def setGetItemMetadata(value: /* index */ Double => RowMetadata[T]): Self = this.set("getItemMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetItemMetadata: Self = this.set("getItemMetadata", js.undefined)
  }
  
}

