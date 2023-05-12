package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Customers
  */
trait Customer
  extends StObject
     with Node
     with HasMetafields
     with MetafieldParentResource {
  
  var acceptsMarketing: Boolean
  
  var addresses: js.Array[MailingAddress]
  
  var createdAt: DateTime
  
  var defaultAddress: js.UndefOr[MailingAddress] = js.undefined
  
  var displayName: String
  
  var email: js.UndefOr[String] = js.undefined
  
  var firstName: js.UndefOr[String] = js.undefined
  
  var lastIncompleteCheckout: js.UndefOr[Checkout] = js.undefined
  
  var lastName: js.UndefOr[String] = js.undefined
  
  var numberOfOrders: Double
  
  var orders: js.Array[Order]
  
  var phone: js.UndefOr[String] = js.undefined
  
  var tags: js.Array[String]
  
  var updatedAt: DateTime
}
object Customer {
  
  inline def apply(
    acceptsMarketing: Boolean,
    addresses: js.Array[MailingAddress],
    createdAt: DateTime,
    displayName: String,
    id: ID,
    metafields: js.Array[Metafield],
    numberOfOrders: Double,
    orders: js.Array[Order],
    tags: js.Array[String],
    updatedAt: DateTime
  ): Customer = {
    val __obj = js.Dynamic.literal(acceptsMarketing = acceptsMarketing.asInstanceOf[js.Any], addresses = addresses.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], numberOfOrders = numberOfOrders.asInstanceOf[js.Any], orders = orders.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Customer] (val x: Self) extends AnyVal {
    
    inline def setAcceptsMarketing(value: Boolean): Self = StObject.set(x, "acceptsMarketing", value.asInstanceOf[js.Any])
    
    inline def setAddresses(value: js.Array[MailingAddress]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesVarargs(value: MailingAddress*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setCreatedAt(value: DateTime): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDefaultAddress(value: MailingAddress): Self = StObject.set(x, "defaultAddress", value.asInstanceOf[js.Any])
    
    inline def setDefaultAddressUndefined: Self = StObject.set(x, "defaultAddress", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setLastIncompleteCheckout(value: Checkout): Self = StObject.set(x, "lastIncompleteCheckout", value.asInstanceOf[js.Any])
    
    inline def setLastIncompleteCheckoutUndefined: Self = StObject.set(x, "lastIncompleteCheckout", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    inline def setNumberOfOrders(value: Double): Self = StObject.set(x, "numberOfOrders", value.asInstanceOf[js.Any])
    
    inline def setOrders(value: js.Array[Order]): Self = StObject.set(x, "orders", value.asInstanceOf[js.Any])
    
    inline def setOrdersVarargs(value: Order*): Self = StObject.set(x, "orders", js.Array(value*))
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUpdatedAt(value: DateTime): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
