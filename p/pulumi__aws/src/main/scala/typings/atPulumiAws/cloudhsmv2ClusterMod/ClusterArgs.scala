package typings.atPulumiAws.cloudhsmv2ClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterArgs extends js.Object {
  /**
    * The type of HSM module in the cluster. Currently, only hsm1.medium is supported.
    */
  val hsmType: Input[String]
  /**
    * The id of Cloud HSM v2 cluster backup to be restored.
    */
  val sourceBackupIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * The IDs of subnets in which cluster will operate.
    */
  val subnetIds: Input[js.Array[Input[String]]]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object ClusterArgs {
  @scala.inline
  def apply(
    hsmType: Input[String],
    subnetIds: Input[js.Array[Input[String]]],
    sourceBackupIdentifier: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): ClusterArgs = {
    val __obj = js.Dynamic.literal(hsmType = hsmType.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
    if (sourceBackupIdentifier != null) __obj.updateDynamic("sourceBackupIdentifier")(sourceBackupIdentifier.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterArgs]
  }
}

