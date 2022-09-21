package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergedRollupOptions
  extends StObject
     with InputOptions {
  
  var output: js.Array[OutputOptions]
}
object MergedRollupOptions {
  
  inline def apply(output: js.Array[OutputOptions]): MergedRollupOptions = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergedRollupOptions]
  }
  
  extension [Self <: MergedRollupOptions](x: Self) {
    
    inline def setOutput(value: js.Array[OutputOptions]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputVarargs(value: OutputOptions*): Self = StObject.set(x, "output", js.Array(value*))
  }
}
