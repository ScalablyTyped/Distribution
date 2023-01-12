package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBatchList extends StObject {
  
  /** BatchList batches */
  var batches: js.UndefOr[js.Array[IBatch] | Null] = js.undefined
}
object IBatchList {
  
  inline def apply(): IBatchList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBatchList] (val x: Self) extends AnyVal {
    
    inline def setBatches(value: js.Array[IBatch]): Self = StObject.set(x, "batches", value.asInstanceOf[js.Any])
    
    inline def setBatchesNull: Self = StObject.set(x, "batches", null)
    
    inline def setBatchesUndefined: Self = StObject.set(x, "batches", js.undefined)
    
    inline def setBatchesVarargs(value: IBatch*): Self = StObject.set(x, "batches", js.Array(value*))
  }
}
