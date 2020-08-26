package typings.router5.routerMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var decoders: Record[String, _] = js.native
  var defaultParams: Record[String, _] = js.native
  var encoders: Record[String, _] = js.native
  var forwardMap: Record[String, _] = js.native
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
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDecoders(value: Record[String, _]): Self = this.set("decoders", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultParams(value: Record[String, _]): Self = this.set("defaultParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoders(value: Record[String, _]): Self = this.set("encoders", value.asInstanceOf[js.Any])
    @scala.inline
    def setForwardMap(value: Record[String, _]): Self = this.set("forwardMap", value.asInstanceOf[js.Any])
  }
  
}

