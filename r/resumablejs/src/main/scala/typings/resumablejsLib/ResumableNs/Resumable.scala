package typings
package resumablejsLib.ResumableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Resumable.Resumable")
@js.native
class Resumable protected () extends js.Object {
  def this(options: ConfigurationHash) = this()
  var defaults: ConfigurationHash = js.native
  var events: js.Array[stdLib.Event] = js.native
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
  var support: scala.Boolean = js.native
  var version: scala.Double = js.native
  /**
       * Add a HTML5 File object to the list of files.
       **/
  def addFile(file: stdLib.File, event: stdLib.Event): scala.Unit = js.native
  def assignBrowse(domNodes: js.Array[stdLib.Element], isDirectory: scala.Boolean): scala.Unit = js.native
  /**
       * Assign a browse action to one or more DOM nodes. Pass in true to allow directories to be selected (Chrome only).
       **/
  def assignBrowse(domNode: stdLib.Element, isDirectory: scala.Boolean): scala.Unit = js.native
  def assignDrop(domNodes: js.Array[stdLib.Element]): scala.Unit = js.native
  /**
       * Assign one or more DOM nodes as a drop target.
       **/
  def assignDrop(domNode: stdLib.Element): scala.Unit = js.native
  /**
       * Cancel upload of all ResumableFile objects and remove them from the list.
       **/
  def cancel(): scala.Unit = js.native
  def fire(): scala.Unit = js.native
  /**
       * Look up a ResumableFile object by its unique identifier.
       **/
  def getFromUniqueIdentifier(uniqueIdentifier: java.lang.String): scala.Unit = js.native
  def getOpt(o: java.lang.String): js.Any = js.native
  /**
       * Returns the total size of the upload in bytes.
       **/
  def getSize(): scala.Double = js.native
  // Events
  /**
  	 * Change event handler
  	 **/
  def handleChangeEvent(e: stdLib.Event): scala.Unit = js.native
  /**
  	 * Drop event handler
  	 **/
  def handleDropEvent(e: stdLib.Event): scala.Unit = js.native
  /**
       * Returns a boolean indicating whether or not the instance is currently uploading anything.
       **/
  def isUploading(): scala.Boolean = js.native
  /**
       * Listen for event from Resumable.js (see below)
       **/
  def on(event: java.lang.String, callback: js.Function): scala.Unit = js.native
  /**
       *  Triggers before the items are cancelled allowing to do any processing on uploading files.
       **/
  @JSName("on")
  def on_beforeCancel(event: resumablejsLib.resumablejsLibStrings.beforeCancel, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       *  Uploading was canceled.
       **/
  @JSName("on")
  def on_cancel(event: resumablejsLib.resumablejsLibStrings.cancel, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Listen to all the events listed above with the same callback function.
       **/
  @JSName("on")
  def on_catchAll(event: resumablejsLib.resumablejsLibStrings.catchAll, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       *  File is ready for upload
       **/
  @JSName("on")
  def on_chunkingComplete(
    event: resumablejsLib.resumablejsLibStrings.chunkingComplete,
    callback: js.Function1[/* file */ ResumableFile, scala.Unit]
  ): scala.Unit = js.native
  /**
       *  Show progress in file preparation
       **/
  @JSName("on")
  def on_chunkingProgress(
    event: resumablejsLib.resumablejsLibStrings.chunkingProgress,
    callback: js.Function2[/* file */ ResumableFile, /* ratio */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       *  Started preparing file for upload
       **/
  @JSName("on")
  def on_chunkingStart(
    event: resumablejsLib.resumablejsLibStrings.chunkingStart,
    callback: js.Function1[/* file */ ResumableFile, scala.Unit]
  ): scala.Unit = js.native
  /**
       *  Uploading completed.
       **/
  @JSName("on")
  def on_complete(event: resumablejsLib.resumablejsLibStrings.complete, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       *  An error, including fileError, occurred.
       **/
  @JSName("on")
  def on_error(
    event: resumablejsLib.resumablejsLibStrings.error,
    callback: js.Function2[/* message */ java.lang.String, /* file */ ResumableFile, scala.Unit]
  ): scala.Unit = js.native
  /**
       *  A new file was added. Optionally, you can use the browser event object from when the file was added.
       **/
  @JSName("on")
  def on_fileAdded(
    event: resumablejsLib.resumablejsLibStrings.fileAdded,
    callback: js.Function2[/* file */ ResumableFile, /* event */ stdLib.DragEvent, scala.Unit]
  ): scala.Unit = js.native
  /**
       *  An error occurred during upload of a specific file.
       **/
  @JSName("on")
  def on_fileError(
    event: resumablejsLib.resumablejsLibStrings.fileError,
    callback: js.Function2[/* file */ ResumableFile, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       *  Uploading progressed for a specific file.
       **/
  @JSName("on")
  def on_fileProgress(
    event: resumablejsLib.resumablejsLibStrings.fileProgress,
    callback: js.Function1[/* file */ ResumableFile, scala.Unit]
  ): scala.Unit = js.native
  /**
       *  Something went wrong during upload of a specific file, uploading is being retried.
       **/
  @JSName("on")
  def on_fileRetry(
    event: resumablejsLib.resumablejsLibStrings.fileRetry,
    callback: js.Function1[/* file */ ResumableFile, scala.Unit]
  ): scala.Unit = js.native
  /**
       *  A specific file was completed.
       **/
  @JSName("on")
  def on_fileSuccess(
    event: resumablejsLib.resumablejsLibStrings.fileSuccess,
    callback: js.Function1[/* file */ ResumableFile, scala.Unit]
  ): scala.Unit = js.native
  /**
       *  New files were added.
       **/
  @JSName("on")
  def on_filesAdded(
    event: resumablejsLib.resumablejsLibStrings.filesAdded,
    callback: js.Function1[/* files */ js.Array[ResumableFile], scala.Unit]
  ): scala.Unit = js.native
  /**
       *  Uploading was paused.
       **/
  @JSName("on")
  def on_pause(event: resumablejsLib.resumablejsLibStrings.pause, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       *  Uploading progress.
       **/
  @JSName("on")
  def on_progress(event: resumablejsLib.resumablejsLibStrings.progress, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       *  Upload has been started on the Resumable object.
       **/
  @JSName("on")
  def on_uploadStart(event: resumablejsLib.resumablejsLibStrings.uploadStart, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Pause uploading.
       **/
  def pause(): scala.Unit = js.native
  /**
       * Returns a float between 0 and 1 indicating the current upload progress of all files.
       **/
  def progress(): scala.Double = js.native
  /**
       * Cancel upload of a specific ResumableFile object on the list from the list.
       **/
  def removeFile(file: ResumableFile): scala.Unit = js.native
  def unAssignDrop(domNodes: js.Array[stdLib.Element]): scala.Unit = js.native
  def unAssignDrop(domNode: stdLib.Element): scala.Unit = js.native
  /**
       * Start or resume uploading.
       **/
  def upload(): scala.Unit = js.native
  def uploadNextChunk(): scala.Unit = js.native
}

