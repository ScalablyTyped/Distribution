package typings.seamless.Seamless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If the fallback functionality is enabled.
    * @default false
    */
  var fallback: js.UndefOr[Boolean] = js.undefined
  /**
    * Text to add after the fallbackLinkText link.
    * @default 'to open in a separate window.'
    */
  var fallbackLinkAfter: js.UndefOr[String] = js.undefined
  /**
    * An array of string styles to add to the fallback link on hover.
    * @default [ 'background-color:#ebebeb', 'border-color:#adadad' ]
    */
  var fallbackLinkHoverStyles: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An array of string styles to add to the fallback link.
    * @default [ 'display: inline-block', 'color: #333', 'border: 1px solid #ccc', 'background-color: #fff', 'padding: 5px 10px', 'text-decoration: none', 'font-size: 12px', 'line-height: 1.5', 'border-radius: 6px', 'font-weight: 400', 'cursor: pointer', '-webkit-user-select: none', '-moz-user-select: none', '-ms-user-select: none', 'user-select: none' ]
    */
  var fallbackLinkStyles: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The string to show within the 'Click here' link to open the fallback window.
    * @default 'Click Here'
    */
  var fallbackLinkText: js.UndefOr[String] = js.undefined
  /**
    * Additional query params to attach to the fallback window when it is opened.
    * @default ''
    */
  var fallbackParams: js.UndefOr[String] = js.undefined
  /**
    * An array of string styles to add to the fallback text when something bad happens.
    * @default [ 'padding: 15px', 'border: 1px solid transparent', 'border-radius: 4px', 'color: #3a87ad', 'background-color: #d9edf7', 'border-color: #bce8f1' ]
    */
  var fallbackStyles: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A message to show below the child iframe to offer assistance if they are having problems.
    * @default ''
    */
  var fallbackText: js.UndefOr[String] = js.undefined
  /**
    * The height of the window that is opened up for the fallback.
    * @default 800
    */
  var fallbackWindowHeight: js.UndefOr[Double] = js.undefined
  /**
    * The width of the window that is opened up for the fallback.
    * @default 960
    */
  var fallbackWindowWidth: js.UndefOr[Double] = js.undefined
  /**
    * The text to show when the child page is loading.
    * @default 'Loading ...'
    */
  var loading: js.UndefOr[String] = js.undefined
  /**
    * Called when a child iframe has finished connecting.
    * @default null
    */
  var onConnect: js.UndefOr[(js.Function1[/* data */ js.Any, Unit]) | Null] = js.undefined
  /**
    * Show or not the loading indicator.
    * @default true
    */
  var showLoadingIndicator: js.UndefOr[Boolean] = js.undefined
  /**
    * The url of the spinner GIF that is shown when the child page is loading.
    * @default 'http://www.travistidwell.com/seamless.js/src/loader.gif'
    */
  var spinner: js.UndefOr[String] = js.undefined
  /**
    * The styles to inject into the child page.
    * @default []
    */
  var styles: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fallback: js.UndefOr[Boolean] = js.undefined,
    fallbackLinkAfter: String = null,
    fallbackLinkHoverStyles: js.Array[String] = null,
    fallbackLinkStyles: js.Array[String] = null,
    fallbackLinkText: String = null,
    fallbackParams: String = null,
    fallbackStyles: js.Array[String] = null,
    fallbackText: String = null,
    fallbackWindowHeight: js.UndefOr[Double] = js.undefined,
    fallbackWindowWidth: js.UndefOr[Double] = js.undefined,
    loading: String = null,
    onConnect: js.UndefOr[Null | (/* data */ js.Any => Unit)] = js.undefined,
    showLoadingIndicator: js.UndefOr[Boolean] = js.undefined,
    spinner: String = null,
    styles: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fallback)) __obj.updateDynamic("fallback")(fallback.get.asInstanceOf[js.Any])
    if (fallbackLinkAfter != null) __obj.updateDynamic("fallbackLinkAfter")(fallbackLinkAfter.asInstanceOf[js.Any])
    if (fallbackLinkHoverStyles != null) __obj.updateDynamic("fallbackLinkHoverStyles")(fallbackLinkHoverStyles.asInstanceOf[js.Any])
    if (fallbackLinkStyles != null) __obj.updateDynamic("fallbackLinkStyles")(fallbackLinkStyles.asInstanceOf[js.Any])
    if (fallbackLinkText != null) __obj.updateDynamic("fallbackLinkText")(fallbackLinkText.asInstanceOf[js.Any])
    if (fallbackParams != null) __obj.updateDynamic("fallbackParams")(fallbackParams.asInstanceOf[js.Any])
    if (fallbackStyles != null) __obj.updateDynamic("fallbackStyles")(fallbackStyles.asInstanceOf[js.Any])
    if (fallbackText != null) __obj.updateDynamic("fallbackText")(fallbackText.asInstanceOf[js.Any])
    if (!js.isUndefined(fallbackWindowHeight)) __obj.updateDynamic("fallbackWindowHeight")(fallbackWindowHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fallbackWindowWidth)) __obj.updateDynamic("fallbackWindowWidth")(fallbackWindowWidth.get.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(onConnect)) __obj.updateDynamic("onConnect")(if (onConnect != null) js.Any.fromFunction1(onConnect.asInstanceOf[/* data */ js.Any => Unit]) else null)
    if (!js.isUndefined(showLoadingIndicator)) __obj.updateDynamic("showLoadingIndicator")(showLoadingIndicator.get.asInstanceOf[js.Any])
    if (spinner != null) __obj.updateDynamic("spinner")(spinner.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

