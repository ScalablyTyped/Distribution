package typings
package atPulumiAwsLib.redshiftSnapshotCopyGrantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotCopyGrantArgs extends js.Object {
  /**
    * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. If not specified, the default key is used.
    */
  val kmsKeyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A friendly name for identifying the grant.
    */
  val snapshotCopyGrantName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object SnapshotCopyGrantArgs {
  @scala.inline
  def apply(
    snapshotCopyGrantName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    kmsKeyId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): SnapshotCopyGrantArgs = {
    val __obj = js.Dynamic.literal(snapshotCopyGrantName = snapshotCopyGrantName.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCopyGrantArgs]
  }
}

