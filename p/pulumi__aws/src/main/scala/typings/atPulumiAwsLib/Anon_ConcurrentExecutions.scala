package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConcurrentExecutions extends js.Object {
  var concurrentExecutions: scala.Double
  var launchPath: java.lang.String
  var parameters: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ConcurrentExecutions {
  @scala.inline
  def apply(
    concurrentExecutions: scala.Double,
    launchPath: java.lang.String,
    parameters: java.lang.String = null
  ): Anon_ConcurrentExecutions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("concurrentExecutions")(concurrentExecutions)
    __obj.updateDynamic("launchPath")(launchPath)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[Anon_ConcurrentExecutions]
  }
}

