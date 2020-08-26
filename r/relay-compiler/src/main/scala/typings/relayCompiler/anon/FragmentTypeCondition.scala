package typings.relayCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FragmentTypeCondition extends js.Object {
  var fragmentTypeCondition: String = js.native
}

object FragmentTypeCondition {
  @scala.inline
  def apply(fragmentTypeCondition: String): FragmentTypeCondition = {
    val __obj = js.Dynamic.literal(fragmentTypeCondition = fragmentTypeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentTypeCondition]
  }
  @scala.inline
  implicit class FragmentTypeConditionOps[Self <: FragmentTypeCondition] (val x: Self) extends AnyVal {
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
    def setFragmentTypeCondition(value: String): Self = this.set("fragmentTypeCondition", value.asInstanceOf[js.Any])
  }
  
}

