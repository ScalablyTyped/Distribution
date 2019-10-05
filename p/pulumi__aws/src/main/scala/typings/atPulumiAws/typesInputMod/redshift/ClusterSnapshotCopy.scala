package typings.atPulumiAws.typesInputMod.redshift

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterSnapshotCopy extends js.Object {
  /**
    * The destination region that you want to copy snapshots to.
    */
  var destinationRegion: Input[String]
  /**
    * The name of the snapshot copy grant to use when snapshots of an AWS KMS-encrypted cluster are copied to the destination region.
    */
  var grantName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The number of days to retain automated snapshots in the destination region after they are copied from the source region. Defaults to `7`.
    */
  var retentionPeriod: js.UndefOr[Input[Double]] = js.undefined
}

object ClusterSnapshotCopy {
  @scala.inline
  def apply(
    destinationRegion: Input[String],
    grantName: Input[String] = null,
    retentionPeriod: Input[Double] = null
  ): ClusterSnapshotCopy = {
    val __obj = js.Dynamic.literal(destinationRegion = destinationRegion.asInstanceOf[js.Any])
    if (grantName != null) __obj.updateDynamic("grantName")(grantName.asInstanceOf[js.Any])
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterSnapshotCopy]
  }
}

