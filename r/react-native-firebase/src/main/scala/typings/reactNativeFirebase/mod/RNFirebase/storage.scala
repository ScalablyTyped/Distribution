package typings.reactNativeFirebase.mod.RNFirebase

import typings.reactNativeFirebase.anon.CACHESDIRECTORYPATH
import typings.reactNativeFirebase.anon.Complete
import typings.reactNativeFirebase.mod.App
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storage {
  
  /**
    * The Firebase Storage service interface.
    *
    * An instance can be accessed using `firebase.storage()`.
    */
  @JSImport("react-native-firebase", "RNFirebase.storage.Storage")
  @js.native
  open class Storage () extends StObject {
    
    /**
      * The app associated with the Storage service instance.
      */
    var app: App = js.native
    
    /**
      * Returns a reference for the given path in the default bucket.
      *
      * @param path A relative path to initialize the reference with, for
      *        example path/to/image.jpg. If not passed, the returned
      *        reference points to the bucket root.
      */
    def ref(): Reference = js.native
    def ref(path: String): Reference = js.native
    
    /**
      * Returns a reference for the given absolute URL.
      *
      * @param url URL must be in the form of either
      *        -   a Cloud Storage URL, for example gs://bucket/files/image.png; or
      *        -   download URL taken from object metadata.
      */
    def refFromURL(url: String): Reference = js.native
    
    /**
      * @param time The new maximum download retry time in milliseconds.
      */
    def setMaxDownloadRetryTime(time: Double): Unit = js.native
    
    /**
      * @param time The new maximum operation retry time in milliseconds.
      */
    def setMaxOperationRetryTime(time: Double): Unit = js.native
    
    /**
      * @param time The new maximum upload retry time in milliseconds.
      */
    def setMaxUploadRetryTime(time: Double): Unit = js.native
  }
  
  @js.native
  sealed trait TaskEvent extends StObject
  @JSImport("react-native-firebase", "RNFirebase.storage.TaskEvent")
  @js.native
  object TaskEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TaskEvent & String] = js.native
    
    @js.native
    sealed trait STATE_CHANGED
      extends StObject
         with TaskEvent
    /* "state_changed" */ val STATE_CHANGED: typings.reactNativeFirebase.mod.RNFirebase.storage.TaskEvent.STATE_CHANGED & String = js.native
  }
  
  @js.native
  sealed trait TaskState extends StObject
  @JSImport("react-native-firebase", "RNFirebase.storage.TaskState")
  @js.native
  object TaskState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TaskState & String] = js.native
    
    @js.native
    sealed trait CANCELLED
      extends StObject
         with TaskState
    /* "cancelled" */ val CANCELLED: typings.reactNativeFirebase.mod.RNFirebase.storage.TaskState.CANCELLED & String = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with TaskState
    /* "error" */ val ERROR: typings.reactNativeFirebase.mod.RNFirebase.storage.TaskState.ERROR & String = js.native
    
    @js.native
    sealed trait PAUSED
      extends StObject
         with TaskState
    /* "paused" */ val PAUSED: typings.reactNativeFirebase.mod.RNFirebase.storage.TaskState.PAUSED & String = js.native
    
    @js.native
    sealed trait RUNNING
      extends StObject
         with TaskState
    /* "running" */ val RUNNING: typings.reactNativeFirebase.mod.RNFirebase.storage.TaskState.RUNNING & String = js.native
    
    @js.native
    sealed trait SUCCESS
      extends StObject
         with TaskState
    /* "success" */ val SUCCESS: typings.reactNativeFirebase.mod.RNFirebase.storage.TaskState.SUCCESS & String = js.native
  }
  
  trait DownloadTaskSnapshot extends StObject {
    
    var bytesTransferred: Double
    
    var ref: Reference
    
    var state: TaskState
    
    var totalBytes: Double
  }
  object DownloadTaskSnapshot {
    
    inline def apply(bytesTransferred: Double, ref: Reference, state: TaskState, totalBytes: Double): DownloadTaskSnapshot = {
      val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadTaskSnapshot]
    }
    
    extension [Self <: DownloadTaskSnapshot](x: Self) {
      
      inline def setBytesTransferred(value: Double): Self = StObject.set(x, "bytesTransferred", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Reference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setState(value: TaskState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    }
  }
  
  trait FullMetadata
    extends StObject
       with SettableMetadata {
    
    var bucket: String
    
    var fullPath: String
    
    var generation: String
    
    var md5Hash: js.UndefOr[String | Null] = js.undefined
    
    var metageneration: String
    
    var name: String
    
    var size: Double
    
    var timeCreated: String
    
    var updated: String
  }
  object FullMetadata {
    
    inline def apply(
      bucket: String,
      fullPath: String,
      generation: String,
      metageneration: String,
      name: String,
      size: Double,
      timeCreated: String,
      updated: String
    ): FullMetadata = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], generation = generation.asInstanceOf[js.Any], metageneration = metageneration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullMetadata]
    }
    
    extension [Self <: FullMetadata](x: Self) {
      
      inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
      
      inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
      
      inline def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
      
      inline def setMd5HashNull: Self = StObject.set(x, "md5Hash", null)
      
      inline def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
      
      inline def setMetageneration(value: String): Self = StObject.set(x, "metageneration", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A reference represents a reference to a Google Cloud Storage object.
    *
    * You can upload, download, and delete objects, as well as get/set object
    * metadata for a file via this reference.
    */
  @js.native
  trait Reference extends StObject {
    
    /**
      * Returns a reference to a relative path from this reference.
      *
      * @param path The relative path
      */
    def child(path: String): Reference = js.native
    
    /**
      * Deletes the object at this reference's location.
      */
    def delete(): js.Promise[Unit] = js.native
    
    /**
      * Downloads the storage object for this reference to the device file
      * path specified.
      *
      * @param filePath The destination path of the downloaded file.
      */
    def downloadFile(filePath: String): StorageTask[DownloadTaskSnapshot] = js.native
    
    var fullPath: String = js.native
    
    /**
      * Fetches a long lived download URL for this object.
      */
    def getDownloadURL(): js.Promise[String] = js.native
    
    /**
      * Fetches metadata for the object at this location, if one exists.
      *
      * @returns A promise that is resolved with the metadata; or rejected on
      *          failure, including if the object does not exist.
      */
    def getMetadata(): js.Promise[FullMetadata] = js.native
    
    /**
      * Uploads the file path specified from the device into a storage object
      * for this reference.
      *
      * @param filePath The path to the file on the device. It must be a full
      *        file path.
      * @param metadata The metadata to associate with this file.
      */
    def putFile(filePath: String): StorageTask[UploadTaskSnapshot] = js.native
    def putFile(filePath: String, metadata: SettableMetadata): StorageTask[UploadTaskSnapshot] = js.native
    
    /**
      * Updates the metadata for the object at this location, if one exists.
      *
      * @param metadata
      */
    def updateMetadata(metadata: SettableMetadata): js.Promise[FullMetadata] = js.native
  }
  
  trait SettableMetadata extends StObject {
    
    var cacheControl: js.UndefOr[String | Null] = js.undefined
    
    var contentDisposition: js.UndefOr[String | Null] = js.undefined
    
    var contentEncoding: js.UndefOr[String | Null] = js.undefined
    
    var contentLanguage: js.UndefOr[String | Null] = js.undefined
    
    var contentType: js.UndefOr[String | Null] = js.undefined
    
    var customMetadata: js.UndefOr[Partial[Record[String, String]]] = js.undefined
  }
  object SettableMetadata {
    
    inline def apply(): SettableMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettableMetadata]
    }
    
    extension [Self <: SettableMetadata](x: Self) {
      
      inline def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      inline def setCacheControlNull: Self = StObject.set(x, "cacheControl", null)
      
      inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
      
      inline def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
      
      inline def setContentDispositionNull: Self = StObject.set(x, "contentDisposition", null)
      
      inline def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
      
      inline def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      inline def setContentEncodingNull: Self = StObject.set(x, "contentEncoding", null)
      
      inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
      
      inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
      
      inline def setContentLanguageNull: Self = StObject.set(x, "contentLanguage", null)
      
      inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setCustomMetadata(value: Partial[Record[String, String]]): Self = StObject.set(x, "customMetadata", value.asInstanceOf[js.Any])
      
      inline def setCustomMetadataUndefined: Self = StObject.set(x, "customMetadata", js.undefined)
    }
  }
  
  trait StorageStatics extends StObject {
    
    var Native: js.UndefOr[CACHESDIRECTORYPATH] = js.undefined
    
    var TaskEvent: typings.reactNativeFirebase.mod.RNFirebase.storage.TaskEvent
    
    var TaskState: typings.reactNativeFirebase.mod.RNFirebase.storage.TaskState
  }
  object StorageStatics {
    
    inline def apply(TaskEvent: TaskEvent, TaskState: TaskState): StorageStatics = {
      val __obj = js.Dynamic.literal(TaskEvent = TaskEvent.asInstanceOf[js.Any], TaskState = TaskState.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageStatics]
    }
    
    extension [Self <: StorageStatics](x: Self) {
      
      inline def setNative(value: CACHESDIRECTORYPATH): Self = StObject.set(x, "Native", value.asInstanceOf[js.Any])
      
      inline def setNativeUndefined: Self = StObject.set(x, "Native", js.undefined)
      
      inline def setTaskEvent(value: TaskEvent): Self = StObject.set(x, "TaskEvent", value.asInstanceOf[js.Any])
      
      inline def setTaskState(value: TaskState): Self = StObject.set(x, "TaskState", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StorageTask[T]
    extends js.Promise[T] {
    
    /**
      * Not supported by react-native-firebase
      */
    def cancel(): Unit = js.native
    
    def on(event: TaskEvent, next: Handler[T]): js.Function0[Unit] = js.native
    def on(event: TaskEvent, next: Handler[T], error: Unit, complete: Handler[T]): js.Function0[Unit] = js.native
    def on(event: TaskEvent, next: Handler[T], error: ErrorHandler): js.Function0[Unit] = js.native
    def on(event: TaskEvent, next: Handler[T], error: ErrorHandler, complete: Handler[T]): js.Function0[Unit] = js.native
    def on(event: TaskEvent, observer: Complete[T]): js.Function0[Unit] = js.native
    
    /**
      * Not supported by react-native-firebase
      */
    def pause(): Unit = js.native
    
    /**
      * Not supported by react-native-firebase
      */
    def resume(): Unit = js.native
  }
  
  trait UploadTaskSnapshot extends StObject {
    
    var bytesTransferred: Double
    
    var downloadURL: String | Null
    
    var metadata: FullMetadata
    
    var ref: Reference
    
    var state: TaskState
    
    var task: StorageTask[UploadTaskSnapshot]
    
    var totalBytes: Double
  }
  object UploadTaskSnapshot {
    
    inline def apply(
      bytesTransferred: Double,
      metadata: FullMetadata,
      ref: Reference,
      state: TaskState,
      task: StorageTask[UploadTaskSnapshot],
      totalBytes: Double
    ): UploadTaskSnapshot = {
      val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any], downloadURL = null)
      __obj.asInstanceOf[UploadTaskSnapshot]
    }
    
    extension [Self <: UploadTaskSnapshot](x: Self) {
      
      inline def setBytesTransferred(value: Double): Self = StObject.set(x, "bytesTransferred", value.asInstanceOf[js.Any])
      
      inline def setDownloadURL(value: String): Self = StObject.set(x, "downloadURL", value.asInstanceOf[js.Any])
      
      inline def setDownloadURLNull: Self = StObject.set(x, "downloadURL", null)
      
      inline def setMetadata(value: FullMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Reference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setState(value: TaskState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTask(value: StorageTask[UploadTaskSnapshot]): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    }
  }
}
