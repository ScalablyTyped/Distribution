package typings.rollup.anon

import typings.rollup.mod.InternalModuleFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChunkId extends StObject {
  
  var chunkId: String = js.native
  
  var format: InternalModuleFormat = js.native
  
  var moduleId: String = js.native
}
object ChunkId {
  
  @scala.inline
  def apply(chunkId: String, format: InternalModuleFormat, moduleId: String): ChunkId = {
    val __obj = js.Dynamic.literal(chunkId = chunkId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkId]
  }
  
  @scala.inline
  implicit class ChunkIdMutableBuilder[Self <: ChunkId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunkId(value: String): Self = StObject.set(x, "chunkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: InternalModuleFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
  }
}
