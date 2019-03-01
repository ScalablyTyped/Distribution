package typings
package senchaUnderscoreTouchLib.ExtNs

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
  var defaultTextHeight: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Returns the value of buttons
  		* @returns Array/Object
  		*/
  var getButtons: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of defaultTextHeight
  		* @returns Number
  		*/
  var getDefaultTextHeight: js.UndefOr[js.Function0[scala.Double]] = js.undefined
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
  var setButtons: js.UndefOr[js.Function1[/* buttons */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of defaultTextHeight
  		* @param defaultTextHeight Number The new value.
  		*/
  var setDefaultTextHeight: js.UndefOr[js.Function1[/* defaultTextHeight */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets icon
  		* @param iconCls String A CSS class name or empty string to clear the icon.
  		* @returns Ext.MessageBox this
  		*/
  var setIcon: js.UndefOr[js.Function1[/* iconCls */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Method] Sets the value of iconCls
  		* @param iconCls String The new value.
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* iconCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of message
  		* @param message String The new value.
  		*/
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of prompt
  		* @param prompt Object The new value.
  		*/
  var setPrompt: js.UndefOr[js.Function1[/* prompt */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
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
    alert: js.Function4[
      /* title */ js.UndefOr[java.lang.String], 
      /* message */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      IMessageBox
    ] = null,
    baseCls: java.lang.String = null,
    buttons: js.Any = null,
    confirm: js.Function4[
      /* title */ js.UndefOr[java.lang.String], 
      /* message */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      IMessageBox
    ] = null,
    defaultTextHeight: scala.Int | scala.Double = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getButtons: js.Function0[_] = null,
    getDefaultTextHeight: js.Function0[scala.Double] = null,
    getLayout: js.Function0[_] = null,
    getPrompt: js.Function0[_] = null,
    getTitle: js.Function0[java.lang.String] = null,
    getUi: js.Function0[java.lang.String] = null,
    getZIndex: js.Function0[scala.Double] = null,
    hideAnimation: js.Any = null,
    icon: java.lang.String = null,
    iconCls: java.lang.String = null,
    layout: js.Any = null,
    message: java.lang.String = null,
    msg: java.lang.String = null,
    prompt: js.Any = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setButtons: js.Function1[/* buttons */ js.UndefOr[js.Any], scala.Unit] = null,
    setDefaultTextHeight: js.Function1[/* defaultTextHeight */ js.UndefOr[scala.Double], scala.Unit] = null,
    setHideAnimation: js.Function1[/* hideAnimation */ js.UndefOr[js.Any], scala.Unit] = null,
    setIcon: js.Function1[/* iconCls */ js.UndefOr[java.lang.String], IMessageBox] = null,
    setIconCls: js.Function1[/* iconCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setLayout: js.Function1[/* layout */ js.UndefOr[js.Any], scala.Unit] = null,
    setMessage: js.Function1[/* message */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setPrompt: js.Function1[/* prompt */ js.UndefOr[js.Any], scala.Unit] = null,
    setShowAnimation: js.Function1[/* showAnimation */ js.UndefOr[js.Any], scala.Unit] = null,
    setTitle: js.Function1[/* title */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setUi: js.Function1[/* ui */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setZIndex: js.Function1[/* zIndex */ js.UndefOr[scala.Double], scala.Unit] = null,
    show: js.Function1[/* config */ js.UndefOr[js.Any], IMessageBox] = null,
    showAnimation: js.Any = null,
    title: java.lang.String = null,
    ui: java.lang.String = null,
    updateText: js.Function1[/* message */ js.UndefOr[java.lang.String], IMessageBox] = null,
    zIndex: scala.Int | scala.Double = null
  ): IMessageBox = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ISheet)
    if (alert != null) __obj.updateDynamic("alert")(alert)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (confirm != null) __obj.updateDynamic("confirm")(confirm)
    if (defaultTextHeight != null) __obj.updateDynamic("defaultTextHeight")(defaultTextHeight.asInstanceOf[js.Any])
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getButtons != null) __obj.updateDynamic("getButtons")(getButtons)
    if (getDefaultTextHeight != null) __obj.updateDynamic("getDefaultTextHeight")(getDefaultTextHeight)
    if (getLayout != null) __obj.updateDynamic("getLayout")(getLayout)
    if (getPrompt != null) __obj.updateDynamic("getPrompt")(getPrompt)
    if (getTitle != null) __obj.updateDynamic("getTitle")(getTitle)
    if (getUi != null) __obj.updateDynamic("getUi")(getUi)
    if (getZIndex != null) __obj.updateDynamic("getZIndex")(getZIndex)
    if (hideAnimation != null) __obj.updateDynamic("hideAnimation")(hideAnimation)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconCls != null) __obj.updateDynamic("iconCls")(iconCls)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (message != null) __obj.updateDynamic("message")(message)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setButtons != null) __obj.updateDynamic("setButtons")(setButtons)
    if (setDefaultTextHeight != null) __obj.updateDynamic("setDefaultTextHeight")(setDefaultTextHeight)
    if (setHideAnimation != null) __obj.updateDynamic("setHideAnimation")(setHideAnimation)
    if (setIcon != null) __obj.updateDynamic("setIcon")(setIcon)
    if (setIconCls != null) __obj.updateDynamic("setIconCls")(setIconCls)
    if (setLayout != null) __obj.updateDynamic("setLayout")(setLayout)
    if (setMessage != null) __obj.updateDynamic("setMessage")(setMessage)
    if (setPrompt != null) __obj.updateDynamic("setPrompt")(setPrompt)
    if (setShowAnimation != null) __obj.updateDynamic("setShowAnimation")(setShowAnimation)
    if (setTitle != null) __obj.updateDynamic("setTitle")(setTitle)
    if (setUi != null) __obj.updateDynamic("setUi")(setUi)
    if (setZIndex != null) __obj.updateDynamic("setZIndex")(setZIndex)
    if (show != null) __obj.updateDynamic("show")(show)
    if (showAnimation != null) __obj.updateDynamic("showAnimation")(showAnimation)
    if (title != null) __obj.updateDynamic("title")(title)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    if (updateText != null) __obj.updateDynamic("updateText")(updateText)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageBox]
  }
}

