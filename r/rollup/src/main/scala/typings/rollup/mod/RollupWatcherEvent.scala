package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.rollup.anon.`1`
  - typings.rollup.anon.Input
  - typings.rollup.anon.Duration
  - typings.rollup.anon.`2`
  - typings.rollup.anon.Error
*/
trait RollupWatcherEvent extends StObject
object RollupWatcherEvent {
  
  inline def `1`(): typings.rollup.anon.`1` = {
    val __obj = js.Dynamic.literal(code = "START")
    __obj.asInstanceOf[typings.rollup.anon.`1`]
  }
  
  inline def `2`(): typings.rollup.anon.`2` = {
    val __obj = js.Dynamic.literal(code = "END")
    __obj.asInstanceOf[typings.rollup.anon.`2`]
  }
  
  inline def Duration(duration: Double, output: js.Array[String], result: RollupBuild): typings.rollup.anon.Duration = {
    val __obj = js.Dynamic.literal(code = "BUNDLE_END", duration = duration.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rollup.anon.Duration]
  }
  
  inline def Error(error: RollupError): typings.rollup.anon.Error = {
    val __obj = js.Dynamic.literal(code = "ERROR", error = error.asInstanceOf[js.Any], result = null)
    __obj.asInstanceOf[typings.rollup.anon.Error]
  }
  
  inline def Input(output: js.Array[String]): typings.rollup.anon.Input = {
    val __obj = js.Dynamic.literal(code = "BUNDLE_START", output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rollup.anon.Input]
  }
}
