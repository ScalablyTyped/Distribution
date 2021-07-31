package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationOutput extends StObject {
  
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: String
  
  /**
    * The Kinesis Firehose configuration for the destination stream. Conflicts with `kinesisStream`.
    * See Kinesis Firehose below for more details.
    */
  var kinesisFirehose: js.UndefOr[AnalyticsApplicationOutputKinesisFirehose] = js.undefined
  
  /**
    * The Kinesis Stream configuration for the destination stream. Conflicts with `kinesisFirehose`.
    * See Kinesis Stream below for more details.
    */
  var kinesisStream: js.UndefOr[AnalyticsApplicationOutputKinesisStream] = js.undefined
  
  /**
    * The Lambda function destination. See Lambda below for more details.
    */
  var lambda: js.UndefOr[AnalyticsApplicationOutputLambda] = js.undefined
  
  /**
    * The Name of the in-application stream.
    */
  var name: String
  
  /**
    * The Schema format of the data written to the destination. See Destination Schema below for more details.
    */
  var schema: AnalyticsApplicationOutputSchema
}
object AnalyticsApplicationOutput {
  
  @scala.inline
  def apply(id: String, name: String, schema: AnalyticsApplicationOutputSchema): AnalyticsApplicationOutput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationOutput]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationOutputMutableBuilder[Self <: AnalyticsApplicationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehose(value: AnalyticsApplicationOutputKinesisFirehose): Self = StObject.set(x, "kinesisFirehose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseUndefined: Self = StObject.set(x, "kinesisFirehose", js.undefined)
    
    @scala.inline
    def setKinesisStream(value: AnalyticsApplicationOutputKinesisStream): Self = StObject.set(x, "kinesisStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisStreamUndefined: Self = StObject.set(x, "kinesisStream", js.undefined)
    
    @scala.inline
    def setLambda(value: AnalyticsApplicationOutputLambda): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: AnalyticsApplicationOutputSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
