package typings.pulumiAws.getKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetKeyArgs extends js.Object {
  /**
    * The ID of the API Key to look up.
    */
  val id: String = js.native
}

object GetKeyArgs {
  @scala.inline
  def apply(id: String): GetKeyArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetKeyArgs]
  }
}

