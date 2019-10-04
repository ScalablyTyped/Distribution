package typings.atPulumiAws.eksGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterArgs extends js.Object {
  /**
    * The name of the cluster
    */
  val name: String
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetClusterArgs {
  @scala.inline
  def apply(name: String, tags: StringDictionary[js.Any] = null): GetClusterArgs = {
    val __obj = js.Dynamic.literal(name = name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetClusterArgs]
  }
}

