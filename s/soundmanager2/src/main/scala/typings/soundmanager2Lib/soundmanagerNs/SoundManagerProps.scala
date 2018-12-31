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

