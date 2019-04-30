package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLHttpRequestEventTarget extends js.Object {
  var onabort: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | scala.Null = js.native
  var onerror: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | scala.Null = js.native
  var onload: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | scala.Null = js.native
  var onloadend: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | scala.Null = js.native
  var onloadstart: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | scala.Null = js.native
  var onprogress: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | scala.Null = js.native
  var ontimeout: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | scala.Null = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeout(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.timeout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  //  addEventListener(type: string, listener: EventListenerOrEventListenerObject): void;
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  //  addEventListener(type: string, listener: EventListenerOrEventListenerObject): void;
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  //  addEventListener(type: string, listener: EventListenerOrEventListenerObject): void;
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  //  addEventListener(type: string, listener: EventListenerOrEventListenerObject): void;
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  //  addEventListener(type: string, listener: EventListenerOrEventListenerObject): void;
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  //  addEventListener(type: string, listener: EventListenerOrEventListenerObject): void;
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  //  addEventListener(type: string, listener: EventListenerOrEventListenerObject): void;
  @JSName("removeEventListener")
  def removeEventListener_timeout(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.timeout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
}

