package typings.serverless.serverlessMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDefinition extends js.Object {
  var environment: js.UndefOr[StringDictionary[String]] = js.undefined
  var handler: String
  var memorySize: js.UndefOr[Double] = js.undefined
  var name: String
  var `package`: Package
  var runtime: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object FunctionDefinition {
  @scala.inline
  def apply(
    handler: String,
    name: String,
    `package`: Package,
    environment: StringDictionary[String] = null,
    memorySize: Int | Double = null,
    runtime: String = null,
    timeout: Int | Double = null
  ): FunctionDefinition = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(`package`.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (memorySize != null) __obj.updateDynamic("memorySize")(memorySize.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDefinition]
  }
}

