package typings
package atPulumiAwsLib.s3InventoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryArgs extends js.Object {
  /**
    * The S3 bucket configuration where inventory results are published (documented below).
    */
  val bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Destination bucket where inventory list files are written (documented below).
    */
  val destination: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketAnonAccountIdBucketArn]
  /**
    * Specifies whether the inventory is enabled or disabled.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Object filtering that accepts a prefix (documented below).
    */
  val filter: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_PrefixInputString]] = js.undefined
  /**
    * Object filtering that accepts a prefix (documented below). Can be `All` or `Current`.
    */
  val includedObjectVersions: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Unique identifier of the inventory configuration for the bucket.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Contains the optional fields that are included in the inventory results.
    */
  val optionalFields: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Contains the frequency for generating inventory results (documented below).
    */
  val schedule: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FrequencyInput]
}

object InventoryArgs {
  @scala.inline
  def apply(
    bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    destination: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketAnonAccountIdBucketArn],
    includedObjectVersions: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    schedule: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FrequencyInput],
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    filter: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_PrefixInputString] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    optionalFields: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): InventoryArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], includedObjectVersions = includedObjectVersions.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (optionalFields != null) __obj.updateDynamic("optionalFields")(optionalFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryArgs]
  }
}

