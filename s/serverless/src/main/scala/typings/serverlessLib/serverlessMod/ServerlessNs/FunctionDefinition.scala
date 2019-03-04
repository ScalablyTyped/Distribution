package typings
package serverlessLib.serverlessMod.ServerlessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDefinition extends js.Object {
  var environment: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var handler: java.lang.String
  var memorySize: js.UndefOr[scala.Double] = js.undefined
  var name: java.lang.String
  var `package`: Package
  var runtime: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object FunctionDefinition {
  @scala.inline
  def apply(
    handler: java.lang.String,
    name: java.lang.String,
    `package`: Package,
    environment: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    memorySize: scala.Int | scala.Double = null,
    runtime: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): FunctionDefinition = {
    val __obj = js.Dynamic.literal(handler = handler, name = name)
    __obj.updateDynamic("package")(`package`)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (memorySize != null) __obj.updateDynamic("memorySize")(memorySize.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDefinition]
  }
}

