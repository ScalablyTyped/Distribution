package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A simple container list for multiple SourceBuffer objects. */
@js.native
trait SourceBufferList
  extends StObject
     with EventTarget
     with /* standard dom */
/* index */ NumberDictionary[SourceBuffer] {
  
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_removesourcebuffer")
  def addEventListener(
    `type`: "removesourcebuffer",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_addsourcebuffer")
  def addEventListener(`type`: "addsourcebuffer", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_addsourcebuffer")
  def addEventListener(
    `type`: "addsourcebuffer",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_removesourcebuffer")
  def addEventListener(
    `type`: "removesourcebuffer",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_addsourcebuffer")
  def addEventListener(
    `type`: "addsourcebuffer",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_removesourcebuffer")
  def addEventListener(
    `type`: "removesourcebuffer",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SourceBuffer]] = js.native
  
  /* standard dom */
  val length: Double = js.native
  
  /* standard dom */
  var onaddsourcebuffer: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onremovesourcebuffer: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_removesourcebuffer")
  def removeEventListener(
    `type`: "removesourcebuffer",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_addsourcebuffer")
  def removeEventListener(`type`: "addsourcebuffer", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_addsourcebuffer")
  def removeEventListener(
    `type`: "addsourcebuffer",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_removesourcebuffer")
  def removeEventListener(
    `type`: "removesourcebuffer",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_removesourcebuffer")
  def removeEventListener(
    `type`: "removesourcebuffer",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_addsourcebuffer")
  def removeEventListener(
    `type`: "addsourcebuffer",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
}
