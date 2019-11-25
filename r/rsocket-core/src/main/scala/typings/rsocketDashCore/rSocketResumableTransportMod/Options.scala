package typings.rsocketDashCore.rSocketResumableTransportMod

import typings.rsocketDashTypes.reactiveSocketTypesMod.Encodable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bufferSize: Double
  var resumeToken: Encodable
  var sessionDurationSeconds: Double
}

object Options {
  @scala.inline
  def apply(bufferSize: Double, resumeToken: Encodable, sessionDurationSeconds: Double): Options = {
    val __obj = js.Dynamic.literal(bufferSize = bufferSize.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any], sessionDurationSeconds = sessionDurationSeconds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

