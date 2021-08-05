package typings.reactPlaidLink

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactPlaidLink.anon.Accounts
import typings.reactPlaidLink.anon.Displaymessage
import typings.reactPlaidLink.anon.EmailAddress
import typings.reactPlaidLink.anon.Errorcode
import typings.reactPlaidLink.anon.Institution
import typings.reactPlaidLink.reactPlaidLinkStrings.ERROR
import typings.reactPlaidLink.reactPlaidLinkStrings.EXIT
import typings.reactPlaidLink.reactPlaidLinkStrings.HANDOFF
import typings.reactPlaidLink.reactPlaidLinkStrings.OPEN
import typings.reactPlaidLink.reactPlaidLinkStrings.OPEN_MY_PLAID
import typings.reactPlaidLink.reactPlaidLinkStrings.SEARCH_INSTITUTION
import typings.reactPlaidLink.reactPlaidLinkStrings.SELECT_INSTITUTION
import typings.reactPlaidLink.reactPlaidLinkStrings.SUBMIT_CREDENTIALS
import typings.reactPlaidLink.reactPlaidLinkStrings.SUBMIT_MFA
import typings.reactPlaidLink.reactPlaidLinkStrings.TRANSITION_VIEW
import typings.reactPlaidLink.reactPlaidLinkStrings.assets
import typings.reactPlaidLink.reactPlaidLinkStrings.auth
import typings.reactPlaidLink.reactPlaidLinkStrings.connect
import typings.reactPlaidLink.reactPlaidLinkStrings.development
import typings.reactPlaidLink.reactPlaidLinkStrings.identity
import typings.reactPlaidLink.reactPlaidLinkStrings.income
import typings.reactPlaidLink.reactPlaidLinkStrings.info
import typings.reactPlaidLink.reactPlaidLinkStrings.investments
import typings.reactPlaidLink.reactPlaidLinkStrings.liabilities
import typings.reactPlaidLink.reactPlaidLinkStrings.payment_initiation
import typings.reactPlaidLink.reactPlaidLinkStrings.production
import typings.reactPlaidLink.reactPlaidLinkStrings.sandbox
import typings.reactPlaidLink.reactPlaidLinkStrings.tartan
import typings.reactPlaidLink.reactPlaidLinkStrings.transactions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-plaid-link", JSImport.Default)
  @js.native
  class default ()
    extends Component[PlaidLinkProps, js.Object, js.Any]
  
  type PlaidLink = Component[PlaidLinkProps, js.Object, js.Any]
  
  trait PlaidLinkProps extends StObject {
    
    // ApiVersion flag to use new version of Plaid API
    var apiVersion: js.UndefOr[String] = js.undefined
    
    // Button Class names as a String
    var className: js.UndefOr[String] = js.undefined
    
    // Displayed once a user has successfully linked their account
    var clientName: String
    
    // The Plaid API environment on which to create user accounts.
    // For development and testing, use tartan. For production, use production
    var env: tartan | sandbox | development | production
    
    // Open link to a specific institution, for a more custom solution
    var institution: js.UndefOr[String] = js.undefined
    
    // A function that is called during a user's flow in Link.
    // See
    var onEvent: js.UndefOr[
        js.Function2[
          /* eventName */ ERROR | EXIT | HANDOFF | OPEN | OPEN_MY_PLAID | SEARCH_INSTITUTION | SELECT_INSTITUTION | SUBMIT_CREDENTIALS | SUBMIT_MFA | TRANSITION_VIEW, 
          /* metadata */ Errorcode, 
          Unit
        ]
      ] = js.undefined
    
    // A function that is called when a user has specifically exited Link flow
    var onExit: js.UndefOr[
        js.Function2[/* error */ Displaymessage | Null, /* metadata */ Institution, Unit]
      ] = js.undefined
    
    // A function that is called when the Link module has finished loading.
    // Calls to plaidLinkHandler.open() prior to the onLoad callback will be
    // delayed until the module is fully loaded.
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    // A function that is called when a user has successfully onboarded their
    // account. The function should expect two arguments, the public_key and a
    // metadata object
    def onSuccess(publicToken: String, metadata: Accounts): Unit
    
    // The Plaid products you wish to use, an array containing some of connect,
    // auth, identity, income, transactions, assets, liabilities
    var product: js.Array[
        connect | info | auth | identity | income | transactions | assets | liabilities | investments | payment_initiation
      ]
    
    // The public_key associated with your account; available from
    // the Plaid dashboard (https://dashboard.plaid.com)
    var publicKey: String
    
    // Set to true to launch Link with the 'Select Account' pane enabled.
    // Allows users to select an individual account once they've authenticated
    var selectAccount: js.UndefOr[Boolean] = js.undefined
    
    // Button Styles as an Object
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    // Specify an existing user's public token to launch Link in update mode.
    // This will cause Link to open directly to the authentication step for
    // that user's institution.
    var token: js.UndefOr[String] = js.undefined
    
    // Specify a user object to enable all Auth features. Reach out to your
    // account manager or integrations@plaid.com to get enabled. See the Auth
    // [https://plaid.com/docs#auth] docs for integration details.
    var user: js.UndefOr[EmailAddress] = js.undefined
    
    // Specify a webhook to associate with a user.
    var webhook: js.UndefOr[String] = js.undefined
  }
  object PlaidLinkProps {
    
    inline def apply(
      clientName: String,
      env: tartan | sandbox | development | production,
      onSuccess: (String, Accounts) => Unit,
      product: js.Array[
          connect | info | auth | identity | income | transactions | assets | liabilities | investments | payment_initiation
        ],
      publicKey: String
    ): PlaidLinkProps = {
      val __obj = js.Dynamic.literal(clientName = clientName.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], onSuccess = js.Any.fromFunction2(onSuccess), product = product.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlaidLinkProps]
    }
    
    extension [Self <: PlaidLinkProps](x: Self) {
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClientName(value: String): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
      
      inline def setEnv(value: tartan | sandbox | development | production): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setInstitution(value: String): Self = StObject.set(x, "institution", value.asInstanceOf[js.Any])
      
      inline def setInstitutionUndefined: Self = StObject.set(x, "institution", js.undefined)
      
      inline def setOnEvent(
        value: (/* eventName */ ERROR | EXIT | HANDOFF | OPEN | OPEN_MY_PLAID | SEARCH_INSTITUTION | SELECT_INSTITUTION | SUBMIT_CREDENTIALS | SUBMIT_MFA | TRANSITION_VIEW, /* metadata */ Errorcode) => Unit
      ): Self = StObject.set(x, "onEvent", js.Any.fromFunction2(value))
      
      inline def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
      
      inline def setOnExit(value: (/* error */ Displaymessage | Null, /* metadata */ Institution) => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction2(value))
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnSuccess(value: (String, Accounts) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2(value))
      
      inline def setProduct(
        value: js.Array[
              connect | info | auth | identity | income | transactions | assets | liabilities | investments | payment_initiation
            ]
      ): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setProductVarargs(
        value: (connect | info | auth | identity | income | transactions | assets | liabilities | investments | payment_initiation)*
      ): Self = StObject.set(x, "product", js.Array(value :_*))
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setSelectAccount(value: Boolean): Self = StObject.set(x, "selectAccount", value.asInstanceOf[js.Any])
      
      inline def setSelectAccountUndefined: Self = StObject.set(x, "selectAccount", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUser(value: EmailAddress): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      inline def setWebhook(value: String): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
      
      inline def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
    }
  }
}
