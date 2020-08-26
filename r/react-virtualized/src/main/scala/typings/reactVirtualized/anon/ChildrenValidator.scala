package typings.reactVirtualized.anon

import typings.react.mod.ReactNode
import typings.react.mod.Validator
import typings.reactVirtualized.esScrollSyncMod.ScrollSyncChildProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildrenValidator extends js.Object {
  var children: Validator[js.Function1[/* props */ ScrollSyncChildProps, ReactNode]] = js.native
}

object ChildrenValidator {
  @scala.inline
  def apply(children: Validator[js.Function1[/* props */ ScrollSyncChildProps, ReactNode]]): ChildrenValidator = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenValidator]
  }
  @scala.inline
  implicit class ChildrenValidatorOps[Self <: ChildrenValidator] (val x: Self) extends AnyVal {
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
    def setChildren(value: Validator[js.Function1[/* props */ ScrollSyncChildProps, ReactNode]]): Self = this.set("children", value.asInstanceOf[js.Any])
  }
  
}

