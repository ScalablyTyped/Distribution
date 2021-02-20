package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Manages URL schemes for Scriptable._
  * @see https://docs.scriptable.app/urlscheme
  */
object URLScheme {
  
  /**
    * _URL for opening the script._
    *
    * Gets the URL for opening the current script. When making a request to the returned URL from another app, e.g. Safari, the script will be opened.
    * @see https://docs.scriptable.app/urlscheme/#foropeningscript
    */
  @JSGlobal("URLScheme.forOpeningScript")
  @js.native
  def forOpeningScript(): String = js.native
  
  /**
    * _URL for opening script settings._
    *
    * Gets the URL for opening the settings of the current script. When making a request to the returned URL from another app, e.g. Safari, the settings of the current script will be
    * opened.
    * @see https://docs.scriptable.app/urlscheme/#foropeningscriptsettings
    */
  @JSGlobal("URLScheme.forOpeningScriptSettings")
  @js.native
  def forOpeningScriptSettings(): String = js.native
  
  /**
    * _URL for running script._
    *
    * Gets the URL for running the current script. When making a request to the returned URL from another app, e.g. Safari, the current script will run.
    *
    * Get the query parameters using `args.queryParameters`.
    * @see https://docs.scriptable.app/urlscheme/#forrunningscript
    */
  @JSGlobal("URLScheme.forRunningScript")
  @js.native
  def forRunningScript(): String = js.native
}
