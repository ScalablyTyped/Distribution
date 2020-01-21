package typings.pulumiAws.outputMod.redshift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterSnapshotCopy extends js.Object {
  /**
    * The destination region that you want to copy snapshots to.
    */
  var destinationRegion: String = js.native
  /**
    * The name of the snapshot copy grant to use when snapshots of an AWS KMS-encrypted cluster are copied to the destination region.
    */
  var grantName: js.UndefOr[String] = js.native
  /**
    * The number of days to retain automated snapshots in the destination region after they are copied from the source region. Defaults to `7`.
    */
  var retentionPeriod: js.UndefOr[Double] = js.native
}

object ClusterSnapshotCopy {
  @scala.inline
  def apply(destinationRegion: String, grantName: String = null, retentionPeriod: Int | Double = null): ClusterSnapshotCopy = {
    val __obj = js.Dynamic.literal(destinationRegion = destinationRegion.asInstanceOf[js.Any])
    if (grantName != null) __obj.updateDynamic("grantName")(grantName.asInstanceOf[js.Any])
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterSnapshotCopy]
  }
}

