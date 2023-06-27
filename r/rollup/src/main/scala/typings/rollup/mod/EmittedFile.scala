package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.rollup.mod.EmittedAsset
  - typings.rollup.mod.EmittedChunk
  - typings.rollup.mod.EmittedPrebuiltChunk
*/
trait EmittedFile extends StObject
object EmittedFile {
  
  inline def EmittedAsset(): typings.rollup.mod.EmittedAsset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("asset")
    __obj.asInstanceOf[typings.rollup.mod.EmittedAsset]
  }
  
  inline def EmittedChunk(id: String): typings.rollup.mod.EmittedChunk = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chunk")
    __obj.asInstanceOf[typings.rollup.mod.EmittedChunk]
  }
  
  inline def EmittedPrebuiltChunk(code: String, fileName: String): typings.rollup.mod.EmittedPrebuiltChunk = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("prebuilt-chunk")
    __obj.asInstanceOf[typings.rollup.mod.EmittedPrebuiltChunk]
  }
}
