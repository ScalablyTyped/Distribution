package typings.stellarSdk

import typings.stellarSdk.federationServerMod.FederationServer.Options
import typings.stellarSdk.federationServerMod.FederationServer.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object federationServerMod {
  
  @JSImport("stellar-sdk/lib/federation_server", "FEDERATION_RESPONSE_MAX_SIZE")
  @js.native
  val FEDERATION_RESPONSE_MAX_SIZE: Double = js.native
  
  @JSImport("stellar-sdk/lib/federation_server", "FederationServer")
  @js.native
  class FederationServer protected () extends StObject {
    def this(serverURL: String, domain: String) = this()
    def this(serverURL: String, domain: String, opts: Options) = this()
    
    var _sendRequest: js.Any = js.native
    
    val domain: js.Any = js.native
    
    def resolveAccountId(accountId: String): js.Promise[Record] = js.native
    
    def resolveAddress(address: String): js.Promise[Record] = js.native
    
    def resolveTransactionId(transactionId: String): js.Promise[Record] = js.native
    
    val serverURL: js.Any = js.native
    
    val timeout: js.Any = js.native
  }
  /* static members */
  object FederationServer {
    
    @JSImport("stellar-sdk/lib/federation_server", "FederationServer.createForDomain")
    @js.native
    def createForDomain(domain: String): js.Promise[FederationServer] = js.native
    @JSImport("stellar-sdk/lib/federation_server", "FederationServer.createForDomain")
    @js.native
    def createForDomain(domain: String, opts: Options): js.Promise[FederationServer] = js.native
    
    @JSImport("stellar-sdk/lib/federation_server", "FederationServer.resolve")
    @js.native
    def resolve(value: String): js.Promise[Record] = js.native
    @JSImport("stellar-sdk/lib/federation_server", "FederationServer.resolve")
    @js.native
    def resolve(value: String, opts: Options): js.Promise[Record] = js.native
    
    @js.native
    trait Options extends StObject {
      
      var allowHttp: js.UndefOr[Boolean] = js.native
      
      var timeout: js.UndefOr[Double] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowHttp(value: Boolean): Self = StObject.set(x, "allowHttp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowHttpUndefined: Self = StObject.set(x, "allowHttp", js.undefined)
        
        @scala.inline
        def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
    
    @js.native
    trait Record extends StObject {
      
      var account_id: String = js.native
      
      var memo: js.UndefOr[String] = js.native
      
      var memo_type: js.UndefOr[String] = js.native
    }
    object Record {
      
      @scala.inline
      def apply(account_id: String): Record = {
        val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any])
        __obj.asInstanceOf[Record]
      }
      
      @scala.inline
      implicit class RecordMutableBuilder[Self <: Record] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMemo(value: String): Self = StObject.set(x, "memo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMemoUndefined: Self = StObject.set(x, "memo", js.undefined)
        
        @scala.inline
        def setMemo_type(value: String): Self = StObject.set(x, "memo_type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMemo_typeUndefined: Self = StObject.set(x, "memo_type", js.undefined)
      }
    }
  }
}
