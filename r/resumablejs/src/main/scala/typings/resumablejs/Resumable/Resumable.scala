package typings.resumablejs.Resumable

import typings.resumablejs.resumablejsStrings.beforeCancel
import typings.resumablejs.resumablejsStrings.cancel
import typings.resumablejs.resumablejsStrings.catchAll
import typings.resumablejs.resumablejsStrings.chunkingComplete
import typings.resumablejs.resumablejsStrings.chunkingProgress
import typings.resumablejs.resumablejsStrings.chunkingStart
import typings.resumablejs.resumablejsStrings.complete
import typings.resumablejs.resumablejsStrings.error
import typings.resumablejs.resumablejsStrings.fileAdded
import typings.resumablejs.resumablejsStrings.fileError
import typings.resumablejs.resumablejsStrings.fileProgress
import typings.resumablejs.resumablejsStrings.fileRetry
import typings.resumablejs.resumablejsStrings.fileSuccess
import typings.resumablejs.resumablejsStrings.filesAdded
import typings.resumablejs.resumablejsStrings.pause
import typings.resumablejs.resumablejsStrings.progress
import typings.resumablejs.resumablejsStrings.uploadStart
import typings.std.DragEvent
import typings.std.Element
import typings.std.Event
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Resumable.Resumable")
@js.native
class Resumable protected () extends js.Object {
  def this(options: ConfigurationHash) = this()
  var defaults: ConfigurationHash = js.native
  var events: js.Array[Event] = js.native
  /**
    * An array of ResumableFile file objects added by the user (see full docs for this object type below).
    **/
  var files: js.Array[ResumableFile] = js.native
  /**
    * A hash object of the configuration of the Resumable.js instance.
    **/
  var opts: ConfigurationHash = js.native
  /**
    * A boolean value indicator whether or not Resumable.js is supported by the current browser.
    **/
  var support: Boolean = js.native
  var version: Double = js.native
  /**
    * Add a HTML5 File object to the list of files.
    **/
  def addFile(file: File, event: Event): Unit = js.native
  def assignBrowse(domNodes: js.Array[Element], isDirectory: Boolean): Unit = js.native
  /**
    * Assign a browse action to one or more DOM nodes. Pass in true to allow directories to be selected (Chrome only).
    **/
  def assignBrowse(domNode: Element, isDirectory: Boolean): Unit = js.native
  def assignDrop(domNodes: js.Array[Element]): Unit = js.native
  /**
    * Assign one or more DOM nodes as a drop target.
    **/
  def assignDrop(domNode: Element): Unit = js.native
  /**
    * Cancel upload of all ResumableFile objects and remove them from the list.
    **/
  def cancel(): Unit = js.native
  def fire(): Unit = js.native
  /**
    * Look up a ResumableFile object by its unique identifier.
    **/
  def getFromUniqueIdentifier(uniqueIdentifier: String): ResumableFile = js.native
  def getOpt(o: String): js.Any = js.native
  /**
    * Returns the total size of the upload in bytes.
    **/
  def getSize(): Double = js.native
  // Events
  /**
  	 * Change event handler
  	 **/
  def handleChangeEvent(e: Event): Unit = js.native
  /**
  	 * Drop event handler
  	 **/
  def handleDropEvent(e: Event): Unit = js.native
  /**
    * Returns a boolean indicating whether or not the instance is currently uploading anything.
    **/
  def isUploading(): Boolean = js.native
  /**
    * Listen for event from Resumable.js (see below)
    **/
  def on(event: String, callback: js.Function): Unit = js.native
  /**
    *  Triggers before the items are cancelled allowing to do any processing on uploading files.
    **/
  @JSName("on")
  def on_beforeCancel(event: beforeCancel, callback: js.Function0[Unit]): Unit = js.native
  /**
    *  Uploading was canceled.
    **/
  @JSName("on")
  def on_cancel(event: cancel, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Listen to all the events listed above with the same callback function.
    **/
  @JSName("on")
  def on_catchAll(event: catchAll, callback: js.Function0[Unit]): Unit = js.native
  /**
    *  File is ready for upload
    **/
  @JSName("on")
  def on_chunkingComplete(event: chunkingComplete, callback: js.Function1[/* file */ ResumableFile, Unit]): Unit = js.native
  /**
    *  Show progress in file preparation
    **/
  @JSName("on")
  def on_chunkingProgress(
    event: chunkingProgress,
    callback: js.Function2[/* file */ ResumableFile, /* ratio */ Double, Unit]
  ): Unit = js.native
  /**
    *  Started preparing file for upload
    **/
  @JSName("on")
  def on_chunkingStart(event: chunkingStart, callback: js.Function1[/* file */ ResumableFile, Unit]): Unit = js.native
  /**
    *  Uploading completed.
    **/
  @JSName("on")
  def on_complete(event: complete, callback: js.Function0[Unit]): Unit = js.native
  /**
    *  An error, including fileError, occurred.
    **/
  @JSName("on")
  def on_error(event: error, callback: js.Function2[/* message */ String, /* file */ ResumableFile, Unit]): Unit = js.native
  /**
    *  A new file was added. Optionally, you can use the browser event object from when the file was added.
    **/
  @JSName("on")
  def on_fileAdded(event: fileAdded, callback: js.Function2[/* file */ ResumableFile, /* event */ DragEvent, Unit]): Unit = js.native
  /**
    *  An error occurred during upload of a specific file.
    **/
  @JSName("on")
  def on_fileError(event: fileError, callback: js.Function2[/* file */ ResumableFile, /* message */ String, Unit]): Unit = js.native
  /**
    *  Uploading progressed for a specific file.
    **/
  @JSName("on")
  def on_fileProgress(event: fileProgress, callback: js.Function1[/* file */ ResumableFile, Unit]): Unit = js.native
  /**
    *  Something went wrong during upload of a specific file, uploading is being retried.
    **/
  @JSName("on")
  def on_fileRetry(event: fileRetry, callback: js.Function1[/* file */ ResumableFile, Unit]): Unit = js.native
  /**
    *  A specific file was completed.
    **/
  @JSName("on")
  def on_fileSuccess(event: fileSuccess, callback: js.Function1[/* file */ ResumableFile, Unit]): Unit = js.native
  /**
    *  New files were added.
    **/
  @JSName("on")
  def on_filesAdded(event: filesAdded, callback: js.Function1[/* files */ js.Array[ResumableFile], Unit]): Unit = js.native
  /**
    *  Uploading was paused.
    **/
  @JSName("on")
  def on_pause(event: pause, callback: js.Function0[Unit]): Unit = js.native
  /**
    *  Uploading progress.
    **/
  @JSName("on")
  def on_progress(event: progress, callback: js.Function0[Unit]): Unit = js.native
  /**
    *  Upload has been started on the Resumable object.
    **/
  @JSName("on")
  def on_uploadStart(event: uploadStart, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Pause uploading.
    **/
  def pause(): Unit = js.native
  /**
    * Returns a float between 0 and 1 indicating the current upload progress of all files.
    **/
  def progress(): Double = js.native
  /**
    * Cancel upload of a specific ResumableFile object on the list from the list.
    **/
  def removeFile(file: ResumableFile): Unit = js.native
  def unAssignDrop(domNodes: js.Array[Element]): Unit = js.native
  def unAssignDrop(domNode: Element): Unit = js.native
  /**
    * Start or resume uploading.
    **/
  def upload(): Unit = js.native
  def uploadNextChunk(): Unit = js.native
}

