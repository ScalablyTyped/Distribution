package typings.pulumiAws.rdsClusterSnapshotMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterSnapshotArgs extends js.Object {
  /**
    * The DB Cluster Identifier from which to take the snapshot.
    */
  val dbClusterIdentifier: Input[String] = js.native
  /**
    * The Identifier for the snapshot.
    */
  val dbClusterSnapshotIdentifier: Input[String] = js.native
  /**
    * A map of tags to assign to the DB cluster.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object ClusterSnapshotArgs {
  @scala.inline
  def apply(dbClusterIdentifier: Input[String], dbClusterSnapshotIdentifier: Input[String]): ClusterSnapshotArgs = {
    val __obj = js.Dynamic.literal(dbClusterIdentifier = dbClusterIdentifier.asInstanceOf[js.Any], dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterSnapshotArgs]
  }
  @scala.inline
  implicit class ClusterSnapshotArgsOps[Self <: ClusterSnapshotArgs] (val x: Self) extends AnyVal {
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
    def setDbClusterIdentifier(value: Input[String]): Self = this.set("dbClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setDbClusterSnapshotIdentifier(value: Input[String]): Self = this.set("dbClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

