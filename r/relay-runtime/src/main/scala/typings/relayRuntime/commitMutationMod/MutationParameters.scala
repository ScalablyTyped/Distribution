package typings.relayRuntime.commitMutationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutationParameters extends js.Object {
  
  val rawResponse: js.UndefOr[js.Object] = js.native
}
object MutationParameters {
  
  @scala.inline
  def apply(): MutationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationParameters]
  }
  
  @scala.inline
  implicit class MutationParametersOps[Self <: MutationParameters] (val x: Self) extends AnyVal {
    
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
    def setRawResponse(value: js.Object): Self = this.set("rawResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawResponse: Self = this.set("rawResponse", js.undefined)
  }
}
