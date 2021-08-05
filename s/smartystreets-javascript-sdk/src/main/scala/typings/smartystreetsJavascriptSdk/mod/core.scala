package typings.smartystreetsJavascriptSdk.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  @JSImport("smartystreets-javascript-sdk", "core.Batch")
  @js.native
  class Batch () extends StObject {
    
    def add(lookup: Lookup): Unit = js.native
    
    def clear(): Unit = js.native
    
    def getByIndex(index: Double): Lookup = js.native
    
    def getByInputId(inputId: String): js.Array[Lookup] = js.native
    
    def isEmpty(): Boolean = js.native
    
    def lenght(): Double = js.native
    
    var lookups: js.Array[Lookup] = js.native
    
    def lookupsHasRoomForLookup(): Boolean = js.native
  }
  
  @JSImport("smartystreets-javascript-sdk", "core.ClientBuilder")
  @js.native
  class ClientBuilder[T] protected () extends StObject {
    def this(credentials: SharedCredentials) = this()
    def this(credentials: StaticCredentials) = this()
    
    var baseUrl: String = js.native
    
    def buildClient(baseUrl: String, Client: Client[T]): Client[T] = js.native
    
    def buildInternationalStreetClient(): Client[typings.smartystreetsJavascriptSdk.mod.internationalStreet.Lookup] = js.native
    
    def buildSender(): js.Any = js.native
    
    def buildUsAutocompleteClient(): Client[typings.smartystreetsJavascriptSdk.mod.usAutocomplete.Lookup] = js.native
    
    def buildUsAutocompleteProClient(): Client[typings.smartystreetsJavascriptSdk.mod.usAutocompletePro.Lookup] = js.native
    
    def buildUsExtractClient(): Client[typings.smartystreetsJavascriptSdk.mod.usExtract.Lookup] = js.native
    
    def buildUsStreetApiClient(): Client[typings.smartystreetsJavascriptSdk.mod.usStreet.Lookup] = js.native
    
    def buildUsZipcodeClient(): Client[typings.smartystreetsJavascriptSdk.mod.usZipcode.Lookup] = js.native
    
    var customHeaders: js.Any = js.native
    
    var debug: Boolean = js.native
    
    var httpSender: js.Any = js.native
    
    var licenses: js.Array[String] = js.native
    
    var maxRetries: Double = js.native
    
    var maxTimeout: Double = js.native
    
    var proxy: String = js.native
    
    var signer: StaticCredentials | SharedCredentials = js.native
    
    def withBaseUrl(url: String): ClientBuilder[T] = js.native
    
    def withCustomHeaders(customHeaders: js.Any): ClientBuilder[T] = js.native
    
    def withDebug(): ClientBuilder[T] = js.native
    
    def withLicenses(licenses: js.Array[String]): ClientBuilder[T] = js.native
    
    def withMaxRetries(retries: Double): ClientBuilder[T] = js.native
    
    def withMaxTimeout(timeout: Double): ClientBuilder[T] = js.native
    
    def withProxy(host: String, port: Double): ClientBuilder[T] = js.native
    def withProxy(host: String, port: Double, username: String): ClientBuilder[T] = js.native
    def withProxy(host: String, port: Double, username: String, password: String): ClientBuilder[T] = js.native
    def withProxy(host: String, port: Double, username: Unit, password: String): ClientBuilder[T] = js.native
    
    def withSender(sender: js.Any): ClientBuilder[T] = js.native
  }
  
  object Errors {
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.BadCredentialsError")
    @js.native
    class BadCredentialsError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.BadRequestError")
    @js.native
    class BadRequestError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.BatchEmptyError")
    @js.native
    class BatchEmptyError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.BatchFullError")
    @js.native
    class BatchFullError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.GatewayTimeoutError")
    @js.native
    class GatewayTimeoutError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.InternalServerError")
    @js.native
    class InternalServerError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.PaymentRequiredError")
    @js.native
    class PaymentRequiredError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.RequestEntityTooLargeError")
    @js.native
    class RequestEntityTooLargeError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.ServiceUnavailableError")
    @js.native
    class ServiceUnavailableError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.SmartyError")
    @js.native
    class SmartyError protected ()
      extends StObject
         with Error {
      def this(message: String) = this()
      
      /* CompleteClass */
      var message: String = js.native
      
      /* CompleteClass */
      var name: String = js.native
    }
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.TooManyRequestsError")
    @js.native
    class TooManyRequestsError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.UndefinedLookupError")
    @js.native
    class UndefinedLookupError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.UnprocessableEntityError")
    @js.native
    class UnprocessableEntityError protected () extends SmartyError {
      def this(message: String) = this()
    }
  }
  
  @JSImport("smartystreets-javascript-sdk", "core.SharedCredentials")
  @js.native
  class SharedCredentials protected () extends StObject {
    def this(authId: String) = this()
    def this(authId: String, hostName: String) = this()
    
    def sign(request: Request_[ParamsDictionary, js.Any, js.Any, Query]): js.Any = js.native
  }
  
  @JSImport("smartystreets-javascript-sdk", "core.StaticCredentials")
  @js.native
  class StaticCredentials protected () extends StObject {
    def this(authId: String, authToken: String) = this()
    
    def sign(request: Request_[ParamsDictionary, js.Any, js.Any, Query]): js.Any = js.native
  }
  
  object buildClient {
    
    @JSImport("smartystreets-javascript-sdk", "core.buildClient")
    @js.native
    val ^ : js.Any = js.native
    
    inline def internationalStreet(credentials: SharedCredentials): Client[typings.smartystreetsJavascriptSdk.mod.internationalStreet.Lookup] = ^.asInstanceOf[js.Dynamic].applyDynamic("internationalStreet")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[typings.smartystreetsJavascriptSdk.mod.internationalStreet.Lookup]]
    inline def internationalStreet(credentials: StaticCredentials): Client[typings.smartystreetsJavascriptSdk.mod.internationalStreet.Lookup] = ^.asInstanceOf[js.Dynamic].applyDynamic("internationalStreet")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[typings.smartystreetsJavascriptSdk.mod.internationalStreet.Lookup]]
    
    inline def usAutocomplete(credentials: SharedCredentials): Client[typings.smartystreetsJavascriptSdk.mod.usAutocomplete.Lookup] = ^.asInstanceOf[js.Dynamic].applyDynamic("usAutocomplete")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[typings.smartystreetsJavascriptSdk.mod.usAutocomplete.Lookup]]
    inline def usAutocomplete(credentials: StaticCredentials): Client[typings.smartystreetsJavascriptSdk.mod.usAutocomplete.Lookup] = ^.asInstanceOf[js.Dynamic].applyDynamic("usAutocomplete")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[typings.smartystreetsJavascriptSdk.mod.usAutocomplete.Lookup]]
    
    inline def usAutocompletePro(credentials: SharedCredentials): Client[typings.smartystreetsJavascriptSdk.mod.usAutocompletePro.Lookup] = ^.asInstanceOf[js.Dynamic].applyDynamic("usAutocompletePro")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[typings.smartystreetsJavascriptSdk.mod.usAutocompletePro.Lookup]]
    inline def usAutocompletePro(credentials: StaticCredentials): Client[typings.smartystreetsJavascriptSdk.mod.usAutocompletePro.Lookup] = ^.asInstanceOf[js.Dynamic].applyDynamic("usAutocompletePro")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[typings.smartystreetsJavascriptSdk.mod.usAutocompletePro.Lookup]]
    
    inline def usExtract(credentials: SharedCredentials): Client[typings.smartystreetsJavascriptSdk.mod.usExtract.Lookup] = ^.asInstanceOf[js.Dynamic].applyDynamic("usExtract")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[typings.smartystreetsJavascriptSdk.mod.usExtract.Lookup]]
    inline def usExtract(credentials: StaticCredentials): Client[typings.smartystreetsJavascriptSdk.mod.usExtract.Lookup] = ^.asInstanceOf[js.Dynamic].applyDynamic("usExtract")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[typings.smartystreetsJavascriptSdk.mod.usExtract.Lookup]]
    
    inline def usStreet(credentials: SharedCredentials): Client[typings.smartystreetsJavascriptSdk.mod.usStreet.Lookup] = ^.asInstanceOf[js.Dynamic].applyDynamic("usStreet")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[typings.smartystreetsJavascriptSdk.mod.usStreet.Lookup]]
    inline def usStreet(credentials: StaticCredentials): Client[typings.smartystreetsJavascriptSdk.mod.usStreet.Lookup] = ^.asInstanceOf[js.Dynamic].applyDynamic("usStreet")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[typings.smartystreetsJavascriptSdk.mod.usStreet.Lookup]]
    
    inline def usZipcode(credentials: SharedCredentials): Client[typings.smartystreetsJavascriptSdk.mod.usZipcode.Lookup] = ^.asInstanceOf[js.Dynamic].applyDynamic("usZipcode")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[typings.smartystreetsJavascriptSdk.mod.usZipcode.Lookup]]
    inline def usZipcode(credentials: StaticCredentials): Client[typings.smartystreetsJavascriptSdk.mod.usZipcode.Lookup] = ^.asInstanceOf[js.Dynamic].applyDynamic("usZipcode")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[typings.smartystreetsJavascriptSdk.mod.usZipcode.Lookup]]
  }
  
  trait Client[T]
    extends StObject
       with ClientInstance {
    
    def send(lookup: T): js.Promise[T]
  }
  object Client {
    
    inline def apply[T](send: T => js.Promise[T], sender: js.Any): Client[T] = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send), sender = sender.asInstanceOf[js.Any])
      __obj.asInstanceOf[Client[T]]
    }
    
    extension [Self <: Client[?], T](x: Self & Client[T]) {
      
      inline def setSend(value: T => js.Promise[T]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    }
  }
  
  trait ClientInstance extends StObject {
    
    var sender: js.Any
  }
  object ClientInstance {
    
    inline def apply(sender: js.Any): ClientInstance = {
      val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientInstance]
    }
    
    extension [Self <: ClientInstance](x: Self) {
      
      inline def setSender(value: js.Any): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.smartystreetsJavascriptSdk.mod.usStreet.Lookup
    - typings.smartystreetsJavascriptSdk.mod.usZipcode.Lookup
    - typings.smartystreetsJavascriptSdk.mod.usAutocomplete.Lookup
    - typings.smartystreetsJavascriptSdk.mod.usAutocompletePro.Lookup
    - typings.smartystreetsJavascriptSdk.mod.usExtract.Lookup
    - typings.smartystreetsJavascriptSdk.mod.internationalStreet.Lookup
  */
  trait Lookup extends StObject
}
