package typings
package atPulumiAwsLib.redshiftGetClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterArgs extends js.Object {
  /**
    * The cluster identifier
    */
  val clusterIdentifier: java.lang.String
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object GetClusterArgs {
  @scala.inline
  def apply(
    clusterIdentifier: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): GetClusterArgs = {
    val __obj = js.Dynamic.literal(clusterIdentifier = clusterIdentifier)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetClusterArgs]
  }
}

