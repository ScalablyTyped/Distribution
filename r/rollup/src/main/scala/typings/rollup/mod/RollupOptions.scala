package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RollupOptions extends InputOptions {
  
  // This is included for compatibility with config files but ignored by rollup.rollup
  var output: js.UndefOr[OutputOptions | js.Array[OutputOptions]] = js.native
}
object RollupOptions {
  
  @scala.inline
  def apply(): RollupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollupOptions]
  }
  
  @scala.inline
  implicit class RollupOptionsMutableBuilder[Self <: RollupOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutput(value: OutputOptions | js.Array[OutputOptions]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    @scala.inline
    def setOutputVarargs(value: OutputOptions*): Self = StObject.set(x, "output", js.Array(value :_*))
  }
}
