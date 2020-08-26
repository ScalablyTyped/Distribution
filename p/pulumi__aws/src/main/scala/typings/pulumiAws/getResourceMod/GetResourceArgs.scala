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
  @scala.inline
  implicit class GetResourceArgsOps[Self <: GetResourceArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestApiId(value: String): Self = this.set("restApiId", value.asInstanceOf[js.Any])
  }
  
}

