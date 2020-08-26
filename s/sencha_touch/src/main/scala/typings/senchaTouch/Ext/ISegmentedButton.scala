package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISegmentedButton extends IContainer {
  /** [Config Option] (Boolean) */
  var allowDepress: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var allowMultiple: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var allowToggle: js.UndefOr[Boolean] = js.native
  /** [Method] We override initItems so we can check for the pressed config  */
  var applyItems: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of allowDepress
    * @returns Boolean
    */
  var getAllowDepress: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of allowMultiple
    * @returns Boolean
    */
  var getAllowMultiple: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of allowToggle
    * @returns Boolean
    */
  var getAllowToggle: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of layout
    * @returns Object
    */
  var getLayout: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets the currently pressed button s */
  var getPressed: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of pressedButtons
    * @returns Array
    */
  var getPressedButtons: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of pressedCls
    * @returns String
    */
  var getPressedCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns true if a specified Ext Button is pressed
    * @param button Ext.Button The button to check if pressed.
    * @returns Boolean pressed
    */
  var isPressed: js.UndefOr[js.Function1[/* button */ js.UndefOr[IButton], Boolean]] = js.native
  /** [Config Option] (Array) */
  var pressedButtons: js.UndefOr[Array] = js.native
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[java.lang.String] = js.native
  /** [Method] Sets the value of allowDepress
    * @param allowDepress Boolean The new value.
    */
  var setAllowDepress: js.UndefOr[js.Function1[/* allowDepress */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of allowMultiple
    * @param allowMultiple Boolean The new value.
    */
  var setAllowMultiple: js.UndefOr[js.Function1[/* allowMultiple */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of allowToggle
    * @param allowToggle Boolean The new value.
    */
  var setAllowToggle: js.UndefOr[js.Function1[/* allowToggle */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Activates a button
    * @param button Number/String/Ext.Button The button to activate.
    * @param pressed Boolean If defined, sets the pressed state of the button, otherwise the pressed state is toggled.
    * @param suppressEvents Boolean true to suppress toggle events during the action. If allowMultiple is true, then setPressed will toggle the button state.
    */
  var setPressed: js.UndefOr[
    js.Function3[
      /* button */ js.UndefOr[js.Any], 
      /* pressed */ js.UndefOr[Boolean], 
      /* suppressEvents */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /** [Method] Sets the value of pressedButtons
    * @param pressedButtons Array The new value.
    */
  var setPressedButtons: js.UndefOr[js.Function1[/* pressedButtons */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of pressedCls
    * @param pressedCls String The new value.
    */
  var setPressedCls: js.UndefOr[js.Function1[/* pressedCls */ js.UndefOr[java.lang.String], Unit]] = js.native
}

object ISegmentedButton {
  @scala.inline
  def apply(): ISegmentedButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISegmentedButton]
  }
  @scala.inline
  implicit class ISegmentedButtonOps[Self <: ISegmentedButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowDepress(value: Boolean): Self = this.set("allowDepress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDepress: Self = this.set("allowDepress", js.undefined)
    @scala.inline
    def setAllowMultiple(value: Boolean): Self = this.set("allowMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMultiple: Self = this.set("allowMultiple", js.undefined)
    @scala.inline
    def setAllowToggle(value: Boolean): Self = this.set("allowToggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowToggle: Self = this.set("allowToggle", js.undefined)
    @scala.inline
    def setApplyItems(value: () => Unit): Self = this.set("applyItems", js.Any.fromFunction0(value))
    @scala.inline
    def deleteApplyItems: Self = this.set("applyItems", js.undefined)
    @scala.inline
    def setGetAllowDepress(value: () => Boolean): Self = this.set("getAllowDepress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAllowDepress: Self = this.set("getAllowDepress", js.undefined)
    @scala.inline
    def setGetAllowMultiple(value: () => Boolean): Self = this.set("getAllowMultiple", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAllowMultiple: Self = this.set("getAllowMultiple", js.undefined)
    @scala.inline
    def setGetAllowToggle(value: () => Boolean): Self = this.set("getAllowToggle", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAllowToggle: Self = this.set("getAllowToggle", js.undefined)
    @scala.inline
    def setGetLayout(value: () => _): Self = this.set("getLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLayout: Self = this.set("getLayout", js.undefined)
    @scala.inline
    def setGetPressed(value: () => Unit): Self = this.set("getPressed", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPressed: Self = this.set("getPressed", js.undefined)
    @scala.inline
    def setGetPressedButtons(value: () => Array): Self = this.set("getPressedButtons", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPressedButtons: Self = this.set("getPressedButtons", js.undefined)
    @scala.inline
    def setGetPressedCls(value: () => java.lang.String): Self = this.set("getPressedCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPressedCls: Self = this.set("getPressedCls", js.undefined)
    @scala.inline
    def setIsPressed(value: /* button */ js.UndefOr[IButton] => Boolean): Self = this.set("isPressed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsPressed: Self = this.set("isPressed", js.undefined)
    @scala.inline
    def setPressedButtons(value: Array): Self = this.set("pressedButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressedButtons: Self = this.set("pressedButtons", js.undefined)
    @scala.inline
    def setPressedCls(value: java.lang.String): Self = this.set("pressedCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressedCls: Self = this.set("pressedCls", js.undefined)
    @scala.inline
    def setSetAllowDepress(value: /* allowDepress */ js.UndefOr[Boolean] => Unit): Self = this.set("setAllowDepress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAllowDepress: Self = this.set("setAllowDepress", js.undefined)
    @scala.inline
    def setSetAllowMultiple(value: /* allowMultiple */ js.UndefOr[Boolean] => Unit): Self = this.set("setAllowMultiple", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAllowMultiple: Self = this.set("setAllowMultiple", js.undefined)
    @scala.inline
    def setSetAllowToggle(value: /* allowToggle */ js.UndefOr[Boolean] => Unit): Self = this.set("setAllowToggle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAllowToggle: Self = this.set("setAllowToggle", js.undefined)
    @scala.inline
    def setSetPressed(
      value: (/* button */ js.UndefOr[js.Any], /* pressed */ js.UndefOr[Boolean], /* suppressEvents */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("setPressed", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSetPressed: Self = this.set("setPressed", js.undefined)
    @scala.inline
    def setSetPressedButtons(value: /* pressedButtons */ js.UndefOr[Array] => Unit): Self = this.set("setPressedButtons", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPressedButtons: Self = this.set("setPressedButtons", js.undefined)
    @scala.inline
    def setSetPressedCls(value: /* pressedCls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setPressedCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPressedCls: Self = this.set("setPressedCls", js.undefined)
  }
  
}

