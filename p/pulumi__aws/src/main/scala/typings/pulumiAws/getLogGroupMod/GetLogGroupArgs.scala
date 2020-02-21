package typings.pulumiAws.getLogGroupMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLogGroupArgs extends js.Object {
  /**
    * The name of the Cloudwatch log group
    */
  val name: String = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetLogGroupArgs {
  @scala.inline
  def apply(name: String, tags: StringDictionary[js.Any] = null): GetLogGroupArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogGroupArgs]
  }
}

