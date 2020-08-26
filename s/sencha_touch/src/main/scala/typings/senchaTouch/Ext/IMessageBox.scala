package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessageBox extends ISheet {
  /** [Method] Displays a standard read only message box with an OK button comparable to the basic JavaScript alert prompt
    * @param title String The title bar text.
    * @param message String The message box body text.
    * @param fn Function A callback function which is called when the dialog is dismissed by clicking on the configured buttons.
    * @param scope Object The scope (this reference) in which the callback is executed. Defaults to: the browser window
    * @returns Ext.MessageBox this
    */
  var alert: js.UndefOr[
    js.Function4[
      /* title */ js.UndefOr[java.lang.String], 
      /* message */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.native
  /** [Config Option] (Array/Object) */
  var buttons: js.UndefOr[js.Any] = js.native
  /** [Method] Displays a confirmation message box with Yes and No buttons comparable to JavaScript s confirm
    * @param title String The title bar text.
    * @param message String The message box body text.
    * @param fn Function A callback function which is called when the dialog is dismissed by clicking on the configured buttons.
    * @param scope Object The scope (this reference) in which the callback is executed. Defaults to: the browser window
    * @returns Ext.MessageBox this
    */
  var confirm: js.UndefOr[
    js.Function4[
      /* title */ js.UndefOr[java.lang.String], 
      /* message */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.native
  /** [Config Option] (Number) */
  var defaultTextHeight: js.UndefOr[Double] = js.native
  /** [Method] Returns the value of buttons
    * @returns Array/Object
    */
  var getButtons: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of defaultTextHeight
    * @returns Number
    */
  var getDefaultTextHeight: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of layout
    * @returns Object
    */
  var getLayout: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of prompt
    * @returns Object
    */
  var getPrompt: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of title
    * @returns String
    */
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Config Option] (String) */
  var icon: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var message: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var msg: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Object) */
  var prompt: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of buttons
    * @param buttons Array/Object The new value.
    */
  var setButtons: js.UndefOr[js.Function1[/* buttons */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of defaultTextHeight
    * @param defaultTextHeight Number The new value.
    */
  var setDefaultTextHeight: js.UndefOr[js.Function1[/* defaultTextHeight */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets icon
    * @param iconCls String A CSS class name or empty string to clear the icon.
    * @returns Ext.MessageBox this
    */
  var setIcon: js.UndefOr[js.Function1[/* iconCls */ js.UndefOr[java.lang.String], this.type]] = js.native
  /** [Method] Sets the value of iconCls
    * @param iconCls String The new value.
    */
  var setIconCls: js.UndefOr[js.Function1[/* iconCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of message
    * @param message String The new value.
    */
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of prompt
    * @param prompt Object The new value.
    */
  var setPrompt: js.UndefOr[js.Function1[/* prompt */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of title
    * @param title String The new value.
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.native
  /** [Method] Sets the value of message
    * @param message String The new value.
    * @returns Ext.MessageBox this
    */
  var updateText: js.UndefOr[js.Function1[/* message */ js.UndefOr[java.lang.String], this.type]] = js.native
}

object IMessageBox {
  @scala.inline
  def apply(): IMessageBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageBox]
  }
  @scala.inline
  implicit class IMessageBoxOps[Self <: IMessageBox] (val x: Self) extends AnyVal {
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
    def setAlert(
      value: (/* title */ js.UndefOr[java.lang.String], /* message */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMessageBox
    ): Self = this.set("alert", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAlert: Self = this.set("alert", js.undefined)
    @scala.inline
    def setButtons(value: js.Any): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setConfirm(
      value: (/* title */ js.UndefOr[java.lang.String], /* message */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMessageBox
    ): Self = this.set("confirm", js.Any.fromFunction4(value))
    @scala.inline
    def deleteConfirm: Self = this.set("confirm", js.undefined)
    @scala.inline
    def setDefaultTextHeight(value: Double): Self = this.set("defaultTextHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTextHeight: Self = this.set("defaultTextHeight", js.undefined)
    @scala.inline
    def setGetButtons(value: () => _): Self = this.set("getButtons", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetButtons: Self = this.set("getButtons", js.undefined)
    @scala.inline
    def setGetDefaultTextHeight(value: () => Double): Self = this.set("getDefaultTextHeight", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDefaultTextHeight: Self = this.set("getDefaultTextHeight", js.undefined)
    @scala.inline
    def setGetLayout(value: () => _): Self = this.set("getLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLayout: Self = this.set("getLayout", js.undefined)
    @scala.inline
    def setGetPrompt(value: () => _): Self = this.set("getPrompt", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPrompt: Self = this.set("getPrompt", js.undefined)
    @scala.inline
    def setGetTitle(value: () => java.lang.String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTitle: Self = this.set("getTitle", js.undefined)
    @scala.inline
    def setIcon(value: java.lang.String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconCls(value: java.lang.String): Self = this.set("iconCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconCls: Self = this.set("iconCls", js.undefined)
    @scala.inline
    def setMessage(value: java.lang.String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setMsg(value: java.lang.String): Self = this.set("msg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsg: Self = this.set("msg", js.undefined)
    @scala.inline
    def setPrompt(value: js.Any): Self = this.set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    @scala.inline
    def setSetButtons(value: /* buttons */ js.UndefOr[js.Any] => Unit): Self = this.set("setButtons", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetButtons: Self = this.set("setButtons", js.undefined)
    @scala.inline
    def setSetDefaultTextHeight(value: /* defaultTextHeight */ js.UndefOr[Double] => Unit): Self = this.set("setDefaultTextHeight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDefaultTextHeight: Self = this.set("setDefaultTextHeight", js.undefined)
    @scala.inline
    def setSetIcon(value: /* iconCls */ js.UndefOr[java.lang.String] => IMessageBox): Self = this.set("setIcon", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetIcon: Self = this.set("setIcon", js.undefined)
    @scala.inline
    def setSetIconCls(value: /* iconCls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setIconCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetIconCls: Self = this.set("setIconCls", js.undefined)
    @scala.inline
    def setSetMessage(value: /* message */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMessage: Self = this.set("setMessage", js.undefined)
    @scala.inline
    def setSetPrompt(value: /* prompt */ js.UndefOr[js.Any] => Unit): Self = this.set("setPrompt", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPrompt: Self = this.set("setPrompt", js.undefined)
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTitle: Self = this.set("setTitle", js.undefined)
    @scala.inline
    def setTitle(value: java.lang.String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUpdateText(value: /* message */ js.UndefOr[java.lang.String] => IMessageBox): Self = this.set("updateText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdateText: Self = this.set("updateText", js.undefined)
  }
  
}

