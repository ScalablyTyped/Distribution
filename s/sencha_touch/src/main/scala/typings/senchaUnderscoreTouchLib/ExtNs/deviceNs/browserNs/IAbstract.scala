package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAbstract
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Used to close the browser if one is opened  */
  var close: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Used to open a new browser window
  		* @param options Object The options to use when opening a new browser window.
  		*/
  var open: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

