package typings.pulumiAws.jobDefinitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.batch.JobDefinitionRetryStrategy
import typings.pulumiAws.inputMod.batch.JobDefinitionTimeout
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDefinitionArgs extends js.Object {
  /**
    * A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
    * provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
    */
  val containerProperties: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the name of the job definition.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the parameter substitution placeholders to set in the job definition.
    */
  val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
    * Maximum number of `retryStrategy` is `1`.  Defined below.
    */
  val retryStrategy: js.UndefOr[Input[JobDefinitionRetryStrategy]] = js.native
  /**
    * Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
    */
  val timeout: js.UndefOr[Input[JobDefinitionTimeout]] = js.native
  /**
    * The type of job definition.  Must be `container`
    */
  val `type`: Input[String] = js.native
}

object JobDefinitionArgs {
  @scala.inline
  def apply(
    `type`: Input[String],
    containerProperties: Input[String] = null,
    name: Input[String] = null,
    parameters: Input[StringDictionary[Input[String]]] = null,
    retryStrategy: Input[JobDefinitionRetryStrategy] = null,
    timeout: Input[JobDefinitionTimeout] = null
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

