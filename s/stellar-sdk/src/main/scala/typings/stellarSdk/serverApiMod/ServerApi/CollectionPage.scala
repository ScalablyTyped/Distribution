package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionPage[T /* <: BaseResponse[scala.Nothing] */] extends StObject {
  
  def next(): js.Promise[CollectionPage[T]] = js.native
  
  def prev(): js.Promise[CollectionPage[T]] = js.native
  
  var records: js.Array[T] = js.native
}
object CollectionPage {
  
  @scala.inline
  def apply[T /* <: BaseResponse[scala.Nothing] */](
    next: () => js.Promise[CollectionPage[T]],
    prev: () => js.Promise[CollectionPage[T]],
    records: js.Array[T]
  ): CollectionPage[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), records = records.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionPage[T]]
  }
  
  @scala.inline
  implicit class CollectionPageMutableBuilder[Self <: CollectionPage[_], T /* <: BaseResponse[scala.Nothing] */] (val x: Self with CollectionPage[T]) extends AnyVal {
    
    @scala.inline
    def setNext(value: () => js.Promise[CollectionPage[T]]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrev(value: () => js.Promise[CollectionPage[T]]): Self = StObject.set(x, "prev", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRecords(value: js.Array[T]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsVarargs(value: T*): Self = StObject.set(x, "records", js.Array(value :_*))
  }
}
