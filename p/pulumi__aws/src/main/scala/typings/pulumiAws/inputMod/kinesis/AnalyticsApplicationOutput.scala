package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationOutput extends StObject {
  
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The Kinesis Firehose configuration for the destination stream. Conflicts with `kinesisStream`.
    * See Kinesis Firehose below for more details.
    */
  var kinesisFirehose: js.UndefOr[Input[AnalyticsApplicationOutputKinesisFirehose]] = js.undefined
  
  /**
    * The Kinesis Stream configuration for the destination stream. Conflicts with `kinesisFirehose`.
    * See Kinesis Stream below for more details.
    */
  var kinesisStream: js.UndefOr[Input[AnalyticsApplicationOutputKinesisStream]] = js.undefined
  
  /**
    * The Lambda function destination. See Lambda below for more details.
    */
  var lambda: js.UndefOr[Input[AnalyticsApplicationOutputLambda]] = js.undefined
  
  /**
    * The Name of the in-application stream.
    */
  var name: Input[String]
  
  /**
    * The Schema format of the data written to the destination. See Destination Schema below for more details.
    */
  var schema: Input[AnalyticsApplicationOutputSchema]
}
object AnalyticsApplicationOutput {
  
  inline def apply(name: Input[String], schema: Input[AnalyticsApplicationOutputSchema]): AnalyticsApplicationOutput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationOutput]
  }
  
  extension [Self <: AnalyticsApplicationOutput](x: Self) {
    
    inline def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKinesisFirehose(value: Input[AnalyticsApplicationOutputKinesisFirehose]): Self = StObject.set(x, "kinesisFirehose", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseUndefined: Self = StObject.set(x, "kinesisFirehose", js.undefined)
    
    inline def setKinesisStream(value: Input[AnalyticsApplicationOutputKinesisStream]): Self = StObject.set(x, "kinesisStream", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamUndefined: Self = StObject.set(x, "kinesisStream", js.undefined)
    
    inline def setLambda(value: Input[AnalyticsApplicationOutputLambda]): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    inline def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: Input[AnalyticsApplicationOutputSchema]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
