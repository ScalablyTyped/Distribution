package typings.serverless.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDefinition extends js.Object {
  @JSName("package")
  var _package: Package
  var environment: js.UndefOr[StringDictionary[String]] = js.undefined
  var events: js.Array[Event]
  var handler: String
  var memorySize: js.UndefOr[Double] = js.undefined
  var name: String
  var runtime: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object FunctionDefinition {
  @scala.inline
  def apply(
    _package: Package,
    events: js.Array[Event],
    handler: String,
    name: String,
    environment: StringDictionary[String] = null,
    memorySize: js.UndefOr[Double] = js.undefined,
    runtime: String = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): FunctionDefinition = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (!js.isUndefined(memorySize)) __obj.updateDynamic("memorySize")(memorySize.get.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDefinition]
  }
}

