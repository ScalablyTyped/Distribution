package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.stencilCore.stencilPrivateMod.RollupChunkResult
  - typings.stencilCore.stencilPrivateMod.RollupAssetResult
*/
trait RollupResult extends StObject
object RollupResult {
  
  inline def RollupAssetResult(content: String, fileName: String): typings.stencilCore.stencilPrivateMod.RollupAssetResult = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("asset")
    __obj.asInstanceOf[typings.stencilCore.stencilPrivateMod.RollupAssetResult]
  }
  
  inline def RollupChunkResult(
    code: String,
    entryKey: String,
    fileName: String,
    imports: js.Array[String],
    isBrowserLoader: Boolean,
    isComponent: Boolean,
    isCore: Boolean,
    isEntry: Boolean,
    isIndex: Boolean,
    moduleFormat: ModuleFormat
  ): typings.stencilCore.stencilPrivateMod.RollupChunkResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], entryKey = entryKey.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], isBrowserLoader = isBrowserLoader.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isCore = isCore.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any], isIndex = isIndex.asInstanceOf[js.Any], moduleFormat = moduleFormat.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chunk")
    __obj.asInstanceOf[typings.stencilCore.stencilPrivateMod.RollupChunkResult]
  }
}
