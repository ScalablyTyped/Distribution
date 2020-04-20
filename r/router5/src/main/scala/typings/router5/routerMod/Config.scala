package typings.router5.routerMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var decoders: Record[String, _]
  var defaultParams: Record[String, _]
  var encoders: Record[String, _]
  var forwardMap: Record[String, _]
}

object Config {
  @scala.inline
  def apply(
    decoders: Record[String, _],
    defaultParams: Record[String, _],
    encoders: Record[String, _],
    forwardMap: Record[String, _]
  ): Config = {
    val __obj = js.Dynamic.literal(decoders = decoders.asInstanceOf[js.Any], defaultParams = defaultParams.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], forwardMap = forwardMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

