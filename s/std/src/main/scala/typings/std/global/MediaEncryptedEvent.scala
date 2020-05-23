package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.MediaEncryptedEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaEncryptedEvent")
@js.native
class MediaEncryptedEvent protected ()
  extends typings.std.MediaEncryptedEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: MediaEncryptedEventInit) = this()
}

@JSGlobal("MediaEncryptedEvent")
@js.native
object MediaEncryptedEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.MediaEncryptedEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ MediaEncryptedEventInit, 
      typings.std.MediaEncryptedEvent
    ]

