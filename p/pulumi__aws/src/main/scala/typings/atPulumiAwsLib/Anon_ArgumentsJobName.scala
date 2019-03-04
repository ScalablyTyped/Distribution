package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgumentsJobName extends js.Object {
  var arguments: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  var jobName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var timeout: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_ArgumentsJobName {
  @scala.inline
  def apply(
    jobName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    arguments: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    timeout: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_ArgumentsJobName = {
    val __obj = js.Dynamic.literal(jobName = jobName.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArgumentsJobName]
  }
}

