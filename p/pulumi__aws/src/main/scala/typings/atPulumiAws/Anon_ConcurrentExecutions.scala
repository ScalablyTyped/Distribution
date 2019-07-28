package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConcurrentExecutions extends js.Object {
  var concurrentExecutions: Double
  var launchPath: String
  var parameters: js.UndefOr[String] = js.undefined
}

object Anon_ConcurrentExecutions {
  @scala.inline
  def apply(concurrentExecutions: Double, launchPath: String, parameters: String = null): Anon_ConcurrentExecutions = {
    val __obj = js.Dynamic.literal(concurrentExecutions = concurrentExecutions, launchPath = launchPath)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[Anon_ConcurrentExecutions]
  }
}

