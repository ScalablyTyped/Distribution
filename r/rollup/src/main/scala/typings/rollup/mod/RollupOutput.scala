package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupOutput extends StObject {
  
  var output: Array[OutputChunk | OutputAsset]
}
object RollupOutput {
  
  inline def apply(output: Array[OutputChunk | OutputAsset]): RollupOutput = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupOutput]
  }
  
  extension [Self <: RollupOutput](x: Self) {
    
    inline def setOutput(value: Array[OutputChunk | OutputAsset]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
