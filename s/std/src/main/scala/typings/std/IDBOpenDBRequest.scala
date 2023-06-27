package typings.std

import typings.std.stdStrings.blocked
import typings.std.stdStrings.upgradeneeded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Also inherits methods from its parents IDBRequest and EventTarget.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest)
  */
@js.native
trait IDBOpenDBRequest
  extends StObject
     with IDBRequest[IDBDatabase] {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_blocked(
    `type`: blocked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blocked(
    `type`: blocked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blocked(
    `type`: blocked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_upgradeneeded(
    `type`: upgradeneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_upgradeneeded(
    `type`: upgradeneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_upgradeneeded(
    `type`: upgradeneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/blocked_event) */
  /* standard dom */
  var onblocked: (js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/upgradeneeded_event) */
  /* standard dom */
  var onupgradeneeded: (js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_blocked(
    `type`: blocked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blocked(
    `type`: blocked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blocked(
    `type`: blocked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_upgradeneeded(
    `type`: upgradeneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_upgradeneeded(
    `type`: upgradeneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_upgradeneeded(
    `type`: upgradeneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
}
