package typings.seamless.Seamless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  var options: ConnectOptions = js.native
  def connect(options: ConnectOptions): Connection = js.native
}

object Static {
  @scala.inline
  def apply(connect: ConnectOptions => Connection, options: ConnectOptions): Static = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Static]
  }
  @scala.inline
  implicit class StaticOps[Self <: Static] (val x: Self) extends AnyVal {
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
    def setConnect(value: ConnectOptions => Connection): Self = this.set("connect", js.Any.fromFunction1(value))
    @scala.inline
    def setOptions(value: ConnectOptions): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

