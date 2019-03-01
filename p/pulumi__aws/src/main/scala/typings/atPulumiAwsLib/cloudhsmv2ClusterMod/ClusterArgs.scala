package typings
package atPulumiAwsLib.cloudhsmv2ClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterArgs extends js.Object {
  /**
    * The type of HSM module in the cluster. Currently, only hsm1.medium is supported.
    */
  val hsmType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The id of Cloud HSM v2 cluster backup to be restored.
    */
  val sourceBackupIdentifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The IDs of subnets in which cluster will operate.
    */
  val subnetIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object ClusterArgs {
  @scala.inline
  def apply(
    hsmType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    subnetIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    sourceBackupIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): ClusterArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hsmType")(hsmType.asInstanceOf[js.Any])
    __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (sourceBackupIdentifier != null) __obj.updateDynamic("sourceBackupIdentifier")(sourceBackupIdentifier.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterArgs]
  }
}

