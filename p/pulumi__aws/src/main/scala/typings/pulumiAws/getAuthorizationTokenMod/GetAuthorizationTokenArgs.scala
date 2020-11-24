package typings.pulumiAws.getAuthorizationTokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAuthorizationTokenArgs extends js.Object {
  
  /**
    * The name of the domain that is in scope for the generated authorization token.
    */
  val domain: String = js.native
  
  /**
    * The account number of the AWS account that owns the domain.
    */
  val domainOwner: js.UndefOr[String] = js.native
  
  /**
    * The time, in seconds, that the generated authorization token is valid. Valid values are `0` and between `900` and `43200`.
    */
  val durationSeconds: js.UndefOr[Double] = js.native
}
object GetAuthorizationTokenArgs {
  
  @scala.inline
  def apply(domain: String): GetAuthorizationTokenArgs = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAuthorizationTokenArgs]
  }
  
  @scala.inline
  implicit class GetAuthorizationTokenArgsOps[Self <: GetAuthorizationTokenArgs] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwner(value: String): Self = this.set("domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainOwner: Self = this.set("domainOwner", js.undefined)
    
    @scala.inline
    def setDurationSeconds(value: Double): Self = this.set("durationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationSeconds: Self = this.set("durationSeconds", js.undefined)
  }
}
