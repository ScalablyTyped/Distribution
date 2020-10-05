package typings.reactDom.experimentalMod.reactDomAugmentingMod

import typings.std.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// enableSuspenseServerRenderer feature
@js.native
trait HydrationOptions extends js.Object {
  var onDeleted: js.UndefOr[js.Function1[/* suspenseInstance */ Comment, Unit]] = js.native
  var onHydrated: js.UndefOr[js.Function1[/* suspenseInstance */ Comment, Unit]] = js.native
}

object HydrationOptions {
  @scala.inline
  def apply(): HydrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HydrationOptions]
  }
  @scala.inline
  implicit class HydrationOptionsOps[Self <: HydrationOptions] (val x: Self) extends AnyVal {
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
    def setOnDeleted(value: /* suspenseInstance */ Comment => Unit): Self = this.set("onDeleted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDeleted: Self = this.set("onDeleted", js.undefined)
    @scala.inline
    def setOnHydrated(value: /* suspenseInstance */ Comment => Unit): Self = this.set("onHydrated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHydrated: Self = this.set("onHydrated", js.undefined)
  }
  
}

