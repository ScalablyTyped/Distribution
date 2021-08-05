package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Manages URL schemes for Scriptable._
  * @see https://docs.scriptable.app/urlscheme
  */
object URLScheme {
  
  @JSGlobal("URLScheme")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _URL for opening the script._
    *
    * Gets the URL for opening the current script. When making a request to the returned URL from another app, e.g. Safari, the script will be opened.
    * @see https://docs.scriptable.app/urlscheme/#foropeningscript
    */
  inline def forOpeningScript(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("forOpeningScript")().asInstanceOf[String]
  
  /**
    * _URL for opening script settings._
    *
    * Gets the URL for opening the settings of the current script. When making a request to the returned URL from another app, e.g. Safari, the settings of the current script will be
    * opened.
    * @see https://docs.scriptable.app/urlscheme/#foropeningscriptsettings
    */
  inline def forOpeningScriptSettings(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("forOpeningScriptSettings")().asInstanceOf[String]
  
  /**
    * _URL for running script._
    *
    * Gets the URL for running the current script. When making a request to the returned URL from another app, e.g. Safari, the current script will run.
    *
    * Get the query parameters using `args.queryParameters`.
    * @see https://docs.scriptable.app/urlscheme/#forrunningscript
    */
  inline def forRunningScript(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("forRunningScript")().asInstanceOf[String]
}
