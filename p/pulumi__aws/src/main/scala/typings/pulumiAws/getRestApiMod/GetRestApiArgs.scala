package typings.pulumiAws.getRestApiMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRestApiArgs extends js.Object {
  /**
    * The name of the REST API to look up. If no REST API is found with this name, an error will be returned. If multiple REST APIs are found with this name, an error will be returned.
    */
  val name: String = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetRestApiArgs {
  @scala.inline
  def apply(name: String, tags: StringDictionary[js.Any] = null): GetRestApiArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRestApiArgs]
  }
}

