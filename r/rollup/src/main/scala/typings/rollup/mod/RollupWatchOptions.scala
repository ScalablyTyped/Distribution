package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupWatchOptions
  extends StObject
     with InputOptions {
  
  var output: js.UndefOr[OutputOptions | js.Array[OutputOptions]] = js.undefined
}
object RollupWatchOptions {
  
  inline def apply(): RollupWatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollupWatchOptions]
  }
  
  extension [Self <: RollupWatchOptions](x: Self) {
    
    inline def setOutput(value: OutputOptions | js.Array[OutputOptions]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setOutputVarargs(value: OutputOptions*): Self = StObject.set(x, "output", js.Array(value*))
  }
}
