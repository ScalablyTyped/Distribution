package typings.rollup.mod

import typings.rollup.anon.PollInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChokidarOptions extends js.Object {
  
  var alwaysStat: js.UndefOr[Boolean] = js.native
  
  var atomic: js.UndefOr[Boolean | Double] = js.native
  
  var awaitWriteFinish: js.UndefOr[PollInterval | Boolean] = js.native
  
  var binaryInterval: js.UndefOr[Double] = js.native
  
  var cwd: js.UndefOr[String] = js.native
  
  var depth: js.UndefOr[Double] = js.native
  
  var disableGlobbing: js.UndefOr[Boolean] = js.native
  
  var followSymlinks: js.UndefOr[Boolean] = js.native
  
  var ignoreInitial: js.UndefOr[Boolean] = js.native
  
  var ignorePermissionErrors: js.UndefOr[Boolean] = js.native
  
  var ignored: js.UndefOr[js.Any] = js.native
  
  var interval: js.UndefOr[Double] = js.native
  
  var persistent: js.UndefOr[Boolean] = js.native
  
  var useFsEvents: js.UndefOr[Boolean] = js.native
  
  var usePolling: js.UndefOr[Boolean] = js.native
}
object ChokidarOptions {
  
  @scala.inline
  def apply(): ChokidarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChokidarOptions]
  }
  
  @scala.inline
  implicit class ChokidarOptionsOps[Self <: ChokidarOptions] (val x: Self) extends AnyVal {
    
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
    def setAlwaysStat(value: Boolean): Self = this.set("alwaysStat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysStat: Self = this.set("alwaysStat", js.undefined)
    
    @scala.inline
    def setAtomic(value: Boolean | Double): Self = this.set("atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtomic: Self = this.set("atomic", js.undefined)
    
    @scala.inline
    def setAwaitWriteFinish(value: PollInterval | Boolean): Self = this.set("awaitWriteFinish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwaitWriteFinish: Self = this.set("awaitWriteFinish", js.undefined)
    
    @scala.inline
    def setBinaryInterval(value: Double): Self = this.set("binaryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryInterval: Self = this.set("binaryInterval", js.undefined)
    
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setDisableGlobbing(value: Boolean): Self = this.set("disableGlobbing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableGlobbing: Self = this.set("disableGlobbing", js.undefined)
    
    @scala.inline
    def setFollowSymlinks(value: Boolean): Self = this.set("followSymlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowSymlinks: Self = this.set("followSymlinks", js.undefined)
    
    @scala.inline
    def setIgnoreInitial(value: Boolean): Self = this.set("ignoreInitial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreInitial: Self = this.set("ignoreInitial", js.undefined)
    
    @scala.inline
    def setIgnorePermissionErrors(value: Boolean): Self = this.set("ignorePermissionErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePermissionErrors: Self = this.set("ignorePermissionErrors", js.undefined)
    
    @scala.inline
    def setIgnored(value: js.Any): Self = this.set("ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnored: Self = this.set("ignored", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setPersistent(value: Boolean): Self = this.set("persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistent: Self = this.set("persistent", js.undefined)
    
    @scala.inline
    def setUseFsEvents(value: Boolean): Self = this.set("useFsEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseFsEvents: Self = this.set("useFsEvents", js.undefined)
    
    @scala.inline
    def setUsePolling(value: Boolean): Self = this.set("usePolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePolling: Self = this.set("usePolling", js.undefined)
  }
}
