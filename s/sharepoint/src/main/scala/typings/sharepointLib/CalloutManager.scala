package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CalloutManager")
@js.native
class CalloutManager () extends js.Object

@JSGlobal("CalloutManager")
@js.native
object CalloutManager extends js.Object {
  /** Closes all callouts on the page */
  def closeAll(): scala.Boolean = js.native
  /** Gets the first launch point within the specified ancestor element, and returns true if the associated with it callout is opened or opening.
          If the launch point is not found or the callout is hidden, returns false. */
  def containsOneCalloutOpen(ancestor: stdLib.HTMLElement): scala.Boolean = js.native
  /** Creates a new callout */
  def createNew(options: sharepointLib.CalloutOptions): sharepointLib.Callout = js.native
  /** Checks if callout with specified ID already exists. If it doesn't, creates it, otherwise returns the existing one. */
  def createNewIfNecessary(options: sharepointLib.CalloutOptions): sharepointLib.Callout = js.native
  /** Perform some action for each callout on the page. */
  def forEach(callback: js.Function1[/* callout */ sharepointLib.Callout, scala.Unit]): scala.Unit = js.native
  /** Finds the closest launch point based on the specified descendant element, and returns callout associated with the launch point. */
  def getFromCalloutDescendant(descendant: stdLib.HTMLElement): sharepointLib.Callout = js.native
  /** Searches for a callout associated with the specified launch point. Throws error if not found. */
  def getFromLaunchPoint(launchPoint: stdLib.HTMLElement): sharepointLib.Callout = js.native
  /** Searches for a callout associated with the specified launch point. Returns null if not found. */
  def getFromLaunchPointIfExists(launchPoint: stdLib.HTMLElement): sharepointLib.Callout = js.native
  /** Returns true if at least one of the defined on page callouts is opened or opening. */
  def isAtLeastOneCalloutOn(): scala.Boolean = js.native
  /** Returns true if at least one of the defined on page callouts is opened. */
  def isAtLeastOneCalloutOpen(): scala.Boolean = js.native
  /** Detaches callout from the launch point and destroys it. */
  def remove(callout: sharepointLib.Callout): scala.Unit = js.native
}

