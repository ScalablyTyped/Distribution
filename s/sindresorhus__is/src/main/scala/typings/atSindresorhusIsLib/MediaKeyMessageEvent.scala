package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaKeyMessageEvent extends Event {
  val message: ArrayBuffer = js.native
  val messageType: MediaKeyMessageType = js.native
}

@JSGlobal("MediaKeyMessageEvent")
@js.native
object MediaKeyMessageEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, MediaKeyMessageEvent]
     with org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ MediaKeyMessageEventInit, 
      MediaKeyMessageEvent
    ]

