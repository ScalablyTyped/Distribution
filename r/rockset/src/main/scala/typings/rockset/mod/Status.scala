package typings.rockset.mod

import typings.rockset.rocksetStrings.COMPLETED
import typings.rockset.rocksetStrings.ERROR
import typings.rockset.rocksetStrings.INITIALIZING
import typings.rockset.rocksetStrings.PROCESSING
import typings.rockset.rocksetStrings.WATCHING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  // ISO-8601 date when last error occurred
  var last_error_at: js.UndefOr[String] = js.undefined
  
  // last source item that errored
  var last_error_item: js.UndefOr[String] = js.undefined
  
  // reason for the last error
  var last_error_reason: js.UndefOr[String] = js.undefined
  
  // ISO-8601 date when source was last processed
  var last_processed_at: js.UndefOr[String] = js.undefined
  
  // last source item processed by ingester
  var last_processed_item: js.UndefOr[String] = js.undefined
  
  // state message
  var message: js.UndefOr[String] = js.undefined
  
  // ISO-8601 date when state was triggered
  var since: js.UndefOr[String] = js.undefined
  
  // Status of the Source's ingestion, one of: INITIALIZING, WATCHING, PROCESSING, COMPLETED, ERROR
  var state: js.UndefOr[INITIALIZING | WATCHING | PROCESSING | COMPLETED | ERROR] = js.undefined
  
  // Total items that errored
  var total_error_items: js.UndefOr[Double] = js.undefined
  
  // Total items processed of source
  var total_processed_items: js.UndefOr[Double] = js.undefined
}
object Status {
  
  inline def apply(): Status = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Status]
  }
  
  extension [Self <: Status](x: Self) {
    
    inline def setLast_error_at(value: String): Self = StObject.set(x, "last_error_at", value.asInstanceOf[js.Any])
    
    inline def setLast_error_atUndefined: Self = StObject.set(x, "last_error_at", js.undefined)
    
    inline def setLast_error_item(value: String): Self = StObject.set(x, "last_error_item", value.asInstanceOf[js.Any])
    
    inline def setLast_error_itemUndefined: Self = StObject.set(x, "last_error_item", js.undefined)
    
    inline def setLast_error_reason(value: String): Self = StObject.set(x, "last_error_reason", value.asInstanceOf[js.Any])
    
    inline def setLast_error_reasonUndefined: Self = StObject.set(x, "last_error_reason", js.undefined)
    
    inline def setLast_processed_at(value: String): Self = StObject.set(x, "last_processed_at", value.asInstanceOf[js.Any])
    
    inline def setLast_processed_atUndefined: Self = StObject.set(x, "last_processed_at", js.undefined)
    
    inline def setLast_processed_item(value: String): Self = StObject.set(x, "last_processed_item", value.asInstanceOf[js.Any])
    
    inline def setLast_processed_itemUndefined: Self = StObject.set(x, "last_processed_item", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    inline def setState(value: INITIALIZING | WATCHING | PROCESSING | COMPLETED | ERROR): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTotal_error_items(value: Double): Self = StObject.set(x, "total_error_items", value.asInstanceOf[js.Any])
    
    inline def setTotal_error_itemsUndefined: Self = StObject.set(x, "total_error_items", js.undefined)
    
    inline def setTotal_processed_items(value: Double): Self = StObject.set(x, "total_processed_items", value.asInstanceOf[js.Any])
    
    inline def setTotal_processed_itemsUndefined: Self = StObject.set(x, "total_processed_items", js.undefined)
  }
}
