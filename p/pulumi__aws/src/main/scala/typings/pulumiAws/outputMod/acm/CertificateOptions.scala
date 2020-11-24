package typings.pulumiAws.outputMod.acm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateOptions extends js.Object {
  
  /**
    * Specifies whether certificate details should be added to a certificate transparency log. Valid values are `ENABLED` or `DISABLED`. See https://docs.aws.amazon.com/acm/latest/userguide/acm-concepts.html#concept-transparency for more details.
    */
  var certificateTransparencyLoggingPreference: js.UndefOr[String] = js.native
}
object CertificateOptions {
  
  @scala.inline
  def apply(): CertificateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateOptions]
  }
  
  @scala.inline
  implicit class CertificateOptionsOps[Self <: CertificateOptions] (val x: Self) extends AnyVal {
    
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
    def setCertificateTransparencyLoggingPreference(value: String): Self = this.set("certificateTransparencyLoggingPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateTransparencyLoggingPreference: Self = this.set("certificateTransparencyLoggingPreference", js.undefined)
  }
}
