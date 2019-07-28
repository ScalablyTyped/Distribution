package typings.atPulumiAws.rdsGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterArgs extends js.Object {
  /**
    * The cluster identifier of the RDS cluster.
    */
  val clusterIdentifier: String
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetClusterArgs {
  @scala.inline
  def apply(clusterIdentifier: String, tags: StringDictionary[js.Any] = null): GetClusterArgs = {
    val __obj = js.Dynamic.literal(clusterIdentifier = clusterIdentifier)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetClusterArgs]
  }
}

