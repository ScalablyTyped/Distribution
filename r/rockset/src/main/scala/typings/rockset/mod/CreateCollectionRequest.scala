package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCollectionRequest extends StObject {
  
  // text describing the collection
  var description: js.UndefOr[String] = js.native
  
  // configuration for event data
  var event_time_info: js.UndefOr[EventTimeInfo] = js.native
  
  // list of mappings
  var field_mappings: js.UndefOr[js.Array[FieldMappingV2]] = js.native
  
  // unique identifer for collection, can contain alphanumeric or dash characters
  var name: String = js.native
  
  // number of seconds after which data is purged, based on event time
  var retention_secs: js.UndefOr[Double] = js.native
  
  // list of sources from which to ingest data
  var sources: js.UndefOr[js.Array[Source]] = js.native
}
object CreateCollectionRequest {
  
  @scala.inline
  def apply(name: String): CreateCollectionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCollectionRequest]
  }
  
  @scala.inline
  implicit class CreateCollectionRequestMutableBuilder[Self <: CreateCollectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEvent_time_info(value: EventTimeInfo): Self = StObject.set(x, "event_time_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent_time_infoUndefined: Self = StObject.set(x, "event_time_info", js.undefined)
    
    @scala.inline
    def setField_mappings(value: js.Array[FieldMappingV2]): Self = StObject.set(x, "field_mappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField_mappingsUndefined: Self = StObject.set(x, "field_mappings", js.undefined)
    
    @scala.inline
    def setField_mappingsVarargs(value: FieldMappingV2*): Self = StObject.set(x, "field_mappings", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetention_secs(value: Double): Self = StObject.set(x, "retention_secs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetention_secsUndefined: Self = StObject.set(x, "retention_secs", js.undefined)
    
    @scala.inline
    def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
