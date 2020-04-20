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
    memorySize: Int | Double = null,
    runtime: String = null,
    timeout: Int | Double = null
  ): FunctionDefinition = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (memorySize != null) __obj.updateDynamic("memorySize")(memorySize.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDefinition]
  }
}

