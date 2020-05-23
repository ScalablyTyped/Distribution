package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This IndexedDB API interface indicates that the version of the database has changed, as the result of an IDBOpenDBRequest.onupgradeneeded event handler function. */
@js.native
trait IDBVersionChangeEvent extends Event {
  val newVersion: Double | Null = js.native
  val oldVersion: Double = js.native
}

