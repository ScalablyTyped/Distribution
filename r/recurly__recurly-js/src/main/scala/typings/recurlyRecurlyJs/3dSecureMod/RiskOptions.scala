package typings.recurlyRecurlyJs.`3dSecureMod`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RiskOptions extends js.Object {
  
  /**
    * `three_d_secure_action_token_id` returned by the Recurly API when 3-D Secure authentication is required for a
    * transaction.
    *
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-recurlythreedsecure|ThreeDSecure}
    */
  var actionTokenId: js.UndefOr[String] = js.native
}
object RiskOptions {
  
  @scala.inline
  def apply(): RiskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskOptions]
  }
  
  @scala.inline
  implicit class RiskOptionsOps[Self <: RiskOptions] (val x: Self) extends AnyVal {
    
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
    def setActionTokenId(value: String): Self = this.set("actionTokenId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionTokenId: Self = this.set("actionTokenId", js.undefined)
  }
}
