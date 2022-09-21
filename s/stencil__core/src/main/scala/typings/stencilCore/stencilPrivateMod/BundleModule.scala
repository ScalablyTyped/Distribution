package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleModule extends StObject {
  
  var cmps: js.Array[ComponentCompilerMeta]
  
  var entryKey: String
  
  var output: BundleModuleOutput
  
  var rollupResult: RollupChunkResult
}
object BundleModule {
  
  inline def apply(
    cmps: js.Array[ComponentCompilerMeta],
    entryKey: String,
    output: BundleModuleOutput,
    rollupResult: RollupChunkResult
  ): BundleModule = {
    val __obj = js.Dynamic.literal(cmps = cmps.asInstanceOf[js.Any], entryKey = entryKey.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], rollupResult = rollupResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleModule]
  }
  
  extension [Self <: BundleModule](x: Self) {
    
    inline def setCmps(value: js.Array[ComponentCompilerMeta]): Self = StObject.set(x, "cmps", value.asInstanceOf[js.Any])
    
    inline def setCmpsVarargs(value: ComponentCompilerMeta*): Self = StObject.set(x, "cmps", js.Array(value*))
    
    inline def setEntryKey(value: String): Self = StObject.set(x, "entryKey", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: BundleModuleOutput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setRollupResult(value: RollupChunkResult): Self = StObject.set(x, "rollupResult", value.asInstanceOf[js.Any])
  }
}
