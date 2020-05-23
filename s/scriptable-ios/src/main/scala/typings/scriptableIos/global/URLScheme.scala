package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Manages URL schemes for Scriptable._
  * @see https://docs.scriptable.app/urlscheme
  */
@JSGlobal("URLScheme")
@js.native
object URLScheme extends js.Object {
  /**
    * _URL for opening the script._
    *
    * Gets the URL for opening the current script. When making a request to the returned URL from another app, e.g. Safari, the script will be opened.
    * @see https://docs.scriptable.app/urlscheme/#foropeningscript
    */
  def forOpeningScript(): String = js.native
  /**
    * _URL for opening script settings._
    *
    * Gets the URL for opening the settings of the current script. When making a request to the returned URL from another app, e.g. Safari, the settings of the current script will be
    * opened.
    * @see https://docs.scriptable.app/urlscheme/#foropeningscriptsettings
    */
  def forOpeningScriptSettings(): String = js.native
  /**
    * _URL for running script._
    *
    * Gets the URL for running the current script. When making a request to the returned URL from another app, e.g. Safari, the current script will run.
    *
    * Any query parameter in the URL will be available using the URLScheme bridge. Get the query paramters using the `allParameters()` and `parameter(name)` functions.
    * @see https://docs.scriptable.app/urlscheme/#forrunningscript
    */
  def forRunningScript(): String = js.native
}

