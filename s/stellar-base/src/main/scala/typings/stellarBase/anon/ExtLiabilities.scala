package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.TrustLineEntryV1Ext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtLiabilities extends js.Object {
  
  var ext: TrustLineEntryV1Ext = js.native
  
  var liabilities: typings.stellarBase.xdrMod.xdr.Liabilities = js.native
}
object ExtLiabilities {
  
  @scala.inline
  def apply(ext: TrustLineEntryV1Ext, liabilities: typings.stellarBase.xdrMod.xdr.Liabilities): ExtLiabilities = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], liabilities = liabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtLiabilities]
  }
  
  @scala.inline
  implicit class ExtLiabilitiesOps[Self <: ExtLiabilities] (val x: Self) extends AnyVal {
    
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
    def setExt(value: TrustLineEntryV1Ext): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiabilities(value: typings.stellarBase.xdrMod.xdr.Liabilities): Self = this.set("liabilities", value.asInstanceOf[js.Any])
  }
}
