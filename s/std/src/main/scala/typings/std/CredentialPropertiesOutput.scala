package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialPropertiesOutput extends js.Object {
  
  var rk: js.UndefOr[scala.Boolean] = js.native
}
object CredentialPropertiesOutput {
  
  @scala.inline
  def apply(): CredentialPropertiesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialPropertiesOutput]
  }
  
  @scala.inline
  implicit class CredentialPropertiesOutputOps[Self <: CredentialPropertiesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRk(value: scala.Boolean): Self = this.set("rk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRk: Self = this.set("rk", js.undefined)
  }
}
