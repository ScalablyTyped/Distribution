package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SourceBufferList interface represents a simple container list for multiple SourceBuffer objects. */
@js.native
trait SourceBufferList
  extends EventTarget
     with /* index */ org.scalablytyped.runtime.NumberDictionary[SourceBuffer] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SourceBuffer]] = js.native
  val length: scala.Double = js.native
  var onaddsourcebuffer: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onremovesourcebuffer: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  @JSName("addEventListener")
  def addEventListener_addsourcebuffer(
    `type`: stdLib.stdLibStrings.addsourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addsourcebuffer(
    `type`: stdLib.stdLibStrings.addsourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addsourcebuffer(
    `type`: stdLib.stdLibStrings.addsourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removesourcebuffer(
    `type`: stdLib.stdLibStrings.removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removesourcebuffer(
    `type`: stdLib.stdLibStrings.removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removesourcebuffer(
    `type`: stdLib.stdLibStrings.removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addsourcebuffer(
    `type`: stdLib.stdLibStrings.addsourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addsourcebuffer(
    `type`: stdLib.stdLibStrings.addsourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addsourcebuffer(
    `type`: stdLib.stdLibStrings.addsourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removesourcebuffer(
    `type`: stdLib.stdLibStrings.removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removesourcebuffer(
    `type`: stdLib.stdLibStrings.removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removesourcebuffer(
    `type`: stdLib.stdLibStrings.removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("SourceBufferList")
@js.native
class SourceBufferListCls () extends SourceBufferList

@JSGlobal("SourceBufferList")
@js.native
object SourceBufferList
  extends org.scalablytyped.runtime.Instantiable0[SourceBufferList]

