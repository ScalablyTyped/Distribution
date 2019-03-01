package typings
package seamlessLib.SeamlessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends js.Object {
  /**
    * Allow appended styles to be injected.
    * @default false
    */
  var allowAppendedStyleInjection: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  If this page should allow injected styles.
    *  @default false
    */
  var allowStyleInjection: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The container for the main content on the page which determines the height of the page.
    * @default 'body'
    */
  var container: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text to place after the link when the cookie test fails.
    * @default ' to open in a separate window.'
    */
  var cookieFallbackAfterMsg: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text to place inside the link to have them open a new window if the cookie test fails.
    * @default 'Click Here'
    */
  var cookieFallbackLinkMsg: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The message to show if the cookie test fails.
    * @default 'Your browser requires this page to be opened in a separate window.'
    */
  var cookieFallbackMsg: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  Called when the parent connects to this iframe.
    *  @default null
    */
  var onConnect: js.UndefOr[js.Function1[/* data */ js.Any, scala.Unit]] = js.undefined
  /**
    *  Callback that is called when an update is triggered to the parent.
    *  @default null
    */
  var onUpdate: js.UndefOr[js.Function1[/* data */ js.Any, scala.Unit]] = js.undefined
  /**
    * If the child page requires cookies (See Child iFrame Cookie Problem section)
    * @default false
    */
  var requireCookies: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The milliseconds that an update is created from the child to the parent.
    * @default 200
    */
  var update: js.UndefOr[scala.Double] = js.undefined
  /**
    * The url of the parent page to connect to.
    * @default ''
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectOptions {
  @scala.inline
  def apply(
    allowAppendedStyleInjection: js.UndefOr[scala.Boolean] = js.undefined,
    allowStyleInjection: js.UndefOr[scala.Boolean] = js.undefined,
    container: java.lang.String = null,
    cookieFallbackAfterMsg: java.lang.String = null,
    cookieFallbackLinkMsg: java.lang.String = null,
    cookieFallbackMsg: java.lang.String = null,
    onConnect: js.Function1[/* data */ js.Any, scala.Unit] = null,
    onUpdate: js.Function1[/* data */ js.Any, scala.Unit] = null,
    requireCookies: js.UndefOr[scala.Boolean] = js.undefined,
    update: scala.Int | scala.Double = null,
    url: java.lang.String = null
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAppendedStyleInjection)) __obj.updateDynamic("allowAppendedStyleInjection")(allowAppendedStyleInjection)
    if (!js.isUndefined(allowStyleInjection)) __obj.updateDynamic("allowStyleInjection")(allowStyleInjection)
    if (container != null) __obj.updateDynamic("container")(container)
    if (cookieFallbackAfterMsg != null) __obj.updateDynamic("cookieFallbackAfterMsg")(cookieFallbackAfterMsg)
    if (cookieFallbackLinkMsg != null) __obj.updateDynamic("cookieFallbackLinkMsg")(cookieFallbackLinkMsg)
    if (cookieFallbackMsg != null) __obj.updateDynamic("cookieFallbackMsg")(cookieFallbackMsg)
    if (onConnect != null) __obj.updateDynamic("onConnect")(onConnect)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    if (!js.isUndefined(requireCookies)) __obj.updateDynamic("requireCookies")(requireCookies)
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ConnectOptions]
  }
}

