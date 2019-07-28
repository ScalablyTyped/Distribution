package typings.atPulumiAws.redshiftSnapshotCopyGrantMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotCopyGrantState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of snapshot copy grant
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. If not specified, the default key is used.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
  /**
    * A friendly name for identifying the grant.
    */
  val snapshotCopyGrantName: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object SnapshotCopyGrantState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    kmsKeyId: Input[String] = null,
    snapshotCopyGrantName: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): SnapshotCopyGrantState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (snapshotCopyGrantName != null) __obj.updateDynamic("snapshotCopyGrantName")(snapshotCopyGrantName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCopyGrantState]
  }
}

