package typings.rtlcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapOptions extends js.Object {
  var greedy: js.UndefOr[Boolean] = js.native
  var ignoreCase: Boolean = js.native
  var scope: String = js.native
}

object MapOptions {
  @scala.inline
  def apply(ignoreCase: Boolean, scope: String): MapOptions = {
    val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
  @scala.inline
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
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
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setGreedy(value: Boolean): Self = this.set("greedy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGreedy: Self = this.set("greedy", js.undefined)
  }
  
}

