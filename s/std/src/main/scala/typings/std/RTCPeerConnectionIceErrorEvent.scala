package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCPeerConnectionIceErrorEvent extends Event {
  val errorCode: Double = js.native
  val errorText: java.lang.String = js.native
  val hostCandidate: java.lang.String = js.native
  val url: java.lang.String = js.native
}

