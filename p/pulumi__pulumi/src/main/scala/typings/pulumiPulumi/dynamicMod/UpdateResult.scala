package typings.pulumiPulumi.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateResult extends js.Object {
  
  /**
    * Any properties that were computed during updating.
    */
  val outs: js.UndefOr[js.Any] = js.native
}
object UpdateResult {
  
  @scala.inline
  def apply(): UpdateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResult]
  }
  
  @scala.inline
  implicit class UpdateResultOps[Self <: UpdateResult] (val x: Self) extends AnyVal {
    
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
    def setOuts(value: js.Any): Self = this.set("outs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuts: Self = this.set("outs", js.undefined)
  }
}
