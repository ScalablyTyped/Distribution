package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConcurrentExecutionsLaunchPath extends js.Object {
  var concurrentExecutions: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var launchPath: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var parameters: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_ConcurrentExecutionsLaunchPath {
  @scala.inline
  def apply(
    concurrentExecutions: atPulumiPulumiLib.outputMod.Input[scala.Double],
    launchPath: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    parameters: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_ConcurrentExecutionsLaunchPath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("concurrentExecutions")(concurrentExecutions.asInstanceOf[js.Any])
    __obj.updateDynamic("launchPath")(launchPath.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConcurrentExecutionsLaunchPath]
  }
}

