package typings.pulumiAws.mltransformMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.glue.MLTransformInputRecordTable
import typings.pulumiAws.inputMod.glue.MLTransformParameters
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MLTransformArgs extends js.Object {
  
  /**
    * Description of the ML Transform.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The version of glue to use, for example "1.0". For information about available versions, see the [AWS Glue Release Notes](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html).
    */
  val glueVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of AWS Glue table definitions used by the transform. see Input Record Tables.
    */
  val inputRecordTables: Input[js.Array[Input[MLTransformInputRecordTable]]] = js.native
  
  /**
    * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can allocate from `2` to `100` DPUs; the default is `10`. `maxCapacity` is a mutually exclusive option with `numberOfWorkers` and `workerType`.
    */
  val maxCapacity: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The maximum number of times to retry this ML Transform if it fails.
    */
  val maxRetries: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The name you assign to this ML Transform. It must be unique in your account.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The number of workers of a defined `workerType` that are allocated when an ML Transform runs. Required with `workerType`.
    */
  val numberOfWorkers: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The algorithmic parameters that are specific to the transform type used. Conditionally dependent on the transform type. see Parameters.
    */
  val parameters: Input[MLTransformParameters] = js.native
  
  /**
    * The ARN of the IAM role associated with this ML Transform.
    */
  val roleArn: Input[String] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The ML Transform timeout in minutes. The default is 2880 minutes (48 hours).
    */
  val timeout: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The type of predefined worker that is allocated when an ML Transform runs. Accepts a value of `Standard`, `G.1X`, or `G.2X`. Required with `numberOfWorkers`.
    */
  val workerType: js.UndefOr[Input[String]] = js.native
}
object MLTransformArgs {
  
  @scala.inline
  def apply(
    inputRecordTables: Input[js.Array[Input[MLTransformInputRecordTable]]],
    parameters: Input[MLTransformParameters],
    roleArn: Input[String]
  ): MLTransformArgs = {
    val __obj = js.Dynamic.literal(inputRecordTables = inputRecordTables.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MLTransformArgs]
  }
  
  @scala.inline
  implicit class MLTransformArgsOps[Self <: MLTransformArgs] (val x: Self) extends AnyVal {
    
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
    def setInputRecordTablesVarargs(value: Input[MLTransformInputRecordTable]*): Self = this.set("inputRecordTables", js.Array(value :_*))
    
    @scala.inline
    def setInputRecordTables(value: Input[js.Array[Input[MLTransformInputRecordTable]]]): Self = this.set("inputRecordTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: Input[MLTransformParameters]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setGlueVersion(value: Input[String]): Self = this.set("glueVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlueVersion: Self = this.set("glueVersion", js.undefined)
    
    @scala.inline
    def setMaxCapacity(value: Input[Double]): Self = this.set("maxCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCapacity: Self = this.set("maxCapacity", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Input[Double]): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNumberOfWorkers(value: Input[Double]): Self = this.set("numberOfWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfWorkers: Self = this.set("numberOfWorkers", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTimeout(value: Input[Double]): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setWorkerType(value: Input[String]): Self = this.set("workerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerType: Self = this.set("workerType", js.undefined)
  }
}
