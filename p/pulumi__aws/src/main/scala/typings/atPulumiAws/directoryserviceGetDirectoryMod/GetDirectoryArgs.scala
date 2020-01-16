package typings.atPulumiAws.directoryserviceGetDirectoryMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDirectoryArgs extends js.Object {
  /**
    * The ID of the directory.
    */
  val directoryId: String = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetDirectoryArgs {
  @scala.inline
  def apply(directoryId: String, tags: StringDictionary[js.Any] = null): GetDirectoryArgs = {
    val __obj = js.Dynamic.literal(directoryId = directoryId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectoryArgs]
  }
}

