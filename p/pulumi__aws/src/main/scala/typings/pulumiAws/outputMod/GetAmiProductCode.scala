package typings.pulumiAws.outputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAmiProductCode extends js.Object {
  
  var productCodeId: String = js.native
  
  var productCodeType: String = js.native
}
object GetAmiProductCode {
  
  @scala.inline
  def apply(productCodeId: String, productCodeType: String): GetAmiProductCode = {
    val __obj = js.Dynamic.literal(productCodeId = productCodeId.asInstanceOf[js.Any], productCodeType = productCodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAmiProductCode]
  }
  
  @scala.inline
  implicit class GetAmiProductCodeOps[Self <: GetAmiProductCode] (val x: Self) extends AnyVal {
    
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
    def setProductCodeId(value: String): Self = this.set("productCodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCodeType(value: String): Self = this.set("productCodeType", value.asInstanceOf[js.Any])
  }
}
