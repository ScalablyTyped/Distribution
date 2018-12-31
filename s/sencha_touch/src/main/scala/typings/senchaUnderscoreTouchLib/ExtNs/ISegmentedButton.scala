package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISegmentedButton extends IContainer {
  /** [Config Option] (Boolean) */
  var allowDepress: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var allowMultiple: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var allowToggle: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] We override initItems so we can check for the pressed config  */
  var applyItems: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of allowDepress
  		* @returns Boolean
  		*/
  var getAllowDepress: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of allowMultiple
  		* @returns Boolean
  		*/
  var getAllowMultiple: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of allowToggle
  		* @returns Boolean
  		*/
  var getAllowToggle: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of layout
  		* @returns Object
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the currently pressed button s */
  var getPressed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of pressedButtons
  		* @returns Array
  		*/
  var getPressedButtons: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of pressedCls
  		* @returns String
  		*/
  var getPressedCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns true if a specified Ext Button is pressed
  		* @param button Ext.Button The button to check if pressed.
  		* @returns Boolean pressed
  		*/
  var isPressed: js.UndefOr[js.Function1[/* button */ js.UndefOr[IButton], scala.Boolean]] = js.undefined
  /** [Config Option] (Array) */
  var pressedButtons: js.UndefOr[Array] = js.undefined
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of allowDepress
  		* @param allowDepress Boolean The new value.
  		*/
  var setAllowDepress: js.UndefOr[js.Function1[/* allowDepress */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of allowMultiple
  		* @param allowMultiple Boolean The new value.
  		*/
  var setAllowMultiple: js.UndefOr[js.Function1[/* allowMultiple */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of allowToggle
  		* @param allowToggle Boolean The new value.
  		*/
  var setAllowToggle: js.UndefOr[js.Function1[/* allowToggle */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Activates a button
  		* @param button Number/String/Ext.Button The button to activate.
  		* @param pressed Boolean If defined, sets the pressed state of the button, otherwise the pressed state is toggled.
  		* @param suppressEvents Boolean true to suppress toggle events during the action. If allowMultiple is true, then setPressed will toggle the button state.
  		*/
  var setPressed: js.UndefOr[
    js.Function3[
      /* button */ js.UndefOr[js.Any], 
      /* pressed */ js.UndefOr[scala.Boolean], 
      /* suppressEvents */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of pressedButtons
  		* @param pressedButtons Array The new value.
  		*/
  var setPressedButtons: js.UndefOr[js.Function1[/* pressedButtons */ js.UndefOr[Array], scala.Unit]] = js.undefined
  /** [Method] Sets the value of pressedCls
  		* @param pressedCls String The new value.
  		*/
  var setPressedCls: js.UndefOr[js.Function1[/* pressedCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
}

