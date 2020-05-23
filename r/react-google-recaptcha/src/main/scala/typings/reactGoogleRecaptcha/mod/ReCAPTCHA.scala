package typings.reactGoogleRecaptcha.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-google-recaptcha", "ReCAPTCHA")
@js.native
class ReCAPTCHA ()
  extends Component[ReCAPTCHAProps, js.Object, js.Any] {
  /**
    * Programatically invoke the reCAPTCHA check. Used if the invisible reCAPTCHA is on a div instead of a button
    */
  def execute(): Unit = js.native
  /**
    * Gets the response for the reCAPTCHA widget.
    * @return the response of the reCAPTCHA widget.
    */
  def getValue(): String | Null = js.native
  /**
    * Gets the widgetId of reCAPTCHA widget
    * @return widgetId | null
    */
  def getWidgetId(): Double | Null = js.native
  /**
    * Resets the reCAPTCHA widget
    */
  def reset(): Unit = js.native
}

