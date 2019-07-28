package typings.atPulumiAws.neptuneClusterSnapshotMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterSnapshotArgs extends js.Object {
  /**
    * The DB Cluster Identifier from which to take the snapshot.
    */
  val dbClusterIdentifier: Input[String]
  /**
    * The Identifier for the snapshot.
    */
  val dbClusterSnapshotIdentifier: Input[String]
}

object ClusterSnapshotArgs {
  @scala.inline
  def apply(dbClusterIdentifier: Input[String], dbClusterSnapshotIdentifier: Input[String]): ClusterSnapshotArgs = {
    val __obj = js.Dynamic.literal(dbClusterIdentifier = dbClusterIdentifier.asInstanceOf[js.Any], dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterSnapshotArgs]
  }
}

