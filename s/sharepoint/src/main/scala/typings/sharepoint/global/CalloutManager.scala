package typings.sharepoint.global

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CalloutManager")
@js.native
class CalloutManager ()
  extends typings.sharepoint.CalloutManager
object CalloutManager {
  
  /** Closes all callouts on the page */
  /* static member */
  @JSGlobal("CalloutManager.closeAll")
  @js.native
  def closeAll(): Boolean = js.native
  
  /** Gets the first launch point within the specified ancestor element, and returns true if the associated with it callout is opened or opening.
    If the launch point is not found or the callout is hidden, returns false. */
  /* static member */
  @JSGlobal("CalloutManager.containsOneCalloutOpen")
  @js.native
  def containsOneCalloutOpen(ancestor: HTMLElement): Boolean = js.native
  
  /** Creates a new callout */
  /* static member */
  @JSGlobal("CalloutManager.createNew")
  @js.native
  def createNew(options: typings.sharepoint.CalloutOptions): typings.sharepoint.Callout = js.native
  
  /** Checks if callout with specified ID already exists. If it doesn't, creates it, otherwise returns the existing one. */
  /* static member */
  @JSGlobal("CalloutManager.createNewIfNecessary")
  @js.native
  def createNewIfNecessary(options: typings.sharepoint.CalloutOptions): typings.sharepoint.Callout = js.native
  
  /** Perform some action for each callout on the page. */
  /* static member */
  @JSGlobal("CalloutManager.forEach")
  @js.native
  def forEach(callback: js.Function1[/* callout */ typings.sharepoint.Callout, Unit]): Unit = js.native
  
  /** Finds the closest launch point based on the specified descendant element, and returns callout associated with the launch point. */
  /* static member */
  @JSGlobal("CalloutManager.getFromCalloutDescendant")
  @js.native
  def getFromCalloutDescendant(descendant: HTMLElement): typings.sharepoint.Callout = js.native
  
  /** Searches for a callout associated with the specified launch point. Throws error if not found. */
  /* static member */
  @JSGlobal("CalloutManager.getFromLaunchPoint")
  @js.native
  def getFromLaunchPoint(launchPoint: HTMLElement): typings.sharepoint.Callout = js.native
  
  /** Searches for a callout associated with the specified launch point. Returns null if not found. */
  /* static member */
  @JSGlobal("CalloutManager.getFromLaunchPointIfExists")
  @js.native
  def getFromLaunchPointIfExists(launchPoint: HTMLElement): typings.sharepoint.Callout = js.native
  
  /** Returns true if at least one of the defined on page callouts is opened or opening. */
  /* static member */
  @JSGlobal("CalloutManager.isAtLeastOneCalloutOn")
  @js.native
  def isAtLeastOneCalloutOn(): Boolean = js.native
  
  /** Returns true if at least one of the defined on page callouts is opened. */
  /* static member */
  @JSGlobal("CalloutManager.isAtLeastOneCalloutOpen")
  @js.native
  def isAtLeastOneCalloutOpen(): Boolean = js.native
  
  /** Detaches callout from the launch point and destroys it. */
  /* static member */
  @JSGlobal("CalloutManager.remove")
  @js.native
  def remove(callout: typings.sharepoint.Callout): Unit = js.native
}
