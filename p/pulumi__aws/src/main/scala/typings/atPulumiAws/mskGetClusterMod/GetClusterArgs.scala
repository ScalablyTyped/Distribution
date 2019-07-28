package typings.atPulumiAws.mskGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterArgs extends js.Object {
  /**
    * Name of the cluster.
    */
  val clusterName: String
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetClusterArgs {
  @scala.inline
  def apply(clusterName: String, tags: StringDictionary[js.Any] = null): GetClusterArgs = {
    val __obj = js.Dynamic.literal(clusterName = clusterName)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetClusterArgs]
  }
}

