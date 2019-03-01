package typings
package soundmanager2Lib.soundmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoundManagerProps extends js.Object {
  var allowScriptAccess: js.UndefOr[ScriptAccess] = js.undefined
  var altURL: js.UndefOr[java.lang.String] = js.undefined
  var bgColor: js.UndefOr[java.lang.String] = js.undefined
  var consoleOnly: js.UndefOr[scala.Boolean] = js.undefined
  var debugFlash: js.UndefOr[scala.Boolean] = js.undefined
  var debugMode: js.UndefOr[scala.Boolean] = js.undefined
  var defaultOptions: js.UndefOr[DefaultOptions] = js.undefined
  /**
    * Some properties are dynamic, determined at initialisation or later
    * during runtime, and should be treated as read-only.
    */
  val features: js.UndefOr[js.Object] = js.undefined
  var flash9Options: js.UndefOr[Flash9Options] = js.undefined
  // html5PollingInterval: number;
  // html5Test: string;
  var flashLoadTimeout: js.UndefOr[scala.Double] = js.undefined
  var flashVersion: js.UndefOr[scala.Double] = js.undefined
  // flashPollingInterval: number;
  var forceUseGlobalHTML5Audio: js.UndefOr[scala.Boolean] = js.undefined
  val html5Only: js.UndefOr[scala.Boolean] = js.undefined
  var idPrefix: js.UndefOr[java.lang.String] = js.undefined
  var ignoreMobileRestrications: js.UndefOr[scala.Boolean] = js.undefined
  var movieStarOptions: js.UndefOr[MovieStarOptions] = js.undefined
  var noSWFCache: js.UndefOr[scala.Boolean] = js.undefined
  var onready: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var ontimeout: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var preferFlash: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The directory where SM2 can find the flash movies (soundmanager2.swf,
    * soundmanager2_flash9.swf and debug versions etc.) Note that SM2 will
    * append the correct SWF file name, depending on flashVersion and
    * debugMode settings.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  var useAltURL: js.UndefOr[scala.Boolean] = js.undefined
  var useConsole: js.UndefOr[scala.Boolean] = js.undefined
  var useFlashBlock: js.UndefOr[scala.Boolean] = js.undefined
  var useHTML5Audio: js.UndefOr[scala.Boolean] = js.undefined
  var useHighPerformance: js.UndefOr[scala.Boolean] = js.undefined
  var waitForWindowLoad: js.UndefOr[soundmanager2Lib.soundmanager2LibNumbers.`false`] = js.undefined
  var wmode: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object SoundManagerProps {
  @scala.inline
  def apply(
    allowScriptAccess: ScriptAccess = null,
    altURL: java.lang.String = null,
    bgColor: java.lang.String = null,
    consoleOnly: js.UndefOr[scala.Boolean] = js.undefined,
    debugFlash: js.UndefOr[scala.Boolean] = js.undefined,
    debugMode: js.UndefOr[scala.Boolean] = js.undefined,
    defaultOptions: DefaultOptions = null,
    features: js.Object = null,
    flash9Options: Flash9Options = null,
    flashLoadTimeout: scala.Int | scala.Double = null,
    flashVersion: scala.Int | scala.Double = null,
    forceUseGlobalHTML5Audio: js.UndefOr[scala.Boolean] = js.undefined,
    html5Only: js.UndefOr[scala.Boolean] = js.undefined,
    idPrefix: java.lang.String = null,
    ignoreMobileRestrications: js.UndefOr[scala.Boolean] = js.undefined,
    movieStarOptions: MovieStarOptions = null,
    noSWFCache: js.UndefOr[scala.Boolean] = js.undefined,
    onready: js.Function0[scala.Unit] = null,
    ontimeout: js.Function0[scala.Unit] = null,
    preferFlash: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null,
    useAltURL: js.UndefOr[scala.Boolean] = js.undefined,
    useConsole: js.UndefOr[scala.Boolean] = js.undefined,
    useFlashBlock: js.UndefOr[scala.Boolean] = js.undefined,
    useHTML5Audio: js.UndefOr[scala.Boolean] = js.undefined,
    useHighPerformance: js.UndefOr[scala.Boolean] = js.undefined,
    waitForWindowLoad: soundmanager2Lib.soundmanager2LibNumbers.`false` = null,
    wmode: java.lang.String = null
  ): SoundManagerProps = {
    val __obj = js.Dynamic.literal()
    if (allowScriptAccess != null) __obj.updateDynamic("allowScriptAccess")(allowScriptAccess)
    if (altURL != null) __obj.updateDynamic("altURL")(altURL)
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor)
    if (!js.isUndefined(consoleOnly)) __obj.updateDynamic("consoleOnly")(consoleOnly)
    if (!js.isUndefined(debugFlash)) __obj.updateDynamic("debugFlash")(debugFlash)
    if (!js.isUndefined(debugMode)) __obj.updateDynamic("debugMode")(debugMode)
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions)
    if (features != null) __obj.updateDynamic("features")(features)
    if (flash9Options != null) __obj.updateDynamic("flash9Options")(flash9Options)
    if (flashLoadTimeout != null) __obj.updateDynamic("flashLoadTimeout")(flashLoadTimeout.asInstanceOf[js.Any])
    if (flashVersion != null) __obj.updateDynamic("flashVersion")(flashVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(forceUseGlobalHTML5Audio)) __obj.updateDynamic("forceUseGlobalHTML5Audio")(forceUseGlobalHTML5Audio)
    if (!js.isUndefined(html5Only)) __obj.updateDynamic("html5Only")(html5Only)
    if (idPrefix != null) __obj.updateDynamic("idPrefix")(idPrefix)
    if (!js.isUndefined(ignoreMobileRestrications)) __obj.updateDynamic("ignoreMobileRestrications")(ignoreMobileRestrications)
    if (movieStarOptions != null) __obj.updateDynamic("movieStarOptions")(movieStarOptions)
    if (!js.isUndefined(noSWFCache)) __obj.updateDynamic("noSWFCache")(noSWFCache)
    if (onready != null) __obj.updateDynamic("onready")(onready)
    if (ontimeout != null) __obj.updateDynamic("ontimeout")(ontimeout)
    if (!js.isUndefined(preferFlash)) __obj.updateDynamic("preferFlash")(preferFlash)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(useAltURL)) __obj.updateDynamic("useAltURL")(useAltURL)
    if (!js.isUndefined(useConsole)) __obj.updateDynamic("useConsole")(useConsole)
    if (!js.isUndefined(useFlashBlock)) __obj.updateDynamic("useFlashBlock")(useFlashBlock)
    if (!js.isUndefined(useHTML5Audio)) __obj.updateDynamic("useHTML5Audio")(useHTML5Audio)
    if (!js.isUndefined(useHighPerformance)) __obj.updateDynamic("useHighPerformance")(useHighPerformance)
    if (waitForWindowLoad != null) __obj.updateDynamic("waitForWindowLoad")(waitForWindowLoad)
    if (wmode != null) __obj.updateDynamic("wmode")(wmode)
    __obj.asInstanceOf[SoundManagerProps]
  }
}

