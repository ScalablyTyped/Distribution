package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMessageBox
  extends StObject
     with ISheet {
  
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
  var getButtons: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of defaultTextHeight
    * @returns Number
    */
  var getDefaultTextHeight: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of layout
    * @returns Object
    */
  var getLayout: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of prompt
    * @returns Object
    */
  var getPrompt: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
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
  
  inline def apply(): IMessageBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageBox]
  }
  
  extension [Self <: IMessageBox](x: Self) {
    
    inline def setAlert(
      value: (/* title */ js.UndefOr[java.lang.String], /* message */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMessageBox
    ): Self = StObject.set(x, "alert", js.Any.fromFunction4(value))
    
    inline def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
    
    inline def setButtons(value: js.Any): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setConfirm(
      value: (/* title */ js.UndefOr[java.lang.String], /* message */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMessageBox
    ): Self = StObject.set(x, "confirm", js.Any.fromFunction4(value))
    
    inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
    
    inline def setDefaultTextHeight(value: Double): Self = StObject.set(x, "defaultTextHeight", value.asInstanceOf[js.Any])
    
    inline def setDefaultTextHeightUndefined: Self = StObject.set(x, "defaultTextHeight", js.undefined)
    
    inline def setGetButtons(value: () => js.Any): Self = StObject.set(x, "getButtons", js.Any.fromFunction0(value))
    
    inline def setGetButtonsUndefined: Self = StObject.set(x, "getButtons", js.undefined)
    
    inline def setGetDefaultTextHeight(value: () => Double): Self = StObject.set(x, "getDefaultTextHeight", js.Any.fromFunction0(value))
    
    inline def setGetDefaultTextHeightUndefined: Self = StObject.set(x, "getDefaultTextHeight", js.undefined)
    
    inline def setGetLayout(value: () => js.Any): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
    
    inline def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
    
    inline def setGetPrompt(value: () => js.Any): Self = StObject.set(x, "getPrompt", js.Any.fromFunction0(value))
    
    inline def setGetPromptUndefined: Self = StObject.set(x, "getPrompt", js.undefined)
    
    inline def setGetTitle(value: () => java.lang.String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    inline def setGetTitleUndefined: Self = StObject.set(x, "getTitle", js.undefined)
    
    inline def setIcon(value: java.lang.String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconCls(value: java.lang.String): Self = StObject.set(x, "iconCls", value.asInstanceOf[js.Any])
    
    inline def setIconClsUndefined: Self = StObject.set(x, "iconCls", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setMessage(value: java.lang.String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMsg(value: java.lang.String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
    
    inline def setPrompt(value: js.Any): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setSetButtons(value: /* buttons */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setButtons", js.Any.fromFunction1(value))
    
    inline def setSetButtonsUndefined: Self = StObject.set(x, "setButtons", js.undefined)
    
    inline def setSetDefaultTextHeight(value: /* defaultTextHeight */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setDefaultTextHeight", js.Any.fromFunction1(value))
    
    inline def setSetDefaultTextHeightUndefined: Self = StObject.set(x, "setDefaultTextHeight", js.undefined)
    
    inline def setSetIcon(value: /* iconCls */ js.UndefOr[java.lang.String] => IMessageBox): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
    
    inline def setSetIconCls(value: /* iconCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setIconCls", js.Any.fromFunction1(value))
    
    inline def setSetIconClsUndefined: Self = StObject.set(x, "setIconCls", js.undefined)
    
    inline def setSetIconUndefined: Self = StObject.set(x, "setIcon", js.undefined)
    
    inline def setSetMessage(value: /* message */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setMessage", js.Any.fromFunction1(value))
    
    inline def setSetMessageUndefined: Self = StObject.set(x, "setMessage", js.undefined)
    
    inline def setSetPrompt(value: /* prompt */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setPrompt", js.Any.fromFunction1(value))
    
    inline def setSetPromptUndefined: Self = StObject.set(x, "setPrompt", js.undefined)
    
    inline def setSetTitle(value: /* title */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    inline def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
    
    inline def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdateText(value: /* message */ js.UndefOr[java.lang.String] => IMessageBox): Self = StObject.set(x, "updateText", js.Any.fromFunction1(value))
    
    inline def setUpdateTextUndefined: Self = StObject.set(x, "updateText", js.undefined)
  }
}
