package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CalloutOptions")
@js.native
class CalloutOptions () extends js.Object {
  /** Some unique id for the callout. */
  var ID: java.lang.String = js.native
  /** One of the following: "topBottom" (default) or "leftRight". */
  var beakOrientation: java.lang.String = js.native
  /** If defined, callout will be inscribed into the bounding element. */
  var boundingBox: stdLib.HTMLElement = js.native
  /** String (HTML allowed) that represents contents of the callout window. */
  var content: java.lang.String = js.native
  /** HTML element that represents contents of the callout window. */
  var contentElement: stdLib.HTMLElement = js.native
  /** Content element's width in pixels. By default = 350. */
  var contentWidth: scala.Double = js.native
  /** Element on that the callout is shown. */
  var launchPoint: stdLib.HTMLElement = js.native
  /** Defines opening behavior */
  var openOptions: CalloutOpenOptions = js.native
  /** Title for the callout */
  var title: java.lang.String = js.native
  /** Fires right after the callout is closed */
  def onClosedCallback(callout: Callout): scala.Unit = js.native
  /** Fires right before the callout is closed */
  def onClosingCallback(callout: Callout): scala.Unit = js.native
  /** Fires right after the callout is shown */
  def onOpenedCallback(callout: Callout): scala.Unit = js.native
  /** Fires after the callout is rendered but before it is positioned and shown */
  def onOpeningCallback(callout: Callout): scala.Unit = js.native
  /** Sets the position of the callout during its opening phase. For an example of a position algorithm function, please explore defaultPositionAlgorithm function from the callout.debug.js file */
  def positionAlgorithm(callout: Callout): scala.Unit = js.native
}

