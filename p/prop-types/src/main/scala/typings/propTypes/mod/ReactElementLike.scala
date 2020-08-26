package typings.propTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactElementLike extends _ReactNodeLike {
  var key: String | Double | Null = js.native
  var props: js.Any = js.native
  var `type`: ReactComponentLike = js.native
}

object ReactElementLike {
  @scala.inline
  def apply(props: js.Any, `type`: ReactComponentLike): ReactElementLike = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactElementLike]
  }
  @scala.inline
  implicit class ReactElementLikeOps[Self <: ReactElementLike] (val x: Self) extends AnyVal {
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
    def setProps(value: js.Any): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeFunction2(value: (/* props */ js.Any, /* context */ js.UndefOr[js.Any]) => js.Any): Self = this.set("type", js.Any.fromFunction2(value))
    @scala.inline
    def setType(value: ReactComponentLike): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String | Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
  }
  
}

