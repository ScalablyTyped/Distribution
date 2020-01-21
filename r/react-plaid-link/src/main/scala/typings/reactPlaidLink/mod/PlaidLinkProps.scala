package typings.reactPlaidLink.mod

import typings.react.mod.CSSProperties
import typings.reactPlaidLink.AnonAPIERROR
import typings.reactPlaidLink.AnonAPIERRORASSETREPORTERROR
import typings.reactPlaidLink.AnonAccounts
import typings.reactPlaidLink.AnonChoosedevice
import typings.reactPlaidLink.AnonEmailAddress
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
import typings.reactPlaidLink.reactPlaidLinkStrings.holdings
import typings.reactPlaidLink.reactPlaidLinkStrings.identity
import typings.reactPlaidLink.reactPlaidLinkStrings.income
import typings.reactPlaidLink.reactPlaidLinkStrings.info
import typings.reactPlaidLink.reactPlaidLinkStrings.liabilities
import typings.reactPlaidLink.reactPlaidLinkStrings.production
import typings.reactPlaidLink.reactPlaidLinkStrings.sandbox
import typings.reactPlaidLink.reactPlaidLinkStrings.tartan
import typings.reactPlaidLink.reactPlaidLinkStrings.transactions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaidLinkProps extends js.Object {
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
      /* metadata */ AnonAPIERRORASSETREPORTERROR, 
      Unit
    ]
  ] = js.undefined
  // A function that is called when a user has specifically exited Link flow
  var onExit: js.UndefOr[
    js.Function2[/* error */ AnonAPIERROR | Null, /* metadata */ AnonChoosedevice, Unit]
  ] = js.undefined
  // A function that is called when the Link module has finished loading.
  // Calls to plaidLinkHandler.open() prior to the onLoad callback will be
  // delayed until the module is fully loaded.
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  // The Plaid products you wish to use, an array containing some of connect,
  // auth, identity, income, transactions, assets, liabilities
  var product: js.Array[
    connect | info | auth | identity | income | transactions | assets | holdings | liabilities
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
  var user: js.UndefOr[AnonEmailAddress] = js.undefined
  // Specify a webhook to associate with a user.
  var webhook: js.UndefOr[String] = js.undefined
  // A function that is called when a user has successfully onboarded their
  // account. The function should expect two arguments, the public_key and a
  // metadata object
  def onSuccess(publicToken: String, metadata: AnonAccounts): Unit
}

object PlaidLinkProps {
  @scala.inline
  def apply(
    clientName: String,
    env: tartan | sandbox | development | production,
    onSuccess: (String, AnonAccounts) => Unit,
    product: js.Array[
      connect | info | auth | identity | income | transactions | assets | holdings | liabilities
    ],
    publicKey: String,
    apiVersion: String = null,
    className: String = null,
    institution: String = null,
    onEvent: (/* eventName */ ERROR | EXIT | HANDOFF | OPEN | OPEN_MY_PLAID | SEARCH_INSTITUTION | SELECT_INSTITUTION | SUBMIT_CREDENTIALS | SUBMIT_MFA | TRANSITION_VIEW, /* metadata */ AnonAPIERRORASSETREPORTERROR) => Unit = null,
    onExit: (/* error */ AnonAPIERROR | Null, /* metadata */ AnonChoosedevice) => Unit = null,
    onLoad: () => Unit = null,
    selectAccount: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    token: String = null,
    user: AnonEmailAddress = null,
    webhook: String = null
  ): PlaidLinkProps = {
    val __obj = js.Dynamic.literal(clientName = clientName.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], onSuccess = js.Any.fromFunction2(onSuccess), product = product.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (institution != null) __obj.updateDynamic("institution")(institution.asInstanceOf[js.Any])
    if (onEvent != null) __obj.updateDynamic("onEvent")(js.Any.fromFunction2(onEvent))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction2(onExit))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (!js.isUndefined(selectAccount)) __obj.updateDynamic("selectAccount")(selectAccount.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (webhook != null) __obj.updateDynamic("webhook")(webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaidLinkProps]
  }
}

