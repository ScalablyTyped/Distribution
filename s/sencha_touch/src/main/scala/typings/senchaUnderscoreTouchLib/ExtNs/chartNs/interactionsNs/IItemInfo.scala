package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.interactionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IItemInfo extends IAbstract {
  /** [Method] Returns the value of panel
  		* @returns Object
  		*/
  var getPanel: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Placeholder method
  		* @param series Object
  		* @param item Object
  		*/
  @JSName("onGesture")
  var onGesture_IItemInfo: js.UndefOr[
    js.Function2[/* series */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Object) */
  var panel: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of panel
  		* @param panel Object The new value.
  		*/
  var setPanel: js.UndefOr[js.Function1[/* panel */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

