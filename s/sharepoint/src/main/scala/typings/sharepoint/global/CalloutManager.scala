package typings.sharepoint.global

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CalloutManager")
@js.native
open class CalloutManager ()
  extends StObject
     with typings.sharepoint.CalloutManager
object CalloutManager {
  
  @JSGlobal("CalloutManager")
  @js.native
  val ^ : js.Any = js.native
  
  /** Closes all callouts on the page */
  /* static member */
  inline def closeAll(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("closeAll")().asInstanceOf[Boolean]
  
  /** Gets the first launch point within the specified ancestor element, and returns true if the associated with it callout is opened or opening.
    If the launch point is not found or the callout is hidden, returns false. */
  /* static member */
  inline def containsOneCalloutOpen(ancestor: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsOneCalloutOpen")(ancestor.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** Creates a new callout */
  /* static member */
  inline def createNew(options: typings.sharepoint.CalloutOptions): typings.sharepoint.Callout = ^.asInstanceOf[js.Dynamic].applyDynamic("createNew")(options.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.Callout]
  
  /** Checks if callout with specified ID already exists. If it doesn't, creates it, otherwise returns the existing one. */
  /* static member */
  inline def createNewIfNecessary(options: typings.sharepoint.CalloutOptions): typings.sharepoint.Callout = ^.asInstanceOf[js.Dynamic].applyDynamic("createNewIfNecessary")(options.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.Callout]
  
  /** Perform some action for each callout on the page. */
  /* static member */
  inline def forEach(callback: js.Function1[/* callout */ typings.sharepoint.Callout, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Finds the closest launch point based on the specified descendant element, and returns callout associated with the launch point. */
  /* static member */
  inline def getFromCalloutDescendant(descendant: HTMLElement): typings.sharepoint.Callout = ^.asInstanceOf[js.Dynamic].applyDynamic("getFromCalloutDescendant")(descendant.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.Callout]
  
  /** Searches for a callout associated with the specified launch point. Throws error if not found. */
  /* static member */
  inline def getFromLaunchPoint(launchPoint: HTMLElement): typings.sharepoint.Callout = ^.asInstanceOf[js.Dynamic].applyDynamic("getFromLaunchPoint")(launchPoint.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.Callout]
  
  /** Searches for a callout associated with the specified launch point. Returns null if not found. */
  /* static member */
  inline def getFromLaunchPointIfExists(launchPoint: HTMLElement): typings.sharepoint.Callout = ^.asInstanceOf[js.Dynamic].applyDynamic("getFromLaunchPointIfExists")(launchPoint.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.Callout]
  
  /** Returns true if at least one of the defined on page callouts is opened or opening. */
  /* static member */
  inline def isAtLeastOneCalloutOn(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAtLeastOneCalloutOn")().asInstanceOf[Boolean]
  
  /** Returns true if at least one of the defined on page callouts is opened. */
  /* static member */
  inline def isAtLeastOneCalloutOpen(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAtLeastOneCalloutOpen")().asInstanceOf[Boolean]
  
  /** Detaches callout from the launch point and destroys it. */
  /* static member */
  inline def remove(callout: typings.sharepoint.Callout): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(callout.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
