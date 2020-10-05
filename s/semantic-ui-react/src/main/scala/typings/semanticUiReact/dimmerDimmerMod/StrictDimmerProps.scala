package typings.semanticUiReact.dimmerDimmerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictDimmerProps extends js.Object {
  /** An active dimmer will dim its parent container. */
  var active: js.UndefOr[Boolean] = js.native
  /** A dimmer can be formatted to be fixed to the page. */
  var page: js.UndefOr[Boolean] = js.native
}

object StrictDimmerProps {
  @scala.inline
  def apply(): StrictDimmerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictDimmerProps]
  }
  @scala.inline
  implicit class StrictDimmerPropsOps[Self <: StrictDimmerProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setPage(value: Boolean): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
  }
  
}

