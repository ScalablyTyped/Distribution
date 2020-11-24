package typings.pulumiAws.workspacesGetImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetImageArgs extends js.Object {
  
  /**
    * The ID of the image.
    */
  val imageId: String = js.native
}
object GetImageArgs {
  
  @scala.inline
  def apply(imageId: String): GetImageArgs = {
    val __obj = js.Dynamic.literal(imageId = imageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageArgs]
  }
  
  @scala.inline
  implicit class GetImageArgsOps[Self <: GetImageArgs] (val x: Self) extends AnyVal {
    
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
    def setImageId(value: String): Self = this.set("imageId", value.asInstanceOf[js.Any])
  }
}
