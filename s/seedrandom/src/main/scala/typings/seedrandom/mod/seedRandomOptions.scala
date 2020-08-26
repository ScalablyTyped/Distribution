package typings.seedrandom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait seedRandomOptions extends js.Object {
  var entropy: js.UndefOr[Boolean] = js.native
  var global: js.UndefOr[Boolean] = js.native
  var pass: js.UndefOr[seedrandomCallback] = js.native
  var state: js.UndefOr[Boolean | State] = js.native
}

object seedRandomOptions {
  @scala.inline
  def apply(): seedRandomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[seedRandomOptions]
  }
  @scala.inline
  implicit class seedRandomOptionsOps[Self <: seedRandomOptions] (val x: Self) extends AnyVal {
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
    def setEntropy(value: Boolean): Self = this.set("entropy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntropy: Self = this.set("entropy", js.undefined)
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    @scala.inline
    def setPass(
      value: (/* prng */ js.UndefOr[prng], /* shortseed */ js.UndefOr[String], /* global */ js.UndefOr[Boolean], /* state */ js.UndefOr[State]) => prng
    ): Self = this.set("pass", js.Any.fromFunction4(value))
    @scala.inline
    def deletePass: Self = this.set("pass", js.undefined)
    @scala.inline
    def setState(value: Boolean | State): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

