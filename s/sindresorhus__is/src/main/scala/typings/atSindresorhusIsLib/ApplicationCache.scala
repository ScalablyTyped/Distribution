package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationCache extends EventTarget {
  val CHECKING: scala.Double = js.native
  val DOWNLOADING: scala.Double = js.native
  val IDLE: scala.Double = js.native
  val OBSOLETE: scala.Double = js.native
  val UNCACHED: scala.Double = js.native
  val UPDATEREADY: scala.Double = js.native
  /** @deprecated */
  var oncached: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /** @deprecated */
  var onchecking: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /** @deprecated */
  var ondownloading: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /** @deprecated */
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /** @deprecated */
  var onnoupdate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /** @deprecated */
  var onobsolete: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /** @deprecated */
  var onprogress: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]) | scala.Null = js.native
  /** @deprecated */
  var onupdateready: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /** @deprecated */
  val status: scala.Double = js.native
  /** @deprecated */
  def abort(): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cached(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.cached,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cached(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.cached,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cached(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.cached,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_checking(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.checking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_checking(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.checking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_checking(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.checking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloading(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.downloading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloading(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.downloading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloading(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.downloading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_noupdate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.noupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_noupdate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.noupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_noupdate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.noupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_obsolete(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.obsolete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_obsolete(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.obsolete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_obsolete(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.obsolete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updateready(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.updateready,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updateready(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.updateready,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updateready(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.updateready,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cached(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.cached,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cached(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.cached,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cached(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.cached,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_checking(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.checking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_checking(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.checking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_checking(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.checking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloading(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.downloading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloading(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.downloading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloading(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.downloading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_noupdate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.noupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_noupdate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.noupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_noupdate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.noupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_obsolete(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.obsolete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_obsolete(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.obsolete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_obsolete(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.obsolete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updateready(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.updateready,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updateready(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.updateready,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updateready(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.updateready,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  /** @deprecated */
  def swapCache(): scala.Unit = js.native
  /** @deprecated */
  def update(): scala.Unit = js.native
}

@JSGlobal("ApplicationCache")
@js.native
object ApplicationCache
  extends org.scalablytyped.runtime.Instantiable0[ApplicationCache] {
  val CHECKING: scala.Double = js.native
  val DOWNLOADING: scala.Double = js.native
  val IDLE: scala.Double = js.native
  val OBSOLETE: scala.Double = js.native
  val UNCACHED: scala.Double = js.native
  val UPDATEREADY: scala.Double = js.native
}

