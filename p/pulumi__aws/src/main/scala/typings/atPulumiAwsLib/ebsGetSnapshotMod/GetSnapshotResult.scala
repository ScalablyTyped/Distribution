package typings
package atPulumiAwsLib.ebsGetSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSnapshotResult extends js.Object {
  /**
    * The data encryption key identifier for the snapshot.
    */
  val dataEncryptionKeyId: java.lang.String
  /**
    * A description for the snapshot
    */
  val description: java.lang.String
  /**
    * Whether the snapshot is encrypted.
    */
  val encrypted: scala.Boolean
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: java.lang.String
  /**
    * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
    */
  val ownerAlias: java.lang.String
  /**
    * The AWS account ID of the EBS snapshot owner.
    */
  val ownerId: java.lang.String
  /**
    * The snapshot ID (e.g. snap-59fcb34e).
    */
  val snapshotId: java.lang.String
  /**
    * The snapshot state.
    */
  val state: java.lang.String
  /**
    * A mapping of tags for the resource.
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * The volume ID (e.g. vol-59fcb34e).
    */
  val volumeId: java.lang.String
  /**
    * The size of the drive in GiBs.
    */
  val volumeSize: scala.Double
}

object GetSnapshotResult {
  @scala.inline
  def apply(
    dataEncryptionKeyId: java.lang.String,
    description: java.lang.String,
    encrypted: scala.Boolean,
    id: java.lang.String,
    kmsKeyId: java.lang.String,
    ownerAlias: java.lang.String,
    ownerId: java.lang.String,
    snapshotId: java.lang.String,
    state: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    volumeId: java.lang.String,
    volumeSize: scala.Double
  ): GetSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataEncryptionKeyId")(dataEncryptionKeyId)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("encrypted")(encrypted)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("kmsKeyId")(kmsKeyId)
    __obj.updateDynamic("ownerAlias")(ownerAlias)
    __obj.updateDynamic("ownerId")(ownerId)
    __obj.updateDynamic("snapshotId")(snapshotId)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("volumeId")(volumeId)
    __obj.updateDynamic("volumeSize")(volumeSize)
    __obj.asInstanceOf[GetSnapshotResult]
  }
}

