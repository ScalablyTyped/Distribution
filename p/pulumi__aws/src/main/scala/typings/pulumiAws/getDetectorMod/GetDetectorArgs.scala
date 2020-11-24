package typings.pulumiAws.getDetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDetectorArgs extends js.Object {
  
  /**
    * The ID of the detector.
    */
  val id: js.UndefOr[String] = js.native
}
object GetDetectorArgs {
  
  @scala.inline
  def apply(): GetDetectorArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDetectorArgs]
  }
  
  @scala.inline
  implicit class GetDetectorArgsOps[Self <: GetDetectorArgs] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
