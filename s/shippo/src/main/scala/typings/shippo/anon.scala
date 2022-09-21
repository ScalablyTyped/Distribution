package typings.shippo

import typings.shippo.mod.Shippo.Address
import typings.shippo.mod.Shippo.Carrier
import typings.shippo.mod.Shippo.CreateAddressRequest
import typings.shippo.mod.Shippo.CreateParcelRequest
import typings.shippo.mod.Shippo.CreateShipmentRequest
import typings.shippo.mod.Shippo.PaginatedList
import typings.shippo.mod.Shippo.PaginationArgs
import typings.shippo.mod.Shippo.Parcel
import typings.shippo.mod.Shippo.Rate
import typings.shippo.mod.Shippo.ServiceLevels
import typings.shippo.mod.Shippo.Shipment
import typings.shippo.mod.Shippo.Transaction
import typings.shippo.mod.Shippo.TransactionCreateInstantRequest
import typings.shippo.mod.Shippo.TransactionCreateRateRequest
import typings.shippo.mod.Shippo.ValidationError
import typings.shippo.shippoStrings.ANY
import typings.shippo.shippoStrings.CASH
import typings.shippo.shippoStrings.FEDEX
import typings.shippo.shippoStrings.SECURED_FUNDS
import typings.shippo.shippoStrings.UPS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    def retrieve(id: String): js.Promise[Rate]
  }
  object `0` {
    
    inline def apply(retrieve: String => js.Promise[Rate]): `0` = {
      val __obj = js.Dynamic.literal(retrieve = js.Any.fromFunction1(retrieve))
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setRetrieve(value: String => js.Promise[Rate]): Self = StObject.set(x, "retrieve", js.Any.fromFunction1(value))
    }
  }
  
  trait Amount extends StObject {
    
    var amount: js.UndefOr[String] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var payment_method: js.UndefOr[SECURED_FUNDS | CASH | ANY] = js.undefined
  }
  object Amount {
    
    inline def apply(): Amount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Amount]
    }
    
    extension [Self <: Amount](x: Self) {
      
      inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setPayment_method(value: SECURED_FUNDS | CASH | ANY): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
      
      inline def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
    }
  }
  
  trait Content extends StObject {
    
    var amount: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var provider: js.UndefOr[FEDEX | UPS] = js.undefined
  }
  object Content {
    
    inline def apply(): Content = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setProvider(value: FEDEX | UPS): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    }
  }
  
  @js.native
  trait Create extends StObject {
    
    def create(request: CreateShipmentRequest): js.Promise[Shipment] = js.native
    
    def list(): js.Promise[PaginatedList[Shipment]] = js.native
    def list(args: PaginationArgs): js.Promise[PaginatedList[Shipment]] = js.native
    
    def retrieve(id: String): js.Promise[Shipment] = js.native
  }
  
  @js.native
  trait CreateList extends StObject {
    
    def create(parcel: CreateParcelRequest): js.Promise[Parcel] = js.native
    
    def list(): js.Promise[PaginatedList[Parcel]] = js.native
    def list(args: PaginationArgs): js.Promise[PaginatedList[Parcel]] = js.native
    
    def retrieve(id: String): js.Promise[Parcel] = js.native
  }
  
  trait Extendedtoken extends StObject {
    
    var extended_token: String
    
    var name: String
    
    var terms: String
    
    var token: ServiceLevels
  }
  object Extendedtoken {
    
    inline def apply(extended_token: String, name: String, terms: String, token: ServiceLevels): Extendedtoken = {
      val __obj = js.Dynamic.literal(extended_token = extended_token.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extendedtoken]
    }
    
    extension [Self <: Extendedtoken](x: Self) {
      
      inline def setExtended_token(value: String): Self = StObject.set(x, "extended_token", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTerms(value: String): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
      
      inline def setToken(value: ServiceLevels): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait Isvalid extends StObject {
    
    var is_valid: js.UndefOr[Boolean] = js.undefined
    
    var messages: js.UndefOr[js.Array[ValidationError]] = js.undefined
  }
  object Isvalid {
    
    inline def apply(): Isvalid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Isvalid]
    }
    
    extension [Self <: Isvalid](x: Self) {
      
      inline def setIs_valid(value: Boolean): Self = StObject.set(x, "is_valid", value.asInstanceOf[js.Any])
      
      inline def setIs_validUndefined: Self = StObject.set(x, "is_valid", js.undefined)
      
      inline def setMessages(value: js.Array[ValidationError]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMessagesVarargs(value: ValidationError*): Self = StObject.set(x, "messages", js.Array(value*))
    }
  }
  
  @js.native
  trait List extends StObject {
    
    def create(request: CreateAddressRequest): js.Promise[Address] = js.native
    
    def list(): js.Promise[PaginatedList[Address]] = js.native
    def list(args: PaginationArgs): js.Promise[PaginatedList[Address]] = js.native
    
    def retrieve(id: String): js.Promise[Address] = js.native
    
    def validate(id: String): js.Promise[Address] = js.native
  }
  
  @js.native
  trait ListRetrieve extends StObject {
    
    def list(): js.Promise[PaginatedList[Carrier]] = js.native
    def list(args: PaginationArgs): js.Promise[PaginatedList[Carrier]] = js.native
    
    def retrieve(carrierId: String): js.Promise[Carrier] = js.native
  }
  
  @js.native
  trait Retrieve extends StObject {
    
    def create(request: TransactionCreateInstantRequest): js.Promise[Transaction] = js.native
    def create(request: TransactionCreateRateRequest): js.Promise[Transaction] = js.native
    
    def list(): js.Promise[PaginatedList[Transaction]] = js.native
    def list(args: PaginationArgs): js.Promise[PaginatedList[Transaction]] = js.native
    
    def retrieve(id: String): js.Promise[Transaction] = js.native
  }
}
