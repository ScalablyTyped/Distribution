package typings.storybookReactNative.previewMod

import typings.storybookReactNative.anon.BackgroundColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Params extends js.Object {
  
  var asyncStorage: js.UndefOr[AsyncStorage | Null] = js.native
  
  var disableWebsockets: Boolean = js.native
  
  var host: String = js.native
  
  var initialSelection: js.Any = js.native
  
  var isUIHidden: Boolean = js.native
  
  var keyboardAvoidingViewVerticalOffset: Double = js.native
  
  var onDeviceUI: Boolean = js.native
  
  var port: Double = js.native
  
  var query: String = js.native
  
  var resetStorybook: Boolean = js.native
  
  var secured: Boolean = js.native
  
  var shouldDisableKeyboardAvoidingView: Boolean = js.native
  
  var shouldPersistSelection: Boolean = js.native
  
  var tabOpen: Double = js.native
  
  var theme: BackgroundColor = js.native
}
object Params {
  
  @scala.inline
  def apply(
    disableWebsockets: Boolean,
    host: String,
    initialSelection: js.Any,
    isUIHidden: Boolean,
    keyboardAvoidingViewVerticalOffset: Double,
    onDeviceUI: Boolean,
    port: Double,
    query: String,
    resetStorybook: Boolean,
    secured: Boolean,
    shouldDisableKeyboardAvoidingView: Boolean,
    shouldPersistSelection: Boolean,
    tabOpen: Double,
    theme: BackgroundColor
  ): Params = {
    val __obj = js.Dynamic.literal(disableWebsockets = disableWebsockets.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], initialSelection = initialSelection.asInstanceOf[js.Any], isUIHidden = isUIHidden.asInstanceOf[js.Any], keyboardAvoidingViewVerticalOffset = keyboardAvoidingViewVerticalOffset.asInstanceOf[js.Any], onDeviceUI = onDeviceUI.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], resetStorybook = resetStorybook.asInstanceOf[js.Any], secured = secured.asInstanceOf[js.Any], shouldDisableKeyboardAvoidingView = shouldDisableKeyboardAvoidingView.asInstanceOf[js.Any], shouldPersistSelection = shouldPersistSelection.asInstanceOf[js.Any], tabOpen = tabOpen.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
  
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
    
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
    def setDisableWebsockets(value: Boolean): Self = this.set("disableWebsockets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialSelection(value: js.Any): Self = this.set("initialSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUIHidden(value: Boolean): Self = this.set("isUIHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardAvoidingViewVerticalOffset(value: Double): Self = this.set("keyboardAvoidingViewVerticalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDeviceUI(value: Boolean): Self = this.set("onDeviceUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetStorybook(value: Boolean): Self = this.set("resetStorybook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecured(value: Boolean): Self = this.set("secured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldDisableKeyboardAvoidingView(value: Boolean): Self = this.set("shouldDisableKeyboardAvoidingView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldPersistSelection(value: Boolean): Self = this.set("shouldPersistSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabOpen(value: Double): Self = this.set("tabOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: BackgroundColor): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncStorage(value: AsyncStorage): Self = this.set("asyncStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncStorage: Self = this.set("asyncStorage", js.undefined)
    
    @scala.inline
    def setAsyncStorageNull: Self = this.set("asyncStorage", null)
  }
}
