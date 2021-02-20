package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProvider[T /* <: SlickData */] extends StObject {
  
  /**
    * Returns the item at a given index.
    * @param index
    */
  def getItem(index: Double): T = js.native
  
  /**
    * Returns the metadata for the item at a given index (optional).
    * @param index
    */
  var getItemMetadata: js.UndefOr[js.Function1[/* index */ Double, RowMetadata[T]]] = js.native
  
  /**
    * Returns the number of data items in the set.
    */
  def getLength(): Double = js.native
}
object DataProvider {
  
  @scala.inline
  def apply[T /* <: SlickData */](getItem: Double => T, getLength: () => Double): DataProvider[T] = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), getLength = js.Any.fromFunction0(getLength))
    __obj.asInstanceOf[DataProvider[T]]
  }
  
  @scala.inline
  implicit class DataProviderMutableBuilder[Self <: DataProvider[_], T /* <: SlickData */] (val x: Self with DataProvider[T]) extends AnyVal {
    
    @scala.inline
    def setGetItem(value: Double => T): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemMetadata(value: /* index */ Double => RowMetadata[T]): Self = StObject.set(x, "getItemMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemMetadataUndefined: Self = StObject.set(x, "getItemMetadata", js.undefined)
    
    @scala.inline
    def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
  }
}
