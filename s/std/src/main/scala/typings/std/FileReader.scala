package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdStrings.abort
import typings.std.stdStrings.load
import typings.std.stdStrings.loadend
import typings.std.stdStrings.loadstart
import typings.std.stdStrings.progress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lets web applications asynchronously read the contents of files (or raw data buffers) stored on the user's computer, using File or Blob objects to specify the file or data to read.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader)
  */
@js.native
trait FileReader
  extends StObject
     with EventTarget {
  
  /* standard dom */
  val DONE: `2` = js.native
  
  /* standard dom */
  val EMPTY: `0` = js.native
  
  /* standard dom */
  val LOADING: `1` = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/abort) */
  /* standard dom */
  def abort(): Unit = js.native
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: typings.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: typings.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: typings.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/error) */
  /* standard dom */
  val error: DOMException | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/abort_event) */
  /* standard dom */
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/error_event) */
  /* standard dom */
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/load_event) */
  /* standard dom */
  var onload: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/loadend_event) */
  /* standard dom */
  var onloadend: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/loadstart_event) */
  /* standard dom */
  var onloadstart: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/progress_event) */
  /* standard dom */
  var onprogress: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/readAsArrayBuffer) */
  /* standard dom */
  def readAsArrayBuffer(blob: Blob): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/readAsBinaryString) */
  /* standard dom */
  def readAsBinaryString(blob: Blob): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/readAsDataURL) */
  /* standard dom */
  def readAsDataURL(blob: Blob): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/readAsText) */
  /* standard dom */
  def readAsText(blob: Blob): Unit = js.native
  def readAsText(blob: Blob, encoding: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/readyState) */
  /* standard dom */
  val readyState: `0` | `1` | `2` = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: typings.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: typings.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: typings.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/result) */
  /* standard dom */
  val result: java.lang.String | js.typedarray.ArrayBuffer | Null = js.native
}
