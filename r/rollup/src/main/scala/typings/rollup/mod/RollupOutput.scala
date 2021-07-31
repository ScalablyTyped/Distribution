package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupOutput extends StObject {
  
  var output: Array[OutputChunk | OutputAsset]
}
object RollupOutput {
  
  @scala.inline
  def apply(output: Array[OutputChunk | OutputAsset]): RollupOutput = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupOutput]
  }
  
  @scala.inline
  implicit class RollupOutputMutableBuilder[Self <: RollupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutput(value: Array[OutputChunk | OutputAsset]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
