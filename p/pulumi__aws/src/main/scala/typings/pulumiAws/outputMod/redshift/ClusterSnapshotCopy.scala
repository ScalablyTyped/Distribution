package typings.pulumiAws.outputMod.redshift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(destinationRegion: String): ClusterSnapshotCopy = {
    val __obj = js.Dynamic.literal(destinationRegion = destinationRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterSnapshotCopy]
  }
  
  @scala.inline
  implicit class ClusterSnapshotCopyOps[Self <: ClusterSnapshotCopy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestinationRegion(value: String): Self = this.set("destinationRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantName(value: String): Self = this.set("grantName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantName: Self = this.set("grantName", js.undefined)
    
    @scala.inline
    def setRetentionPeriod(value: Double): Self = this.set("retentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionPeriod: Self = this.set("retentionPeriod", js.undefined)
  }
}
