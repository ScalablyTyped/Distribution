package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionStats extends StObject {
  
  /**
    * total number of bytes inserted into the collection
    * @type {number}
    * @memberof CollectionStats
    */
  var bytes_inserted: js.UndefOr[Double] = js.undefined
  
  /**
    * total number of bytes overwritten in writing into the collection
    * @type {number}
    * @memberof CollectionStats
    */
  var bytes_overwritten: js.UndefOr[Double] = js.undefined
  
  /**
    * number of documents in the collection
    * @type {number}
    * @memberof CollectionStats
    */
  var doc_count: js.UndefOr[Double] = js.undefined
  
  /**
    * number between 0 and 1 that indicates progress of collection creation
    * @type {number}
    * @memberof CollectionStats
    */
  var fill_progress: js.UndefOr[Double] = js.undefined
  
  /**
    * milliseconds since Unix epoch Jan 1, 1970
    * @type {number}
    * @memberof CollectionStats
    */
  var last_queried_ms: js.UndefOr[Double] = js.undefined
  
  /**
    * milliseconds since Unix epoch Jan 1, 1970
    * @type {number}
    * @memberof CollectionStats
    */
  var last_updated_ms: js.UndefOr[Double] = js.undefined
  
  /**
    * number of documents purged from the collection
    * @type {number}
    * @memberof CollectionStats
    */
  var purged_doc_count: js.UndefOr[Double] = js.undefined
  
  /**
    * total collection size in bytes purged
    * @type {number}
    * @memberof CollectionStats
    */
  var purged_doc_size: js.UndefOr[Double] = js.undefined
  
  /**
    * total collection size in bytes
    * @type {number}
    * @memberof CollectionStats
    */
  var total_size: js.UndefOr[Double] = js.undefined
}
object CollectionStats {
  
  inline def apply(): CollectionStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionStats]
  }
  
  extension [Self <: CollectionStats](x: Self) {
    
    inline def setBytes_inserted(value: Double): Self = StObject.set(x, "bytes_inserted", value.asInstanceOf[js.Any])
    
    inline def setBytes_insertedUndefined: Self = StObject.set(x, "bytes_inserted", js.undefined)
    
    inline def setBytes_overwritten(value: Double): Self = StObject.set(x, "bytes_overwritten", value.asInstanceOf[js.Any])
    
    inline def setBytes_overwrittenUndefined: Self = StObject.set(x, "bytes_overwritten", js.undefined)
    
    inline def setDoc_count(value: Double): Self = StObject.set(x, "doc_count", value.asInstanceOf[js.Any])
    
    inline def setDoc_countUndefined: Self = StObject.set(x, "doc_count", js.undefined)
    
    inline def setFill_progress(value: Double): Self = StObject.set(x, "fill_progress", value.asInstanceOf[js.Any])
    
    inline def setFill_progressUndefined: Self = StObject.set(x, "fill_progress", js.undefined)
    
    inline def setLast_queried_ms(value: Double): Self = StObject.set(x, "last_queried_ms", value.asInstanceOf[js.Any])
    
    inline def setLast_queried_msUndefined: Self = StObject.set(x, "last_queried_ms", js.undefined)
    
    inline def setLast_updated_ms(value: Double): Self = StObject.set(x, "last_updated_ms", value.asInstanceOf[js.Any])
    
    inline def setLast_updated_msUndefined: Self = StObject.set(x, "last_updated_ms", js.undefined)
    
    inline def setPurged_doc_count(value: Double): Self = StObject.set(x, "purged_doc_count", value.asInstanceOf[js.Any])
    
    inline def setPurged_doc_countUndefined: Self = StObject.set(x, "purged_doc_count", js.undefined)
    
    inline def setPurged_doc_size(value: Double): Self = StObject.set(x, "purged_doc_size", value.asInstanceOf[js.Any])
    
    inline def setPurged_doc_sizeUndefined: Self = StObject.set(x, "purged_doc_size", js.undefined)
    
    inline def setTotal_size(value: Double): Self = StObject.set(x, "total_size", value.asInstanceOf[js.Any])
    
    inline def setTotal_sizeUndefined: Self = StObject.set(x, "total_size", js.undefined)
  }
}
