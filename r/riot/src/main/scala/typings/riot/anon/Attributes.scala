package typings.riot.anon

import typings.riotjsDomBindings.mod.AttributeExpressionData
import typings.riotjsDomBindings.mod.SlotBindingData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attributes[InitialProps] extends js.Object {
  var attributes: js.UndefOr[js.Array[AttributeExpressionData]] = js.native
  var props: js.UndefOr[InitialProps] = js.native
  var slots: js.UndefOr[js.Array[SlotBindingData]] = js.native
}

object Attributes {
  @scala.inline
  def apply[InitialProps](): Attributes[InitialProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes[InitialProps]]
  }
  @scala.inline
  implicit class AttributesOps[Self <: Attributes[_], InitialProps] (val x: Self with Attributes[InitialProps]) extends AnyVal {
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
    def setAttributesVarargs(value: AttributeExpressionData*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[AttributeExpressionData]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setProps(value: InitialProps): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    @scala.inline
    def setSlotsVarargs(value: SlotBindingData*): Self = this.set("slots", js.Array(value :_*))
    @scala.inline
    def setSlots(value: js.Array[SlotBindingData]): Self = this.set("slots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlots: Self = this.set("slots", js.undefined)
  }
  
}

