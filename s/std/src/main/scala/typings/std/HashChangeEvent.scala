package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events that fire when the fragment identifier of the URL has changed. */
@js.native
trait HashChangeEvent extends Event_ {
  val newURL: java.lang.String = js.native
  val oldURL: java.lang.String = js.native
}

@JSGlobal("HashChangeEvent")
@js.native
object HashChangeEvent
  extends Instantiable1[/* type */ java.lang.String, HashChangeEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ HashChangeEventInit, 
      HashChangeEvent
    ]

