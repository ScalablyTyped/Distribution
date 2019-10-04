package typings.atPulumiAws.batchJobDefinitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.batchNs.JobDefinitionRetryStrategy
import typings.atPulumiAws.typesInputMod.batchNs.JobDefinitionTimeout
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobDefinitionState extends js.Object {
  /**
    * The Amazon Resource Name of the job definition.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
    * provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
    */
  val containerProperties: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies the name of the job definition.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies the parameter substitution placeholders to set in the job definition.
    */
  val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
    * Maximum number of `retryStrategy` is `1`.  Defined below.
    */
  val retryStrategy: js.UndefOr[Input[JobDefinitionRetryStrategy]] = js.undefined
  /**
    * The revision of the job definition.
    */
  val revision: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
    */
  val timeout: js.UndefOr[Input[JobDefinitionTimeout]] = js.undefined
  /**
    * The type of job definition.  Must be `container`
    */
  val `type`: js.UndefOr[Input[String]] = js.undefined
}

object JobDefinitionState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    containerProperties: Input[String] = null,
    name: Input[String] = null,
    parameters: Input[StringDictionary[Input[String]]] = null,
    retryStrategy: Input[JobDefinitionRetryStrategy] = null,
    revision: Input[Double] = null,
    timeout: Input[JobDefinitionTimeout] = null,
    `type`: Input[String] = null
  ): JobDefinitionState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (containerProperties != null) __obj.updateDynamic("containerProperties")(containerProperties.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (retryStrategy != null) __obj.updateDynamic("retryStrategy")(retryStrategy.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDefinitionState]
  }
}

