package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This IndexedDB API interface indicates that the version of the database has changed, as the result of an IDBOpenDBRequest.onupgradeneeded event handler function. */
@js.native
trait IDBVersionChangeEvent
  extends StObject
     with Event {
  
  /* standard dom */
  val newVersion: Double | Null = js.native
  
  /* standard dom */
  val oldVersion: Double = js.native
}
