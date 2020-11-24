package typings.pulumiPulumi.dynamicMod

import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateResult extends js.Object {
  
  /**
    * The ID of the created resource.
    */
  val id: ID = js.native
  
  /**
    * Any properties that were computed during creation.
    */
  val outs: js.UndefOr[js.Any] = js.native
}
object CreateResult {
  
  @scala.inline
  def apply(id: ID): CreateResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResult]
  }
  
  @scala.inline
  implicit class CreateResultOps[Self <: CreateResult] (val x: Self) extends AnyVal {
    
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
    def setId(value: ID): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuts(value: js.Any): Self = this.set("outs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuts: Self = this.set("outs", js.undefined)
  }
}
