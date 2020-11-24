package typings.reactHotLoader.anon

import typings.react.mod.ComponentType
import typings.reactHotLoader.mod.HotError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-hot-loader.react-hot-loader.Config> */
@js.native
trait PartialConfig extends js.Object {
  
  var ErrorOverlay: js.UndefOr[ComponentType[Errors]] = js.native
  
  var allowSFC: js.UndefOr[Boolean] = js.native
  
  var disableHotRenderer: js.UndefOr[Boolean] = js.native
  
  var disableHotRendererWhenInjected: js.UndefOr[Boolean] = js.native
  
  var errorReporter: js.UndefOr[ComponentType[HotError]] = js.native
  
  var ignoreComponents: js.UndefOr[Boolean] = js.native
  
  var ignoreSFC: js.UndefOr[Boolean] = js.native
  
  var logLevel: js.UndefOr[String] = js.native
  
  var onComponentCreate: js.UndefOr[js.Function2[/* type */ js.Any, /* displayName */ String, _]] = js.native
  
  var onComponentRegister: js.UndefOr[
    js.Function3[/* type */ js.Any, /* uniqueLocalName */ String, /* fileName */ String, _]
  ] = js.native
  
  var pureRender: js.UndefOr[Boolean] = js.native
  
  var pureSFC: js.UndefOr[Boolean] = js.native
  
  var reloadHooks: js.UndefOr[Boolean] = js.native
  
  var showReactDomPatchNotification: js.UndefOr[Boolean] = js.native
  
  var trackTailUpdates: js.UndefOr[Boolean] = js.native
}
object PartialConfig {
  
  @scala.inline
  def apply(): PartialConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfig]
  }
  
  @scala.inline
  implicit class PartialConfigOps[Self <: PartialConfig] (val x: Self) extends AnyVal {
    
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
    def setErrorOverlay(value: ComponentType[Errors]): Self = this.set("ErrorOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorOverlay: Self = this.set("ErrorOverlay", js.undefined)
    
    @scala.inline
    def setAllowSFC(value: Boolean): Self = this.set("allowSFC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSFC: Self = this.set("allowSFC", js.undefined)
    
    @scala.inline
    def setDisableHotRenderer(value: Boolean): Self = this.set("disableHotRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableHotRenderer: Self = this.set("disableHotRenderer", js.undefined)
    
    @scala.inline
    def setDisableHotRendererWhenInjected(value: Boolean): Self = this.set("disableHotRendererWhenInjected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableHotRendererWhenInjected: Self = this.set("disableHotRendererWhenInjected", js.undefined)
    
    @scala.inline
    def setErrorReporter(value: ComponentType[HotError]): Self = this.set("errorReporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorReporter: Self = this.set("errorReporter", js.undefined)
    
    @scala.inline
    def setIgnoreComponents(value: Boolean): Self = this.set("ignoreComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreComponents: Self = this.set("ignoreComponents", js.undefined)
    
    @scala.inline
    def setIgnoreSFC(value: Boolean): Self = this.set("ignoreSFC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreSFC: Self = this.set("ignoreSFC", js.undefined)
    
    @scala.inline
    def setLogLevel(value: String): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setOnComponentCreate(value: (/* type */ js.Any, /* displayName */ String) => _): Self = this.set("onComponentCreate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnComponentCreate: Self = this.set("onComponentCreate", js.undefined)
    
    @scala.inline
    def setOnComponentRegister(value: (/* type */ js.Any, /* uniqueLocalName */ String, /* fileName */ String) => _): Self = this.set("onComponentRegister", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnComponentRegister: Self = this.set("onComponentRegister", js.undefined)
    
    @scala.inline
    def setPureRender(value: Boolean): Self = this.set("pureRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePureRender: Self = this.set("pureRender", js.undefined)
    
    @scala.inline
    def setPureSFC(value: Boolean): Self = this.set("pureSFC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePureSFC: Self = this.set("pureSFC", js.undefined)
    
    @scala.inline
    def setReloadHooks(value: Boolean): Self = this.set("reloadHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReloadHooks: Self = this.set("reloadHooks", js.undefined)
    
    @scala.inline
    def setShowReactDomPatchNotification(value: Boolean): Self = this.set("showReactDomPatchNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowReactDomPatchNotification: Self = this.set("showReactDomPatchNotification", js.undefined)
    
    @scala.inline
    def setTrackTailUpdates(value: Boolean): Self = this.set("trackTailUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackTailUpdates: Self = this.set("trackTailUpdates", js.undefined)
  }
}
