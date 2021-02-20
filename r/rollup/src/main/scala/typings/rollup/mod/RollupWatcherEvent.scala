package typings.rollup.mod

import typings.rollup.rollupStrings.BUNDLE_END
import typings.rollup.rollupStrings.BUNDLE_START
import typings.rollup.rollupStrings.END
import typings.rollup.rollupStrings.ERROR
import typings.rollup.rollupStrings.START
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.rollup.anon.`2`
  - typings.rollup.anon.Input
  - typings.rollup.anon.Duration
  - typings.rollup.anon.`3`
  - typings.rollup.anon.Error
*/
trait RollupWatcherEvent extends StObject
object RollupWatcherEvent {
  
  @scala.inline
  def `2`(code: START): typings.rollup.anon.`2` = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rollup.anon.`2`]
  }
  
  @scala.inline
  def `3`(code: END): typings.rollup.anon.`3` = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rollup.anon.`3`]
  }
  
  @scala.inline
  def Duration(code: BUNDLE_END, duration: Double, output: js.Array[String], result: RollupBuild): typings.rollup.anon.Duration = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rollup.anon.Duration]
  }
  
  @scala.inline
  def Error(code: ERROR, error: RollupError): typings.rollup.anon.Error = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rollup.anon.Error]
  }
  
  @scala.inline
  def Input(code: BUNDLE_START, output: js.Array[String]): typings.rollup.anon.Input = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rollup.anon.Input]
  }
}
