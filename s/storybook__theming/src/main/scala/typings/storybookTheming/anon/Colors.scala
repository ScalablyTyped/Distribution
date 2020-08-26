package typings.storybookTheming.anon

import typings.storybookTheming.syntaxMod.ColorsHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Colors extends js.Object {
  var colors: ColorsHash = js.native
  var mono: String = js.native
}

object Colors {
  @scala.inline
  def apply(colors: ColorsHash, mono: String): Colors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], mono = mono.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
  @scala.inline
  implicit class ColorsOps[Self <: Colors] (val x: Self) extends AnyVal {
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
    def setColors(value: ColorsHash): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setMono(value: String): Self = this.set("mono", value.asInstanceOf[js.Any])
  }
  
}

