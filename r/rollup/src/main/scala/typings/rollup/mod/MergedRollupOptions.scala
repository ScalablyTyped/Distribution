package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergedRollupOptions
  extends StObject
     with InputOptionsWithPlugins {
  
  var output: js.Array[OutputOptions]
}
object MergedRollupOptions {
  
  inline def apply(output: js.Array[OutputOptions], plugins: js.Array[Plugin]): MergedRollupOptions = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergedRollupOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MergedRollupOptions] (val x: Self) extends AnyVal {
    
    inline def setOutput(value: js.Array[OutputOptions]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputVarargs(value: OutputOptions*): Self = StObject.set(x, "output", js.Array(value*))
  }
}
