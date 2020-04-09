package typings.pulumiAws.getKeyMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetKeyArgs extends js.Object {
  /**
    * The ID of the API Key to look up.
    */
  val id: String = js.native
  /**
    * A mapping of tags for the resource.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetKeyArgs {
  @scala.inline
  def apply(id: String, tags: StringDictionary[js.Any] = null): GetKeyArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyArgs]
  }
}

