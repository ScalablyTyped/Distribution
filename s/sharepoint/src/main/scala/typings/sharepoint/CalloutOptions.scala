package typings.sharepoint

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CalloutOptions")
@js.native
class CalloutOptions () extends js.Object {
  /** Some unique id for the callout. */
  var ID: String = js.native
  /** One of the following: "topBottom" (default) or "leftRight". */
  var beakOrientation: String = js.native
  /** If defined, callout will be inscribed into the bounding element. */
  var boundingBox: HTMLElement = js.native
  /** String (HTML allowed) that represents contents of the callout window. */
  var content: String = js.native
  /** HTML element that represents contents of the callout window. */
  var contentElement: HTMLElement = js.native
  /** Content element's width in pixels. By default = 350. */
  var contentWidth: Double = js.native
  /** Element on that the callout is shown. */
  var launchPoint: HTMLElement = js.native
  /** Defines opening behavior */
  var openOptions: CalloutOpenOptions = js.native
  /** Title for the callout */
  var title: String = js.native
  /** Fires right after the callout is closed */
  def onClosedCallback(callout: Callout): Unit = js.native
  /** Fires right before the callout is closed */
  def onClosingCallback(callout: Callout): Unit = js.native
  /** Fires right after the callout is shown */
  def onOpenedCallback(callout: Callout): Unit = js.native
  /** Fires after the callout is rendered but before it is positioned and shown */
  def onOpeningCallback(callout: Callout): Unit = js.native
  /** Sets the position of the callout during its opening phase. For an example of a position algorithm function, please explore defaultPositionAlgorithm function from the callout.debug.js file */
  def positionAlgorithm(callout: Callout): Unit = js.native
}

