package typings
package atPulumiAwsLib.batchJobDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobDefinitionArgs extends js.Object {
  /**
    * A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
    * provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
    */
  val containerProperties: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the name of the job definition.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the parameter substitution placeholders to set in the job definition.
    */
  val parameters: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
    * Maximum number of `retry_strategy` is `1`.  Defined below.
    */
  val retryStrategy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AttemptsInput]] = js.undefined
  /**
    * Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
    */
  val timeout: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AttemptDurationSecondsInput]
  ] = js.undefined
  /**
    * The type of job definition.  Must be `container`
    */
  val `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object JobDefinitionArgs {
  @scala.inline
  def apply(
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    containerProperties: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    parameters: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null,
    retryStrategy: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AttemptsInput] = null,
    timeout: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AttemptDurationSecondsInput] = null
  ): JobDefinitionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (containerProperties != null) __obj.updateDynamic("containerProperties")(containerProperties.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (retryStrategy != null) __obj.updateDynamic("retryStrategy")(retryStrategy.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDefinitionArgs]
  }
}

