package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationOutput extends StObject {
  
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
  implicit class AnalyticsApplicationOutputMutableBuilder[Self <: AnalyticsApplicationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKinesisFirehose(value: Input[AnalyticsApplicationOutputKinesisFirehose]): Self = StObject.set(x, "kinesisFirehose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseUndefined: Self = StObject.set(x, "kinesisFirehose", js.undefined)
    
    @scala.inline
    def setKinesisStream(value: Input[AnalyticsApplicationOutputKinesisStream]): Self = StObject.set(x, "kinesisStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisStreamUndefined: Self = StObject.set(x, "kinesisStream", js.undefined)
    
    @scala.inline
    def setLambda(value: Input[AnalyticsApplicationOutputLambda]): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: Input[AnalyticsApplicationOutputSchema]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
