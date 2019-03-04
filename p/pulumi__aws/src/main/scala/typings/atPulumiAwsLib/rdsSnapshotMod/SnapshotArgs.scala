package typings
package atPulumiAwsLib.rdsSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotArgs extends js.Object {
  /**
    * The DB Instance Identifier from which to take the snapshot.
    */
  val dbInstanceIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The Identifier for the snapshot.
    */
  val dbSnapshotIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object SnapshotArgs {
  @scala.inline
  def apply(
    dbInstanceIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    dbSnapshotIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): SnapshotArgs = {
    val __obj = js.Dynamic.literal(dbInstanceIdentifier = dbInstanceIdentifier.asInstanceOf[js.Any], dbSnapshotIdentifier = dbSnapshotIdentifier.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotArgs]
  }
}

