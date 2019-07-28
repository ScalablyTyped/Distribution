package typings.atPulumiAws.elasticacheGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterArgs extends js.Object {
  /**
    * Group identifier.
    */
  val clusterId: String
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetClusterArgs {
  @scala.inline
  def apply(clusterId: String, tags: StringDictionary[js.Any] = null): GetClusterArgs = {
    val __obj = js.Dynamic.literal(clusterId = clusterId)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetClusterArgs]
  }
}

