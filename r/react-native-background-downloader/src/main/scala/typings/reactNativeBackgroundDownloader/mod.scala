package typings.reactNativeBackgroundDownloader

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    def apply(value: String): js.UndefOr[DownloadTaskState with String] = js.native
    
    @js.native
    sealed trait DONE extends DownloadTaskState
    /* "DONE" */ val DONE: typings.reactNativeBackgroundDownloader.mod.DownloadTaskState.DONE with String = js.native
    
    @js.native
    sealed trait DOWNLOADING extends DownloadTaskState
    /* "DOWNLOADING" */ val DOWNLOADING: typings.reactNativeBackgroundDownloader.mod.DownloadTaskState.DOWNLOADING with String = js.native
    
    @js.native
    sealed trait FAILED extends DownloadTaskState
    /* "FAILED" */ val FAILED: typings.reactNativeBackgroundDownloader.mod.DownloadTaskState.FAILED with String = js.native
    
    @js.native
    sealed trait PAUSED extends DownloadTaskState
    /* "PAUSED" */ val PAUSED: typings.reactNativeBackgroundDownloader.mod.DownloadTaskState.PAUSED with String = js.native
    
    @js.native
    sealed trait STOPPED extends DownloadTaskState
    /* "STOPPED" */ val STOPPED: typings.reactNativeBackgroundDownloader.mod.DownloadTaskState.STOPPED with String = js.native
  }
  
  @js.native
  trait Network extends StObject {
    
    var ALL: String = js.native
    
    var WIFI_ONLY: String = js.native
  }
  object Network {
    
    @JSImport("react-native-background-downloader", "Network")
    @js.native
    val ^ : Network = js.native
    
    @scala.inline
    implicit class NetworkMutableBuilder[Self <: Network] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setALL(value: String): Self = StObject.set(x, "ALL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWIFI_ONLY(value: String): Self = StObject.set(x, "WIFI_ONLY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Priority extends StObject {
    
    var HIGH: String = js.native
    
    var LOW: String = js.native
    
    var MEDIUM: String = js.native
  }
  object Priority {
    
    @JSImport("react-native-background-downloader", "Priority")
    @js.native
    val ^ : Priority = js.native
    
    @scala.inline
    implicit class PriorityMutableBuilder[Self <: Priority] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHIGH(value: String): Self = StObject.set(x, "HIGH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLOW(value: String): Self = StObject.set(x, "LOW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMEDIUM(value: String): Self = StObject.set(x, "MEDIUM", value.asInstanceOf[js.Any])
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
  
  type BeginHandler = js.Function1[/* expectedBytes */ Double, js.Any]
  
  type CheckForExistingDownloads_ = js.Function0[js.Promise[js.Array[DownloadTask]]]
  
  @js.native
  trait Directories_ extends StObject {
    
    var documents: String = js.native
  }
  object Directories_ {
    
    @scala.inline
    def apply(documents: String): Directories_ = {
      val __obj = js.Dynamic.literal(documents = documents.asInstanceOf[js.Any])
      __obj.asInstanceOf[Directories_]
    }
    
    @scala.inline
    implicit class Directories_MutableBuilder[Self <: Directories_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocuments(value: String): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    }
  }
  
  type DoneHandler = js.Function0[js.Any]
  
  type DownloadHeaders = StringDictionary[String | Null]
  
  @js.native
  trait DownloadOption extends StObject {
    
    var destination: String = js.native
    
    var headers: js.UndefOr[DownloadHeaders] = js.native
    
    var id: String = js.native
    
    var url: String = js.native
  }
  object DownloadOption {
    
    @scala.inline
    def apply(destination: String, id: String, url: String): DownloadOption = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadOption]
    }
    
    @scala.inline
    implicit class DownloadOptionMutableBuilder[Self <: DownloadOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: DownloadHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DownloadTask extends StObject {
    
    def _beginHandler(expectedBytes: Double): js.Any = js.native
    @JSName("_beginHandler")
    var _beginHandler_Original: BeginHandler = js.native
    
    def _doneHandler(): js.Any = js.native
    @JSName("_doneHandler")
    var _doneHandler_Original: DoneHandler = js.native
    
    def _errorHandler(error: js.Any, errorCode: js.Any): js.Any = js.native
    @JSName("_errorHandler")
    var _errorHandler_Original: ErrorHandler = js.native
    
    def _progressHandler(percent: Double, bytesWritten: Double, totalBytes: Double): js.Any = js.native
    @JSName("_progressHandler")
    var _progressHandler_Original: ProgressHandler = js.native
    
    def begin(handler: BeginHandler): DownloadTask = js.native
    
    var bytesWritten: Double = js.native
    
    def done(handler: DoneHandler): DownloadTask = js.native
    
    def error(handler: ErrorHandler): DownloadTask = js.native
    
    var id: String = js.native
    
    def pause(): js.Any = js.native
    
    var percent: Double = js.native
    
    def progress(handler: ProgressHandler): DownloadTask = js.native
    
    def resume(): js.Any = js.native
    
    var state: DownloadTaskState = js.native
    
    def stop(): js.Any = js.native
    
    var totalBytes: Double = js.native
  }
  
  type Download_ = js.Function1[/* options */ DownloadOption, DownloadTask]
  
  type ErrorHandler = js.Function2[/* error */ js.Any, /* errorCode */ js.Any, js.Any]
  
  type ProgressHandler = js.Function3[/* percent */ Double, /* bytesWritten */ Double, /* totalBytes */ Double, js.Any]
  
  @js.native
  trait RNBackgroundDownloader extends StObject {
    
    var Network: typings.reactNativeBackgroundDownloader.mod.Network = js.native
    
    var Priority: typings.reactNativeBackgroundDownloader.mod.Priority = js.native
    
    def checkForExistingDownloads(): js.Promise[js.Array[DownloadTask]] = js.native
    @JSName("checkForExistingDownloads")
    var checkForExistingDownloads_Original: CheckForExistingDownloads_ = js.native
    
    var directories: Directories_ = js.native
    
    def download(options: DownloadOption): DownloadTask = js.native
    @JSName("download")
    var download_Original: Download_ = js.native
    
    def setHeaders(h: DownloadHeaders): Unit = js.native
    @JSName("setHeaders")
    var setHeaders_Original: SetHeaders_ = js.native
  }
  
  type SetHeaders_ = js.Function1[/* h */ DownloadHeaders, Unit]
  
  type TaskInfo = String | TaskInfoObject
  
  @js.native
  trait TaskInfoObject extends StObject {
    
    var bytesWritten: Double = js.native
    
    var id: String = js.native
    
    var percent: Double = js.native
    
    var totalBytes: Double = js.native
  }
  object TaskInfoObject {
    
    @scala.inline
    def apply(bytesWritten: Double, id: String, percent: Double, totalBytes: Double): TaskInfoObject = {
      val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskInfoObject]
    }
    
    @scala.inline
    implicit class TaskInfoObjectMutableBuilder[Self <: TaskInfoObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = RNBackgroundDownloader
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: RNBackgroundDownloader = default
}
