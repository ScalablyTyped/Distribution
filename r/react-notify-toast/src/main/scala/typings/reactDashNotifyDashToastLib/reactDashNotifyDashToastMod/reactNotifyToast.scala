package typings
package reactDashNotifyDashToastLib.reactDashNotifyDashToastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait reactNotifyToast extends js.Object {
  def createShowQueue(): reactNotifyToast = js.native
  def hide(): scala.Unit = js.native
  def show(text: java.lang.String): scala.Unit = js.native
  @JSName("show")
  def show_custom(
    text: java.lang.String,
    `type`: reactDashNotifyDashToastLib.reactDashNotifyDashToastLibStrings.custom
  ): scala.Unit = js.native
  @JSName("show")
  def show_custom(
    text: java.lang.String,
    `type`: reactDashNotifyDashToastLib.reactDashNotifyDashToastLibStrings.custom,
    timeout: scala.Double
  ): scala.Unit = js.native
  @JSName("show")
  def show_custom(
    text: java.lang.String,
    `type`: reactDashNotifyDashToastLib.reactDashNotifyDashToastLibStrings.custom,
    timeout: scala.Double,
    color: reactNotifyToastColor
  ): scala.Unit = js.native
  @JSName("show")
  def show_error(
    text: java.lang.String,
    `type`: reactDashNotifyDashToastLib.reactDashNotifyDashToastLibStrings.error
  ): scala.Unit = js.native
  @JSName("show")
  def show_error(
    text: java.lang.String,
    `type`: reactDashNotifyDashToastLib.reactDashNotifyDashToastLibStrings.error,
    timeout: scala.Double
  ): scala.Unit = js.native
  @JSName("show")
  def show_error(
    text: java.lang.String,
    `type`: reactDashNotifyDashToastLib.reactDashNotifyDashToastLibStrings.error,
    timeout: scala.Double,
    color: reactNotifyToastColor
  ): scala.Unit = js.native
  @JSName("show")
  def show_success(
    text: java.lang.String,
    `type`: reactDashNotifyDashToastLib.reactDashNotifyDashToastLibStrings.success
  ): scala.Unit = js.native
  @JSName("show")
  def show_success(
    text: java.lang.String,
    `type`: reactDashNotifyDashToastLib.reactDashNotifyDashToastLibStrings.success,
    timeout: scala.Double
  ): scala.Unit = js.native
  @JSName("show")
  def show_success(
    text: java.lang.String,
    `type`: reactDashNotifyDashToastLib.reactDashNotifyDashToastLibStrings.success,
    timeout: scala.Double,
    color: reactNotifyToastColor
  ): scala.Unit = js.native
  @JSName("show")
  def show_warning(
    text: java.lang.String,
    `type`: reactDashNotifyDashToastLib.reactDashNotifyDashToastLibStrings.warning
  ): scala.Unit = js.native
  @JSName("show")
  def show_warning(
    text: java.lang.String,
    `type`: reactDashNotifyDashToastLib.reactDashNotifyDashToastLibStrings.warning,
    timeout: scala.Double
  ): scala.Unit = js.native
  @JSName("show")
  def show_warning(
    text: java.lang.String,
    `type`: reactDashNotifyDashToastLib.reactDashNotifyDashToastLibStrings.warning,
    timeout: scala.Double,
    color: reactNotifyToastColor
  ): scala.Unit = js.native
}

