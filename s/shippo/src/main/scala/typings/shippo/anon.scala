package typings.shippo

import typings.shippo.mod.Address
import typings.shippo.mod.Batch
import typings.shippo.mod.Batch.ObjectResult
import typings.shippo.mod.BatchAddShipmentsRequest
import typings.shippo.mod.BatchRemoveShipmentsRequest
import typings.shippo.mod.Carrier
import typings.shippo.mod.Carriers
import typings.shippo.mod.CreateAddressRequest
import typings.shippo.mod.CreateBatchRequest
import typings.shippo.mod.CreateCustomsDeclarationRequest
import typings.shippo.mod.CreateCustomsItemRequest
import typings.shippo.mod.CreateManifestRequest
import typings.shippo.mod.CreateParcelRequest
import typings.shippo.mod.CreateRefundRequest
import typings.shippo.mod.CreateShipmentRequest
import typings.shippo.mod.CustomsDeclaration
import typings.shippo.mod.CustomsItem
import typings.shippo.mod.Manifest
import typings.shippo.mod.PaginatedList
import typings.shippo.mod.PaginationArgs
import typings.shippo.mod.Parcel
import typings.shippo.mod.Rate
import typings.shippo.mod.Refund
import typings.shippo.mod.RegisterTrackRequest
import typings.shippo.mod.ServiceLevels
import typings.shippo.mod.Shipment
import typings.shippo.mod.Track
import typings.shippo.mod.Transaction
import typings.shippo.mod.TransactionCreateInstantRequest
import typings.shippo.mod.TransactionCreateRateRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    def list(): js.Promise[PaginatedList[Carrier]] = js.native
    def list(args: PaginationArgs): js.Promise[PaginatedList[Carrier]] = js.native
    
    def retrieve(carrierId: String): js.Promise[Carrier] = js.native
  }
  
  @js.native
  trait `1` extends StObject {
    
    def create(request: CreateManifestRequest): js.Promise[Manifest] = js.native
    
    def list(): js.Promise[PaginatedList[Manifest]] = js.native
    def list(args: PaginationArgs): js.Promise[PaginatedList[Manifest]] = js.native
    
    def retrieve(id: String): js.Promise[Manifest] = js.native
  }
  
  @js.native
  trait `2` extends StObject {
    
    def create(request: CreateRefundRequest): js.Promise[Refund] = js.native
    
    def list(): js.Promise[PaginatedList[Refund]] = js.native
    def list(args: PaginationArgs): js.Promise[PaginatedList[Refund]] = js.native
    
    def retrieve(id: String): js.Promise[Refund] = js.native
  }
  
  trait `3` extends StObject {
    
    def retrieve(id: String): js.Promise[Rate]
  }
  object `3` {
    
    inline def apply(retrieve: String => js.Promise[Rate]): `3` = {
      val __obj = js.Dynamic.literal(retrieve = js.Any.fromFunction1(retrieve))
      __obj.asInstanceOf[`3`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
      
      inline def setRetrieve(value: String => js.Promise[Rate]): Self = StObject.set(x, "retrieve", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Add extends StObject {
    
    def add(id: String, request: BatchAddShipmentsRequest): js.Promise[Batch] = js.native
    
    def create(request: CreateBatchRequest): js.Promise[Batch] = js.native
    
    def purchase(id: String): js.Promise[Batch] = js.native
    
    def remove(id: String, request: BatchRemoveShipmentsRequest): js.Promise[Batch] = js.native
    
    def retrieve(id: String): js.Promise[Batch] = js.native
    def retrieve(id: String, page: Double): js.Promise[Batch] = js.native
    def retrieve(id: String, page: Double, filter: ObjectResult): js.Promise[Batch] = js.native
    def retrieve(id: String, page: Unit, filter: ObjectResult): js.Promise[Batch] = js.native
  }
  
  @js.native
  trait Create extends StObject {
    
    def create(request: CreateAddressRequest): js.Promise[Address] = js.native
    
    def list(): js.Promise[PaginatedList[Address]] = js.native
    def list(args: PaginationArgs): js.Promise[PaginatedList[Address]] = js.native
    
    def retrieve(id: String): js.Promise[Address] = js.native
    
    def validate(id: String): js.Promise[Address] = js.native
  }
  
  @js.native
  trait CreateList extends StObject {
    
    def create(request: TransactionCreateInstantRequest): js.Promise[Transaction] = js.native
    def create(request: TransactionCreateRateRequest): js.Promise[Transaction] = js.native
    
    def list(): js.Promise[PaginatedList[Transaction]] = js.native
    def list(args: PaginationArgs): js.Promise[PaginatedList[Transaction]] = js.native
    
    def retrieve(id: String): js.Promise[Transaction] = js.native
  }
  
  @js.native
  trait CreateListRetrieve extends StObject {
    
    def create(request: CreateCustomsDeclarationRequest): js.Promise[CustomsDeclaration] = js.native
    
    def list(): js.Promise[PaginatedList[CustomsDeclaration]] = js.native
    def list(args: PaginationArgs): js.Promise[PaginatedList[CustomsDeclaration]] = js.native
    
    def retrieve(id: String): js.Promise[CustomsDeclaration] = js.native
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Extendedtoken] (val x: Self) extends AnyVal {
      
      inline def setExtended_token(value: String): Self = StObject.set(x, "extended_token", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTerms(value: String): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
      
      inline def setToken(value: ServiceLevels): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait Getstatus extends StObject {
    
    def create(request: RegisterTrackRequest): js.Promise[Track]
    
    def get_status(carrier: Carriers, trackingNumber: String): js.Promise[Track]
  }
  object Getstatus {
    
    inline def apply(
      create: RegisterTrackRequest => js.Promise[Track],
      get_status: (Carriers, String) => js.Promise[Track]
    ): Getstatus = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get_status = js.Any.fromFunction2(get_status))
      __obj.asInstanceOf[Getstatus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Getstatus] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: RegisterTrackRequest => js.Promise[Track]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setGet_status(value: (Carriers, String) => js.Promise[Track]): Self = StObject.set(x, "get_status", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait List extends StObject {
    
    def create(parcel: CreateParcelRequest): js.Promise[Parcel] = js.native
    
    def list(): js.Promise[PaginatedList[Parcel]] = js.native
    def list(args: PaginationArgs): js.Promise[PaginatedList[Parcel]] = js.native
    
    def retrieve(id: String): js.Promise[Parcel] = js.native
  }
  
  @js.native
  trait ListRetrieve extends StObject {
    
    def create(request: CreateCustomsItemRequest): js.Promise[CustomsItem] = js.native
    
    def list(): js.Promise[PaginatedList[CustomsItem]] = js.native
    def list(args: PaginationArgs): js.Promise[PaginatedList[CustomsItem]] = js.native
    
    def retrieve(id: String): js.Promise[CustomsItem] = js.native
  }
  
  @js.native
  trait Retrieve extends StObject {
    
    def create(request: CreateShipmentRequest): js.Promise[Shipment] = js.native
    
    def list(): js.Promise[PaginatedList[Shipment]] = js.native
    def list(args: PaginationArgs): js.Promise[PaginatedList[Shipment]] = js.native
    
    def retrieve(id: String): js.Promise[Shipment] = js.native
  }
}
