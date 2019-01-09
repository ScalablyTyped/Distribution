package typings
package atPulumiAwsLib.s3InventoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryArgs extends js.Object {
  /**
    * The S3 bucket configuration where inventory results are published (documented below).
    */
  val bucket: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Destination bucket where inventory list files are written (documented below).
    */
  val destination: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_BucketAnonAccountIdBucketArn]
  /**
    * Specifies whether the inventory is enabled or disabled.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Object filtering that accepts a prefix (documented below).
    */
  val filter: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_PrefixInputString]] = js.undefined
  /**
    * Object filtering that accepts a prefix (documented below). Can be `All` or `Current`.
    */
  val includedObjectVersions: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Unique identifier of the inventory configuration for the bucket.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Contains the optional fields that are included in the inventory results.
    */
  val optionalFields: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Contains the frequency for generating inventory results (documented below).
    */
  val schedule: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_FrequencyInput]
}

