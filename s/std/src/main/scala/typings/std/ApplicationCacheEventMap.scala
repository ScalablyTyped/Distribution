package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationCacheEventMap extends StObject {
  
  var cached: Event = js.native
  
  var checking: Event = js.native
  
  var downloading: Event = js.native
  
  var error: Event = js.native
  
  var noupdate: Event = js.native
  
  var obsolete: Event = js.native
  
  var progress: ProgressEvent[ApplicationCache] = js.native
  
  var updateready: Event = js.native
}
object ApplicationCacheEventMap {
  
  @scala.inline
  def apply(
    cached: Event,
    checking: Event,
    downloading: Event,
    error: Event,
    noupdate: Event,
    obsolete: Event,
    progress: ProgressEvent[ApplicationCache],
    updateready: Event
  ): ApplicationCacheEventMap = {
    val __obj = js.Dynamic.literal(cached = cached.asInstanceOf[js.Any], checking = checking.asInstanceOf[js.Any], downloading = downloading.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], noupdate = noupdate.asInstanceOf[js.Any], obsolete = obsolete.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], updateready = updateready.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCacheEventMap]
  }
  
  @scala.inline
  implicit class ApplicationCacheEventMapMutableBuilder[Self <: ApplicationCacheEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCached(value: Event): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecking(value: Event): Self = StObject.set(x, "checking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloading(value: Event): Self = StObject.set(x, "downloading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoupdate(value: Event): Self = StObject.set(x, "noupdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObsolete(value: Event): Self = StObject.set(x, "obsolete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: ProgressEvent[ApplicationCache]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateready(value: Event): Self = StObject.set(x, "updateready", value.asInstanceOf[js.Any])
  }
}
