package typings.pulumiAws

import typings.pulumiAws.anon.ApproximateCreationDateTime
import typings.pulumiAws.anon.PrincipalId
import typings.pulumiAws.inputMod.lambda.EventSourceMappingDestinationConfig
import typings.pulumiAws.lambdaMixinsMod.EventHandler
import typings.pulumiAws.lambdaMod.EventSourceMapping
import typings.pulumiAws.lambdaMod.EventSubscription
import typings.pulumiAws.pulumiAwsStrings.INSERT
import typings.pulumiAws.pulumiAwsStrings.LATEST
import typings.pulumiAws.pulumiAwsStrings.MODIFY
import typings.pulumiAws.pulumiAwsStrings.REMOVE
import typings.pulumiAws.pulumiAwsStrings.TRIM_HORIZON
import typings.pulumiAws.tableMod.Table
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamodbMixinsMod {
  
  @JSImport("@pulumi/aws/dynamodb/dynamodbMixins", "TableEventSubscription")
  @js.native
  class TableEventSubscription protected () extends EventSubscription {
    def this(name: String, table: Table, handler: TableEventHandler, args: TableEventSubscriptionArgs) = this()
    def this(
      name: String,
      table: Table,
      handler: TableEventHandler,
      args: TableEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
    
    val eventSourceMapping: EventSourceMapping = js.native
    
    val table: Table = js.native
  }
  
  @js.native
  trait TableEvent extends StObject {
    
    var Records: js.Array[TableEventRecord] = js.native
  }
  object TableEvent {
    
    @scala.inline
    def apply(Records: js.Array[TableEventRecord]): TableEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableEvent]
    }
    
    @scala.inline
    implicit class TableEventMutableBuilder[Self <: TableEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecords(value: js.Array[TableEventRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: TableEventRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  type TableEventHandler = EventHandler[TableEvent, Unit]
  
  @js.native
  trait TableEventRecord extends StObject {
    
    var awsRegion: String = js.native
    
    var dynamodb: ApproximateCreationDateTime = js.native
    
    var eventID: String = js.native
    
    var eventName: INSERT | MODIFY | REMOVE = js.native
    
    var eventSource: String = js.native
    
    var eventVersion: String = js.native
    
    var userIdentity: PrincipalId = js.native
  }
  object TableEventRecord {
    
    @scala.inline
    def apply(
      awsRegion: String,
      dynamodb: ApproximateCreationDateTime,
      eventID: String,
      eventName: INSERT | MODIFY | REMOVE,
      eventSource: String,
      eventVersion: String,
      userIdentity: PrincipalId
    ): TableEventRecord = {
      val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], dynamodb = dynamodb.asInstanceOf[js.Any], eventID = eventID.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], userIdentity = userIdentity.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableEventRecord]
    }
    
    @scala.inline
    implicit class TableEventRecordMutableBuilder[Self <: TableEventRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamodb(value: ApproximateCreationDateTime): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventID(value: String): Self = StObject.set(x, "eventID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventName(value: INSERT | MODIFY | REMOVE): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventVersion(value: String): Self = StObject.set(x, "eventVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIdentity(value: PrincipalId): Self = StObject.set(x, "userIdentity", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TableEventSubscriptionArgs extends StObject {
    
    /**
      * The largest number of records that Lambda will retrieve from your event source at the time of invocation. Defaults to `100` for DynamoDB.
      */
    val batchSize: js.UndefOr[Double] = js.native
    
    /**
      * If the function returns an error, split the batch in two and retry. Defaults to `false`.
      */
    val bisectBatchOnFunctionError: js.UndefOr[Boolean] = js.native
    
    /**
      * An Amazon SQS queue or Amazon SNS topic destination for failed records.
      */
    val destinationConfig: js.UndefOr[Input[EventSourceMappingDestinationConfig]] = js.native
    
    /**
      * The maximum amount of time to gather records before invoking the function, in seconds. Records will continue to buffer
      * until either maximum_batching_window_in_seconds expires or batch_size has been met. Defaults to as soon as records
      * are available in the stream. If the batch it reads from the stream only has one record in it, Lambda only sends one record to the function.
      */
    val maximumBatchingWindowInSeconds: js.UndefOr[Double] = js.native
    
    /**
      * The maximum age of a record that Lambda sends to a function for processing. Minimum of `60`, maximum and default of `604800`
      */
    val maximumRecordAgeInSeconds: js.UndefOr[Double] = js.native
    
    /**
      * The maximum number of times to retry when the function returns an error. Minimum of `0`, maximum and default of `10000`.
      */
    val maximumRetryAttempts: js.UndefOr[Double] = js.native
    
    /**
      * The number of batches to process from each shard concurrently. Minimum and default of `1`, maximum of `10`
      */
    val parallelizationFactor: js.UndefOr[Double] = js.native
    
    /**
      * The position in the stream where AWS Lambda should start reading. Must be one of either `TRIM_HORIZON` or `LATEST`.
      */
    val startingPosition: TRIM_HORIZON | LATEST = js.native
  }
  object TableEventSubscriptionArgs {
    
    @scala.inline
    def apply(startingPosition: TRIM_HORIZON | LATEST): TableEventSubscriptionArgs = {
      val __obj = js.Dynamic.literal(startingPosition = startingPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableEventSubscriptionArgs]
    }
    
    @scala.inline
    implicit class TableEventSubscriptionArgsMutableBuilder[Self <: TableEventSubscriptionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      @scala.inline
      def setBisectBatchOnFunctionError(value: Boolean): Self = StObject.set(x, "bisectBatchOnFunctionError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBisectBatchOnFunctionErrorUndefined: Self = StObject.set(x, "bisectBatchOnFunctionError", js.undefined)
      
      @scala.inline
      def setDestinationConfig(value: Input[EventSourceMappingDestinationConfig]): Self = StObject.set(x, "destinationConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationConfigUndefined: Self = StObject.set(x, "destinationConfig", js.undefined)
      
      @scala.inline
      def setMaximumBatchingWindowInSeconds(value: Double): Self = StObject.set(x, "maximumBatchingWindowInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumBatchingWindowInSecondsUndefined: Self = StObject.set(x, "maximumBatchingWindowInSeconds", js.undefined)
      
      @scala.inline
      def setMaximumRecordAgeInSeconds(value: Double): Self = StObject.set(x, "maximumRecordAgeInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumRecordAgeInSecondsUndefined: Self = StObject.set(x, "maximumRecordAgeInSeconds", js.undefined)
      
      @scala.inline
      def setMaximumRetryAttempts(value: Double): Self = StObject.set(x, "maximumRetryAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumRetryAttemptsUndefined: Self = StObject.set(x, "maximumRetryAttempts", js.undefined)
      
      @scala.inline
      def setParallelizationFactor(value: Double): Self = StObject.set(x, "parallelizationFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelizationFactorUndefined: Self = StObject.set(x, "parallelizationFactor", js.undefined)
      
      @scala.inline
      def setStartingPosition(value: TRIM_HORIZON | LATEST): Self = StObject.set(x, "startingPosition", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object pulumiAwsDynamodbTableAugmentingMod {
    
    @js.native
    trait Table extends StObject {
      
      /**
        * Creates a new subscription to events fired from this Table to the handler provided,
        * along with options to control the behavior of the subscription.
        *
        * In order to receive events the [Table] must have been created with the `streamEnabled: true`
        * value as well as an appropriate `streamViewType`.
        */
      def onEvent(name: String, handler: TableEventHandler, args: TableEventSubscriptionArgs): TableEventSubscription = js.native
      def onEvent(
        name: String,
        handler: TableEventHandler,
        args: TableEventSubscriptionArgs,
        opts: ComponentResourceOptions
      ): TableEventSubscription = js.native
    }
  }
}
