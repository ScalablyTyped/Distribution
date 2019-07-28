package typings.atPulumiAws.s3InventoryMod

import typings.atPulumiAws.Anon_BucketAnonAccountIdBucketArn
import typings.atPulumiAws.Anon_FrequencyInput
import typings.atPulumiAws.Anon_PrefixInputString
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryArgs extends js.Object {
  /**
    * The S3 bucket configuration where inventory results are published (documented below).
    */
  val bucket: Input[String]
  /**
    * Destination bucket where inventory list files are written (documented below).
    */
  val destination: Input[Anon_BucketAnonAccountIdBucketArn]
  /**
    * Specifies whether the inventory is enabled or disabled.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Object filtering that accepts a prefix (documented below).
    */
  val filter: js.UndefOr[Input[Anon_PrefixInputString]] = js.undefined
  /**
    * Object filtering that accepts a prefix (documented below). Can be `All` or `Current`.
    */
  val includedObjectVersions: Input[String]
  /**
    * Unique identifier of the inventory configuration for the bucket.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Contains the optional fields that are included in the inventory results.
    */
  val optionalFields: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Contains the frequency for generating inventory results (documented below).
    */
  val schedule: Input[Anon_FrequencyInput]
}

object InventoryArgs {
  @scala.inline
  def apply(
    bucket: Input[String],
    destination: Input[Anon_BucketAnonAccountIdBucketArn],
    includedObjectVersions: Input[String],
    schedule: Input[Anon_FrequencyInput],
    enabled: Input[Boolean] = null,
    filter: Input[Anon_PrefixInputString] = null,
    name: Input[String] = null,
    optionalFields: Input[js.Array[Input[String]]] = null
  ): InventoryArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], includedObjectVersions = includedObjectVersions.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (optionalFields != null) __obj.updateDynamic("optionalFields")(optionalFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryArgs]
  }
}

