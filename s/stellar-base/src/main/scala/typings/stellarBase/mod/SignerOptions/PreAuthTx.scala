package typings.stellarBase.mod.SignerOptions

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreAuthTx extends js.Object {
  
  var preAuthTx: Buffer | String = js.native
  
  var weight: js.UndefOr[Double | String] = js.native
}
object PreAuthTx {
  
  @scala.inline
  def apply(preAuthTx: Buffer | String): PreAuthTx = {
    val __obj = js.Dynamic.literal(preAuthTx = preAuthTx.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreAuthTx]
  }
  
  @scala.inline
  implicit class PreAuthTxOps[Self <: PreAuthTx] (val x: Self) extends AnyVal {
    
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
    def setPreAuthTx(value: Buffer | String): Self = this.set("preAuthTx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double | String): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
