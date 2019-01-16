package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortSignal extends EventTarget {
  /**
    * Returns true if this AbortSignal's AbortController has signaled to abort, and false
    * otherwise.
    */
  val aborted: scala.Boolean = js.native
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]) | scala.Null = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
}

@JSGlobal("AbortSignal")
@js.native
object AbortSignal
  extends org.scalablytyped.runtime.Instantiable0[AbortSignal]

