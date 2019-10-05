package typings.stellarDashSdk.stellarDashSdkMod.Server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowHttp: Boolean
}

object Options {
  @scala.inline
  def apply(allowHttp: Boolean): Options = {
    val __obj = js.Dynamic.literal(allowHttp = allowHttp)
  
    __obj.asInstanceOf[Options]
  }
}

