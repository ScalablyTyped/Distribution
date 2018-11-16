package typings
package sharepointLib.SrchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Srch.ScriptApplicationManager")
@js.native
class ScriptApplicationManager () extends js.Object {
  /** Adds handler for the load event */
  def add_load(handlerFunction: js.Function2[/* instance */ js.Any, /* eventArgs */ js.Any, scala.Unit]): scala.Unit = js.native
  /** Adds handler for the postload event */
  def add_postLoad(handlerFunction: js.Function2[/* instance */ js.Any, /* eventArgs */ js.Any, scala.Unit]): scala.Unit = js.native
  /** Adds handler for the preload event */
  def add_preLoad(handlerFunction: js.Function2[/* instance */ js.Any, /* eventArgs */ js.Any, scala.Unit]): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  /** Returns server-relative link to _layouts/DesignDisplayTemplates.aspx */
  def get_displayTemplatesUrl(): java.lang.String = js.native
  /** Returns absolute URL of the current page (without ? and # parts) */
  def get_pagePath(): java.lang.String = js.native
  /** Returns server-relative link to _layouts/EditUserPref.aspx */
  def get_preferencesUrl(): java.lang.String = js.native
  /** Returns server-relative link to _layouts/listqueryrules.aspx */
  def get_queryRulesUrl(): java.lang.String = js.native
  /** Returns server-relative link to _layouts/manageresultsources.aspx */
  def get_resultSourcesUrl(): java.lang.String = js.native
  /** Returns server-relative link to _layouts/manageresulttypes.aspx */
  def get_resultTypesUrl(): java.lang.String = js.native
  /** Gets the current search session ID from the cookies (if session ID does not exist in the cookies yet - it will be added) */
  def get_searchSessionID(): scala.Unit = js.native
  def initialize(): scala.Unit = js.native
  /** Puts specified hash-key address into the current page location.
           * @param url The hash-key, e.g. '#k=test'
           */
  def navigateTo(url: java.lang.String): scala.Unit = js.native
  /** Raises the load event */
  def raiseLoadEvent(): scala.Unit = js.native
  /** Raises the postload event */
  def raisePostLoadEvent(): scala.Unit = js.native
  /** Raises the preload event */
  def raisePreLoadEvent(): scala.Unit = js.native
  /** Registers DisplayControl, DataProvider or SearchBox in the system.
           * After registration the controls will be correctly processed in the page search context.
           */
  def registerClientControl(clientControl: DataProvider): scala.Unit = js.native
  /** Registers DisplayControl, DataProvider or SearchBox in the system.
           * After registration the controls will be correctly processed in the page search context.
           */
  def registerClientControl(clientControl: DisplayControl): scala.Unit = js.native
  /** Registers DisplayControl, DataProvider or SearchBox in the system.
           * After registration the controls will be correctly processed in the page search context.
           */
  def registerClientControl(clientControl: SearchBox): scala.Unit = js.native
  /** Removes handler for the load event */
  def remove_load(handlerFunction: js.Function2[/* instance */ js.Any, /* eventArgs */ js.Any, scala.Unit]): scala.Unit = js.native
  /** Removes handler for the postload event */
  def remove_postLoad(handlerFunction: js.Function2[/* instance */ js.Any, /* eventArgs */ js.Any, scala.Unit]): scala.Unit = js.native
  /** Removes handler for the preload event */
  def remove_preLoad(handlerFunction: js.Function2[/* instance */ js.Any, /* eventArgs */ js.Any, scala.Unit]): scala.Unit = js.native
}

@JSGlobal("Srch.ScriptApplicationManager")
@js.native
object ScriptApplicationManager extends js.Object {
  def get_clientRuntimeContext(): sharepointLib.SPNs.ClientRuntimeContext = js.native
  def get_current(): sharepointLib.SrchNs.ScriptApplicationManager = js.native
}

