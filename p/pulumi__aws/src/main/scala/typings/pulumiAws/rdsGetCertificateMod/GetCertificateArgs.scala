package typings.pulumiAws.rdsGetCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCertificateArgs extends js.Object {
  
  /**
    * Certificate identifier. For example, `rds-ca-2019`.
    */
  val id: js.UndefOr[String] = js.native
  
  /**
    * When enabled, returns the certificate with the latest `ValidTill`.
    */
  val latestValidTill: js.UndefOr[Boolean] = js.native
}
object GetCertificateArgs {
  
  @scala.inline
  def apply(): GetCertificateArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCertificateArgs]
  }
  
  @scala.inline
  implicit class GetCertificateArgsOps[Self <: GetCertificateArgs] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLatestValidTill(value: Boolean): Self = this.set("latestValidTill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestValidTill: Self = this.set("latestValidTill", js.undefined)
  }
}
