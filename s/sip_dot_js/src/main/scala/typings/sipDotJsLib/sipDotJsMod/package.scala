package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sipDotJsMod {
  type DescriptionModifier = js.Function1[
    /* description */ stdLib.RTCSessionDescription, 
    js.Promise[stdLib.RTCSessionDescription]
  ]
  type IncomingMessage = Request
  type IncomingRequest = Request
  type OutgoingRequest = Request
  type Request = Context
}
