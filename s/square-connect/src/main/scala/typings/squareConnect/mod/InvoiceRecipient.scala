package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "InvoiceRecipient")
@js.native
open class InvoiceRecipient () extends StObject {
  
  /**
    * The recipient's physical address.
    */
  var address: js.UndefOr[Address] = js.native
  
  /**
    * The name of the recipient's company.
    */
  var company_name: js.UndefOr[String] = js.native
  
  /**
    * The ID of the customer. This is the customer profile ID that you provide when creating a draft invoice.
    */
  var customer_id: js.UndefOr[String] = js.native
  
  /**
    * The recipient's email address.
    */
  var email_address: js.UndefOr[String] = js.native
  
  /**
    * The recipient's family (that is, last) name.
    */
  var family_name: js.UndefOr[String] = js.native
  
  /**
    * The recipient's given (that is, first) name.
    */
  var given_name: js.UndefOr[String] = js.native
  
  /**
    * The recipient's phone number.
    */
  var phone_number: js.UndefOr[String] = js.native
}
