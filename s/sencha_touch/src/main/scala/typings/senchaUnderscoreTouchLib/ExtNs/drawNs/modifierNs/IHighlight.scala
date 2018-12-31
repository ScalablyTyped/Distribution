package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs.modifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHighlight extends IModifier {
  /** [Config Option] (Boolean) */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Filter modifier changes if overriding source attributes
  		* @param attr Object The source attributes.
  		* @param changes Object The modifier changes.
  		* @returns * The filtered changes.
  		*/
  var filterChanges: js.UndefOr[js.Function2[/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the value of enabled
  		* @returns Boolean
  		*/
  var getEnabled: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of highlightStyle
  		* @returns Object
  		*/
  var getHighlightStyle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Object) */
  var highlightStyle: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of enabled
  		* @param enabled Boolean The new value.
  		*/
  var setEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of highlightStyle
  		* @param highlightStyle Object The new value.
  		*/
  var setHighlightStyle: js.UndefOr[js.Function1[/* highlightStyle */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

