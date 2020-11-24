package typings.pulumiPulumi.settingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  val dryRun: js.UndefOr[Boolean] = js.native
  
  val engineAddr: js.UndefOr[String] = js.native
  
  val legacyApply: js.UndefOr[Boolean] = js.native
  
  val monitorAddr: js.UndefOr[String] = js.native
  
  val parallel: js.UndefOr[Double] = js.native
  
  val project: js.UndefOr[String] = js.native
  
  val queryMode: js.UndefOr[Boolean] = js.native
  
  val stack: js.UndefOr[String] = js.native
  
  /**
    * Directory containing the send/receive files for making synchronous invokes to the engine.
    */
  val syncDir: js.UndefOr[String] = js.native
  
  val testModeEnabled: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
    
    @scala.inline
    def setEngineAddr(value: String): Self = this.set("engineAddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineAddr: Self = this.set("engineAddr", js.undefined)
    
    @scala.inline
    def setLegacyApply(value: Boolean): Self = this.set("legacyApply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegacyApply: Self = this.set("legacyApply", js.undefined)
    
    @scala.inline
    def setMonitorAddr(value: String): Self = this.set("monitorAddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitorAddr: Self = this.set("monitorAddr", js.undefined)
    
    @scala.inline
    def setParallel(value: Double): Self = this.set("parallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    
    @scala.inline
    def setQueryMode(value: Boolean): Self = this.set("queryMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryMode: Self = this.set("queryMode", js.undefined)
    
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    
    @scala.inline
    def setSyncDir(value: String): Self = this.set("syncDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncDir: Self = this.set("syncDir", js.undefined)
    
    @scala.inline
    def setTestModeEnabled(value: Boolean): Self = this.set("testModeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestModeEnabled: Self = this.set("testModeEnabled", js.undefined)
  }
}
