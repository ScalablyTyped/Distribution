package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.saucelabsStrings.`public restricted`
import typings.saucelabs.saucelabsStrings.complete
import typings.saucelabs.saucelabsStrings.error_
import typings.saucelabs.saucelabsStrings.failed
import typings.saucelabs.saucelabsStrings.passed
import typings.saucelabs.saucelabsStrings.public
import typings.saucelabs.saucelabsStrings.share
import typings.saucelabs.saucelabsStrings.team
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Job
  extends /* key */ StringDictionary[js.Any] {
  
  var assigned_tunnel_id: js.UndefOr[String] = js.native
  
  var automation_backend: js.UndefOr[String] = js.native
  
  var base_config: js.UndefOr[BaseConfig] = js.native
  
  var breakpointed: js.UndefOr[String] = js.native
  
  var browser: js.UndefOr[String] = js.native
  
  var browser_short_version: js.UndefOr[String] = js.native
  
  var browser_version: js.UndefOr[String] = js.native
  
  var build: js.UndefOr[String] = js.native
  
  var collects_automator_log: js.UndefOr[Boolean] = js.native
  
  var command_counts: js.UndefOr[CommandCountStats] = js.native
  
  var commands_not_successful: js.UndefOr[Double] = js.native
  
  var consolidated_status: js.UndefOr[error_ | passed | failed | complete] = js.native
  
  var creation_time: js.UndefOr[String] = js.native
  
  var `custom-data`: js.UndefOr[String] = js.native
  
  var deletion_time: js.UndefOr[String] = js.native
  
  var end_time: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var log_url: js.UndefOr[String] = js.native
  
  var manual: js.UndefOr[Boolean] = js.native
  
  var modification_time: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var os: js.UndefOr[String] = js.native
  
  var owner: js.UndefOr[String] = js.native
  
  var passed: js.UndefOr[Boolean] = js.native
  
  var proxied: js.UndefOr[Boolean] = js.native
  
  var proxy_host: js.UndefOr[Boolean] = js.native
  
  var public: js.UndefOr[typings.saucelabs.saucelabsStrings.public | (`public restricted`) | share | team] = js.native
  
  var record_screenshots: js.UndefOr[Boolean] = js.native
  
  var record_video: js.UndefOr[Boolean] = js.native
  
  var selenium_version: js.UndefOr[String] = js.native
  
  var start_time: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  var video_secret: js.UndefOr[String] = js.native
  
  var video_url: js.UndefOr[String] = js.native
}
object Job {
  
  @scala.inline
  def apply(id: String): Job = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
  
  @scala.inline
  implicit class JobOps[Self <: Job] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigned_tunnel_id(value: String): Self = this.set("assigned_tunnel_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssigned_tunnel_id: Self = this.set("assigned_tunnel_id", js.undefined)
    
    @scala.inline
    def setAutomation_backend(value: String): Self = this.set("automation_backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomation_backend: Self = this.set("automation_backend", js.undefined)
    
    @scala.inline
    def setBase_config(value: BaseConfig): Self = this.set("base_config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase_config: Self = this.set("base_config", js.undefined)
    
    @scala.inline
    def setBreakpointed(value: String): Self = this.set("breakpointed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakpointed: Self = this.set("breakpointed", js.undefined)
    
    @scala.inline
    def setBrowser(value: String): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    
    @scala.inline
    def setBrowser_short_version(value: String): Self = this.set("browser_short_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser_short_version: Self = this.set("browser_short_version", js.undefined)
    
    @scala.inline
    def setBrowser_version(value: String): Self = this.set("browser_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser_version: Self = this.set("browser_version", js.undefined)
    
    @scala.inline
    def setBuild(value: String): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuild: Self = this.set("build", js.undefined)
    
    @scala.inline
    def setCollects_automator_log(value: Boolean): Self = this.set("collects_automator_log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollects_automator_log: Self = this.set("collects_automator_log", js.undefined)
    
    @scala.inline
    def setCommand_counts(value: CommandCountStats): Self = this.set("command_counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand_counts: Self = this.set("command_counts", js.undefined)
    
    @scala.inline
    def setCommands_not_successful(value: Double): Self = this.set("commands_not_successful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommands_not_successful: Self = this.set("commands_not_successful", js.undefined)
    
    @scala.inline
    def setConsolidated_status(value: error_ | passed | failed | complete): Self = this.set("consolidated_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsolidated_status: Self = this.set("consolidated_status", js.undefined)
    
    @scala.inline
    def setCreation_time(value: String): Self = this.set("creation_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreation_time: Self = this.set("creation_time", js.undefined)
    
    @scala.inline
    def `setCustom-data`(value: String): Self = this.set("custom-data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCustom-data`: Self = this.set("custom-data", js.undefined)
    
    @scala.inline
    def setDeletion_time(value: String): Self = this.set("deletion_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletion_time: Self = this.set("deletion_time", js.undefined)
    
    @scala.inline
    def setEnd_time(value: String): Self = this.set("end_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd_time: Self = this.set("end_time", js.undefined)
    
    @scala.inline
    def setLog_url(value: String): Self = this.set("log_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog_url: Self = this.set("log_url", js.undefined)
    
    @scala.inline
    def setManual(value: Boolean): Self = this.set("manual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManual: Self = this.set("manual", js.undefined)
    
    @scala.inline
    def setModification_time(value: String): Self = this.set("modification_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModification_time: Self = this.set("modification_time", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOs: Self = this.set("os", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setPassed(value: Boolean): Self = this.set("passed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassed: Self = this.set("passed", js.undefined)
    
    @scala.inline
    def setProxied(value: Boolean): Self = this.set("proxied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxied: Self = this.set("proxied", js.undefined)
    
    @scala.inline
    def setProxy_host(value: Boolean): Self = this.set("proxy_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy_host: Self = this.set("proxy_host", js.undefined)
    
    @scala.inline
    def setPublic(value: public | (`public restricted`) | share | team): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
    
    @scala.inline
    def setRecord_screenshots(value: Boolean): Self = this.set("record_screenshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecord_screenshots: Self = this.set("record_screenshots", js.undefined)
    
    @scala.inline
    def setRecord_video(value: Boolean): Self = this.set("record_video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecord_video: Self = this.set("record_video", js.undefined)
    
    @scala.inline
    def setSelenium_version(value: String): Self = this.set("selenium_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelenium_version: Self = this.set("selenium_version", js.undefined)
    
    @scala.inline
    def setStart_time(value: String): Self = this.set("start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart_time: Self = this.set("start_time", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVideo_secret(value: String): Self = this.set("video_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo_secret: Self = this.set("video_secret", js.undefined)
    
    @scala.inline
    def setVideo_url(value: String): Self = this.set("video_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo_url: Self = this.set("video_url", js.undefined)
  }
}
