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
  
  var ignored: js.UndefOr[Any] = js.undefined
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var persistent: js.UndefOr[Boolean] = js.undefined
  
  var useFsEvents: js.UndefOr[Boolean] = js.undefined
  
  var usePolling: js.UndefOr[Boolean] = js.undefined
}
object ChokidarOptions {
  
  inline def apply(): ChokidarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChokidarOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChokidarOptions] (val x: Self) extends AnyVal {
    
    inline def setAlwaysStat(value: Boolean): Self = StObject.set(x, "alwaysStat", value.asInstanceOf[js.Any])
    
    inline def setAlwaysStatUndefined: Self = StObject.set(x, "alwaysStat", js.undefined)
    
    inline def setAtomic(value: Boolean | Double): Self = StObject.set(x, "atomic", value.asInstanceOf[js.Any])
    
    inline def setAtomicUndefined: Self = StObject.set(x, "atomic", js.undefined)
    
    inline def setAwaitWriteFinish(value: PollInterval | Boolean): Self = StObject.set(x, "awaitWriteFinish", value.asInstanceOf[js.Any])
    
    inline def setAwaitWriteFinishUndefined: Self = StObject.set(x, "awaitWriteFinish", js.undefined)
    
    inline def setBinaryInterval(value: Double): Self = StObject.set(x, "binaryInterval", value.asInstanceOf[js.Any])
    
    inline def setBinaryIntervalUndefined: Self = StObject.set(x, "binaryInterval", js.undefined)
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setDisableGlobbing(value: Boolean): Self = StObject.set(x, "disableGlobbing", value.asInstanceOf[js.Any])
    
    inline def setDisableGlobbingUndefined: Self = StObject.set(x, "disableGlobbing", js.undefined)
    
    inline def setFollowSymlinks(value: Boolean): Self = StObject.set(x, "followSymlinks", value.asInstanceOf[js.Any])
    
    inline def setFollowSymlinksUndefined: Self = StObject.set(x, "followSymlinks", js.undefined)
    
    inline def setIgnoreInitial(value: Boolean): Self = StObject.set(x, "ignoreInitial", value.asInstanceOf[js.Any])
    
    inline def setIgnoreInitialUndefined: Self = StObject.set(x, "ignoreInitial", js.undefined)
    
    inline def setIgnorePermissionErrors(value: Boolean): Self = StObject.set(x, "ignorePermissionErrors", value.asInstanceOf[js.Any])
    
    inline def setIgnorePermissionErrorsUndefined: Self = StObject.set(x, "ignorePermissionErrors", js.undefined)
    
    inline def setIgnored(value: Any): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    inline def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    inline def setUseFsEvents(value: Boolean): Self = StObject.set(x, "useFsEvents", value.asInstanceOf[js.Any])
    
    inline def setUseFsEventsUndefined: Self = StObject.set(x, "useFsEvents", js.undefined)
    
    inline def setUsePolling(value: Boolean): Self = StObject.set(x, "usePolling", value.asInstanceOf[js.Any])
    
    inline def setUsePollingUndefined: Self = StObject.set(x, "usePolling", js.undefined)
  }
}
