package typings.pulumiAws.dynamodbMixinsMod

import typings.pulumiAws.inputMod.lambda.EventSourceMappingDestinationConfig
import typings.pulumiAws.pulumiAwsStrings.LATEST
import typings.pulumiAws.pulumiAwsStrings.TRIM_HORIZON
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableEventSubscriptionArgs extends js.Object {
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
  implicit class TableEventSubscriptionArgsOps[Self <: TableEventSubscriptionArgs] (val x: Self) extends AnyVal {
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
    def setStartingPosition(value: TRIM_HORIZON | LATEST): Self = this.set("startingPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    @scala.inline
    def setBisectBatchOnFunctionError(value: Boolean): Self = this.set("bisectBatchOnFunctionError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBisectBatchOnFunctionError: Self = this.set("bisectBatchOnFunctionError", js.undefined)
    @scala.inline
    def setDestinationConfig(value: Input[EventSourceMappingDestinationConfig]): Self = this.set("destinationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationConfig: Self = this.set("destinationConfig", js.undefined)
    @scala.inline
    def setMaximumBatchingWindowInSeconds(value: Double): Self = this.set("maximumBatchingWindowInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumBatchingWindowInSeconds: Self = this.set("maximumBatchingWindowInSeconds", js.undefined)
    @scala.inline
    def setMaximumRecordAgeInSeconds(value: Double): Self = this.set("maximumRecordAgeInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumRecordAgeInSeconds: Self = this.set("maximumRecordAgeInSeconds", js.undefined)
    @scala.inline
    def setMaximumRetryAttempts(value: Double): Self = this.set("maximumRetryAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumRetryAttempts: Self = this.set("maximumRetryAttempts", js.undefined)
    @scala.inline
    def setParallelizationFactor(value: Double): Self = this.set("parallelizationFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallelizationFactor: Self = this.set("parallelizationFactor", js.undefined)
  }
  
}

