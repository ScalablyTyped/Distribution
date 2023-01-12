package typings.rollup.anon

import typings.rollup.mod.InputOption
import typings.rollup.mod.RollupWatcherEvent
import typings.rollup.rollupStrings.BUNDLE_START
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input
  extends StObject
     with RollupWatcherEvent {
  
  var code: BUNDLE_START
  
  var input: js.UndefOr[InputOption] = js.undefined
  
  var output: js.Array[String]
}
object Input {
  
  inline def apply(output: js.Array[String]): Input = {
    val __obj = js.Dynamic.literal(code = "BUNDLE_START", output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
    
    inline def setCode(value: BUNDLE_START): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setInput(value: InputOption): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setInputVarargs(value: String*): Self = StObject.set(x, "input", js.Array(value*))
    
    inline def setOutput(value: js.Array[String]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputVarargs(value: String*): Self = StObject.set(x, "output", js.Array(value*))
  }
}
