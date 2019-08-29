package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This IndexedDB API interface indicates that the version of the database has changed, as the result of an IDBOpenDBRequest.onupgradeneeded event handler function. */
@js.native
trait IDBVersionChangeEvent extends Event {
  val newVersion: Double | Null = js.native
  val oldVersion: Double = js.native
}

@JSGlobal("IDBVersionChangeEvent")
@js.native
class IDBVersionChangeEventCls protected () extends IDBVersionChangeEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: IDBVersionChangeEventInit) = this()
}

@JSGlobal("IDBVersionChangeEvent")
@js.native
object IDBVersionChangeEvent
  extends Instantiable1[/* type */ java.lang.String, IDBVersionChangeEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ IDBVersionChangeEventInit, 
      IDBVersionChangeEvent
    ]

