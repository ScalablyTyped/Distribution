package typings.reactNative

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileReader
  extends StObject
     with EventTarget {
  
  val DONE: Double = js.native
  
  val EMPTY: Double = js.native
  
  val LOADING: Double = js.native
  
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
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_load")
  def addEventListener(
    `type`: "load",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_loadstart")
  def addEventListener(
    `type`: "loadstart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_abort")
  def addEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_progress")
  def addEventListener(
    `type`: "progress",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: Boolean
  ): Unit = js.native
  
  val error: js.Error | Null = js.native
  
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]) | Null = js.native
  
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]) | Null = js.native
  
  var onload: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]) | Null = js.native
  
  var onloadend: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]) | Null = js.native
  
  var onloadstart: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]) | Null = js.native
  
  var onprogress: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any]) | Null = js.native
  
  def readAsArrayBuffer(blob: Blob): Unit = js.native
  
  // readAsBinaryString(blob: Blob): void;
  def readAsDataURL(blob: Blob): Unit = js.native
  
  def readAsText(blob: Blob): Unit = js.native
  def readAsText(blob: Blob, encoding: String): Unit = js.native
  
  val readyState: Double = js.native
  
  // addEventListener(type: string, listener: EventListenerOrEventListenerObject, options?: boolean | AddEventListenerOptions): void;
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
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_error")
  def removeEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_progress")
  def removeEventListener(
    `type`: "progress",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_load")
  def removeEventListener(
    `type`: "load",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_loadend")
  def removeEventListener(
    `type`: "loadend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_loadstart")
  def removeEventListener(
    `type`: "loadstart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], Any],
    options: Boolean
  ): Unit = js.native
  
  val result: String | js.typedarray.ArrayBuffer = js.native
}
