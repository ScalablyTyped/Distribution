package typings.reactNativeBackgroundDownloader

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-background-downloader", JSImport.Default)
  @js.native
  val default: RNBackgroundDownloader = js.native
  
  @js.native
  sealed trait DownloadTaskState extends StObject
  @JSImport("react-native-background-downloader", "DownloadTaskState")
  @js.native
  object DownloadTaskState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DownloadTaskState & String] = js.native
    
    @js.native
    sealed trait DONE
      extends StObject
         with DownloadTaskState
    /* "DONE" */ val DONE: typings.reactNativeBackgroundDownloader.mod.DownloadTaskState.DONE & String = js.native
    
    @js.native
    sealed trait DOWNLOADING
      extends StObject
         with DownloadTaskState
    /* "DOWNLOADING" */ val DOWNLOADING: typings.reactNativeBackgroundDownloader.mod.DownloadTaskState.DOWNLOADING & String = js.native
    
    @js.native
    sealed trait FAILED
      extends StObject
         with DownloadTaskState
    /* "FAILED" */ val FAILED: typings.reactNativeBackgroundDownloader.mod.DownloadTaskState.FAILED & String = js.native
    
    @js.native
    sealed trait PAUSED
      extends StObject
         with DownloadTaskState
    /* "PAUSED" */ val PAUSED: typings.reactNativeBackgroundDownloader.mod.DownloadTaskState.PAUSED & String = js.native
    
    @js.native
    sealed trait STOPPED
      extends StObject
         with DownloadTaskState
    /* "STOPPED" */ val STOPPED: typings.reactNativeBackgroundDownloader.mod.DownloadTaskState.STOPPED & String = js.native
  }
  
  trait Network extends StObject {
    
    var ALL: String
    
    var WIFI_ONLY: String
  }
  object Network {
    
    @JSImport("react-native-background-downloader", "Network")
    @js.native
    val ^ : Network = js.native
    
    extension [Self <: Network](x: Self) {
      
      inline def setALL(value: String): Self = StObject.set(x, "ALL", value.asInstanceOf[js.Any])
      
      inline def setWIFI_ONLY(value: String): Self = StObject.set(x, "WIFI_ONLY", value.asInstanceOf[js.Any])
    }
  }
  
  trait Priority extends StObject {
    
    var HIGH: String
    
    var LOW: String
    
    var MEDIUM: String
  }
  object Priority {
    
    @JSImport("react-native-background-downloader", "Priority")
    @js.native
    val ^ : Priority = js.native
    
    extension [Self <: Priority](x: Self) {
      
      inline def setHIGH(value: String): Self = StObject.set(x, "HIGH", value.asInstanceOf[js.Any])
      
      inline def setLOW(value: String): Self = StObject.set(x, "LOW", value.asInstanceOf[js.Any])
      
      inline def setMEDIUM(value: String): Self = StObject.set(x, "MEDIUM", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("react-native-background-downloader", "checkForExistingDownloads")
  @js.native
  val checkForExistingDownloads: CheckForExistingDownloads_ = js.native
  
  @JSImport("react-native-background-downloader", "directories")
  @js.native
  val directories: Directories_ = js.native
  
  @JSImport("react-native-background-downloader", "download")
  @js.native
  val download: Download_ = js.native
  
  @JSImport("react-native-background-downloader", "setHeaders")
  @js.native
  val setHeaders: SetHeaders_ = js.native
  
  type BeginHandler = js.Function1[/* expectedBytes */ Double, Any]
  
  type CheckForExistingDownloads_ = js.Function0[js.Promise[js.Array[DownloadTask]]]
  
  trait Directories_ extends StObject {
    
    var documents: String
  }
  object Directories_ {
    
    inline def apply(documents: String): Directories_ = {
      val __obj = js.Dynamic.literal(documents = documents.asInstanceOf[js.Any])
      __obj.asInstanceOf[Directories_]
    }
    
    extension [Self <: Directories_](x: Self) {
      
      inline def setDocuments(value: String): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    }
  }
  
  type DoneHandler = js.Function0[Any]
  
  type DownloadHeaders = StringDictionary[String | Null]
  
  trait DownloadOption extends StObject {
    
    var destination: String
    
    var headers: js.UndefOr[DownloadHeaders] = js.undefined
    
    var id: String
    
    var url: String
  }
  object DownloadOption {
    
    inline def apply(destination: String, id: String, url: String): DownloadOption = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadOption]
    }
    
    extension [Self <: DownloadOption](x: Self) {
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: DownloadHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait DownloadTask extends StObject {
    
    def _beginHandler(expectedBytes: Double): Any
    @JSName("_beginHandler")
    var _beginHandler_Original: BeginHandler
    
    def _doneHandler(): Any
    @JSName("_doneHandler")
    var _doneHandler_Original: DoneHandler
    
    def _errorHandler(error: Any, errorCode: Any): Any
    @JSName("_errorHandler")
    var _errorHandler_Original: ErrorHandler
    
    def _progressHandler(percent: Double, bytesWritten: Double, totalBytes: Double): Any
    @JSName("_progressHandler")
    var _progressHandler_Original: ProgressHandler
    
    def begin(handler: BeginHandler): DownloadTask
    
    var bytesWritten: Double
    
    def done(handler: DoneHandler): DownloadTask
    
    def error(handler: ErrorHandler): DownloadTask
    
    var id: String
    
    def pause(): Any
    
    var percent: Double
    
    def progress(handler: ProgressHandler): DownloadTask
    
    def resume(): Any
    
    var state: DownloadTaskState
    
    def stop(): Any
    
    var totalBytes: Double
  }
  object DownloadTask {
    
    inline def apply(
      _beginHandler: /* expectedBytes */ Double => Any,
      _doneHandler: () => Any,
      _errorHandler: (/* error */ Any, /* errorCode */ Any) => Any,
      _progressHandler: (/* percent */ Double, /* bytesWritten */ Double, /* totalBytes */ Double) => Any,
      begin: BeginHandler => DownloadTask,
      bytesWritten: Double,
      done: DoneHandler => DownloadTask,
      error: ErrorHandler => DownloadTask,
      id: String,
      pause: () => Any,
      percent: Double,
      progress: ProgressHandler => DownloadTask,
      resume: () => Any,
      state: DownloadTaskState,
      stop: () => Any,
      totalBytes: Double
    ): DownloadTask = {
      val __obj = js.Dynamic.literal(_beginHandler = js.Any.fromFunction1(_beginHandler), _doneHandler = js.Any.fromFunction0(_doneHandler), _errorHandler = js.Any.fromFunction2(_errorHandler), _progressHandler = js.Any.fromFunction3(_progressHandler), begin = js.Any.fromFunction1(begin), bytesWritten = bytesWritten.asInstanceOf[js.Any], done = js.Any.fromFunction1(done), error = js.Any.fromFunction1(error), id = id.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), percent = percent.asInstanceOf[js.Any], progress = js.Any.fromFunction1(progress), resume = js.Any.fromFunction0(resume), state = state.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), totalBytes = totalBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadTask]
    }
    
    extension [Self <: DownloadTask](x: Self) {
      
      inline def setBegin(value: BeginHandler => DownloadTask): Self = StObject.set(x, "begin", js.Any.fromFunction1(value))
      
      inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
      
      inline def setDone(value: DoneHandler => DownloadTask): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
      
      inline def setError(value: ErrorHandler => DownloadTask): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPause(value: () => Any): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: ProgressHandler => DownloadTask): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
      
      inline def setResume(value: () => Any): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      inline def setState(value: DownloadTaskState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStop(value: () => Any): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
      
      inline def set_beginHandler(value: /* expectedBytes */ Double => Any): Self = StObject.set(x, "_beginHandler", js.Any.fromFunction1(value))
      
      inline def set_doneHandler(value: () => Any): Self = StObject.set(x, "_doneHandler", js.Any.fromFunction0(value))
      
      inline def set_errorHandler(value: (/* error */ Any, /* errorCode */ Any) => Any): Self = StObject.set(x, "_errorHandler", js.Any.fromFunction2(value))
      
      inline def set_progressHandler(value: (/* percent */ Double, /* bytesWritten */ Double, /* totalBytes */ Double) => Any): Self = StObject.set(x, "_progressHandler", js.Any.fromFunction3(value))
    }
  }
  
  type Download_ = js.Function1[/* options */ DownloadOption, DownloadTask]
  
  type ErrorHandler = js.Function2[/* error */ Any, /* errorCode */ Any, Any]
  
  type ProgressHandler = js.Function3[/* percent */ Double, /* bytesWritten */ Double, /* totalBytes */ Double, Any]
  
  trait RNBackgroundDownloader extends StObject {
    
    var Network: typings.reactNativeBackgroundDownloader.mod.Network
    
    var Priority: typings.reactNativeBackgroundDownloader.mod.Priority
    
    def checkForExistingDownloads(): js.Promise[js.Array[DownloadTask]]
    @JSName("checkForExistingDownloads")
    var checkForExistingDownloads_Original: CheckForExistingDownloads_
    
    var directories: Directories_
    
    def download(options: DownloadOption): DownloadTask
    @JSName("download")
    var download_Original: Download_
    
    def setHeaders(h: DownloadHeaders): Unit
    @JSName("setHeaders")
    var setHeaders_Original: SetHeaders_
  }
  object RNBackgroundDownloader {
    
    inline def apply(
      Network: Network,
      Priority: Priority,
      checkForExistingDownloads: () => js.Promise[js.Array[DownloadTask]],
      directories: Directories_,
      download: /* options */ DownloadOption => DownloadTask,
      setHeaders: /* h */ DownloadHeaders => Unit
    ): RNBackgroundDownloader = {
      val __obj = js.Dynamic.literal(Network = Network.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], checkForExistingDownloads = js.Any.fromFunction0(checkForExistingDownloads), directories = directories.asInstanceOf[js.Any], download = js.Any.fromFunction1(download), setHeaders = js.Any.fromFunction1(setHeaders))
      __obj.asInstanceOf[RNBackgroundDownloader]
    }
    
    extension [Self <: RNBackgroundDownloader](x: Self) {
      
      inline def setCheckForExistingDownloads(value: () => js.Promise[js.Array[DownloadTask]]): Self = StObject.set(x, "checkForExistingDownloads", js.Any.fromFunction0(value))
      
      inline def setDirectories(value: Directories_): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      inline def setDownload(value: /* options */ DownloadOption => DownloadTask): Self = StObject.set(x, "download", js.Any.fromFunction1(value))
      
      inline def setNetwork(value: Network): Self = StObject.set(x, "Network", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Priority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
      
      inline def setSetHeaders(value: /* h */ DownloadHeaders => Unit): Self = StObject.set(x, "setHeaders", js.Any.fromFunction1(value))
    }
  }
  
  type SetHeaders_ = js.Function1[/* h */ DownloadHeaders, Unit]
  
  type TaskInfo = String | TaskInfoObject
  
  trait TaskInfoObject extends StObject {
    
    var bytesWritten: Double
    
    var id: String
    
    var percent: Double
    
    var totalBytes: Double
  }
  object TaskInfoObject {
    
    inline def apply(bytesWritten: Double, id: String, percent: Double, totalBytes: Double): TaskInfoObject = {
      val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskInfoObject]
    }
    
    extension [Self <: TaskInfoObject](x: Self) {
      
      inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = RNBackgroundDownloader
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: RNBackgroundDownloader = default
}
