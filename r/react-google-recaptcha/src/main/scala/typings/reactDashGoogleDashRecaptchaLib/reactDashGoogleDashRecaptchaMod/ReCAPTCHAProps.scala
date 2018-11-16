package typings
package reactDashGoogleDashRecaptchaLib.reactDashGoogleDashRecaptchaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReCAPTCHAProps extends js.Object {
  /**
  	 * Optional. The badge location for g-recaptcha with size of "invisible".
  	 *
  	 * @default "bottomright"
  	 */
  var badge: js.UndefOr[reactDashGoogleDashRecaptchaLib.Badge] = js.native
  /**
  	 *  Optional callback, called when a challenge expires and has to be redone by the user.
  	 */
  var onExpired: js.UndefOr[js.Function0[scala.Unit]] = js.native
  /**
  	 *  The API client key
  	 */
  var sitekey: java.lang.String = js.native
  /**
  	 *  Optional compact, normal or invisible. This allows you to change the size or do an invisible captcha
  	 */
  var size: js.UndefOr[reactDashGoogleDashRecaptchaLib.Size] = js.native
  /**
  	 *  Optional set the stoken parameter, which allows the captcha to be used from different domains,
  	 *  @see reCAPTCHA secure-token
  	 */
  var stoken: js.UndefOr[java.lang.String] = js.native
  /**
  	 *  Optional the tabindex of the element
  	 *  @default 0
  	 */
  var tabindex: js.UndefOr[scala.Double] = js.native
  /**
  	 *  Optional light or dark theme of the widget
  	 *  @default "light"
  	 */
  var theme: js.UndefOr[reactDashGoogleDashRecaptchaLib.Theme] = js.native
  /**
  	 * Optional image or audio The type of initial captcha
  	 * @default "image"
  	 */
  var `type`: js.UndefOr[reactDashGoogleDashRecaptchaLib.Type] = js.native
  /**
  	 *  The function to be called when the user successfully completes the captcha. It will also be called
  	 *  with null, when captcha expires
  	 *  @param token string or null
  	 */
  def onChange(): scala.Unit = js.native
  /**
  	 *  The function to be called when the user successfully completes the captcha. It will also be called
  	 *  with null, when captcha expires
  	 *  @param token string or null
  	 */
  def onChange(token: java.lang.String): scala.Unit = js.native
}

