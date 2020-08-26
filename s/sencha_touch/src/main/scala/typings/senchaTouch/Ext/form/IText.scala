package typings.senchaTouch.Ext.form

import typings.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IText
  extends typings.senchaTouch.Ext.field.IField {
  /** [Config Option] (Boolean) */
  var autoCapitalize: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var autoComplete: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var autoCorrect: js.UndefOr[Boolean] = js.native
  /** [Method] Attempts to forcefully blur input focus for the field
    * @returns Ext.field.Text This field
    */
  var blur: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Attempts to set the field as the active input focus
    * @returns Ext.field.Text This field
    */
  var focus: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Returns the value of autoCapitalize
    * @returns Boolean
    */
  var getAutoCapitalize: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of autoComplete
    * @returns Boolean
    */
  var getAutoComplete: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of autoCorrect
    * @returns Boolean
    */
  var getAutoCorrect: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of maxLength
    * @returns Number
    */
  var getMaxLength: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of placeHolder
    * @returns String
    */
  var getPlaceHolder: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of readOnly
    * @returns Boolean
    */
  var getReadOnly: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Number) */
  var maxLength: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var placeHolder: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** [Method] Resets the current field value back to the original value on this field when it was created
    * @returns Ext.field.Field this
    */
  @JSName("reset")
  var reset_IText: js.UndefOr[js.Function0[typings.senchaTouch.Ext.field.IField]] = js.native
  /** [Method] Attempts to forcefully select all the contents of the input field
    * @returns Ext.field.Text this
    */
  var select: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Sets the value of autoCapitalize
    * @param autoCapitalize Boolean The new value.
    */
  var setAutoCapitalize: js.UndefOr[js.Function1[/* autoCapitalize */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of autoComplete
    * @param autoComplete Boolean The new value.
    */
  var setAutoComplete: js.UndefOr[js.Function1[/* autoComplete */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of autoCorrect
    * @param autoCorrect Boolean The new value.
    */
  var setAutoCorrect: js.UndefOr[js.Function1[/* autoCorrect */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of bubbleEvents
    * @param bubbleEvents Array The new value.
    */
  @JSName("setBubbleEvents")
  var setBubbleEvents_IText: js.UndefOr[js.Function1[/* bubbleEvents */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of maxLength
    * @param maxLength Number The new value.
    */
  var setMaxLength: js.UndefOr[js.Function1[/* maxLength */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of placeHolder
    * @param placeHolder String The new value.
    */
  var setPlaceHolder: js.UndefOr[js.Function1[/* placeHolder */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of readOnly
    * @param readOnly Boolean The new value.
    */
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Property] (String/Number) */
  var startValue: js.UndefOr[js.Any] = js.native
}

object IText {
  @scala.inline
  def apply(): IText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IText]
  }
  @scala.inline
  implicit class ITextOps[Self <: IText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoCapitalize(value: Boolean): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    @scala.inline
    def setAutoComplete(value: Boolean): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutoCorrect(value: Boolean): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    @scala.inline
    def setBlur(value: () => IText): Self = this.set("blur", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    @scala.inline
    def setFocus(value: () => IText): Self = this.set("focus", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setGetAutoCapitalize(value: () => Boolean): Self = this.set("getAutoCapitalize", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAutoCapitalize: Self = this.set("getAutoCapitalize", js.undefined)
    @scala.inline
    def setGetAutoComplete(value: () => Boolean): Self = this.set("getAutoComplete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAutoComplete: Self = this.set("getAutoComplete", js.undefined)
    @scala.inline
    def setGetAutoCorrect(value: () => Boolean): Self = this.set("getAutoCorrect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAutoCorrect: Self = this.set("getAutoCorrect", js.undefined)
    @scala.inline
    def setGetMaxLength(value: () => Double): Self = this.set("getMaxLength", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMaxLength: Self = this.set("getMaxLength", js.undefined)
    @scala.inline
    def setGetPlaceHolder(value: () => String): Self = this.set("getPlaceHolder", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPlaceHolder: Self = this.set("getPlaceHolder", js.undefined)
    @scala.inline
    def setGetReadOnly(value: () => Boolean): Self = this.set("getReadOnly", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetReadOnly: Self = this.set("getReadOnly", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setPlaceHolder(value: String): Self = this.set("placeHolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceHolder: Self = this.set("placeHolder", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setReset(value: () => typings.senchaTouch.Ext.field.IField): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setSelect(value: () => IText): Self = this.set("select", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSetAutoCapitalize(value: /* autoCapitalize */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoCapitalize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAutoCapitalize: Self = this.set("setAutoCapitalize", js.undefined)
    @scala.inline
    def setSetAutoComplete(value: /* autoComplete */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAutoComplete: Self = this.set("setAutoComplete", js.undefined)
    @scala.inline
    def setSetAutoCorrect(value: /* autoCorrect */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoCorrect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAutoCorrect: Self = this.set("setAutoCorrect", js.undefined)
    @scala.inline
    def setSetBubbleEvents(value: /* bubbleEvents */ js.UndefOr[Array] => Unit): Self = this.set("setBubbleEvents", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBubbleEvents: Self = this.set("setBubbleEvents", js.undefined)
    @scala.inline
    def setSetMaxLength(value: /* maxLength */ js.UndefOr[Double] => Unit): Self = this.set("setMaxLength", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxLength: Self = this.set("setMaxLength", js.undefined)
    @scala.inline
    def setSetPlaceHolder(value: /* placeHolder */ js.UndefOr[String] => Unit): Self = this.set("setPlaceHolder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPlaceHolder: Self = this.set("setPlaceHolder", js.undefined)
    @scala.inline
    def setSetReadOnly(value: /* readOnly */ js.UndefOr[Boolean] => Unit): Self = this.set("setReadOnly", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetReadOnly: Self = this.set("setReadOnly", js.undefined)
    @scala.inline
    def setStartValue(value: js.Any): Self = this.set("startValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartValue: Self = this.set("startValue", js.undefined)
  }
  
}

