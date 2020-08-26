package typings.rollupPluginutils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataToEsmOptions extends js.Object {
  var compact: js.UndefOr[Boolean] = js.native
  var indent: js.UndefOr[String] = js.native
  var namedExports: js.UndefOr[Boolean] = js.native
  var objectShorthand: js.UndefOr[Boolean] = js.native
  var preferConst: js.UndefOr[Boolean] = js.native
}

object DataToEsmOptions {
  @scala.inline
  def apply(): DataToEsmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataToEsmOptions]
  }
  @scala.inline
  implicit class DataToEsmOptionsOps[Self <: DataToEsmOptions] (val x: Self) extends AnyVal {
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
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    @scala.inline
    def setNamedExports(value: Boolean): Self = this.set("namedExports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedExports: Self = this.set("namedExports", js.undefined)
    @scala.inline
    def setObjectShorthand(value: Boolean): Self = this.set("objectShorthand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectShorthand: Self = this.set("objectShorthand", js.undefined)
    @scala.inline
    def setPreferConst(value: Boolean): Self = this.set("preferConst", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferConst: Self = this.set("preferConst", js.undefined)
  }
  
}

