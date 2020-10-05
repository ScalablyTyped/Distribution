package typings.storybookRouter.routerMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteProps extends js.Object {
  var hideOnly: Boolean = js.native
  var path: String = js.native
  var startsWith: Boolean = js.native
  def children(renderData: RenderData): ReactNode = js.native
}

object RouteProps {
  @scala.inline
  def apply(children: RenderData => ReactNode, hideOnly: Boolean, path: String, startsWith: Boolean): RouteProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), hideOnly = hideOnly.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteProps]
  }
  @scala.inline
  implicit class RoutePropsOps[Self <: RouteProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: RenderData => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setHideOnly(value: Boolean): Self = this.set("hideOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartsWith(value: Boolean): Self = this.set("startsWith", value.asInstanceOf[js.Any])
  }
  
}

