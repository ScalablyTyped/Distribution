package typings.pulumiAws.getRoleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRoleArgs extends js.Object {
  /**
    * The friendly IAM role name to match.
    */
  val name: String = js.native
  /**
    * The tags attached to the role.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetRoleArgs {
  @scala.inline
  def apply(name: String, tags: StringDictionary[js.Any] = null): GetRoleArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRoleArgs]
  }
}

