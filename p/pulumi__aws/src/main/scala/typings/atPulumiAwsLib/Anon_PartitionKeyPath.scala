package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PartitionKeyPath extends js.Object {
  var partitionKeyPath: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_PartitionKeyPath {
  @scala.inline
  def apply(partitionKeyPath: java.lang.String = null): Anon_PartitionKeyPath = {
    val __obj = js.Dynamic.literal()
    if (partitionKeyPath != null) __obj.updateDynamic("partitionKeyPath")(partitionKeyPath)
    __obj.asInstanceOf[Anon_PartitionKeyPath]
  }
}

