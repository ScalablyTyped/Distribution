package typings
package reactDashPlaidDashLinkLib.reactDashPlaidDashLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaidLinkProps extends js.Object {
  // ApiVersion flag to use new version of Plaid API
  var apiVersion: js.UndefOr[java.lang.String] = js.undefined
  // Button Class names as a String
  var className: js.UndefOr[java.lang.String] = js.undefined
  // Displayed once a user has successfully linked their account
  var clientName: java.lang.String
  // The Plaid API environment on which to create user accounts.
  // For development and testing, use tartan. For production, use production
  var env: reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.tartan | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.sandbox | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.development | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.production
  // Open link to a specific institution, for a more custom solution
  var institution: js.UndefOr[java.lang.String] = js.undefined
  // A function that is called during a user's flow in Link.
  // See
  var onEvent: js.UndefOr[
    js.Function2[
      /* eventName */ reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.ERROR | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.EXIT | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.HANDOFF | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.OPEN | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.OPEN_MY_PLAID | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.SEARCH_INSTITUTION | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.SELECT_INSTITUTION | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.SUBMIT_CREDENTIALS | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.SUBMIT_MFA | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.TRANSITION_VIEW, 
      /* metadata */ reactDashPlaidDashLinkLib.Anon_APIERRORASSETREPORTERROR, 
      scala.Unit
    ]
  ] = js.undefined
  // A function that is called when a user has specifically exited Link flow
  var onExit: js.UndefOr[
    js.Function2[
      /* error */ reactDashPlaidDashLinkLib.Anon_APIERROR | scala.Null, 
      /* metadata */ reactDashPlaidDashLinkLib.Anon_Choosedevice, 
      scala.Unit
    ]
  ] = js.undefined
  // A function that is called when the Link module has finished loading.
  // Calls to plaidLinkHandler.open() prior to the onLoad callback will be
  // delayed until the module is fully loaded.
  var onLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  // The Plaid products you wish to use, an array containing some of connect,
  // auth, identity, income, transactions, assets, liabilities
  var product: js.Array[
    reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.connect | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.info | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.auth | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.identity | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.income | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.transactions | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.assets | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.holdings | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.liabilities
  ]
  // The public_key associated with your account; available from
  // the Plaid dashboard (https://dashboard.plaid.com)
  var publicKey: java.lang.String
  // Set to true to launch Link with the 'Select Account' pane enabled.
  // Allows users to select an individual account once they've authenticated
  var selectAccount: js.UndefOr[scala.Boolean] = js.undefined
  // Button Styles as an Object
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  // Specify an existing user's public token to launch Link in update mode.
  // This will cause Link to open directly to the authentication step for
  // that user's institution.
  var token: js.UndefOr[java.lang.String] = js.undefined
  // Specify a user object to enable all Auth features. Reach out to your
  // account manager or integrations@plaid.com to get enabled. See the Auth
  // [https://plaid.com/docs#auth] docs for integration details.
  var user: js.UndefOr[reactDashPlaidDashLinkLib.Anon_EmailAddress] = js.undefined
  // Specify a webhook to associate with a user.
  var webhook: js.UndefOr[java.lang.String] = js.undefined
  // A function that is called when a user has successfully onboarded their
  // account. The function should expect two arguments, the public_key and a
  // metadata object
  def onSuccess(publicToken: java.lang.String, metadata: reactDashPlaidDashLinkLib.Anon_Accounts): scala.Unit
}

object PlaidLinkProps {
  @scala.inline
  def apply(
    clientName: java.lang.String,
    env: reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.tartan | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.sandbox | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.development | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.production,
    onSuccess: (java.lang.String, reactDashPlaidDashLinkLib.Anon_Accounts) => scala.Unit,
    product: js.Array[
      reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.connect | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.info | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.auth | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.identity | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.income | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.transactions | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.assets | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.holdings | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.liabilities
    ],
    publicKey: java.lang.String,
    apiVersion: java.lang.String = null,
    className: java.lang.String = null,
    institution: java.lang.String = null,
    onEvent: (/* eventName */ reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.ERROR | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.EXIT | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.HANDOFF | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.OPEN | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.OPEN_MY_PLAID | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.SEARCH_INSTITUTION | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.SELECT_INSTITUTION | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.SUBMIT_CREDENTIALS | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.SUBMIT_MFA | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.TRANSITION_VIEW, /* metadata */ reactDashPlaidDashLinkLib.Anon_APIERRORASSETREPORTERROR) => scala.Unit = null,
    onExit: (/* error */ reactDashPlaidDashLinkLib.Anon_APIERROR | scala.Null, /* metadata */ reactDashPlaidDashLinkLib.Anon_Choosedevice) => scala.Unit = null,
    onLoad: () => scala.Unit = null,
    selectAccount: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    token: java.lang.String = null,
    user: reactDashPlaidDashLinkLib.Anon_EmailAddress = null,
    webhook: java.lang.String = null
  ): PlaidLinkProps = {
    val __obj = js.Dynamic.literal(clientName = clientName, env = env.asInstanceOf[js.Any], onSuccess = js.Any.fromFunction2(onSuccess), product = product, publicKey = publicKey)
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion)
    if (className != null) __obj.updateDynamic("className")(className)
    if (institution != null) __obj.updateDynamic("institution")(institution)
    if (onEvent != null) __obj.updateDynamic("onEvent")(js.Any.fromFunction2(onEvent))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction2(onExit))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (!js.isUndefined(selectAccount)) __obj.updateDynamic("selectAccount")(selectAccount)
    if (style != null) __obj.updateDynamic("style")(style)
    if (token != null) __obj.updateDynamic("token")(token)
    if (user != null) __obj.updateDynamic("user")(user)
    if (webhook != null) __obj.updateDynamic("webhook")(webhook)
    __obj.asInstanceOf[PlaidLinkProps]
  }
}

