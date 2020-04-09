package typings.pulumiAws.getStreamMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStreamArgs extends js.Object {
  /**
    * The name of the Kinesis Stream.
    */
  val name: String = js.native
  /**
    * A mapping of tags to assigned to the stream.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetStreamArgs {
  @scala.inline
  def apply(name: String, tags: StringDictionary[js.Any] = null): GetStreamArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamArgs]
  }
}

