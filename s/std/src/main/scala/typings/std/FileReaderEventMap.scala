package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileReaderEventMap extends StObject {
  
  var abort: ProgressEvent[FileReader] = js.native
  
  var error: ProgressEvent[FileReader] = js.native
  
  var load: ProgressEvent[FileReader] = js.native
  
  var loadend: ProgressEvent[FileReader] = js.native
  
  var loadstart: ProgressEvent[FileReader] = js.native
  
  var progress: ProgressEvent[FileReader] = js.native
}
object FileReaderEventMap {
  
  @scala.inline
  def apply(
    abort: ProgressEvent[FileReader],
    error: ProgressEvent[FileReader],
    load: ProgressEvent[FileReader],
    loadend: ProgressEvent[FileReader],
    loadstart: ProgressEvent[FileReader],
    progress: ProgressEvent[FileReader]
  ): FileReaderEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileReaderEventMap]
  }
  
  @scala.inline
  implicit class FileReaderEventMapMutableBuilder[Self <: FileReaderEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: ProgressEvent[FileReader]): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: ProgressEvent[FileReader]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoad(value: ProgressEvent[FileReader]): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadend(value: ProgressEvent[FileReader]): Self = StObject.set(x, "loadend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadstart(value: ProgressEvent[FileReader]): Self = StObject.set(x, "loadstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: ProgressEvent[FileReader]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
  }
}
