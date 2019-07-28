package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaEncryptedEvent extends Event {
  val initData: ArrayBuffer | Null = js.native
  val initDataType: java.lang.String = js.native
}

@JSGlobal("MediaEncryptedEvent")
@js.native
class MediaEncryptedEventCls protected () extends MediaEncryptedEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: MediaEncryptedEventInit) = this()
}

@JSGlobal("MediaEncryptedEvent")
@js.native
object MediaEncryptedEvent
  extends Instantiable1[/* type */ java.lang.String, MediaEncryptedEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ MediaEncryptedEventInit, 
      MediaEncryptedEvent
    ]

