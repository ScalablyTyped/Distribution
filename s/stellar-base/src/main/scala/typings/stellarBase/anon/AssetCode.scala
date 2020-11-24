package typings.stellarBase.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetCode extends js.Object {
  
  var assetCode: Buffer = js.native
  
  var issuer: typings.stellarBase.xdrMod.xdr.AccountId = js.native
}
object AssetCode {
  
  @scala.inline
  def apply(assetCode: Buffer, issuer: typings.stellarBase.xdrMod.xdr.AccountId): AssetCode = {
    val __obj = js.Dynamic.literal(assetCode = assetCode.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetCode]
  }
  
  @scala.inline
  implicit class AssetCodeOps[Self <: AssetCode] (val x: Self) extends AnyVal {
    
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
    def setAssetCode(value: Buffer): Self = this.set("assetCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuer(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = this.set("issuer", value.asInstanceOf[js.Any])
  }
}
