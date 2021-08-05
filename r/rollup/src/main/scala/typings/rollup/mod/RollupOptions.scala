package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupOptions
  extends StObject
     with InputOptions {
  
  // This is included for compatibility with config files but ignored by rollup.rollup
  var output: js.UndefOr[OutputOptions | js.Array[OutputOptions]] = js.undefined
}
object RollupOptions {
  
  inline def apply(): RollupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollupOptions]
  }
  
  extension [Self <: RollupOptions](x: Self) {
    
    inline def setOutput(value: OutputOptions | js.Array[OutputOptions]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setOutputVarargs(value: OutputOptions*): Self = StObject.set(x, "output", js.Array(value :_*))
  }
}
