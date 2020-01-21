package typings.pulumiAws.rdsSnapshotMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotArgs extends js.Object {
  /**
    * The DB Instance Identifier from which to take the snapshot.
    */
  val dbInstanceIdentifier: Input[String] = js.native
  /**
    * The Identifier for the snapshot.
    */
  val dbSnapshotIdentifier: Input[String] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object SnapshotArgs {
  @scala.inline
  def apply(
    dbInstanceIdentifier: Input[String],
    dbSnapshotIdentifier: Input[String],
    tags: Input[StringDictionary[_]] = null
  ): SnapshotArgs = {
    val __obj = js.Dynamic.literal(dbInstanceIdentifier = dbInstanceIdentifier.asInstanceOf[js.Any], dbSnapshotIdentifier = dbSnapshotIdentifier.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotArgs]
  }
}

