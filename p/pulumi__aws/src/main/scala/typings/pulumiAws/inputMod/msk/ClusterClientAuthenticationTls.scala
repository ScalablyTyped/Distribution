package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterClientAuthenticationTls extends js.Object {
  
  /**
    * List of ACM Certificate Authority Amazon Resource Names (ARNs).
    */
  var certificateAuthorityArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object ClusterClientAuthenticationTls {
  
  @scala.inline
  def apply(): ClusterClientAuthenticationTls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterClientAuthenticationTls]
  }
  
  @scala.inline
  implicit class ClusterClientAuthenticationTlsOps[Self <: ClusterClientAuthenticationTls] (val x: Self) extends AnyVal {
    
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
    def setCertificateAuthorityArnsVarargs(value: Input[String]*): Self = this.set("certificateAuthorityArns", js.Array(value :_*))
    
    @scala.inline
    def setCertificateAuthorityArns(value: Input[js.Array[Input[String]]]): Self = this.set("certificateAuthorityArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateAuthorityArns: Self = this.set("certificateAuthorityArns", js.undefined)
  }
}
