package typings.stellarSdk.horizonApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeeBumpTransactionResponse extends js.Object {
  
  var hash: String = js.native
  
  var signatures: js.Array[String] = js.native
}
object FeeBumpTransactionResponse {
  
  @scala.inline
  def apply(hash: String, signatures: js.Array[String]): FeeBumpTransactionResponse = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeeBumpTransactionResponse]
  }
  
  @scala.inline
  implicit class FeeBumpTransactionResponseOps[Self <: FeeBumpTransactionResponse] (val x: Self) extends AnyVal {
    
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
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesVarargs(value: String*): Self = this.set("signatures", js.Array(value :_*))
    
    @scala.inline
    def setSignatures(value: js.Array[String]): Self = this.set("signatures", value.asInstanceOf[js.Any])
  }
}
