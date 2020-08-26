package typings.semver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoerceOptions extends Options {
  /**
    * Used by `coerce()` to coerce from right to left.
    *
    * @default false
    *
    * @example
    * coerce('1.2.3.4', { rtl: true });
    * // => SemVer { version: '2.3.4', ... }
    *
    * @since 6.2.0
    */
  var rtl: js.UndefOr[Boolean] = js.native
}

object CoerceOptions {
  @scala.inline
  def apply(): CoerceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoerceOptions]
  }
  @scala.inline
  implicit class CoerceOptionsOps[Self <: CoerceOptions] (val x: Self) extends AnyVal {
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
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
  }
  
}

