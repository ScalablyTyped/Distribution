package typings
package atPulumiAwsLib.s3InventoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryState extends js.Object {
  /**
    * The S3 bucket configuration where inventory results are published (documented below).
    */
  val bucket: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Destination bucket where inventory list files are written (documented below).
    */
  val destination: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketAnonAccountIdBucketArn]
  ] = js.undefined
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
  val includedObjectVersions: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
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
  val schedule: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FrequencyInput]] = js.undefined
}

