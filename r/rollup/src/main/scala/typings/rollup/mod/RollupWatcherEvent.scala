package typings.rollup.mod

import typings.rollup.rollupStrings.BUNDLE_END
import typings.rollup.rollupStrings.BUNDLE_START
import typings.rollup.rollupStrings.END
import typings.rollup.rollupStrings.ERROR
import typings.rollup.rollupStrings.START
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rollup.Anon0
  - typings.rollup.AnonInput
  - typings.rollup.AnonDuration
  - typings.rollup.Anon1
  - typings.rollup.AnonError
*/
trait RollupWatcherEvent extends js.Object

object RollupWatcherEvent {
  @scala.inline
  def Anon0(code: START): RollupWatcherEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RollupWatcherEvent]
  }
  @scala.inline
  def AnonInput(code: BUNDLE_START, input: InputOption, output: js.Array[String]): RollupWatcherEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RollupWatcherEvent]
  }
  @scala.inline
  def AnonDuration(
    code: BUNDLE_END,
    duration: Double,
    input: InputOption,
    output: js.Array[String],
    result: RollupBuild
  ): RollupWatcherEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RollupWatcherEvent]
  }
  @scala.inline
  def Anon1(code: END): RollupWatcherEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RollupWatcherEvent]
  }
  @scala.inline
  def AnonError(code: ERROR, error: RollupError): RollupWatcherEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RollupWatcherEvent]
  }
}

