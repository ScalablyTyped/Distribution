package typings.sharepoint

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Callout")
@js.native
class Callout () extends js.Object {
  /** Adds a link to the actions panel in the bottom part of the callout window */
  def addAction(action: CalloutAction): Unit = js.native
  /** Adds event handler to the callout.
    @param eventName one of the following: "opened", "opening", "closing", "closed" */
  def addEventCallback(eventName: String, callback: js.Function1[/* callout */ this.type, Unit]): Unit = js.native
  /** Hide the callout. Animation can be used only for IE9+ */
  def close(useAnimation: Boolean): Unit = js.native
  /** Do not call this directly. Instead, use CalloutManager.remove */
  def destroy(): Unit = js.native
  /** Returns the callout actions menu */
  def getActionMenu(): CalloutActionMenu = js.native
  /** Returns the beak orientation defined for the callout during its creation. */
  def getBeakOrientation(): String = js.native
  /** Returns the bounding element defined for the callout during its creation. */
  def getBoundingBox(): HTMLElement = js.native
  /** Returns the contents of the callout. */
  def getContent(): String = js.native
  /** Returns the content element of the callout. */
  def getContentElement(): HTMLElement = js.native
  /** Returns the content width defined for the callout during its creation. */
  def getContentWidth(): Double = js.native
  /** Returns the ID of the callout. */
  def getID(): String = js.native
  /** Returns the launch point element of the callout. */
  def getLaunchPoint(): HTMLElement = js.native
  /** Returns the object that represents open behaivor defined for the callout during its creation. */
  def getOpenOptions(): CalloutOpenOptions = js.native
  /** Returns the position algorithm function defined for the callout during its creation. */
  def getPositionAlgorithm(): js.Any = js.native
  /** Returns the title of the callout. */
  def getTitle(): String = js.native
  /** Specifies wherever callout is in "Closed" state */
  def isClosed(): Boolean = js.native
  /** Specifies wherever callout is in "Closing" state */
  def isClosing(): Boolean = js.native
  /** Specifies wherever callout is in "Opened" state */
  def isOpen(): Boolean = js.native
  /** Specifies wherever callout is in "Opened" or "Opening" state */
  def isOpenOrOpening(): Boolean = js.native
  /** Specifies wherever callout is in "Opening" state */
  def isOpening(): Boolean = js.native
  /** Display the callout. Animation can be used only for IE9+ */
  def open(useAnimation: Boolean): Unit = js.native
  /** Re-renders the actions menu. Call after the actions menu is changed. */
  def refreshActions(): Unit = js.native
  /** Sets options for the callout. Not all options can be changed for the callout after its creation. */
  def set(options: CalloutOptions): js.Any = js.native
  /** Display if hidden, hide if shown. */
  def toggle(): Unit = js.native
}

