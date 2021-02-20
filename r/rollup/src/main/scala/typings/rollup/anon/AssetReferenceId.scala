package typings.rollup.anon

import typings.rollup.mod.InternalModuleFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetReferenceId extends StObject {
  
  var assetReferenceId: String | Null = js.native
  
  var chunkId: String = js.native
  
  var chunkReferenceId: String | Null = js.native
  
  var fileName: String = js.native
  
  var format: InternalModuleFormat = js.native
  
  var moduleId: String = js.native
  
  var referenceId: String = js.native
  
  var relativePath: String = js.native
}
object AssetReferenceId {
  
  @scala.inline
  def apply(
    chunkId: String,
    fileName: String,
    format: InternalModuleFormat,
    moduleId: String,
    referenceId: String,
    relativePath: String
  ): AssetReferenceId = {
    val __obj = js.Dynamic.literal(chunkId = chunkId.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], referenceId = referenceId.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetReferenceId]
  }
  
  @scala.inline
  implicit class AssetReferenceIdMutableBuilder[Self <: AssetReferenceId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetReferenceId(value: String): Self = StObject.set(x, "assetReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetReferenceIdNull: Self = StObject.set(x, "assetReferenceId", null)
    
    @scala.inline
    def setChunkId(value: String): Self = StObject.set(x, "chunkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkReferenceId(value: String): Self = StObject.set(x, "chunkReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkReferenceIdNull: Self = StObject.set(x, "chunkReferenceId", null)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: InternalModuleFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceId(value: String): Self = StObject.set(x, "referenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
  }
}
