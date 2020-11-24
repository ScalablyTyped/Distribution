package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationOutput extends js.Object {
  
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Kinesis Firehose configuration for the destination stream. Conflicts with `kinesisStream`.
    * See Kinesis Firehose below for more details.
    */
  var kinesisFirehose: js.UndefOr[Input[AnalyticsApplicationOutputKinesisFirehose]] = js.native
  
  /**
    * The Kinesis Stream configuration for the destination stream. Conflicts with `kinesisFirehose`.
    * See Kinesis Stream below for more details.
    */
  var kinesisStream: js.UndefOr[Input[AnalyticsApplicationOutputKinesisStream]] = js.native
  
  /**
    * The Lambda function destination. See Lambda below for more details.
    */
  var lambda: js.UndefOr[Input[AnalyticsApplicationOutputLambda]] = js.native
  
  /**
    * The Name of the in-application stream.
    */
  var name: Input[String] = js.native
  
  /**
    * The Schema format of the data written to the destination. See Destination Schema below for more details.
    */
  var schema: Input[AnalyticsApplicationOutputSchema] = js.native
}
object AnalyticsApplicationOutput {
  
  @scala.inline
  def apply(name: Input[String], schema: Input[AnalyticsApplicationOutputSchema]): AnalyticsApplicationOutput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationOutput]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationOutputOps[Self <: AnalyticsApplicationOutput] (val x: Self) extends AnyVal {
    
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: Input[AnalyticsApplicationOutputSchema]): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Input[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKinesisFirehose(value: Input[AnalyticsApplicationOutputKinesisFirehose]): Self = this.set("kinesisFirehose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisFirehose: Self = this.set("kinesisFirehose", js.undefined)
    
    @scala.inline
    def setKinesisStream(value: Input[AnalyticsApplicationOutputKinesisStream]): Self = this.set("kinesisStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisStream: Self = this.set("kinesisStream", js.undefined)
    
    @scala.inline
    def setLambda(value: Input[AnalyticsApplicationOutputLambda]): Self = this.set("lambda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambda: Self = this.set("lambda", js.undefined)
  }
}
