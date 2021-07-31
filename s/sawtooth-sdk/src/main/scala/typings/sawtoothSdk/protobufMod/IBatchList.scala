package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBatchList extends StObject {
  
  /** BatchList batches */
  var batches: js.UndefOr[js.Array[IBatch] | Null] = js.undefined
}
object IBatchList {
  
  @scala.inline
  def apply(): IBatchList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchList]
  }
  
  @scala.inline
  implicit class IBatchListMutableBuilder[Self <: IBatchList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatches(value: js.Array[IBatch]): Self = StObject.set(x, "batches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchesNull: Self = StObject.set(x, "batches", null)
    
    @scala.inline
    def setBatchesUndefined: Self = StObject.set(x, "batches", js.undefined)
    
    @scala.inline
    def setBatchesVarargs(value: IBatch*): Self = StObject.set(x, "batches", js.Array(value :_*))
  }
}
