package typings.pulumiAws.jobDefinitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.batch.JobDefinitionRetryStrategy
import typings.pulumiAws.inputMod.batch.JobDefinitionTimeout
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDefinitionState extends js.Object {
  /**
    * The Amazon Resource Name of the job definition.
    */
  val arn: js.UndefOr[Input[String]] = js.native
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
    * The revision of the job definition.
    */
  val revision: js.UndefOr[Input[Double]] = js.native
  /**
    * Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
    */
  val timeout: js.UndefOr[Input[JobDefinitionTimeout]] = js.native
  /**
    * The type of job definition.  Must be `container`
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object JobDefinitionState {
  @scala.inline
  def apply(): JobDefinitionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDefinitionState]
  }
  @scala.inline
  implicit class JobDefinitionStateOps[Self <: JobDefinitionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setContainerProperties(value: Input[String]): Self = this.set("containerProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerProperties: Self = this.set("containerProperties", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParameters(value: Input[StringDictionary[Input[String]]]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setRetryStrategy(value: Input[JobDefinitionRetryStrategy]): Self = this.set("retryStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryStrategy: Self = this.set("retryStrategy", js.undefined)
    @scala.inline
    def setRevision(value: Input[Double]): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
    @scala.inline
    def setTimeout(value: Input[JobDefinitionTimeout]): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

