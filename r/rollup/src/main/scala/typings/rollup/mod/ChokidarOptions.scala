package typings.rollup.mod

import typings.rollup.anon.PollInterval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChokidarOptions extends StObject {
  
  var alwaysStat: js.UndefOr[Boolean] = js.undefined
  
  var atomic: js.UndefOr[Boolean | Double] = js.undefined
  
  var awaitWriteFinish: js.UndefOr[PollInterval | Boolean] = js.undefined
  
  var binaryInterval: js.UndefOr[Double] = js.undefined
  
  var cwd: js.UndefOr[String] = js.undefined
  
  var depth: js.UndefOr[Double] = js.undefined
  
  var disableGlobbing: js.UndefOr[Boolean] = js.undefined
  
  var followSymlinks: js.UndefOr[Boolean] = js.undefined
  
  var ignoreInitial: js.UndefOr[Boolean] = js.undefined
  
  var ignorePermissionErrors: js.UndefOr[Boolean] = js.undefined
  
  var ignored: js.UndefOr[js.Any] = js.undefined
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var persistent: js.UndefOr[Boolean] = js.undefined
  
  var useFsEvents: js.UndefOr[Boolean] = js.undefined
  
  var usePolling: js.UndefOr[Boolean] = js.undefined
}
object ChokidarOptions {
  
  @scala.inline
  def apply(): ChokidarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChokidarOptions]
  }
  
  @scala.inline
  implicit class ChokidarOptionsMutableBuilder[Self <: ChokidarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysStat(value: Boolean): Self = StObject.set(x, "alwaysStat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysStatUndefined: Self = StObject.set(x, "alwaysStat", js.undefined)
    
    @scala.inline
    def setAtomic(value: Boolean | Double): Self = StObject.set(x, "atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtomicUndefined: Self = StObject.set(x, "atomic", js.undefined)
    
    @scala.inline
    def setAwaitWriteFinish(value: PollInterval | Boolean): Self = StObject.set(x, "awaitWriteFinish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwaitWriteFinishUndefined: Self = StObject.set(x, "awaitWriteFinish", js.undefined)
    
    @scala.inline
    def setBinaryInterval(value: Double): Self = StObject.set(x, "binaryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryIntervalUndefined: Self = StObject.set(x, "binaryInterval", js.undefined)
    
    @scala.inline
    def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setDisableGlobbing(value: Boolean): Self = StObject.set(x, "disableGlobbing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableGlobbingUndefined: Self = StObject.set(x, "disableGlobbing", js.undefined)
    
    @scala.inline
    def setFollowSymlinks(value: Boolean): Self = StObject.set(x, "followSymlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowSymlinksUndefined: Self = StObject.set(x, "followSymlinks", js.undefined)
    
    @scala.inline
    def setIgnoreInitial(value: Boolean): Self = StObject.set(x, "ignoreInitial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreInitialUndefined: Self = StObject.set(x, "ignoreInitial", js.undefined)
    
    @scala.inline
    def setIgnorePermissionErrors(value: Boolean): Self = StObject.set(x, "ignorePermissionErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorePermissionErrorsUndefined: Self = StObject.set(x, "ignorePermissionErrors", js.undefined)
    
    @scala.inline
    def setIgnored(value: js.Any): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    @scala.inline
    def setUseFsEvents(value: Boolean): Self = StObject.set(x, "useFsEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFsEventsUndefined: Self = StObject.set(x, "useFsEvents", js.undefined)
    
    @scala.inline
    def setUsePolling(value: Boolean): Self = StObject.set(x, "usePolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePollingUndefined: Self = StObject.set(x, "usePolling", js.undefined)
  }
}
