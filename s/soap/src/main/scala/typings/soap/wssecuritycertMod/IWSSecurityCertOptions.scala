package typings.soap.wssecuritycertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWSSecurityCertOptions extends js.Object {
  
  var additionalReferences: js.UndefOr[js.Array[String]] = js.native
  
  var hasTimeStamp: js.UndefOr[Boolean] = js.native
  
  var signatureAlgorithm: js.UndefOr[String] = js.native
  
  var signatureTransformations: js.UndefOr[js.Array[String]] = js.native
  
  var signerOptions: js.UndefOr[IXmlSignerOptions] = js.native
}
object IWSSecurityCertOptions {
  
  @scala.inline
  def apply(): IWSSecurityCertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWSSecurityCertOptions]
  }
  
  @scala.inline
  implicit class IWSSecurityCertOptionsOps[Self <: IWSSecurityCertOptions] (val x: Self) extends AnyVal {
    
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
    def setAdditionalReferencesVarargs(value: String*): Self = this.set("additionalReferences", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalReferences(value: js.Array[String]): Self = this.set("additionalReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalReferences: Self = this.set("additionalReferences", js.undefined)
    
    @scala.inline
    def setHasTimeStamp(value: Boolean): Self = this.set("hasTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasTimeStamp: Self = this.set("hasTimeStamp", js.undefined)
    
    @scala.inline
    def setSignatureAlgorithm(value: String): Self = this.set("signatureAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureAlgorithm: Self = this.set("signatureAlgorithm", js.undefined)
    
    @scala.inline
    def setSignatureTransformationsVarargs(value: String*): Self = this.set("signatureTransformations", js.Array(value :_*))
    
    @scala.inline
    def setSignatureTransformations(value: js.Array[String]): Self = this.set("signatureTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureTransformations: Self = this.set("signatureTransformations", js.undefined)
    
    @scala.inline
    def setSignerOptions(value: IXmlSignerOptions): Self = this.set("signerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerOptions: Self = this.set("signerOptions", js.undefined)
  }
}
