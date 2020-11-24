package typings.reactPlaidLink.mod

import typings.react.mod.CSSProperties
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaidLinkProps extends js.Object {
  
  // ApiVersion flag to use new version of Plaid API
  var apiVersion: js.UndefOr[String] = js.native
  
  // Button Class names as a String
  var className: js.UndefOr[String] = js.native
  
  // Displayed once a user has successfully linked their account
  var clientName: String = js.native
  
  // The Plaid API environment on which to create user accounts.
  // For development and testing, use tartan. For production, use production
  var env: tartan | sandbox | development | production = js.native
  
  // Open link to a specific institution, for a more custom solution
  var institution: js.UndefOr[String] = js.native
  
  // A function that is called during a user's flow in Link.
  // See
  var onEvent: js.UndefOr[
    js.Function2[
      /* eventName */ ERROR | EXIT | HANDOFF | OPEN | OPEN_MY_PLAID | SEARCH_INSTITUTION | SELECT_INSTITUTION | SUBMIT_CREDENTIALS | SUBMIT_MFA | TRANSITION_VIEW, 
      /* metadata */ Errorcode, 
      Unit
    ]
  ] = js.native
  
  // A function that is called when a user has specifically exited Link flow
  var onExit: js.UndefOr[
    js.Function2[/* error */ Displaymessage | Null, /* metadata */ Institution, Unit]
  ] = js.native
  
  // A function that is called when the Link module has finished loading.
  // Calls to plaidLinkHandler.open() prior to the onLoad callback will be
  // delayed until the module is fully loaded.
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  
  // A function that is called when a user has successfully onboarded their
  // account. The function should expect two arguments, the public_key and a
  // metadata object
  def onSuccess(publicToken: String, metadata: Accounts): Unit = js.native
  
  // The Plaid products you wish to use, an array containing some of connect,
  // auth, identity, income, transactions, assets, liabilities
  var product: js.Array[
    connect | info | auth | identity | income | transactions | assets | liabilities | investments | payment_initiation
  ] = js.native
  
  // The public_key associated with your account; available from
  // the Plaid dashboard (https://dashboard.plaid.com)
  var publicKey: String = js.native
  
  // Set to true to launch Link with the 'Select Account' pane enabled.
  // Allows users to select an individual account once they've authenticated
  var selectAccount: js.UndefOr[Boolean] = js.native
  
  // Button Styles as an Object
  var style: js.UndefOr[CSSProperties] = js.native
  
  // Specify an existing user's public token to launch Link in update mode.
  // This will cause Link to open directly to the authentication step for
  // that user's institution.
  var token: js.UndefOr[String] = js.native
  
  // Specify a user object to enable all Auth features. Reach out to your
  // account manager or integrations@plaid.com to get enabled. See the Auth
  // [https://plaid.com/docs#auth] docs for integration details.
  var user: js.UndefOr[EmailAddress] = js.native
  
  // Specify a webhook to associate with a user.
  var webhook: js.UndefOr[String] = js.native
}
object PlaidLinkProps {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class PlaidLinkPropsOps[Self <: PlaidLinkProps] (val x: Self) extends AnyVal {
    
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
    def setClientName(value: String): Self = this.set("clientName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnv(value: tartan | sandbox | development | production): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSuccess(value: (String, Accounts) => Unit): Self = this.set("onSuccess", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProductVarargs(
      value: (connect | info | auth | identity | income | transactions | assets | liabilities | investments | payment_initiation)*
    ): Self = this.set("product", js.Array(value :_*))
    
    @scala.inline
    def setProduct(
      value: js.Array[
          connect | info | auth | identity | income | transactions | assets | liabilities | investments | payment_initiation
        ]
    ): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: String): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setInstitution(value: String): Self = this.set("institution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstitution: Self = this.set("institution", js.undefined)
    
    @scala.inline
    def setOnEvent(
      value: (/* eventName */ ERROR | EXIT | HANDOFF | OPEN | OPEN_MY_PLAID | SEARCH_INSTITUTION | SELECT_INSTITUTION | SUBMIT_CREDENTIALS | SUBMIT_MFA | TRANSITION_VIEW, /* metadata */ Errorcode) => Unit
    ): Self = this.set("onEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnEvent: Self = this.set("onEvent", js.undefined)
    
    @scala.inline
    def setOnExit(value: (/* error */ Displaymessage | Null, /* metadata */ Institution) => Unit): Self = this.set("onExit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    
    @scala.inline
    def setOnLoad(value: () => Unit): Self = this.set("onLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setSelectAccount(value: Boolean): Self = this.set("selectAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectAccount: Self = this.set("selectAccount", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setUser(value: EmailAddress): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    
    @scala.inline
    def setWebhook(value: String): Self = this.set("webhook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebhook: Self = this.set("webhook", js.undefined)
  }
}
