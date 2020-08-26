package typings.qlik.anon

import org.scalablytyped.runtime.StringDictionary
import typings.qlik.mod.CustomProperty
import typings.qlik.qlikStrings.settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0` extends js.Object {
  var items: js.UndefOr[StringDictionary[CustomProperty]] = js.native
  var uses: settings = js.native
}

object `0` {
  @scala.inline
  def apply(uses: settings): `0` = {
    val __obj = js.Dynamic.literal(uses = uses.asInstanceOf[js.Any])
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
    def setUses(value: settings): Self = this.set("uses", value.asInstanceOf[js.Any])
    @scala.inline
    def setItems(value: StringDictionary[CustomProperty]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

