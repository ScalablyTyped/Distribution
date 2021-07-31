package typings.redisInfo.mod

import typings.redisInfo.mod.Flag.ON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistenceAOFOnInfo extends StObject {
  
  var aof_base_size: String
  
  var aof_buffer_length: String
  
  var aof_current_size: String
  
  var aof_delayed_fsync: String
  
  var aof_enabled: ON
  
  var aof_pending_bio_fsync: String
  
  var aof_pending_rewrite: Flag
  
  var aof_rewrite_buffer_length: String
}
object PersistenceAOFOnInfo {
  
  @scala.inline
  def apply(
    aof_base_size: String,
    aof_buffer_length: String,
    aof_current_size: String,
    aof_delayed_fsync: String,
    aof_enabled: ON,
    aof_pending_bio_fsync: String,
    aof_pending_rewrite: Flag,
    aof_rewrite_buffer_length: String
  ): PersistenceAOFOnInfo = {
    val __obj = js.Dynamic.literal(aof_base_size = aof_base_size.asInstanceOf[js.Any], aof_buffer_length = aof_buffer_length.asInstanceOf[js.Any], aof_current_size = aof_current_size.asInstanceOf[js.Any], aof_delayed_fsync = aof_delayed_fsync.asInstanceOf[js.Any], aof_enabled = aof_enabled.asInstanceOf[js.Any], aof_pending_bio_fsync = aof_pending_bio_fsync.asInstanceOf[js.Any], aof_pending_rewrite = aof_pending_rewrite.asInstanceOf[js.Any], aof_rewrite_buffer_length = aof_rewrite_buffer_length.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistenceAOFOnInfo]
  }
  
  @scala.inline
  implicit class PersistenceAOFOnInfoMutableBuilder[Self <: PersistenceAOFOnInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAof_base_size(value: String): Self = StObject.set(x, "aof_base_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAof_buffer_length(value: String): Self = StObject.set(x, "aof_buffer_length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAof_current_size(value: String): Self = StObject.set(x, "aof_current_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAof_delayed_fsync(value: String): Self = StObject.set(x, "aof_delayed_fsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAof_enabled(value: ON): Self = StObject.set(x, "aof_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAof_pending_bio_fsync(value: String): Self = StObject.set(x, "aof_pending_bio_fsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAof_pending_rewrite(value: Flag): Self = StObject.set(x, "aof_pending_rewrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAof_rewrite_buffer_length(value: String): Self = StObject.set(x, "aof_rewrite_buffer_length", value.asInstanceOf[js.Any])
  }
}
