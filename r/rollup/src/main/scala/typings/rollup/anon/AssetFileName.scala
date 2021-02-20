package typings.rollup.anon

import typings.rollup.mod.InternalModuleFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetFileName extends StObject {
  
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
  implicit class AssetFileNameMutableBuilder[Self <: AssetFileName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetFileName(value: String): Self = StObject.set(x, "assetFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkId(value: String): Self = StObject.set(x, "chunkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: InternalModuleFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeAssetPath(value: String): Self = StObject.set(x, "relativeAssetPath", value.asInstanceOf[js.Any])
  }
}
