package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.IDBVersionChangeEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("IDBVersionChangeEvent")
@js.native
class IDBVersionChangeEvent protected ()
  extends typings.std.IDBVersionChangeEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: IDBVersionChangeEventInit) = this()
}

@JSGlobal("IDBVersionChangeEvent")
@js.native
object IDBVersionChangeEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.IDBVersionChangeEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ IDBVersionChangeEventInit, 
      typings.std.IDBVersionChangeEvent
    ]

