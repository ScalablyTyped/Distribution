package typings.stellarBase.mod.SignerOptions

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sha256Hash extends js.Object {
  
  var sha256Hash: Buffer | String = js.native
  
  var weight: js.UndefOr[Double | String] = js.native
}
object Sha256Hash {
  
  @scala.inline
  def apply(sha256Hash: Buffer | String): Sha256Hash = {
    val __obj = js.Dynamic.literal(sha256Hash = sha256Hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha256Hash]
  }
  
  @scala.inline
  implicit class Sha256HashOps[Self <: Sha256Hash] (val x: Self) extends AnyVal {
    
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
    def setSha256Hash(value: Buffer | String): Self = this.set("sha256Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double | String): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
