package typings.rockset.distCodegenApiMod

import typings.rockset.distCodegenApiMod.StatusMongoDb.StateEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusMongoDb extends StObject {
  
  /**
    * MongoDB scan end time
    * @type {string}
    * @memberof StatusMongoDb
    */
  var scan_end_time: js.UndefOr[String] = js.undefined
  
  /**
    * Number of records inserted using scan
    * @type {number}
    * @memberof StatusMongoDb
    */
  var scan_records_processed: js.UndefOr[Double] = js.undefined
  
  /**
    * MongoDB scan start time
    * @type {string}
    * @memberof StatusMongoDb
    */
  var scan_start_time: js.UndefOr[String] = js.undefined
  
  /**
    * Number of records in MongoDB table at time of scan
    * @type {number}
    * @memberof StatusMongoDb
    */
  var scan_total_records: js.UndefOr[Double] = js.undefined
  
  /**
    * state of current ingest for this table
    * @type {string}
    * @memberof StatusMongoDb
    */
  var state: js.UndefOr[StateEnum] = js.undefined
  
  /**
    * ISO-8601 date when delete from source was last processed
    * @type {string}
    * @memberof StatusMongoDb
    */
  var stream_last_delete_processed_at: js.UndefOr[String] = js.undefined
  
  /**
    * ISO-8601 date when new insert from source was last processed
    * @type {string}
    * @memberof StatusMongoDb
    */
  var stream_last_insert_processed_at: js.UndefOr[String] = js.undefined
  
  /**
    * ISO-8601 date when update from source was last processed
    * @type {string}
    * @memberof StatusMongoDb
    */
  var stream_last_update_processed_at: js.UndefOr[String] = js.undefined
  
  /**
    * Number of new records deleted using stream
    * @type {number}
    * @memberof StatusMongoDb
    */
  var stream_records_deleted: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of new records inserted using stream
    * @type {number}
    * @memberof StatusMongoDb
    */
  var stream_records_inserted: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of new records updated using stream
    * @type {number}
    * @memberof StatusMongoDb
    */
  var stream_records_updated: js.UndefOr[Double] = js.undefined
}
object StatusMongoDb {
  
  inline def apply(): StatusMongoDb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusMongoDb]
  }
  
  @js.native
  sealed trait StateEnum extends StObject
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen/api", "StatusMongoDb.StateEnum")
  @js.native
  object StateEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StateEnum & Double] = js.native
    
    @js.native
    sealed trait INITIALIZING
      extends StObject
         with StateEnum
    /* 0 */ val INITIALIZING: typings.rockset.distCodegenApiMod.StatusMongoDb.StateEnum.INITIALIZING & Double = js.native
    
    @js.native
    sealed trait PROCESSINGSTREAM
      extends StObject
         with StateEnum
    /* 2 */ val PROCESSINGSTREAM: typings.rockset.distCodegenApiMod.StatusMongoDb.StateEnum.PROCESSINGSTREAM & Double = js.native
    
    @js.native
    sealed trait SCANNINGTABLE
      extends StObject
         with StateEnum
    /* 1 */ val SCANNINGTABLE: typings.rockset.distCodegenApiMod.StatusMongoDb.StateEnum.SCANNINGTABLE & Double = js.native
  }
  
  extension [Self <: StatusMongoDb](x: Self) {
    
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
    
    inline def setStream_last_delete_processed_at(value: String): Self = StObject.set(x, "stream_last_delete_processed_at", value.asInstanceOf[js.Any])
    
    inline def setStream_last_delete_processed_atUndefined: Self = StObject.set(x, "stream_last_delete_processed_at", js.undefined)
    
    inline def setStream_last_insert_processed_at(value: String): Self = StObject.set(x, "stream_last_insert_processed_at", value.asInstanceOf[js.Any])
    
    inline def setStream_last_insert_processed_atUndefined: Self = StObject.set(x, "stream_last_insert_processed_at", js.undefined)
    
    inline def setStream_last_update_processed_at(value: String): Self = StObject.set(x, "stream_last_update_processed_at", value.asInstanceOf[js.Any])
    
    inline def setStream_last_update_processed_atUndefined: Self = StObject.set(x, "stream_last_update_processed_at", js.undefined)
    
    inline def setStream_records_deleted(value: Double): Self = StObject.set(x, "stream_records_deleted", value.asInstanceOf[js.Any])
    
    inline def setStream_records_deletedUndefined: Self = StObject.set(x, "stream_records_deleted", js.undefined)
    
    inline def setStream_records_inserted(value: Double): Self = StObject.set(x, "stream_records_inserted", value.asInstanceOf[js.Any])
    
    inline def setStream_records_insertedUndefined: Self = StObject.set(x, "stream_records_inserted", js.undefined)
    
    inline def setStream_records_updated(value: Double): Self = StObject.set(x, "stream_records_updated", value.asInstanceOf[js.Any])
    
    inline def setStream_records_updatedUndefined: Self = StObject.set(x, "stream_records_updated", js.undefined)
  }
}
