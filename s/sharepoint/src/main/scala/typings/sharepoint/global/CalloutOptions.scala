package typings.sharepoint.global

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CalloutOptions")
@js.native
class CalloutOptions ()
  extends typings.sharepoint.CalloutOptions {
  /** Some unique id for the callout. */
  /* CompleteClass */
  override var ID: String = js.native
  /** One of the following: "topBottom" (default) or "leftRight". */
  /* CompleteClass */
  override var beakOrientation: String = js.native
  /** If defined, callout will be inscribed into the bounding element. */
  /* CompleteClass */
  override var boundingBox: HTMLElement = js.native
  /** String (HTML allowed) that represents contents of the callout window. */
  /* CompleteClass */
  override var content: String = js.native
  /** HTML element that represents contents of the callout window. */
  /* CompleteClass */
  override var contentElement: HTMLElement = js.native
  /** Content element's width in pixels. By default = 350. */
  /* CompleteClass */
  override var contentWidth: Double = js.native
  /** Element on that the callout is shown. */
  /* CompleteClass */
  override var launchPoint: HTMLElement = js.native
  /** Defines opening behavior */
  /* CompleteClass */
  override var openOptions: typings.sharepoint.CalloutOpenOptions = js.native
  /** Title for the callout */
  /* CompleteClass */
  override var title: String = js.native
  /** Fires right after the callout is closed */
  /* CompleteClass */
  override def onClosedCallback(callout: typings.sharepoint.Callout): Unit = js.native
  /** Fires right before the callout is closed */
  /* CompleteClass */
  override def onClosingCallback(callout: typings.sharepoint.Callout): Unit = js.native
  /** Fires right after the callout is shown */
  /* CompleteClass */
  override def onOpenedCallback(callout: typings.sharepoint.Callout): Unit = js.native
  /** Fires after the callout is rendered but before it is positioned and shown */
  /* CompleteClass */
  override def onOpeningCallback(callout: typings.sharepoint.Callout): Unit = js.native
  /** Sets the position of the callout during its opening phase. For an example of a position algorithm function, please explore defaultPositionAlgorithm function from the callout.debug.js file */
  /* CompleteClass */
  override def positionAlgorithm(callout: typings.sharepoint.Callout): Unit = js.native
}

