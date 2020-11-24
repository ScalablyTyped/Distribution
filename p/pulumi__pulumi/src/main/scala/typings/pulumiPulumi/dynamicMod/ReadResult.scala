package typings.pulumiPulumi.dynamicMod

import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadResult extends js.Object {
  
  /**
    * The ID of the resource ready back (or blank if missing).
    */
  val id: js.UndefOr[ID] = js.native
  
  /**
    * The current property state read from the live environment.
    */
  val props: js.UndefOr[js.Any] = js.native
}
object ReadResult {
  
  @scala.inline
  def apply(): ReadResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadResult]
  }
  
  @scala.inline
  implicit class ReadResultOps[Self <: ReadResult] (val x: Self) extends AnyVal {
    
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
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setProps(value: js.Any): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
  }
}
