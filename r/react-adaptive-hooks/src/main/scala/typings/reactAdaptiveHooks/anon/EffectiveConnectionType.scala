package typings.reactAdaptiveHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EffectiveConnectionType extends js.Object {
  var effectiveConnectionType: typings.reactAdaptiveHooks.networkMod.EffectiveConnectionType | Null = js.native
  var unsupported: Boolean = js.native
}

object EffectiveConnectionType {
  @scala.inline
  def apply(unsupported: Boolean): EffectiveConnectionType = {
    val __obj = js.Dynamic.literal(unsupported = unsupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectiveConnectionType]
  }
  @scala.inline
  implicit class EffectiveConnectionTypeOps[Self <: EffectiveConnectionType] (val x: Self) extends AnyVal {
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
    def setUnsupported(value: Boolean): Self = this.set("unsupported", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffectiveConnectionType(value: typings.reactAdaptiveHooks.networkMod.EffectiveConnectionType): Self = this.set("effectiveConnectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffectiveConnectionTypeNull: Self = this.set("effectiveConnectionType", null)
  }
  
}

