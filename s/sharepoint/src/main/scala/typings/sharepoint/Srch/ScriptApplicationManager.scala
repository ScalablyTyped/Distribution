package typings.sharepoint.Srch

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.Anon_ContextTitle
import typings.sharepoint.SP.ClientRuntimeContext
import typings.std.HTMLCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Srch.ScriptApplicationManager")
@js.native
class ScriptApplicationManager () extends js.Object {
  var queryGroups: StringDictionary[QueryGroup] = js.native
  var states: Anon_ContextTitle = js.native
  /** Adds handler for the load event */
  def add_load(handlerFunction: js.Function2[/* instance */ js.Any, /* eventArgs */ js.Any, Unit]): Unit = js.native
  /** Adds handler for the postload event */
  def add_postLoad(handlerFunction: js.Function2[/* instance */ js.Any, /* eventArgs */ js.Any, Unit]): Unit = js.native
  /** Adds handler for the preload event */
  def add_preLoad(handlerFunction: js.Function2[/* instance */ js.Any, /* eventArgs */ js.Any, Unit]): Unit = js.native
  def dispose(): Unit = js.native
  def getNavigationNodes(): HTMLCollection = js.native
  /** Returns server-relative link to _layouts/DesignDisplayTemplates.aspx */
  def get_displayTemplatesUrl(): String = js.native
  /** Returns absolute URL of the current page (without ? and # parts) */
  def get_pagePath(): String = js.native
  /** Returns server-relative link to _layouts/EditUserPref.aspx */
  def get_preferencesUrl(): String = js.native
  /** Returns server-relative link to _layouts/listqueryrules.aspx */
  def get_queryRulesUrl(): String = js.native
  /** Returns server-relative link to _layouts/manageresultsources.aspx */
  def get_resultSourcesUrl(): String = js.native
  /** Returns server-relative link to _layouts/manageresulttypes.aspx */
  def get_resultTypesUrl(): String = js.native
  /** Gets the current search session ID from the cookies (if session ID does not exist in the cookies yet - it will be added) */
  def get_searchSessionID(): Unit = js.native
  def initialize(): Unit = js.native
  /** Puts specified hash-key address into the current page location.
    * @param url The hash-key, e.g. '#k=test'
    */
  def navigateTo(url: String): Unit = js.native
  /** Raises the load event */
  def raiseLoadEvent(): Unit = js.native
  /** Raises the postload event */
  def raisePostLoadEvent(): Unit = js.native
  /** Raises the preload event */
  def raisePreLoadEvent(): Unit = js.native
  def registerClientControl(clientControl: DataProvider): Unit = js.native
  /** Registers DisplayControl, DataProvider or SearchBox in the system.
    * After registration the controls will be correctly processed in the page search context.
    */
  def registerClientControl(clientControl: DisplayControl): Unit = js.native
  def registerClientControl(clientControl: SearchBox): Unit = js.native
  /** Removes handler for the load event */
  def remove_load(handlerFunction: js.Function2[/* instance */ js.Any, /* eventArgs */ js.Any, Unit]): Unit = js.native
  /** Removes handler for the postload event */
  def remove_postLoad(handlerFunction: js.Function2[/* instance */ js.Any, /* eventArgs */ js.Any, Unit]): Unit = js.native
  /** Removes handler for the preload event */
  def remove_preLoad(handlerFunction: js.Function2[/* instance */ js.Any, /* eventArgs */ js.Any, Unit]): Unit = js.native
}

/* static members */
@JSGlobal("Srch.ScriptApplicationManager")
@js.native
object ScriptApplicationManager extends js.Object {
  def get_clientRuntimeContext(): ClientRuntimeContext = js.native
  def get_current(): ScriptApplicationManager = js.native
}

