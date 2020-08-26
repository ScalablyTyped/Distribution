package typings.shopifyPrime.redirectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedirectOptions extends js.Object {
  /**
    * Filter Redirects with given path
    */
  var path: String = js.native
  /**
    * Filter Redirects with given target
    */
  var target: String = js.native
}

object RedirectOptions {
  @scala.inline
  def apply(path: String, target: String): RedirectOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectOptions]
  }
  @scala.inline
  implicit class RedirectOptionsOps[Self <: RedirectOptions] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

