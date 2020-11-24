package typings.rollup.anon

import typings.rollup.mod.InternalModuleFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetFileName extends js.Object {
  
  var assetFileName: String = js.native
  
  var chunkId: String = js.native
  
  var format: InternalModuleFormat = js.native
  
  var moduleId: String = js.native
  
  var relativeAssetPath: String = js.native
}
object AssetFileName {
  
  @scala.inline
  def apply(
    assetFileName: String,
    chunkId: String,
    format: InternalModuleFormat,
    moduleId: String,
    relativeAssetPath: String
  ): AssetFileName = {
    val __obj = js.Dynamic.literal(assetFileName = assetFileName.asInstanceOf[js.Any], chunkId = chunkId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], relativeAssetPath = relativeAssetPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetFileName]
  }
  
  @scala.inline
  implicit class AssetFileNameOps[Self <: AssetFileName] (val x: Self) extends AnyVal {
    
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
    def setAssetFileName(value: String): Self = this.set("assetFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkId(value: String): Self = this.set("chunkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: InternalModuleFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleId(value: String): Self = this.set("moduleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeAssetPath(value: String): Self = this.set("relativeAssetPath", value.asInstanceOf[js.Any])
  }
}
