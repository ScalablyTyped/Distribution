package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionStats extends StObject {
  
  // number of documents in the collection
  var doc_count: js.UndefOr[Double] = js.native
  
  // number between 0 and 1 that indicates progress of collection creation
  var fill_progress: js.UndefOr[Double] = js.native
  
  // milliseconds since Unix epoch Jan 1, 1970
  var last_queried_ms: js.UndefOr[Double] = js.native
  
  // milliseconds since Unix epoch Jan 1, 1970
  var last_updated_ms: js.UndefOr[Double] = js.native
  
  // number of documents purged from the collection
  var purged_doc_count: js.UndefOr[Double] = js.native
  
  // total collection size in bytes purged
  var purged_doc_size: js.UndefOr[Double] = js.native
  
  // total collection size in bytes
  var total_size: js.UndefOr[Double] = js.native
}
object CollectionStats {
  
  @scala.inline
  def apply(): CollectionStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionStats]
  }
  
  @scala.inline
  implicit class CollectionStatsMutableBuilder[Self <: CollectionStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoc_count(value: Double): Self = StObject.set(x, "doc_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoc_countUndefined: Self = StObject.set(x, "doc_count", js.undefined)
    
    @scala.inline
    def setFill_progress(value: Double): Self = StObject.set(x, "fill_progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill_progressUndefined: Self = StObject.set(x, "fill_progress", js.undefined)
    
    @scala.inline
    def setLast_queried_ms(value: Double): Self = StObject.set(x, "last_queried_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_queried_msUndefined: Self = StObject.set(x, "last_queried_ms", js.undefined)
    
    @scala.inline
    def setLast_updated_ms(value: Double): Self = StObject.set(x, "last_updated_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_updated_msUndefined: Self = StObject.set(x, "last_updated_ms", js.undefined)
    
    @scala.inline
    def setPurged_doc_count(value: Double): Self = StObject.set(x, "purged_doc_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurged_doc_countUndefined: Self = StObject.set(x, "purged_doc_count", js.undefined)
    
    @scala.inline
    def setPurged_doc_size(value: Double): Self = StObject.set(x, "purged_doc_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurged_doc_sizeUndefined: Self = StObject.set(x, "purged_doc_size", js.undefined)
    
    @scala.inline
    def setTotal_size(value: Double): Self = StObject.set(x, "total_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_sizeUndefined: Self = StObject.set(x, "total_size", js.undefined)
  }
}
