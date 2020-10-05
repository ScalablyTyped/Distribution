package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageTransitionEventInit extends EventInit {
  var persisted: js.UndefOr[scala.Boolean] = js.native
}

object PageTransitionEventInit {
  @scala.inline
  def apply(): PageTransitionEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageTransitionEventInit]
  }
  @scala.inline
  implicit class PageTransitionEventInitOps[Self <: PageTransitionEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPersisted(value: scala.Boolean): Self = this.set("persisted", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersisted: Self = this.set("persisted", js.undefined)
  }
  
}

