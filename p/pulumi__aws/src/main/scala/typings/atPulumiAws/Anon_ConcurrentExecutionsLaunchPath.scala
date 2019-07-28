package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConcurrentExecutionsLaunchPath extends js.Object {
  var concurrentExecutions: Input[Double]
  var launchPath: Input[String]
  var parameters: js.UndefOr[Input[String]] = js.undefined
}

object Anon_ConcurrentExecutionsLaunchPath {
  @scala.inline
  def apply(concurrentExecutions: Input[Double], launchPath: Input[String], parameters: Input[String] = null): Anon_ConcurrentExecutionsLaunchPath = {
    val __obj = js.Dynamic.literal(concurrentExecutions = concurrentExecutions.asInstanceOf[js.Any], launchPath = launchPath.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConcurrentExecutionsLaunchPath]
  }
}

