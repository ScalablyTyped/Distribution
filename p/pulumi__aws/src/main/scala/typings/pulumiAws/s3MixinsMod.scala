package typings.pulumiAws

import typings.pulumiAws.anon.PrincipalIdString
import typings.pulumiAws.anon.SourceIPAddress
import typings.pulumiAws.anon.Xamzid2
import typings.pulumiAws.lambdaMixinsMod.EventHandler
import typings.pulumiAws.lambdaMod.EventSubscription
import typings.pulumiAws.pulumiAwsStrings.Asterisk
import typings.pulumiAws.pulumiAwsStrings.CompleteMultipartUpload
import typings.pulumiAws.pulumiAwsStrings.Copy
import typings.pulumiAws.pulumiAwsStrings.Delete
import typings.pulumiAws.pulumiAwsStrings.DeleteMarkerCreated
import typings.pulumiAws.pulumiAwsStrings.Post
import typings.pulumiAws.pulumiAwsStrings.Put
import typings.pulumiAws.s3BucketMod.Bucket
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3MixinsMod {
  
  @JSImport("@pulumi/aws/s3/s3Mixins", "BucketEventSubscription")
  @js.native
  class BucketEventSubscription protected () extends EventSubscription {
    def this(name: String, bucket: Bucket, handler: BucketEventHandler, args: BucketEventSubscriptionArgs) = this()
    def this(
      name: String,
      bucket: Bucket,
      handler: BucketEventHandler,
      args: BucketEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
    
    val bucket: Bucket = js.native
  }
  
  trait BucketEvent extends StObject {
    
    var Records: js.UndefOr[js.Array[BucketRecord]] = js.undefined
  }
  object BucketEvent {
    
    @scala.inline
    def apply(): BucketEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketEvent]
    }
    
    @scala.inline
    implicit class BucketEventMutableBuilder[Self <: BucketEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecords(value: js.Array[BucketRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsUndefined: Self = StObject.set(x, "Records", js.undefined)
      
      @scala.inline
      def setRecordsVarargs(value: BucketRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  type BucketEventHandler = EventHandler[BucketEvent, Unit]
  
  trait BucketEventSubscriptionArgs
    extends StObject
       with CommonBucketSubscriptionArgs {
    
    /**
      * Events to subscribe to. For example: "[s3:ObjectCreated:*]".  Cannot be empty.
      */
    var events: js.Array[String]
  }
  object BucketEventSubscriptionArgs {
    
    @scala.inline
    def apply(events: js.Array[String]): BucketEventSubscriptionArgs = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketEventSubscriptionArgs]
    }
    
    @scala.inline
    implicit class BucketEventSubscriptionArgsMutableBuilder[Self <: BucketEventSubscriptionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
    }
  }
  
  trait BucketRecord extends StObject {
    
    var awsRegion: String
    
    var eventName: String
    
    var eventSource: String
    
    var eventTime: String
    
    var eventVersion: String
    
    var requestParameters: SourceIPAddress
    
    var responseElements: Xamzid2
    
    var s3: typings.pulumiAws.anon.Bucket
    
    var userIdentity: PrincipalIdString
  }
  object BucketRecord {
    
    @scala.inline
    def apply(
      awsRegion: String,
      eventName: String,
      eventSource: String,
      eventTime: String,
      eventVersion: String,
      requestParameters: SourceIPAddress,
      responseElements: Xamzid2,
      s3: typings.pulumiAws.anon.Bucket,
      userIdentity: PrincipalIdString
    ): BucketRecord = {
      val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], requestParameters = requestParameters.asInstanceOf[js.Any], responseElements = responseElements.asInstanceOf[js.Any], s3 = s3.asInstanceOf[js.Any], userIdentity = userIdentity.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketRecord]
    }
    
    @scala.inline
    implicit class BucketRecordMutableBuilder[Self <: BucketRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventVersion(value: String): Self = StObject.set(x, "eventVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestParameters(value: SourceIPAddress): Self = StObject.set(x, "requestParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseElements(value: Xamzid2): Self = StObject.set(x, "responseElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3(value: typings.pulumiAws.anon.Bucket): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIdentity(value: PrincipalIdString): Self = StObject.set(x, "userIdentity", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommonBucketSubscriptionArgs extends StObject {
    
    /**
      * An optional prefix to filter down notifications.  See
      * aws.s3.BucketNotification.lambdaFunctions for more details.
      */
    var filterPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * An optional suffix to filter down notifications.  See
      * aws.s3.BucketNotification.lambdaFunctions for more details.
      */
    var filterSuffix: js.UndefOr[String] = js.undefined
  }
  object CommonBucketSubscriptionArgs {
    
    @scala.inline
    def apply(): CommonBucketSubscriptionArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonBucketSubscriptionArgs]
    }
    
    @scala.inline
    implicit class CommonBucketSubscriptionArgsMutableBuilder[Self <: CommonBucketSubscriptionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilterPrefix(value: String): Self = StObject.set(x, "filterPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterPrefixUndefined: Self = StObject.set(x, "filterPrefix", js.undefined)
      
      @scala.inline
      def setFilterSuffix(value: String): Self = StObject.set(x, "filterSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterSuffixUndefined: Self = StObject.set(x, "filterSuffix", js.undefined)
    }
  }
  
  trait ObjectCreatedSubscriptionArgs
    extends StObject
       with CommonBucketSubscriptionArgs {
    
    var event: js.UndefOr[Asterisk | Put | Post | Copy | CompleteMultipartUpload] = js.undefined
  }
  object ObjectCreatedSubscriptionArgs {
    
    @scala.inline
    def apply(): ObjectCreatedSubscriptionArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectCreatedSubscriptionArgs]
    }
    
    @scala.inline
    implicit class ObjectCreatedSubscriptionArgsMutableBuilder[Self <: ObjectCreatedSubscriptionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: Asterisk | Put | Post | Copy | CompleteMultipartUpload): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    }
  }
  
  trait ObjectRemovedSubscriptionArgs
    extends StObject
       with CommonBucketSubscriptionArgs {
    
    var event: js.UndefOr[Asterisk | Delete | DeleteMarkerCreated] = js.undefined
  }
  object ObjectRemovedSubscriptionArgs {
    
    @scala.inline
    def apply(): ObjectRemovedSubscriptionArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectRemovedSubscriptionArgs]
    }
    
    @scala.inline
    implicit class ObjectRemovedSubscriptionArgsMutableBuilder[Self <: ObjectRemovedSubscriptionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: Asterisk | Delete | DeleteMarkerCreated): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    }
  }
  
  /* augmented module */
  object pulumiAwsS3BucketAugmentingMod {
    
    @js.native
    trait Bucket extends StObject {
      
      /**
        * Creates a new subscription to events fired from this Bucket to the handler provided,
        * along with options to control the behavior of the subscription.  This function should be
        * used when full control over the subscription is wanted, and other helpers (like
        * onObjectCreated/onObjectRemoved) are not sufficient.
        */
      def onEvent(name: String, handler: BucketEventHandler, args: BucketEventSubscriptionArgs): BucketEventSubscription = js.native
      def onEvent(
        name: String,
        handler: BucketEventHandler,
        args: BucketEventSubscriptionArgs,
        opts: ComponentResourceOptions
      ): BucketEventSubscription = js.native
      
      /**
        * Creates a new subscription to events fired from this Bucket to the handler provided,
        * along with options to control the behavior of the subscription.  The handler will be
        * called whenever a matching [s3.Object] is created.
        */
      def onObjectCreated(name: String, handler: BucketEventHandler): BucketEventSubscription = js.native
      def onObjectCreated(name: String, handler: BucketEventHandler, args: Unit, opts: ComponentResourceOptions): BucketEventSubscription = js.native
      def onObjectCreated(name: String, handler: BucketEventHandler, args: ObjectCreatedSubscriptionArgs): BucketEventSubscription = js.native
      def onObjectCreated(
        name: String,
        handler: BucketEventHandler,
        args: ObjectCreatedSubscriptionArgs,
        opts: ComponentResourceOptions
      ): BucketEventSubscription = js.native
      
      /**
        * Creates a new subscription to events fired from this Bucket to the handler provided,
        * along with options to control the behavior of the subscription.  The handler will be
        * called whenever an matching [s3.Object] is removed.
        */
      def onObjectRemoved(name: String, handler: BucketEventHandler): BucketEventSubscription = js.native
      def onObjectRemoved(name: String, handler: BucketEventHandler, args: Unit, opts: ComponentResourceOptions): BucketEventSubscription = js.native
      def onObjectRemoved(name: String, handler: BucketEventHandler, args: ObjectRemovedSubscriptionArgs): BucketEventSubscription = js.native
      def onObjectRemoved(
        name: String,
        handler: BucketEventHandler,
        args: ObjectRemovedSubscriptionArgs,
        opts: ComponentResourceOptions
      ): BucketEventSubscription = js.native
    }
  }
}
