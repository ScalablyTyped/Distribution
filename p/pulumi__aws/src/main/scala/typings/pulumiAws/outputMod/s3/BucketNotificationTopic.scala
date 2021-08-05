package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketNotificationTopic extends StObject {
  
  /**
    * Specifies [event](http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html#notification-how-to-event-types-and-destinations) for which to send notifications.
    */
  var events: js.Array[String]
  
  /**
    * Specifies object key name prefix.
    */
  var filterPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies object key name suffix.
    */
  var filterSuffix: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies unique identifier for each of the notification configurations.
    */
  var id: String
  
  /**
    * Specifies Amazon SNS topic ARN.
    */
  var topicArn: String
}
object BucketNotificationTopic {
  
  inline def apply(events: js.Array[String], id: String, topicArn: String): BucketNotificationTopic = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketNotificationTopic]
  }
  
  extension [Self <: BucketNotificationTopic](x: Self) {
    
    inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    inline def setFilterPrefix(value: String): Self = StObject.set(x, "filterPrefix", value.asInstanceOf[js.Any])
    
    inline def setFilterPrefixUndefined: Self = StObject.set(x, "filterPrefix", js.undefined)
    
    inline def setFilterSuffix(value: String): Self = StObject.set(x, "filterSuffix", value.asInstanceOf[js.Any])
    
    inline def setFilterSuffixUndefined: Self = StObject.set(x, "filterSuffix", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
  }
}
