package typings.reactPopper.anon

import typings.reactPopper.mod.Modifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePopper[Modifiers] extends js.Object {
  var createPopper: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopperJS.createPopper */ js.Any
  ] = js.native
  var modifiers: js.UndefOr[js.Array[Modifier[Modifiers, js.Object]]] = js.native
}

object CreatePopper {
  @scala.inline
  def apply[Modifiers](): CreatePopper[Modifiers] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePopper[Modifiers]]
  }
  @scala.inline
  implicit class CreatePopperOps[Self <: CreatePopper[_], Modifiers] (val x: Self with CreatePopper[Modifiers]) extends AnyVal {
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
    def setCreatePopper(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopperJS.createPopper */ js.Any
    ): Self = this.set("createPopper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatePopper: Self = this.set("createPopper", js.undefined)
    @scala.inline
    def setModifiersVarargs(value: (Modifier[Modifiers, js.Object])*): Self = this.set("modifiers", js.Array(value :_*))
    @scala.inline
    def setModifiers(value: js.Array[Modifier[Modifiers, js.Object]]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
  }
  
}

