package typings.prismReactRenderer.mod

import typings.prismReactRenderer.anon.Languages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrismTheme extends js.Object {
  var plain: PrismThemeEntry = js.native
  var styles: js.Array[Languages] = js.native
}

object PrismTheme {
  @scala.inline
  def apply(plain: PrismThemeEntry, styles: js.Array[Languages]): PrismTheme = {
    val __obj = js.Dynamic.literal(plain = plain.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrismTheme]
  }
  @scala.inline
  implicit class PrismThemeOps[Self <: PrismTheme] (val x: Self) extends AnyVal {
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
    def setPlain(value: PrismThemeEntry): Self = this.set("plain", value.asInstanceOf[js.Any])
    @scala.inline
    def setStylesVarargs(value: Languages*): Self = this.set("styles", js.Array(value :_*))
    @scala.inline
    def setStyles(value: js.Array[Languages]): Self = this.set("styles", value.asInstanceOf[js.Any])
  }
  
}

