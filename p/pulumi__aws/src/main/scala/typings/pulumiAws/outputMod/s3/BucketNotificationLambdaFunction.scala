package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketNotificationLambdaFunction extends StObject {
  
  /**
    * Specifies [event](http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html#notification-how-to-event-types-and-destinations) for which to send notifications.
    */
  var events: js.Array[String] = js.native
  
  /**
    * Specifies object key name prefix.
    */
  var filterPrefix: js.UndefOr[String] = js.native
  
  /**
    * Specifies object key name suffix.
    */
  var filterSuffix: js.UndefOr[String] = js.native
  
  /**
    * Specifies unique identifier for each of the notification configurations.
    */
  var id: String = js.native
  
  /**
    * Specifies Amazon Lambda function ARN.
    */
  var lambdaFunctionArn: js.UndefOr[String] = js.native
}
object BucketNotificationLambdaFunction {
  
  @scala.inline
  def apply(events: js.Array[String], id: String): BucketNotificationLambdaFunction = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketNotificationLambdaFunction]
  }
  
  @scala.inline
  implicit class BucketNotificationLambdaFunctionMutableBuilder[Self <: BucketNotificationLambdaFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setFilterPrefix(value: String): Self = StObject.set(x, "filterPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterPrefixUndefined: Self = StObject.set(x, "filterPrefix", js.undefined)
    
    @scala.inline
    def setFilterSuffix(value: String): Self = StObject.set(x, "filterSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSuffixUndefined: Self = StObject.set(x, "filterSuffix", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionArn(value: String): Self = StObject.set(x, "lambdaFunctionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionArnUndefined: Self = StObject.set(x, "lambdaFunctionArn", js.undefined)
  }
}
