package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.captureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISimulator
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Start the audio recorder application and return information about captured audio clip file s
  		* @param config Object The configuration object to be passed:
  		*/
  var captureAudio: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Start the video recorder application and return information about captured video clip file s
  		* @param config Object The configuration object to be passed:
  		*/
  var captureVideo: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

