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
  
  @scala.inline
  def apply(): RollupWatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollupWatchOptions]
  }
  
  @scala.inline
  implicit class RollupWatchOptionsMutableBuilder[Self <: RollupWatchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutput(value: OutputOptions | js.Array[OutputOptions]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    @scala.inline
    def setOutputVarargs(value: OutputOptions*): Self = StObject.set(x, "output", js.Array(value :_*))
  }
}
