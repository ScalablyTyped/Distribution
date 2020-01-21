package typings.pulumiAws.getResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceArgs extends js.Object {
  /**
    * The full path of the resource.  If no path is found, an error will be returned.
    */
  val path: String = js.native
  /**
    * The REST API id that owns the resource. If no REST API is found, an error will be returned.
    */
  val restApiId: String = js.native
}

object GetResourceArgs {
  @scala.inline
  def apply(path: String, restApiId: String): GetResourceArgs = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetResourceArgs]
  }
}

