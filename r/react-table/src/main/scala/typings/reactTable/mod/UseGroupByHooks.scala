package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseGroupByHooks[D /* <: js.Object */] extends js.Object {
  var getGroupByToggleProps: js.Array[HeaderGroupPropGetter[D]] = js.native
}

object UseGroupByHooks {
  @scala.inline
  def apply[/* <: js.Object */ D](getGroupByToggleProps: js.Array[HeaderGroupPropGetter[D]]): UseGroupByHooks[D] = {
    val __obj = js.Dynamic.literal(getGroupByToggleProps = getGroupByToggleProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGroupByHooks[D]]
  }
  @scala.inline
  implicit class UseGroupByHooksOps[Self <: UseGroupByHooks[_], /* <: js.Object */ D] (val x: Self with UseGroupByHooks[D]) extends AnyVal {
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
    def setGetGroupByTogglePropsVarargs(value: HeaderGroupPropGetter[D]*): Self = this.set("getGroupByToggleProps", js.Array(value :_*))
    @scala.inline
    def setGetGroupByToggleProps(value: js.Array[HeaderGroupPropGetter[D]]): Self = this.set("getGroupByToggleProps", value.asInstanceOf[js.Any])
  }
  
}

