package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Also inherits methods from its parents IDBRequest and EventTarget. */
@js.native
trait IDBOpenDBRequest
  extends StObject
     with IDBRequest[IDBDatabase] {
  
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_upgradeneeded")
  def addEventListener(
    `type`: "upgradeneeded",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any]
  ): Unit = js.native
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_blocked")
  def addEventListener(
    `type`: "blocked",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_upgradeneeded")
  def addEventListener(
    `type`: "upgradeneeded",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_blocked")
  def addEventListener(
    `type`: "blocked",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_blocked")
  def addEventListener(
    `type`: "blocked",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_upgradeneeded")
  def addEventListener(
    `type`: "upgradeneeded",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  var onblocked: (js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onupgradeneeded: (js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_blocked")
  def removeEventListener(
    `type`: "blocked",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_upgradeneeded")
  def removeEventListener(
    `type`: "upgradeneeded",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_upgradeneeded")
  def removeEventListener(
    `type`: "upgradeneeded",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_blocked")
  def removeEventListener(
    `type`: "blocked",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_upgradeneeded")
  def removeEventListener(
    `type`: "upgradeneeded",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_blocked")
  def removeEventListener(
    `type`: "blocked",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
}
