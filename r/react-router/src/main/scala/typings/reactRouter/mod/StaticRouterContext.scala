package typings.reactRouter.mod

import typings.reactRouter.reactRouterStrings.PUSH
import typings.reactRouter.reactRouterStrings.REPLACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticRouterContext extends StaticContext {
  var action: js.UndefOr[PUSH | REPLACE] = js.native
  var location: js.UndefOr[js.Object] = js.native
  var url: js.UndefOr[String] = js.native
}

object StaticRouterContext {
  @scala.inline
  def apply(): StaticRouterContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticRouterContext]
  }
  @scala.inline
  implicit class StaticRouterContextOps[Self <: StaticRouterContext] (val x: Self) extends AnyVal {
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
    def setAction(value: PUSH | REPLACE): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setLocation(value: js.Object): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

