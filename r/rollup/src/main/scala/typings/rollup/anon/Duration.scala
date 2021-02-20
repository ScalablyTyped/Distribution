package typings.rollup.anon

import typings.rollup.mod.InputOption
import typings.rollup.mod.RollupBuild
import typings.rollup.mod.RollupWatcherEvent
import typings.rollup.rollupStrings.BUNDLE_END
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Duration extends RollupWatcherEvent {
  
  var code: BUNDLE_END = js.native
  
  var duration: Double = js.native
  
  var input: js.UndefOr[InputOption] = js.native
  
  var output: js.Array[String] = js.native
  
  var result: RollupBuild = js.native
}
object Duration {
  
  @scala.inline
  def apply(code: BUNDLE_END, duration: Double, output: js.Array[String], result: RollupBuild): Duration = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit class DurationMutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: BUNDLE_END): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: InputOption): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setInputVarargs(value: String*): Self = StObject.set(x, "input", js.Array(value :_*))
    
    @scala.inline
    def setOutput(value: js.Array[String]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputVarargs(value: String*): Self = StObject.set(x, "output", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: RollupBuild): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
