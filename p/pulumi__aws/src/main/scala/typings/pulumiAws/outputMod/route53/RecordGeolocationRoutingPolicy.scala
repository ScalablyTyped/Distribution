package typings.pulumiAws.outputMod.route53

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordGeolocationRoutingPolicy extends js.Object {
  
  /**
    * A two-letter continent code. See http://docs.aws.amazon.com/Route53/latest/APIReference/API_GetGeoLocation.html for code details. Either `continent` or `country` must be specified.
    */
  var continent: js.UndefOr[String] = js.native
  
  /**
    * A two-character country code or `*` to indicate a default resource record set.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * A subdivision code for a country.
    */
  var subdivision: js.UndefOr[String] = js.native
}
object RecordGeolocationRoutingPolicy {
  
  @scala.inline
  def apply(): RecordGeolocationRoutingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordGeolocationRoutingPolicy]
  }
  
  @scala.inline
  implicit class RecordGeolocationRoutingPolicyOps[Self <: RecordGeolocationRoutingPolicy] (val x: Self) extends AnyVal {
    
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
    def setContinent(value: String): Self = this.set("continent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinent: Self = this.set("continent", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setSubdivision(value: String): Self = this.set("subdivision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdivision: Self = this.set("subdivision", js.undefined)
  }
}
