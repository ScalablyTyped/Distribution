package typings.std

import org.scalablytyped.runtime.Instantiable3
import typings.std.stdStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCSrtpSdesTransport
  extends EventTarget
     with RTCTransport {
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  val transport: RTCIceTransport = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
}

@JSGlobal("RTCSrtpSdesTransport")
@js.native
object RTCSrtpSdesTransport extends Instantiable3[
      /* transport */ RTCIceTransport, 
      /* encryptParameters */ RTCSrtpSdesParameters, 
      /* decryptParameters */ RTCSrtpSdesParameters, 
      RTCSrtpSdesTransport
    ] {
  def getLocalParameters(): js.Array[RTCSrtpSdesParameters] = js.native
}

