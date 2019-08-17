package typings.rsocketDashCore.rSocketResumableTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bufferSize: Double
  var resumeToken: String
}

object Options {
  @scala.inline
  def apply(bufferSize: Double, resumeToken: String): Options = {
    val __obj = js.Dynamic.literal(bufferSize = bufferSize, resumeToken = resumeToken)
  
    __obj.asInstanceOf[Options]
  }
}

