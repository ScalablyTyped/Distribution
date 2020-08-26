package typings.reactDom.experimentalMod.reactDomAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// exposeConcurrentModeAPIs features
@js.native
trait RootOptions extends js.Object {
  var hydrate: js.UndefOr[Boolean] = js.native
  var hydrationOptions: js.UndefOr[HydrationOptions] = js.native
}

object RootOptions {
  @scala.inline
  def apply(): RootOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootOptions]
  }
  @scala.inline
  implicit class RootOptionsOps[Self <: RootOptions] (val x: Self) extends AnyVal {
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
    def setHydrate(value: Boolean): Self = this.set("hydrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHydrate: Self = this.set("hydrate", js.undefined)
    @scala.inline
    def setHydrationOptions(value: HydrationOptions): Self = this.set("hydrationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHydrationOptions: Self = this.set("hydrationOptions", js.undefined)
  }
  
}

