package typings.senchaUnderscoreTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  ] = js.undefined
  /** [Config Option] (Array/Object) */
  var buttons: js.UndefOr[js.Any] = js.undefined
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
  ] = js.undefined
  /** [Config Option] (Number) */
  var defaultTextHeight: js.UndefOr[Double] = js.undefined
  /** [Method] Returns the value of buttons
  		* @returns Array/Object
  		*/
  var getButtons: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of defaultTextHeight
  		* @returns Number
  		*/
  var getDefaultTextHeight: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of layout
  		* @returns Object
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of prompt
  		* @returns Object
  		*/
  var getPrompt: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var msg: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var prompt: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of buttons
  		* @param buttons Array/Object The new value.
  		*/
  var setButtons: js.UndefOr[js.Function1[/* buttons */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of defaultTextHeight
  		* @param defaultTextHeight Number The new value.
  		*/
  var setDefaultTextHeight: js.UndefOr[js.Function1[/* defaultTextHeight */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets icon
  		* @param iconCls String A CSS class name or empty string to clear the icon.
  		* @returns Ext.MessageBox this
  		*/
  var setIcon: js.UndefOr[js.Function1[/* iconCls */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Method] Sets the value of iconCls
  		* @param iconCls String The new value.
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* iconCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of message
  		* @param message String The new value.
  		*/
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of prompt
  		* @param prompt Object The new value.
  		*/
  var setPrompt: js.UndefOr[js.Function1[/* prompt */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of message
  		* @param message String The new value.
  		* @returns Ext.MessageBox this
  		*/
  var updateText: js.UndefOr[js.Function1[/* message */ js.UndefOr[java.lang.String], this.type]] = js.undefined
}

object IMessageBox {
  @scala.inline
  def apply(
    ISheet: ISheet = null,
    alert: (/* title */ js.UndefOr[java.lang.String], /* message */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMessageBox = null,
    baseCls: java.lang.String = null,
    buttons: js.Any = null,
    confirm: (/* title */ js.UndefOr[java.lang.String], /* message */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMessageBox = null,
    defaultTextHeight: Int | Double = null,
    getBaseCls: () => java.lang.String = null,
    getButtons: () => _ = null,
    getDefaultTextHeight: () => Double = null,
    getLayout: () => _ = null,
    getPrompt: () => _ = null,
    getTitle: () => java.lang.String = null,
    getUi: () => java.lang.String = null,
    getZIndex: () => Double = null,
    hideAnimation: js.Any = null,
    icon: java.lang.String = null,
    iconCls: java.lang.String = null,
    layout: js.Any = null,
    message: java.lang.String = null,
    msg: java.lang.String = null,
    prompt: js.Any = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => Unit = null,
    setButtons: /* buttons */ js.UndefOr[js.Any] => Unit = null,
    setDefaultTextHeight: /* defaultTextHeight */ js.UndefOr[Double] => Unit = null,
    setHideAnimation: /* hideAnimation */ js.UndefOr[js.Any] => Unit = null,
    setIcon: /* iconCls */ js.UndefOr[java.lang.String] => IMessageBox = null,
    setIconCls: /* iconCls */ js.UndefOr[java.lang.String] => Unit = null,
    setLayout: /* layout */ js.UndefOr[js.Any] => Unit = null,
    setMessage: /* message */ js.UndefOr[java.lang.String] => Unit = null,
    setPrompt: /* prompt */ js.UndefOr[js.Any] => Unit = null,
    setShowAnimation: /* showAnimation */ js.UndefOr[js.Any] => Unit = null,
    setTitle: /* title */ js.UndefOr[java.lang.String] => Unit = null,
    setUi: /* ui */ js.UndefOr[java.lang.String] => Unit = null,
    setZIndex: /* zIndex */ js.UndefOr[Double] => Unit = null,
    show: /* config */ js.UndefOr[js.Any] => IMessageBox = null,
    showAnimation: js.Any = null,
    title: java.lang.String = null,
    ui: java.lang.String = null,
    updateText: /* message */ js.UndefOr[java.lang.String] => IMessageBox = null,
    zIndex: Int | Double = null
  ): IMessageBox = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ISheet)
    if (alert != null) __obj.updateDynamic("alert")(js.Any.fromFunction4(alert))
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (confirm != null) __obj.updateDynamic("confirm")(js.Any.fromFunction4(confirm))
    if (defaultTextHeight != null) __obj.updateDynamic("defaultTextHeight")(defaultTextHeight.asInstanceOf[js.Any])
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getButtons != null) __obj.updateDynamic("getButtons")(js.Any.fromFunction0(getButtons))
    if (getDefaultTextHeight != null) __obj.updateDynamic("getDefaultTextHeight")(js.Any.fromFunction0(getDefaultTextHeight))
    if (getLayout != null) __obj.updateDynamic("getLayout")(js.Any.fromFunction0(getLayout))
    if (getPrompt != null) __obj.updateDynamic("getPrompt")(js.Any.fromFunction0(getPrompt))
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (getUi != null) __obj.updateDynamic("getUi")(js.Any.fromFunction0(getUi))
    if (getZIndex != null) __obj.updateDynamic("getZIndex")(js.Any.fromFunction0(getZIndex))
    if (hideAnimation != null) __obj.updateDynamic("hideAnimation")(hideAnimation)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconCls != null) __obj.updateDynamic("iconCls")(iconCls)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (message != null) __obj.updateDynamic("message")(message)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setButtons != null) __obj.updateDynamic("setButtons")(js.Any.fromFunction1(setButtons))
    if (setDefaultTextHeight != null) __obj.updateDynamic("setDefaultTextHeight")(js.Any.fromFunction1(setDefaultTextHeight))
    if (setHideAnimation != null) __obj.updateDynamic("setHideAnimation")(js.Any.fromFunction1(setHideAnimation))
    if (setIcon != null) __obj.updateDynamic("setIcon")(js.Any.fromFunction1(setIcon))
    if (setIconCls != null) __obj.updateDynamic("setIconCls")(js.Any.fromFunction1(setIconCls))
    if (setLayout != null) __obj.updateDynamic("setLayout")(js.Any.fromFunction1(setLayout))
    if (setMessage != null) __obj.updateDynamic("setMessage")(js.Any.fromFunction1(setMessage))
    if (setPrompt != null) __obj.updateDynamic("setPrompt")(js.Any.fromFunction1(setPrompt))
    if (setShowAnimation != null) __obj.updateDynamic("setShowAnimation")(js.Any.fromFunction1(setShowAnimation))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1(setUi))
    if (setZIndex != null) __obj.updateDynamic("setZIndex")(js.Any.fromFunction1(setZIndex))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1(show))
    if (showAnimation != null) __obj.updateDynamic("showAnimation")(showAnimation)
    if (title != null) __obj.updateDynamic("title")(title)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    if (updateText != null) __obj.updateDynamic("updateText")(js.Any.fromFunction1(updateText))
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageBox]
  }
}

