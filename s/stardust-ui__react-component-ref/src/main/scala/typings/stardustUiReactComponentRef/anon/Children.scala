package typings.stardustUiReactComponentRef.anon

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.Validator
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends js.Object {
  var children: Validator[ReactElementLike] = js.native
  var innerRef: Validator[Ref[_]] = js.native
}

object Children {
  @scala.inline
  def apply(children: Validator[ReactElementLike], innerRef: Validator[Ref[_]]): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], innerRef = innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
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
    def setChildren(value: Validator[ReactElementLike]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerRef(value: Validator[Ref[_]]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
  }
  
}

