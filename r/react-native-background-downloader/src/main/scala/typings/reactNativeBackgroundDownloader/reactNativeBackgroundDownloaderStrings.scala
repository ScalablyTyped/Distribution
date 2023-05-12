package typings.reactNativeBackgroundDownloader

import typings.reactNativeBackgroundDownloader.mod.DownloadTaskState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeBackgroundDownloaderStrings {
  
  @js.native
  sealed trait DONE
    extends StObject
       with DownloadTaskState
  inline def DONE: DONE = "DONE".asInstanceOf[DONE]
  
  @js.native
  sealed trait DOWNLOADING
    extends StObject
       with DownloadTaskState
  inline def DOWNLOADING: DOWNLOADING = "DOWNLOADING".asInstanceOf[DOWNLOADING]
  
  @js.native
  sealed trait FAILED
    extends StObject
       with DownloadTaskState
  inline def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @js.native
  sealed trait PAUSED
    extends StObject
       with DownloadTaskState
  inline def PAUSED: PAUSED = "PAUSED".asInstanceOf[PAUSED]
  
  @js.native
  sealed trait STOPPED
    extends StObject
       with DownloadTaskState
  inline def STOPPED: STOPPED = "STOPPED".asInstanceOf[STOPPED]
}
