package typings.reactNativeSquareInAppPayments.mod.SQIPCardEntry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Types
@js.native
trait CardEntryConfig extends js.Object {
  
  /**
    * The street address lines of the contact address.
    * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
    */
  var addressLines: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Payment amount
    * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
    */
  var amount: js.UndefOr[Double] = js.native
  
  /**
    * Indicates the action (Charge or Store) that will be performed onto the card after retrieving the verification token.
    * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
    */
  var buyerAction: js.UndefOr[String] = js.native
  
  /**
    * The city name of the contact address.
    * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
    */
  var city: js.UndefOr[String] = js.native
  
  /**
    * Indicates that the customer must enter the postal code associated with their payment card. When false, the postal code field will not be displayed. Defaults to true.
    * A Postal code must be collected for processing payments for Square accounts based in the United States, Canada, and United Kingdom.
    * Disabling postal code collection in those regions will result in all credit card transactions being declined.
    */
  var collectPostalCode: Boolean = js.native
  
  /**
    * A 2-letter string containing the ISO 3166-1 country code of the contact address.
    * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
    */
  var countryCode: js.UndefOr[String] = js.native
  
  /**
    * ISO currency code of the payment amount.
    * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
    */
  var currencyCode: js.UndefOr[String] = js.native
  
  /**
    * Email address of the contact.
    * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * Last name of the contact.
    * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
    */
  var familyName: js.UndefOr[String] = js.native
  
  /**
    * Given name of the contact.
    * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
    */
  var givenName: js.UndefOr[String] = js.native
  
  /**
    * The telephone number of the contact.
    * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
    */
  var phone: js.UndefOr[String] = js.native
  
  /**
    * The postal code of the contact address.
    * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
    */
  var postalCode: js.UndefOr[String] = js.native
  
  /**
    * The applicable administrative region (e.g., province, state) of the contact address.
    * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * The location that is being verified against.
    * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
    */
  var squareLocationId: js.UndefOr[String] = js.native
}
object CardEntryConfig {
  
  @scala.inline
  def apply(collectPostalCode: Boolean): CardEntryConfig = {
    val __obj = js.Dynamic.literal(collectPostalCode = collectPostalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardEntryConfig]
  }
  
  @scala.inline
  implicit class CardEntryConfigOps[Self <: CardEntryConfig] (val x: Self) extends AnyVal {
    
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
    def setCollectPostalCode(value: Boolean): Self = this.set("collectPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLinesVarargs(value: String*): Self = this.set("addressLines", js.Array(value :_*))
    
    @scala.inline
    def setAddressLines(value: js.Array[String]): Self = this.set("addressLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressLines: Self = this.set("addressLines", js.undefined)
    
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setBuyerAction(value: String): Self = this.set("buyerAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuyerAction: Self = this.set("buyerAction", js.undefined)
    
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamilyName: Self = this.set("familyName", js.undefined)
    
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSquareLocationId(value: String): Self = this.set("squareLocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSquareLocationId: Self = this.set("squareLocationId", js.undefined)
  }
}
