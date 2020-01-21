package typings.rollup

import typings.rollup.mod.InputOption
import typings.rollup.mod.RollupBuild
import typings.rollup.mod.RollupWatcherEvent
import typings.rollup.rollupStrings.BUNDLE_END
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBUNDLEEND extends RollupWatcherEvent {
  var code: BUNDLE_END
  var duration: Double
  var input: InputOption
  var output: js.Array[String]
  var result: RollupBuild
}

object AnonBUNDLEEND {
  @scala.inline
  def apply(
    code: BUNDLE_END,
    duration: Double,
    input: InputOption,
    output: js.Array[String],
    result: RollupBuild
  ): AnonBUNDLEEND = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBUNDLEEND]
  }
}

