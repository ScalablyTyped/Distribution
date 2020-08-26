package typings.remarkable.anon

import typings.remarkable.libMod.BlockParsingRule
import typings.remarkable.rulerMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0` extends js.Object {
  var ruler: ^[BlockParsingRule] = js.native
}

object `0` {
  @scala.inline
  def apply(ruler: ^[BlockParsingRule]): `0` = {
    val __obj = js.Dynamic.literal(ruler = ruler.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
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
    def setRuler(value: ^[BlockParsingRule]): Self = this.set("ruler", value.asInstanceOf[js.Any])
  }
  
}

