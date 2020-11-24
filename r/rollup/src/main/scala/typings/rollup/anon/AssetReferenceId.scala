package typings.rollup.anon

import typings.rollup.mod.InternalModuleFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetReferenceId extends js.Object {
  
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
  implicit class AssetReferenceIdOps[Self <: AssetReferenceId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChunkId(value: String): Self = this.set("chunkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: InternalModuleFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleId(value: String): Self = this.set("moduleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceId(value: String): Self = this.set("referenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativePath(value: String): Self = this.set("relativePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetReferenceId(value: String): Self = this.set("assetReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetReferenceIdNull: Self = this.set("assetReferenceId", null)
    
    @scala.inline
    def setChunkReferenceId(value: String): Self = this.set("chunkReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkReferenceIdNull: Self = this.set("chunkReferenceId", null)
  }
}
