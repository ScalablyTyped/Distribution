package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientSortControls extends js.Object {
  /** ClientSortControls keys */
  var keys: js.UndefOr[js.Array[String] | Null] = js.native
  /** ClientSortControls reverse */
  var reverse: js.UndefOr[Boolean | Null] = js.native
}

object IClientSortControls {
  @scala.inline
  def apply(): IClientSortControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientSortControls]
  }
  @scala.inline
  implicit class IClientSortControlsOps[Self <: IClientSortControls] (val x: Self) extends AnyVal {
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
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setKeysNull: Self = this.set("keys", null)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setReverseNull: Self = this.set("reverse", null)
  }
  
}

