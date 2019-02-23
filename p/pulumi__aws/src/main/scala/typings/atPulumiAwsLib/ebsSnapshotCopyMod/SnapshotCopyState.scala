package typings
package atPulumiAwsLib.ebsSnapshotCopyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotCopyState extends js.Object {
  /**
    * The data encryption key identifier for the snapshot.
    * * `source_snapshot_id` The ARN of the copied snapshot.
    * * `source_region` The region of the source snapshot.
    */
  val dataEncryptionKeyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A description of what the snapshot is.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether the snapshot is encrypted.
    */
  val encrypted: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The ARN for the KMS encryption key.
    * * `source_snapshot_id` The ARN for the snapshot to be copied.
    * * `source_region` The region of the source snapshot.
    */
  val kmsKeyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
    */
  val ownerAlias: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The AWS account ID of the snapshot owner.
    */
  val ownerId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val sourceRegion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val sourceSnapshotId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags for the snapshot.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  val volumeId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The size of the drive in GiBs.
    */
  val volumeSize: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

