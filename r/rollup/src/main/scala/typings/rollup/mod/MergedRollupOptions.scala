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
  
  @scala.inline
  def apply(output: js.Array[OutputOptions]): MergedRollupOptions = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergedRollupOptions]
  }
  
  @scala.inline
  implicit class MergedRollupOptionsMutableBuilder[Self <: MergedRollupOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutput(value: js.Array[OutputOptions]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputVarargs(value: OutputOptions*): Self = StObject.set(x, "output", js.Array(value :_*))
  }
}
