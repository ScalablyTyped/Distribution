package typings.slug.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mode extends js.Object {
  var charmap: js.UndefOr[CharMap_ | Null] = js.native
  var lower: js.UndefOr[Boolean | Null] = js.native
  var multicharmap: js.UndefOr[CharMap_ | Null] = js.native
  var remove: js.UndefOr[RegExp | Null] = js.native
  var replacement: js.UndefOr[String | Null] = js.native
  var symbols: js.UndefOr[Boolean | Null] = js.native
}

object Mode {
  @scala.inline
  def apply(): Mode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mode]
  }
  @scala.inline
  implicit class ModeOps[Self <: Mode] (val x: Self) extends AnyVal {
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
    def setCharmap(value: CharMap_): Self = this.set("charmap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharmap: Self = this.set("charmap", js.undefined)
    @scala.inline
    def setCharmapNull: Self = this.set("charmap", null)
    @scala.inline
    def setLower(value: Boolean): Self = this.set("lower", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLower: Self = this.set("lower", js.undefined)
    @scala.inline
    def setLowerNull: Self = this.set("lower", null)
    @scala.inline
    def setMulticharmap(value: CharMap_): Self = this.set("multicharmap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulticharmap: Self = this.set("multicharmap", js.undefined)
    @scala.inline
    def setMulticharmapNull: Self = this.set("multicharmap", null)
    @scala.inline
    def setRemove(value: RegExp): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setRemoveNull: Self = this.set("remove", null)
    @scala.inline
    def setReplacement(value: String): Self = this.set("replacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplacement: Self = this.set("replacement", js.undefined)
    @scala.inline
    def setReplacementNull: Self = this.set("replacement", null)
    @scala.inline
    def setSymbols(value: Boolean): Self = this.set("symbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
    @scala.inline
    def setSymbolsNull: Self = this.set("symbols", null)
  }
  
}

