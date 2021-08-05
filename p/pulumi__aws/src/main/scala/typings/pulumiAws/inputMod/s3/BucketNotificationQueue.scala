package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketNotificationQueue extends StObject {
  
  /**
    * Specifies [event](http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html#notification-how-to-event-types-and-destinations) for which to send notifications.
    */
  var events: Input[js.Array[Input[String]]]
  
  /**
    * Specifies object key name prefix.
    */
  var filterPrefix: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Specifies object key name suffix.
    */
  var filterSuffix: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Specifies unique identifier for each of the notification configurations.
    */
  var id: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Specifies Amazon SQS queue ARN.
    */
  var queueArn: Input[String]
}
object BucketNotificationQueue {
  
  inline def apply(events: Input[js.Array[Input[String]]], queueArn: Input[String]): BucketNotificationQueue = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], queueArn = queueArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketNotificationQueue]
  }
  
  extension [Self <: BucketNotificationQueue](x: Self) {
    
    inline def setEvents(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: Input[String]*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    inline def setFilterPrefix(value: Input[String]): Self = StObject.set(x, "filterPrefix", value.asInstanceOf[js.Any])
    
    inline def setFilterPrefixUndefined: Self = StObject.set(x, "filterPrefix", js.undefined)
    
    inline def setFilterSuffix(value: Input[String]): Self = StObject.set(x, "filterSuffix", value.asInstanceOf[js.Any])
    
    inline def setFilterSuffixUndefined: Self = StObject.set(x, "filterSuffix", js.undefined)
    
    inline def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setQueueArn(value: Input[String]): Self = StObject.set(x, "queueArn", value.asInstanceOf[js.Any])
  }
}
