package typings.pulumiAws.mskGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterArgs extends js.Object {
  /**
    * Name of the cluster.
    */
  val clusterName: String = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetClusterArgs {
  @scala.inline
  def apply(clusterName: String, tags: StringDictionary[js.Any] = null): GetClusterArgs = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterArgs]
  }
}

