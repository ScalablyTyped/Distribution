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
import org.scalablytyped.runtime.StObject
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
  implicit class JobMutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssigned_tunnel_id(value: String): Self = StObject.set(x, "assigned_tunnel_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigned_tunnel_idUndefined: Self = StObject.set(x, "assigned_tunnel_id", js.undefined)
    
    @scala.inline
    def setAutomation_backend(value: String): Self = StObject.set(x, "automation_backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomation_backendUndefined: Self = StObject.set(x, "automation_backend", js.undefined)
    
    @scala.inline
    def setBase_config(value: BaseConfig): Self = StObject.set(x, "base_config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase_configUndefined: Self = StObject.set(x, "base_config", js.undefined)
    
    @scala.inline
    def setBreakpointed(value: String): Self = StObject.set(x, "breakpointed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointedUndefined: Self = StObject.set(x, "breakpointed", js.undefined)
    
    @scala.inline
    def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    @scala.inline
    def setBrowser_short_version(value: String): Self = StObject.set(x, "browser_short_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser_short_versionUndefined: Self = StObject.set(x, "browser_short_version", js.undefined)
    
    @scala.inline
    def setBrowser_version(value: String): Self = StObject.set(x, "browser_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser_versionUndefined: Self = StObject.set(x, "browser_version", js.undefined)
    
    @scala.inline
    def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    @scala.inline
    def setCollects_automator_log(value: Boolean): Self = StObject.set(x, "collects_automator_log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollects_automator_logUndefined: Self = StObject.set(x, "collects_automator_log", js.undefined)
    
    @scala.inline
    def setCommand_counts(value: CommandCountStats): Self = StObject.set(x, "command_counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand_countsUndefined: Self = StObject.set(x, "command_counts", js.undefined)
    
    @scala.inline
    def setCommands_not_successful(value: Double): Self = StObject.set(x, "commands_not_successful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommands_not_successfulUndefined: Self = StObject.set(x, "commands_not_successful", js.undefined)
    
    @scala.inline
    def setConsolidated_status(value: error_ | passed | failed | complete): Self = StObject.set(x, "consolidated_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsolidated_statusUndefined: Self = StObject.set(x, "consolidated_status", js.undefined)
    
    @scala.inline
    def setCreation_time(value: String): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreation_timeUndefined: Self = StObject.set(x, "creation_time", js.undefined)
    
    @scala.inline
    def `setCustom-data`(value: String): Self = StObject.set(x, "custom-data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCustom-dataUndefined`: Self = StObject.set(x, "custom-data", js.undefined)
    
    @scala.inline
    def setDeletion_time(value: String): Self = StObject.set(x, "deletion_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletion_timeUndefined: Self = StObject.set(x, "deletion_time", js.undefined)
    
    @scala.inline
    def setEnd_time(value: String): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_timeUndefined: Self = StObject.set(x, "end_time", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog_url(value: String): Self = StObject.set(x, "log_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog_urlUndefined: Self = StObject.set(x, "log_url", js.undefined)
    
    @scala.inline
    def setManual(value: Boolean): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
    
    @scala.inline
    def setModification_time(value: String): Self = StObject.set(x, "modification_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModification_timeUndefined: Self = StObject.set(x, "modification_time", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassedUndefined: Self = StObject.set(x, "passed", js.undefined)
    
    @scala.inline
    def setProxied(value: Boolean): Self = StObject.set(x, "proxied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxiedUndefined: Self = StObject.set(x, "proxied", js.undefined)
    
    @scala.inline
    def setProxy_host(value: Boolean): Self = StObject.set(x, "proxy_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxy_hostUndefined: Self = StObject.set(x, "proxy_host", js.undefined)
    
    @scala.inline
    def setPublic(value: public | (`public restricted`) | share | team): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    @scala.inline
    def setRecord_screenshots(value: Boolean): Self = StObject.set(x, "record_screenshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecord_screenshotsUndefined: Self = StObject.set(x, "record_screenshots", js.undefined)
    
    @scala.inline
    def setRecord_video(value: Boolean): Self = StObject.set(x, "record_video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecord_videoUndefined: Self = StObject.set(x, "record_video", js.undefined)
    
    @scala.inline
    def setSelenium_version(value: String): Self = StObject.set(x, "selenium_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelenium_versionUndefined: Self = StObject.set(x, "selenium_version", js.undefined)
    
    @scala.inline
    def setStart_time(value: String): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setVideo_secret(value: String): Self = StObject.set(x, "video_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_secretUndefined: Self = StObject.set(x, "video_secret", js.undefined)
    
    @scala.inline
    def setVideo_url(value: String): Self = StObject.set(x, "video_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_urlUndefined: Self = StObject.set(x, "video_url", js.undefined)
  }
}
