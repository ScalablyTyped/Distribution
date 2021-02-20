package typings.senchaTouch.Ext.form

import typings.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ITextMutableBuilder[Self <: IText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCapitalize(value: Boolean): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    @scala.inline
    def setAutoComplete(value: Boolean): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    @scala.inline
    def setAutoCorrect(value: Boolean): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    @scala.inline
    def setBlur(value: () => IText): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    @scala.inline
    def setFocus(value: () => IText): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setGetAutoCapitalize(value: () => Boolean): Self = StObject.set(x, "getAutoCapitalize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAutoCapitalizeUndefined: Self = StObject.set(x, "getAutoCapitalize", js.undefined)
    
    @scala.inline
    def setGetAutoComplete(value: () => Boolean): Self = StObject.set(x, "getAutoComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAutoCompleteUndefined: Self = StObject.set(x, "getAutoComplete", js.undefined)
    
    @scala.inline
    def setGetAutoCorrect(value: () => Boolean): Self = StObject.set(x, "getAutoCorrect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAutoCorrectUndefined: Self = StObject.set(x, "getAutoCorrect", js.undefined)
    
    @scala.inline
    def setGetMaxLength(value: () => Double): Self = StObject.set(x, "getMaxLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxLengthUndefined: Self = StObject.set(x, "getMaxLength", js.undefined)
    
    @scala.inline
    def setGetPlaceHolder(value: () => String): Self = StObject.set(x, "getPlaceHolder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPlaceHolderUndefined: Self = StObject.set(x, "getPlaceHolder", js.undefined)
    
    @scala.inline
    def setGetReadOnly(value: () => Boolean): Self = StObject.set(x, "getReadOnly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetReadOnlyUndefined: Self = StObject.set(x, "getReadOnly", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setPlaceHolder(value: String): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setReset(value: () => typings.senchaTouch.Ext.field.IField): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    @scala.inline
    def setSelect(value: () => IText): Self = StObject.set(x, "select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSetAutoCapitalize(value: /* autoCapitalize */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoCapitalize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutoCapitalizeUndefined: Self = StObject.set(x, "setAutoCapitalize", js.undefined)
    
    @scala.inline
    def setSetAutoComplete(value: /* autoComplete */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutoCompleteUndefined: Self = StObject.set(x, "setAutoComplete", js.undefined)
    
    @scala.inline
    def setSetAutoCorrect(value: /* autoCorrect */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoCorrect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutoCorrectUndefined: Self = StObject.set(x, "setAutoCorrect", js.undefined)
    
    @scala.inline
    def setSetBubbleEvents(value: /* bubbleEvents */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setBubbleEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBubbleEventsUndefined: Self = StObject.set(x, "setBubbleEvents", js.undefined)
    
    @scala.inline
    def setSetMaxLength(value: /* maxLength */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMaxLengthUndefined: Self = StObject.set(x, "setMaxLength", js.undefined)
    
    @scala.inline
    def setSetPlaceHolder(value: /* placeHolder */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setPlaceHolder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPlaceHolderUndefined: Self = StObject.set(x, "setPlaceHolder", js.undefined)
    
    @scala.inline
    def setSetReadOnly(value: /* readOnly */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetReadOnlyUndefined: Self = StObject.set(x, "setReadOnly", js.undefined)
    
    @scala.inline
    def setStartValue(value: js.Any): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
  }
}
