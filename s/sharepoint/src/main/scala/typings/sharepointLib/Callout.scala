package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Callout")
@js.native
class Callout () extends js.Object {
  /** Adds a link to the actions panel in the bottom part of the callout window */
  def addAction(action: CalloutAction): scala.Unit = js.native
  /** Adds event handler to the callout.
    @param eventName one of the following: "opened", "opening", "closing", "closed" */
  def addEventCallback(eventName: java.lang.String, callback: js.Function1[/* callout */ this.type, scala.Unit]): scala.Unit = js.native
  /** Hide the callout. Animation can be used only for IE9+ */
  def close(useAnimation: scala.Boolean): scala.Unit = js.native
  /** Do not call this directly. Instead, use CalloutManager.remove */
  def destroy(): scala.Unit = js.native
  /** Returns the callout actions menu */
  def getActionMenu(): CalloutActionMenu = js.native
  /** Returns the beak orientation defined for the callout during its creation. */
  def getBeakOrientation(): java.lang.String = js.native
  /** Returns the bounding element defined for the callout during its creation. */
  def getBoundingBox(): stdLib.HTMLElement = js.native
  /** Returns the contents of the callout. */
  def getContent(): java.lang.String = js.native
  /** Returns the content element of the callout. */
  def getContentElement(): stdLib.HTMLElement = js.native
  /** Returns the content width defined for the callout during its creation. */
  def getContentWidth(): scala.Double = js.native
  /** Returns the ID of the callout. */
  def getID(): java.lang.String = js.native
  /** Returns the launch point element of the callout. */
  def getLaunchPoint(): stdLib.HTMLElement = js.native
  /** Returns the object that represents open behaivor defined for the callout during its creation. */
  def getOpenOptions(): CalloutOpenOptions = js.native
  /** Returns the position algorithm function defined for the callout during its creation. */
  def getPositionAlgorithm(): js.Any = js.native
  /** Returns the title of the callout. */
  def getTitle(): java.lang.String = js.native
  /** Specifies wherever callout is in "Closed" state */
  def isClosed(): scala.Boolean = js.native
  /** Specifies wherever callout is in "Closing" state */
  def isClosing(): scala.Boolean = js.native
  /** Specifies wherever callout is in "Opened" state */
  def isOpen(): scala.Boolean = js.native
  /** Specifies wherever callout is in "Opened" or "Opening" state */
  def isOpenOrOpening(): scala.Boolean = js.native
  /** Specifies wherever callout is in "Opening" state */
  def isOpening(): scala.Boolean = js.native
  /** Display the callout. Animation can be used only for IE9+ */
  def open(useAnimation: scala.Boolean): scala.Unit = js.native
  /** Re-renders the actions menu. Call after the actions menu is changed. */
  def refreshActions(): scala.Unit = js.native
  /** Sets options for the callout. Not all options can be changed for the callout after its creation. */
  def set(options: CalloutOptions): js.Any = js.native
  /** Display if hidden, hide if shown. */
  def toggle(): scala.Unit = js.native
}

