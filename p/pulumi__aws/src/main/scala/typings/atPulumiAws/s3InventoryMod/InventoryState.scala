package typings.atPulumiAws.s3InventoryMod

import typings.atPulumiAws.Anon_BucketAnonAccountIdBucketArn
import typings.atPulumiAws.Anon_FrequencyInput
import typings.atPulumiAws.Anon_PrefixInputString
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryState extends js.Object {
  /**
    * The S3 bucket configuration where inventory results are published (documented below).
    */
  val bucket: js.UndefOr[Input[String]] = js.undefined
  /**
    * Destination bucket where inventory list files are written (documented below).
    */
  val destination: js.UndefOr[Input[Anon_BucketAnonAccountIdBucketArn]] = js.undefined
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
  val includedObjectVersions: js.UndefOr[Input[String]] = js.undefined
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
  val schedule: js.UndefOr[Input[Anon_FrequencyInput]] = js.undefined
}

object InventoryState {
  @scala.inline
  def apply(
    bucket: Input[String] = null,
    destination: Input[Anon_BucketAnonAccountIdBucketArn] = null,
    enabled: Input[Boolean] = null,
    filter: Input[Anon_PrefixInputString] = null,
    includedObjectVersions: Input[String] = null,
    name: Input[String] = null,
    optionalFields: Input[js.Array[Input[String]]] = null,
    schedule: Input[Anon_FrequencyInput] = null
  ): InventoryState = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (includedObjectVersions != null) __obj.updateDynamic("includedObjectVersions")(includedObjectVersions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (optionalFields != null) __obj.updateDynamic("optionalFields")(optionalFields.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryState]
  }
}

