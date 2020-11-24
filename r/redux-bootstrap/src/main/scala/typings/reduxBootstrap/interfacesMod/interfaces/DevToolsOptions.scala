package typings.reduxBootstrap.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevToolsOptions extends js.Object {
  
  var actionBlacklist: js.UndefOr[String | js.Array[String]] = js.native
  
  var actionCreators: js.UndefOr[js.Array[_] | js.Object] = js.native
  
  var actionSanitizer: js.UndefOr[js.Function] = js.native
  
  var actionWhitelist: js.UndefOr[String | js.Array[String]] = js.native
  
  var autoPause: js.UndefOr[Boolean] = js.native
  
  var features: js.UndefOr[js.Object] = js.native
  
  var latency: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var pauseActionType: js.UndefOr[String] = js.native
  
  var predicate: js.UndefOr[js.Function] = js.native
  
  var serialize: js.UndefOr[Boolean | js.Object] = js.native
  
  var shouldHotReload: js.UndefOr[Boolean] = js.native
  
  var shouldRecordChanges: js.UndefOr[Boolean] = js.native
  
  var shouldStartLocked: js.UndefOr[Boolean] = js.native
  
  var stateSanitizer: js.UndefOr[js.Function] = js.native
}
object DevToolsOptions {
  
  @scala.inline
  def apply(): DevToolsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevToolsOptions]
  }
  
  @scala.inline
  implicit class DevToolsOptionsOps[Self <: DevToolsOptions] (val x: Self) extends AnyVal {
    
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
    def setActionBlacklistVarargs(value: String*): Self = this.set("actionBlacklist", js.Array(value :_*))
    
    @scala.inline
    def setActionBlacklist(value: String | js.Array[String]): Self = this.set("actionBlacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionBlacklist: Self = this.set("actionBlacklist", js.undefined)
    
    @scala.inline
    def setActionCreatorsVarargs(value: js.Any*): Self = this.set("actionCreators", js.Array(value :_*))
    
    @scala.inline
    def setActionCreators(value: js.Array[_] | js.Object): Self = this.set("actionCreators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionCreators: Self = this.set("actionCreators", js.undefined)
    
    @scala.inline
    def setActionSanitizer(value: js.Function): Self = this.set("actionSanitizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionSanitizer: Self = this.set("actionSanitizer", js.undefined)
    
    @scala.inline
    def setActionWhitelistVarargs(value: String*): Self = this.set("actionWhitelist", js.Array(value :_*))
    
    @scala.inline
    def setActionWhitelist(value: String | js.Array[String]): Self = this.set("actionWhitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionWhitelist: Self = this.set("actionWhitelist", js.undefined)
    
    @scala.inline
    def setAutoPause(value: Boolean): Self = this.set("autoPause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPause: Self = this.set("autoPause", js.undefined)
    
    @scala.inline
    def setFeatures(value: js.Object): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setLatency(value: Double): Self = this.set("latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatency: Self = this.set("latency", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPauseActionType(value: String): Self = this.set("pauseActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseActionType: Self = this.set("pauseActionType", js.undefined)
    
    @scala.inline
    def setPredicate(value: js.Function): Self = this.set("predicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredicate: Self = this.set("predicate", js.undefined)
    
    @scala.inline
    def setSerialize(value: Boolean | js.Object): Self = this.set("serialize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
    
    @scala.inline
    def setShouldHotReload(value: Boolean): Self = this.set("shouldHotReload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldHotReload: Self = this.set("shouldHotReload", js.undefined)
    
    @scala.inline
    def setShouldRecordChanges(value: Boolean): Self = this.set("shouldRecordChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldRecordChanges: Self = this.set("shouldRecordChanges", js.undefined)
    
    @scala.inline
    def setShouldStartLocked(value: Boolean): Self = this.set("shouldStartLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldStartLocked: Self = this.set("shouldStartLocked", js.undefined)
    
    @scala.inline
    def setStateSanitizer(value: js.Function): Self = this.set("stateSanitizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateSanitizer: Self = this.set("stateSanitizer", js.undefined)
  }
}
