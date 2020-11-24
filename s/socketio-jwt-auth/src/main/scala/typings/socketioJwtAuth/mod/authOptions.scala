package typings.socketioJwtAuth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait authOptions extends js.Object {
  
  var algorithm: js.UndefOr[String] = js.native
  
  var secret: String = js.native
  
  var succeedWithoutToken: js.UndefOr[Boolean] = js.native
}
object authOptions {
  
  @scala.inline
  def apply(secret: String): authOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[authOptions]
  }
  
  @scala.inline
  implicit class authOptionsOps[Self <: authOptions] (val x: Self) extends AnyVal {
    
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
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setSucceedWithoutToken(value: Boolean): Self = this.set("succeedWithoutToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSucceedWithoutToken: Self = this.set("succeedWithoutToken", js.undefined)
  }
}
