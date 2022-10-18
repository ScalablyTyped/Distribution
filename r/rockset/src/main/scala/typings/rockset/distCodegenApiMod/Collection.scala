package typings.rockset.distCodegenApiMod

import typings.rockset.distCodegenApiMod.Collection.StatusEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collection extends StObject {
  
  /**
    * ISO-8601 date
    * @type {string}
    * @memberof Collection
    */
  var created_at: js.UndefOr[String] = js.undefined
  
  /**
    * email of user who created the collection
    * @type {string}
    * @memberof Collection
    */
  var created_by: js.UndefOr[String] = js.undefined
  
  /**
    * text describing the collection
    * @type {string}
    * @memberof Collection
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * list of mappings applied on all documents in a collection
    * @type {Array<FieldMappingV2>}
    * @memberof Collection
    */
  var field_mappings: js.UndefOr[js.Array[FieldMappingV2]] = js.undefined
  
  /**
    * unique identifer for collection, can contain alphanumeric or dash characters
    * @type {string}
    * @memberof Collection
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * number of seconds after which data is purged based on event time
    * @type {number}
    * @memberof Collection
    */
  var retention_secs: js.UndefOr[Double] = js.undefined
  
  /**
    * list of sources from which collection ingests
    * @type {Array<Source>}
    * @memberof Collection
    */
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
  
  /**
    * metrics about the collection
    * @type {CollectionStats}
    * @memberof Collection
    */
  var stats: js.UndefOr[CollectionStats] = js.undefined
  
  /**
    * current status of collection, one of: CREATED, READY, DELETED
    * @type {string}
    * @memberof Collection
    */
  var status: js.UndefOr[StatusEnum] = js.undefined
  
  /**
    * name of the workspace that the collection is in
    * @type {string}
    * @memberof Collection
    */
  var workspace: js.UndefOr[String] = js.undefined
}
object Collection {
  
  inline def apply(): Collection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collection]
  }
  
  @js.native
  sealed trait StatusEnum extends StObject
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen/api", "Collection.StatusEnum")
  @js.native
  object StatusEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StatusEnum & Double] = js.native
    
    @js.native
    sealed trait BULKINGESTMODE
      extends StObject
         with StatusEnum
    /* 7 */ val BULKINGESTMODE: typings.rockset.distCodegenApiMod.Collection.StatusEnum.BULKINGESTMODE & Double = js.native
    
    @js.native
    sealed trait CREATED
      extends StObject
         with StatusEnum
    /* 1 */ val CREATED: typings.rockset.distCodegenApiMod.Collection.StatusEnum.CREATED & Double = js.native
    
    @js.native
    sealed trait DELETED
      extends StObject
         with StatusEnum
    /* 4 */ val DELETED: typings.rockset.distCodegenApiMod.Collection.StatusEnum.DELETED & Double = js.native
    
    @js.native
    sealed trait EXITINGBULKINGESTMODE
      extends StObject
         with StatusEnum
    /* 8 */ val EXITINGBULKINGESTMODE: typings.rockset.distCodegenApiMod.Collection.StatusEnum.EXITINGBULKINGESTMODE & Double = js.native
    
    @js.native
    sealed trait INITIALIZED
      extends StObject
         with StatusEnum
    /* 0 */ val INITIALIZED: typings.rockset.distCodegenApiMod.Collection.StatusEnum.INITIALIZED & Double = js.native
    
    @js.native
    sealed trait PAUSED
      extends StObject
         with StatusEnum
    /* 3 */ val PAUSED: typings.rockset.distCodegenApiMod.Collection.StatusEnum.PAUSED & Double = js.native
    
    @js.native
    sealed trait PAUSING
      extends StObject
         with StatusEnum
    /* 5 */ val PAUSING: typings.rockset.distCodegenApiMod.Collection.StatusEnum.PAUSING & Double = js.native
    
    @js.native
    sealed trait READY
      extends StObject
         with StatusEnum
    /* 2 */ val READY: typings.rockset.distCodegenApiMod.Collection.StatusEnum.READY & Double = js.native
    
    @js.native
    sealed trait RESUMING
      extends StObject
         with StatusEnum
    /* 6 */ val RESUMING: typings.rockset.distCodegenApiMod.Collection.StatusEnum.RESUMING & Double = js.native
    
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with StatusEnum
    /* 9 */ val UNKNOWN: typings.rockset.distCodegenApiMod.Collection.StatusEnum.UNKNOWN & Double = js.native
  }
  
  extension [Self <: Collection](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
    
    inline def setCreated_byUndefined: Self = StObject.set(x, "created_by", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setField_mappings(value: js.Array[FieldMappingV2]): Self = StObject.set(x, "field_mappings", value.asInstanceOf[js.Any])
    
    inline def setField_mappingsUndefined: Self = StObject.set(x, "field_mappings", js.undefined)
    
    inline def setField_mappingsVarargs(value: FieldMappingV2*): Self = StObject.set(x, "field_mappings", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRetention_secs(value: Double): Self = StObject.set(x, "retention_secs", value.asInstanceOf[js.Any])
    
    inline def setRetention_secsUndefined: Self = StObject.set(x, "retention_secs", js.undefined)
    
    inline def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setStats(value: CollectionStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatus(value: StatusEnum): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setWorkspace(value: String): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
  }
}
