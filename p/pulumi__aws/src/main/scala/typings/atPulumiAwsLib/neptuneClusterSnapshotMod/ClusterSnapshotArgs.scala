package typings
package atPulumiAwsLib.neptuneClusterSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterSnapshotArgs extends js.Object {
  /**
    * The DB Cluster Identifier from which to take the snapshot.
    */
  val dbClusterIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The Identifier for the snapshot.
    */
  val dbClusterSnapshotIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

