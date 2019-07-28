package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgumentsJobName extends js.Object {
  var arguments: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  var jobName: Input[String]
  var timeout: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_ArgumentsJobName {
  @scala.inline
  def apply(
    jobName: Input[String],
    arguments: Input[StringDictionary[_]] = null,
    timeout: Input[Double] = null
  ): Anon_ArgumentsJobName = {
    val __obj = js.Dynamic.literal(jobName = jobName.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArgumentsJobName]
  }
}

