package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadLinkResult extends js.Object {
  /** The keypath of the source in the host instance. */
  var keypath: String = js.native
  /** The Ractive instance that hosts the source keypath. */
  var ractive: Ractive[Ractive[_]] = js.native
}

object ReadLinkResult {
  @scala.inline
  def apply(keypath: String, ractive: Ractive[Ractive[_]]): ReadLinkResult = {
    val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any], ractive = ractive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadLinkResult]
  }
  @scala.inline
  implicit class ReadLinkResultOps[Self <: ReadLinkResult] (val x: Self) extends AnyVal {
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
    def setKeypath(value: String): Self = this.set("keypath", value.asInstanceOf[js.Any])
    @scala.inline
    def setRactive(value: Ractive[Ractive[_]]): Self = this.set("ractive", value.asInstanceOf[js.Any])
  }
  
}

