package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseStrings.passiveFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfferEntryFlags extends js.Object {
  val name: passiveFlag = js.native
  val value: `1` = js.native
}

object OfferEntryFlags {
  @scala.inline
  def apply(name: passiveFlag, value: `1`): OfferEntryFlags = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfferEntryFlags]
  }
  @scala.inline
  implicit class OfferEntryFlagsOps[Self <: OfferEntryFlags] (val x: Self) extends AnyVal {
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
    def setName(value: passiveFlag): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: `1`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

