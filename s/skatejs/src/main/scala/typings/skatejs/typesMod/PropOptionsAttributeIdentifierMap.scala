package typings.skatejs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropOptionsAttributeIdentifierMap extends js.Object {
  var source: js.UndefOr[PropOptionsAttributeIdentifier] = js.native
  var target: js.UndefOr[PropOptionsAttributeIdentifier] = js.native
}

object PropOptionsAttributeIdentifierMap {
  @scala.inline
  def apply(): PropOptionsAttributeIdentifierMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropOptionsAttributeIdentifierMap]
  }
  @scala.inline
  implicit class PropOptionsAttributeIdentifierMapOps[Self <: PropOptionsAttributeIdentifierMap] (val x: Self) extends AnyVal {
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
    def setSource(value: PropOptionsAttributeIdentifier): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTarget(value: PropOptionsAttributeIdentifier): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

