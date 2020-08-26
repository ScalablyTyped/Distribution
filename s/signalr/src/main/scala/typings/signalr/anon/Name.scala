package typings.signalr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Name extends js.Object {
  var name: String = js.native
  def supportsKeepAlive(): Boolean = js.native
}

object Name {
  @scala.inline
  def apply(name: String, supportsKeepAlive: () => Boolean): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], supportsKeepAlive = js.Any.fromFunction0(supportsKeepAlive))
    __obj.asInstanceOf[Name]
  }
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsKeepAlive(value: () => Boolean): Self = this.set("supportsKeepAlive", js.Any.fromFunction0(value))
  }
  
}

