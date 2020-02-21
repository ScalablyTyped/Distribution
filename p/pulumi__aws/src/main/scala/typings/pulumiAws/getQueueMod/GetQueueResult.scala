package typings.pulumiAws.getQueueMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueueResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the queue.
    */
  val arn: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
  /**
    * A mapping of tags for the resource.
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * The URL of the queue.
    */
  val url: String = js.native
}

object GetQueueResult {
  @scala.inline
  def apply(arn: String, id: String, name: String, tags: StringDictionary[js.Any], url: String): GetQueueResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetQueueResult]
  }
}

