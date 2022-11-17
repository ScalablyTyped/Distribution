package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Lets web applications asynchronously read the contents of files (or raw data buffers) stored on the user's computer, using File or Blob objects to specify the file or data to read. */
@js.native
trait FileReader
  extends StObject
     with EventTarget {
  
  /* standard dom */
  val DONE: Double = js.native
  
  /* standard dom */
  val EMPTY: Double = js.native
  
  /* standard dom */
  val LOADING: Double = js.native
  
  /* standard dom */
  def abort(): Unit = js.native
  
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_progress")
  def addEventListener(
    `type`: "progress",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_loadend")
  def addEventListener(
    `type`: "loadend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_abort")
  def addEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_load")
  def addEventListener(
    `type`: "load",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_loadstart")
  def addEventListener(
    `type`: "loadstart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_loadend")
  def addEventListener(
    `type`: "loadend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_load")
  def addEventListener(
    `type`: "load",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_loadstart")
  def addEventListener(
    `type`: "loadstart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_abort")
  def addEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_progress")
  def addEventListener(
    `type`: "progress",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_loadend")
  def addEventListener(
    `type`: "loadend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_loadstart")
  def addEventListener(
    `type`: "loadstart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_abort")
  def addEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_load")
  def addEventListener(
    `type`: "load",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_progress")
  def addEventListener(
    `type`: "progress",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  val error: DOMException | Null = js.native
  
  /* standard dom */
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]) | Null = js.native
  
  /* standard dom */
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]) | Null = js.native
  
  /* standard dom */
  var onload: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]) | Null = js.native
  
  /* standard dom */
  var onloadend: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]) | Null = js.native
  
  /* standard dom */
  var onloadstart: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]) | Null = js.native
  
  /* standard dom */
  var onprogress: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]) | Null = js.native
  
  /* standard dom */
  def readAsArrayBuffer(blob: Blob): Unit = js.native
  
  /* standard dom */
  def readAsBinaryString(blob: Blob): Unit = js.native
  
  /* standard dom */
  def readAsDataURL(blob: Blob): Unit = js.native
  
  /* standard dom */
  def readAsText(blob: Blob): Unit = js.native
  def readAsText(blob: Blob, encoding: java.lang.String): Unit = js.native
  
  /* standard dom */
  val readyState: Double = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_abort")
  def removeEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_progress")
  def removeEventListener(
    `type`: "progress",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_loadend")
  def removeEventListener(
    `type`: "loadend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_loadstart")
  def removeEventListener(
    `type`: "loadstart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_error")
  def removeEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_load")
  def removeEventListener(
    `type`: "load",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_abort")
  def removeEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_error")
  def removeEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_progress")
  def removeEventListener(
    `type`: "progress",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_load")
  def removeEventListener(
    `type`: "load",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_loadend")
  def removeEventListener(
    `type`: "loadend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_loadstart")
  def removeEventListener(
    `type`: "loadstart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_loadend")
  def removeEventListener(
    `type`: "loadend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_load")
  def removeEventListener(
    `type`: "load",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_abort")
  def removeEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_progress")
  def removeEventListener(
    `type`: "progress",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_error")
  def removeEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_loadstart")
  def removeEventListener(
    `type`: "loadstart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  val result: java.lang.String | js.typedarray.ArrayBuffer | Null = js.native
}
