package typings.rockset.distCodegenApiMod

import typings.rockset.distCodegenApiMod.Status.StateEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  /**
    * ISO-8601 date when last error occurred
    * @type {string}
    * @memberof Status
    */
  var last_error_at: js.UndefOr[String] = js.undefined
  
  /**
    * last source item that errored
    * @type {string}
    * @memberof Status
    */
  var last_error_item: js.UndefOr[String] = js.undefined
  
  /**
    * reason for the last error
    * @type {string}
    * @memberof Status
    */
  var last_error_reason: js.UndefOr[String] = js.undefined
  
  /**
    * ISO-8601 date when source was last processed
    * @type {string}
    * @memberof Status
    */
  var last_processed_at: js.UndefOr[String] = js.undefined
  
  /**
    * last source item processed by ingester
    * @type {string}
    * @memberof Status
    */
  var last_processed_item: js.UndefOr[String] = js.undefined
  
  /**
    * state message
    * @type {string}
    * @memberof Status
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * ISO-8601 date when state was triggered
    * @type {string}
    * @memberof Status
    */
  var since: js.UndefOr[String] = js.undefined
  
  /**
    * Status of the Source's ingestion, one of: INITIALIZING, WATCHING, PROCESSING, COMPLETED, ERROR
    * @type {string}
    * @memberof Status
    */
  var state: js.UndefOr[StateEnum] = js.undefined
  
  /**
    * Total items that errored
    * @type {number}
    * @memberof Status
    */
  var total_error_items: js.UndefOr[Double] = js.undefined
  
  /**
    * Total items processed of source
    * @type {number}
    * @memberof Status
    */
  var total_processed_items: js.UndefOr[Double] = js.undefined
}
object Status {
  
  inline def apply(): Status = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Status]
  }
  
  @js.native
  sealed trait StateEnum extends StObject
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen/api", "Status.StateEnum")
  @js.native
  object StateEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StateEnum & Double] = js.native
    
    @js.native
    sealed trait COMPLETED
      extends StObject
         with StateEnum
    /* 3 */ val COMPLETED: typings.rockset.distCodegenApiMod.Status.StateEnum.COMPLETED & Double = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with StateEnum
    /* 4 */ val ERROR: typings.rockset.distCodegenApiMod.Status.StateEnum.ERROR & Double = js.native
    
    @js.native
    sealed trait INITIALIZING
      extends StObject
         with StateEnum
    /* 0 */ val INITIALIZING: typings.rockset.distCodegenApiMod.Status.StateEnum.INITIALIZING & Double = js.native
    
    @js.native
    sealed trait PROCESSING
      extends StObject
         with StateEnum
    /* 2 */ val PROCESSING: typings.rockset.distCodegenApiMod.Status.StateEnum.PROCESSING & Double = js.native
    
    @js.native
    sealed trait WATCHING
      extends StObject
         with StateEnum
    /* 1 */ val WATCHING: typings.rockset.distCodegenApiMod.Status.StateEnum.WATCHING & Double = js.native
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
    
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
    
    inline def setState(value: StateEnum): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTotal_error_items(value: Double): Self = StObject.set(x, "total_error_items", value.asInstanceOf[js.Any])
    
    inline def setTotal_error_itemsUndefined: Self = StObject.set(x, "total_error_items", js.undefined)
    
    inline def setTotal_processed_items(value: Double): Self = StObject.set(x, "total_processed_items", value.asInstanceOf[js.Any])
    
    inline def setTotal_processed_itemsUndefined: Self = StObject.set(x, "total_processed_items", js.undefined)
  }
}
