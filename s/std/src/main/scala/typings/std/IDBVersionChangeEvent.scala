package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This IndexedDB API interface indicates that the version of the database has changed, as the result of an IDBOpenDBRequest.onupgradeneeded event handler function.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent)
  */
@js.native
trait IDBVersionChangeEvent
  extends StObject
     with Event {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent/newVersion) */
  /* standard dom */
  val newVersion: Double | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent/oldVersion) */
  /* standard dom */
  val oldVersion: Double = js.native
}
