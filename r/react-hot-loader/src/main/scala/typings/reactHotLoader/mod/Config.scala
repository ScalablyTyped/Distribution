package typings.reactHotLoader.mod

import typings.react.mod.ComponentType
import typings.reactHotLoader.anon.Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  /**
    * Global error overlay
    */
  var ErrorOverlay: ComponentType[Errors] = js.native
  
  /**
    * Allows SFC to be used, enables "intermediate" components used by Relay, should be disabled for Preact
    */
  var allowSFC: Boolean = js.native
  
  /**
    * Disable "hot-replacement-render"
    */
  var disableHotRenderer: Boolean = js.native
  
  /**
    * Disable "hot-replacement-render" when injection into react-dom are made
    */
  var disableHotRendererWhenInjected: Boolean = js.native
  
  /**
    * default value for AppContainer errorOverlay
    */
  var errorReporter: ComponentType[HotError] = js.native
  
  /**
    * flag to completely disable RHL for Components
    */
  var ignoreComponents: Boolean = js.native
  
  /**
    * flag to completely disable RHL for SFC
    */
  var ignoreSFC: Boolean = js.native
  
  /**
    * Specify loglLevel, default to 'error', set it to false to disable logs.
    * Available levels: ['debug', 'log', 'warn', 'error']
    */
  var logLevel: String = js.native
  
  /**
    *
    * @param type {any} type being rendered. The first argument of React.createElement
    * @param displayName {string} type display name (if exists)
    */
  def onComponentCreate(`type`: js.Any, displayName: String): js.Any = js.native
  
  /**
    *
    * @param {any} type being registered. This could be ANY top level variable among project.
    * @param {string} uniqueLocalName - variable name
    * @param {string} fileName - origin file
    * @return {any}
    */
  def onComponentRegister(`type`: js.Any, uniqueLocalName: String, fileName: String): js.Any = js.native
  
  /**
    * keep render method unpatched, moving sideEffect to componentDidUpdate
    */
  var pureRender: Boolean = js.native
  
  /**
    *  Allows using SFC without changes. leading to some components not updated
    */
  var pureSFC: Boolean = js.native
  
  /**
    * enables or disables hooks treatment
    */
  var reloadHooks: Boolean = js.native
  
  /**
    * Show "hot-loader/react-dom" warning
    */
  var showReactDomPatchNotification: Boolean = js.native
  
  /**
    * Controls tail(deferred) update checking
    */
  var trackTailUpdates: Boolean = js.native
}
object Config {
  
  @scala.inline
  def apply(
    ErrorOverlay: ComponentType[Errors],
    allowSFC: Boolean,
    disableHotRenderer: Boolean,
    disableHotRendererWhenInjected: Boolean,
    errorReporter: ComponentType[HotError],
    ignoreComponents: Boolean,
    ignoreSFC: Boolean,
    logLevel: String,
    onComponentCreate: (js.Any, String) => js.Any,
    onComponentRegister: (js.Any, String, String) => js.Any,
    pureRender: Boolean,
    pureSFC: Boolean,
    reloadHooks: Boolean,
    showReactDomPatchNotification: Boolean,
    trackTailUpdates: Boolean
  ): Config = {
    val __obj = js.Dynamic.literal(ErrorOverlay = ErrorOverlay.asInstanceOf[js.Any], allowSFC = allowSFC.asInstanceOf[js.Any], disableHotRenderer = disableHotRenderer.asInstanceOf[js.Any], disableHotRendererWhenInjected = disableHotRendererWhenInjected.asInstanceOf[js.Any], errorReporter = errorReporter.asInstanceOf[js.Any], ignoreComponents = ignoreComponents.asInstanceOf[js.Any], ignoreSFC = ignoreSFC.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], onComponentCreate = js.Any.fromFunction2(onComponentCreate), onComponentRegister = js.Any.fromFunction3(onComponentRegister), pureRender = pureRender.asInstanceOf[js.Any], pureSFC = pureSFC.asInstanceOf[js.Any], reloadHooks = reloadHooks.asInstanceOf[js.Any], showReactDomPatchNotification = showReactDomPatchNotification.asInstanceOf[js.Any], trackTailUpdates = trackTailUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setAllowSFC(value: Boolean): Self = this.set("allowSFC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableHotRenderer(value: Boolean): Self = this.set("disableHotRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableHotRendererWhenInjected(value: Boolean): Self = this.set("disableHotRendererWhenInjected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorReporter(value: ComponentType[HotError]): Self = this.set("errorReporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreComponents(value: Boolean): Self = this.set("ignoreComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreSFC(value: Boolean): Self = this.set("ignoreSFC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevel(value: String): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnComponentCreate(value: (js.Any, String) => js.Any): Self = this.set("onComponentCreate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnComponentRegister(value: (js.Any, String, String) => js.Any): Self = this.set("onComponentRegister", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPureRender(value: Boolean): Self = this.set("pureRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPureSFC(value: Boolean): Self = this.set("pureSFC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReloadHooks(value: Boolean): Self = this.set("reloadHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowReactDomPatchNotification(value: Boolean): Self = this.set("showReactDomPatchNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackTailUpdates(value: Boolean): Self = this.set("trackTailUpdates", value.asInstanceOf[js.Any])
  }
}
