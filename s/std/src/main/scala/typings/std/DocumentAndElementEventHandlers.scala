package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentAndElementEventHandlers extends StObject {
  
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_cut")
  def addEventListener(`type`: "cut", listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_copy")
  def addEventListener(`type`: "copy", listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_paste")
  def addEventListener(`type`: "paste", listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_copy")
  def addEventListener(
    `type`: "copy",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_paste")
  def addEventListener(
    `type`: "paste",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_cut")
  def addEventListener(
    `type`: "cut",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_cut")
  def addEventListener(
    `type`: "cut",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_copy")
  def addEventListener(
    `type`: "copy",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_paste")
  def addEventListener(
    `type`: "paste",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  /* standard dom */
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  var oncopy: (js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]) | Null = js.native
  
  /* standard dom */
  var oncut: (js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onpaste: (js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]) | Null = js.native
  
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_cut")
  def removeEventListener(`type`: "cut", listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_copy")
  def removeEventListener(`type`: "copy", listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_paste")
  def removeEventListener(`type`: "paste", listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_paste")
  def removeEventListener(
    `type`: "paste",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_cut")
  def removeEventListener(
    `type`: "cut",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_copy")
  def removeEventListener(
    `type`: "copy",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_cut")
  def removeEventListener(
    `type`: "cut",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_copy")
  def removeEventListener(
    `type`: "copy",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_paste")
  def removeEventListener(
    `type`: "paste",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  /* standard dom */
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
}
