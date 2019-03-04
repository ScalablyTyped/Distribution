package typings
package atPulumiAwsLib.elasticacheGetClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterArgs extends js.Object {
  /**
    * Group identifier.
    */
  val clusterId: java.lang.String
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object GetClusterArgs {
  @scala.inline
  def apply(clusterId: java.lang.String, tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null): GetClusterArgs = {
    val __obj = js.Dynamic.literal(clusterId = clusterId)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetClusterArgs]
  }
}

