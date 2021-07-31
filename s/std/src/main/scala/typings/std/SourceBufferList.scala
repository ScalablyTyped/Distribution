package typings.std

import org.scalablytyped.runtime.NumberDictionary
import typings.std.stdStrings.addsourcebuffer
import typings.std.stdStrings.removesourcebuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A simple container list for multiple SourceBuffer objects. */
@js.native
trait SourceBufferList
  extends StObject
     with EventTarget
     with /* index */ NumberDictionary[SourceBuffer] {
  
  @JSName("addEventListener")
  def addEventListener_addsourcebuffer(`type`: addsourcebuffer, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addsourcebuffer(
    `type`: addsourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addsourcebuffer(
    `type`: addsourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removesourcebuffer(
    `type`: removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removesourcebuffer(
    `type`: removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removesourcebuffer(
    `type`: removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SourceBuffer]] = js.native
  
  val length: Double = js.native
  
  var onaddsourcebuffer: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onremovesourcebuffer: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_addsourcebuffer(`type`: addsourcebuffer, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addsourcebuffer(
    `type`: addsourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addsourcebuffer(
    `type`: addsourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removesourcebuffer(
    `type`: removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removesourcebuffer(
    `type`: removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removesourcebuffer(
    `type`: removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
}
