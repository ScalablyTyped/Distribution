package typings.rockset.distCodegenApiMod

import typings.rockset.distCodegenApiMod.StatusDynamoDb.StateEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusDynamoDb extends StObject {
  
  /**
    * DynamoDb scan end time
    * @type {string}
    * @memberof StatusDynamoDb
    */
  var scan_end_time: js.UndefOr[String] = js.undefined
  
  /**
    * Number of records inserted using scan
    * @type {number}
    * @memberof StatusDynamoDb
    */
  var scan_records_processed: js.UndefOr[Double] = js.undefined
  
  /**
    * DynamoDB scan start time
    * @type {string}
    * @memberof StatusDynamoDb
    */
  var scan_start_time: js.UndefOr[String] = js.undefined
  
  /**
    * Number of records in DynamoDB table at time of scan
    * @type {number}
    * @memberof StatusDynamoDb
    */
  var scan_total_records: js.UndefOr[Double] = js.undefined
  
  /**
    * state of current ingest for this table
    * @type {string}
    * @memberof StatusDynamoDb
    */
  var state: js.UndefOr[StateEnum] = js.undefined
  
  /**
    * ISO-8601 date when source was last processed
    * @type {string}
    * @memberof StatusDynamoDb
    */
  var stream_last_processed_at: js.UndefOr[String] = js.undefined
}
object StatusDynamoDb {
  
  inline def apply(): StatusDynamoDb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusDynamoDb]
  }
  
  @js.native
  sealed trait StateEnum extends StObject
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen/api", "StatusDynamoDb.StateEnum")
  @js.native
  object StateEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StateEnum & Double] = js.native
    
    @js.native
    sealed trait INITIALIZING
      extends StObject
         with StateEnum
    /* 0 */ val INITIALIZING: typings.rockset.distCodegenApiMod.StatusDynamoDb.StateEnum.INITIALIZING & Double = js.native
    
    @js.native
    sealed trait PROCESSINGSTREAM
      extends StObject
         with StateEnum
    /* 2 */ val PROCESSINGSTREAM: typings.rockset.distCodegenApiMod.StatusDynamoDb.StateEnum.PROCESSINGSTREAM & Double = js.native
    
    @js.native
    sealed trait SCANNINGTABLE
      extends StObject
         with StateEnum
    /* 1 */ val SCANNINGTABLE: typings.rockset.distCodegenApiMod.StatusDynamoDb.StateEnum.SCANNINGTABLE & Double = js.native
  }
  
  extension [Self <: StatusDynamoDb](x: Self) {
    
    inline def setScan_end_time(value: String): Self = StObject.set(x, "scan_end_time", value.asInstanceOf[js.Any])
    
    inline def setScan_end_timeUndefined: Self = StObject.set(x, "scan_end_time", js.undefined)
    
    inline def setScan_records_processed(value: Double): Self = StObject.set(x, "scan_records_processed", value.asInstanceOf[js.Any])
    
    inline def setScan_records_processedUndefined: Self = StObject.set(x, "scan_records_processed", js.undefined)
    
    inline def setScan_start_time(value: String): Self = StObject.set(x, "scan_start_time", value.asInstanceOf[js.Any])
    
    inline def setScan_start_timeUndefined: Self = StObject.set(x, "scan_start_time", js.undefined)
    
    inline def setScan_total_records(value: Double): Self = StObject.set(x, "scan_total_records", value.asInstanceOf[js.Any])
    
    inline def setScan_total_recordsUndefined: Self = StObject.set(x, "scan_total_records", js.undefined)
    
    inline def setState(value: StateEnum): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStream_last_processed_at(value: String): Self = StObject.set(x, "stream_last_processed_at", value.asInstanceOf[js.Any])
    
    inline def setStream_last_processed_atUndefined: Self = StObject.set(x, "stream_last_processed_at", js.undefined)
  }
}
