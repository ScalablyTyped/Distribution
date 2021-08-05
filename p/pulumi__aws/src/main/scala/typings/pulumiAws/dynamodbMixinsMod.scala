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
  
  trait TableEvent extends StObject {
    
    var Records: js.Array[TableEventRecord]
  }
  object TableEvent {
    
    inline def apply(Records: js.Array[TableEventRecord]): TableEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableEvent]
    }
    
    extension [Self <: TableEvent](x: Self) {
      
      inline def setRecords(value: js.Array[TableEventRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: TableEventRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  type TableEventHandler = EventHandler[TableEvent, Unit]
  
  trait TableEventRecord extends StObject {
    
    var awsRegion: String
    
    var dynamodb: ApproximateCreationDateTime
    
    var eventID: String
    
    var eventName: INSERT | MODIFY | REMOVE
    
    var eventSource: String
    
    var eventVersion: String
    
    var userIdentity: PrincipalId
  }
  object TableEventRecord {
    
    inline def apply(
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
    
    extension [Self <: TableEventRecord](x: Self) {
      
      inline def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
      
      inline def setDynamodb(value: ApproximateCreationDateTime): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
      
      inline def setEventID(value: String): Self = StObject.set(x, "eventID", value.asInstanceOf[js.Any])
      
      inline def setEventName(value: INSERT | MODIFY | REMOVE): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      inline def setEventVersion(value: String): Self = StObject.set(x, "eventVersion", value.asInstanceOf[js.Any])
      
      inline def setUserIdentity(value: PrincipalId): Self = StObject.set(x, "userIdentity", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableEventSubscriptionArgs extends StObject {
    
    /**
      * The largest number of records that Lambda will retrieve from your event source at the time of invocation. Defaults to `100` for DynamoDB.
      */
    val batchSize: js.UndefOr[Double] = js.undefined
    
    /**
      * If the function returns an error, split the batch in two and retry. Defaults to `false`.
      */
    val bisectBatchOnFunctionError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An Amazon SQS queue or Amazon SNS topic destination for failed records.
      */
    val destinationConfig: js.UndefOr[Input[EventSourceMappingDestinationConfig]] = js.undefined
    
    /**
      * The maximum amount of time to gather records before invoking the function, in seconds. Records will continue to buffer
      * until either maximum_batching_window_in_seconds expires or batch_size has been met. Defaults to as soon as records
      * are available in the stream. If the batch it reads from the stream only has one record in it, Lambda only sends one record to the function.
      */
    val maximumBatchingWindowInSeconds: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum age of a record that Lambda sends to a function for processing. Minimum of `60`, maximum and default of `604800`
      */
    val maximumRecordAgeInSeconds: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of times to retry when the function returns an error. Minimum of `0`, maximum and default of `10000`.
      */
    val maximumRetryAttempts: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of batches to process from each shard concurrently. Minimum and default of `1`, maximum of `10`
      */
    val parallelizationFactor: js.UndefOr[Double] = js.undefined
    
    /**
      * The position in the stream where AWS Lambda should start reading. Must be one of either `TRIM_HORIZON` or `LATEST`.
      */
    val startingPosition: TRIM_HORIZON | LATEST
  }
  object TableEventSubscriptionArgs {
    
    inline def apply(startingPosition: TRIM_HORIZON | LATEST): TableEventSubscriptionArgs = {
      val __obj = js.Dynamic.literal(startingPosition = startingPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableEventSubscriptionArgs]
    }
    
    extension [Self <: TableEventSubscriptionArgs](x: Self) {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setBisectBatchOnFunctionError(value: Boolean): Self = StObject.set(x, "bisectBatchOnFunctionError", value.asInstanceOf[js.Any])
      
      inline def setBisectBatchOnFunctionErrorUndefined: Self = StObject.set(x, "bisectBatchOnFunctionError", js.undefined)
      
      inline def setDestinationConfig(value: Input[EventSourceMappingDestinationConfig]): Self = StObject.set(x, "destinationConfig", value.asInstanceOf[js.Any])
      
      inline def setDestinationConfigUndefined: Self = StObject.set(x, "destinationConfig", js.undefined)
      
      inline def setMaximumBatchingWindowInSeconds(value: Double): Self = StObject.set(x, "maximumBatchingWindowInSeconds", value.asInstanceOf[js.Any])
      
      inline def setMaximumBatchingWindowInSecondsUndefined: Self = StObject.set(x, "maximumBatchingWindowInSeconds", js.undefined)
      
      inline def setMaximumRecordAgeInSeconds(value: Double): Self = StObject.set(x, "maximumRecordAgeInSeconds", value.asInstanceOf[js.Any])
      
      inline def setMaximumRecordAgeInSecondsUndefined: Self = StObject.set(x, "maximumRecordAgeInSeconds", js.undefined)
      
      inline def setMaximumRetryAttempts(value: Double): Self = StObject.set(x, "maximumRetryAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaximumRetryAttemptsUndefined: Self = StObject.set(x, "maximumRetryAttempts", js.undefined)
      
      inline def setParallelizationFactor(value: Double): Self = StObject.set(x, "parallelizationFactor", value.asInstanceOf[js.Any])
      
      inline def setParallelizationFactorUndefined: Self = StObject.set(x, "parallelizationFactor", js.undefined)
      
      inline def setStartingPosition(value: TRIM_HORIZON | LATEST): Self = StObject.set(x, "startingPosition", value.asInstanceOf[js.Any])
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
