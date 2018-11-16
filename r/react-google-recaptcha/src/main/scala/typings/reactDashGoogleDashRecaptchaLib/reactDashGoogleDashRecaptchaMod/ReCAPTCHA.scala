package typings
package reactDashGoogleDashRecaptchaLib.reactDashGoogleDashRecaptchaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReCAPTCHA
  extends reactLib.reactMod.Component[ReCAPTCHAProps, js.Object, js.Any] {
  /**
  	 * Programatically invoke the reCAPTCHA check. Used if the invisible reCAPTCHA is on a div instead of a button
  	 */
  def execute(): scala.Unit = js.native
  /**
  	 * Gets the response for the reCAPTCHA widget.
  	 * @return the response of the reCAPTCHA widget.
  	 */
  def getValue(): java.lang.String | scala.Null = js.native
  /**
  	 * Gets the widgetId of reCAPTCHA widget
  	 * @return widgetId | null
  	 */
  def getWidgetId(): scala.Double | scala.Null = js.native
  /**
  	 * Resets the reCAPTCHA widget
  	 */
  def reset(): scala.Unit = js.native
}

