package typings
package reactDashGoogleDashRecaptchaLib.reactDashGoogleDashRecaptchaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReCAPTCHAProps extends js.Object {
  /**
  	 * Optional. The badge location for g-recaptcha with size of "invisible".
  	 *
  	 * @default "bottomright"
  	 */
  var badge: js.UndefOr[reactDashGoogleDashRecaptchaLib.Badge] = js.undefined
  /**
  	 *  The function to be called when the user successfully completes the normal or compat captcha.
  	 * 	It will also be called with null, when captcha expires
  	 *  @param token string or null
  	 */
  var onChange: js.UndefOr[js.Function1[/* token */ java.lang.String | scala.Null, scala.Unit]] = js.undefined
  /**
  	 *  Optional callback, called when a challenge expires and has to be redone by the user.
  	 */
  var onExpired: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
  	 *  The API client key
  	 */
  var sitekey: java.lang.String
  /**
  	 *  Optional compact, normal or invisible. This allows you to change the size or do an invisible captcha
  	 */
  var size: js.UndefOr[reactDashGoogleDashRecaptchaLib.Size] = js.undefined
  /**
  	 *  Optional set the stoken parameter, which allows the captcha to be used from different domains,
  	 *  @see reCAPTCHA secure-token
  	 */
  var stoken: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 *  Optional the tabindex of the element
  	 *  @default 0
  	 */
  var tabindex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 *  Optional light or dark theme of the widget
  	 *  @default "light"
  	 */
  var theme: js.UndefOr[reactDashGoogleDashRecaptchaLib.Theme] = js.undefined
  /**
  	 * Optional image or audio The type of initial captcha
  	 * @default "image"
  	 */
  var `type`: js.UndefOr[reactDashGoogleDashRecaptchaLib.Type] = js.undefined
}

